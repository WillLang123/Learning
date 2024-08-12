#include <sys/wait.h>
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdlib.h>

//#define NULL    0

int main (void)
{
	    if (fork() == 0){   /* This is the child process */
	            //execve("Child",NULL,NULL);
		    
	            //execvp("./Child",NULL);
		    

		printf("I am child process with PID: %d\n", getpid());
			exit(0);

            } else {

	    /* Parent code here */
	   printf("Process[%d]: Parent in execution ...\n", getpid());
	   sleep(5);
	   if(wait(NULL) > 0) /* Child terminating */
	        printf("Process[%d]: Parent detects terminating child \n", getpid());
	   printf("Process[%d]: Parent terminating ...\n", getppid());
	}

	printf("HHHHHH\n");


}

