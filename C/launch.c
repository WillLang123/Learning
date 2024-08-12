#include <sys/wait.h>
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>

//#define	DEBUG
#define MAX_ARGS	64
#define MAX_ARG_LEN	16
#define	MAX_LINE_LEN	80
#define WHITESPACE	" .,\t\n"


struct command_t {
  char *name;
  int argc;
  char *argv[MAX_ARGS];
};

/* Function prototypes */
int parseCommand(char *, struct command_t *);
int getarg(char **, char *);


int main(int argc, char *argv[]) {
	int i;
	int pid, numChildren;
	int status;
	FILE *fid;
	char cmdLine[MAX_LINE_LEN];
	struct command_t command;

/* Read the command line parameters */
	if(argc != 2) {
		fprintf(stderr, "Usage:  launch <launch_set_filename>\n");
		exit(0);
	}

/* Open a file that contains a set of commands */
	fid = fopen(argv[1], "r");

/* Process each command in the launch file */
	numChildren  = 0;
	while (fgets(cmdLine, MAX_LINE_LEN, fid) != NULL) {

	//  printf("Command Line: %s", cmdLine);

	  parseCommand(cmdLine, &command);
	  command.argv[command.argc] = NULL;

   /* Create a child process to execute the command */
	  if((pid = fork()) == 0) {
	  /* Child executing command */
//#ifdef DEBUG
/*
	    printf("command.name = '%s'\n", command.name);
	    printf("command.argc = '%d'\n", command.argc);
	    for(i = 0; i <= command.argc; i++) { 
	      printf("command.argv[%d]= '%s'\n", i, command.argv[i]);
	    }
*/
//#endif
	    execvp(command.name, command.argv);
	  }
	  /* Parent continuing to the next command in the file */
	  numChildren++;
	}
	printf("\n\nlaunch: Launched %d commands\n", numChildren);

/* Terminate after all children have terminated */
	for(i = 0; i < numChildren; i++) {
	  wait(&status);
	/* Should free dynamic storage in command data structure */
	}
	printf("\n\nlaunch: Terminating successfully\n");
	return 0;
}


int parseCommand(char *cLine, struct command_t *cmd) {
/* Determine command name and construct the parameter list */

    int argc;
    char **clPtr;

/* Initialization */
    clPtr = &cLine;
    argc = 0;
    cmd->argv[argc] = (char *) malloc(MAX_ARG_LEN);
/* Fill argv[] */
    while((cmd->argv[argc] = strsep(clPtr, WHITESPACE)) != NULL) {
        cmd->argv[++argc] = (char *) malloc(MAX_ARG_LEN);
    }

/* Set the command name and argc */
    cmd->argc = argc-1;
    cmd->name = (char *) malloc(sizeof(cmd->argv[0]));
    strcpy(cmd->name, cmd->argv[0]);
//    printf("HHH: %s\n", cmd->name);
    return  1;	
}


