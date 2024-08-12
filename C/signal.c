#include <sys/wait.h>
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdlib.h>

//#define NULL    0
void hupprint(int sig){
    printf("Child:I have received SIGHUP\n");
}
void intprint(int sig){
    printf("Child:I have received SIGINT\n");
}
void quitprint(int sig){
    printf("Child:I have received SIGQUIT\n");
    printf("Child exiting due to exit(0) in SIGQUIT signal handler function...\n");
    exit(0);
}


int main (void)
{	
	    signal(SIGHUP,hupprint);
    	    signal(SIGINT,intprint);
    	    signal(SIGQUIT,quitprint);
	    int pid = fork();

	    if (pid == 0){   /* This is the child process */
	        printf("I am child process with PID: %d\n", getpid());
		while(1){
		printf("child process running...\n");
		sleep(1);
		}
            } else {

	    /* Parent code here */
	   printf("Process[%d]: Parent in execution ...\n", getpid());
	   sleep(3);
	   kill(pid, SIGHUP);
       	   sleep(3);
       	   kill(pid, SIGINT);
      	   sleep(3);
      	   kill(pid, SIGQUIT);
	   if(wait(NULL) > 0) /* Child terminating */
	        printf("Process[%d]: Parent detects terminating child \n", getpid());
	   printf("Process[%d]: Parent terminating ...\n", getppid());
	}

}