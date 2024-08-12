#include <sys/wait.h>
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdlib.h>

int main (void)
{
	    if (fork() == 0){   /* This is the child process */	    

		printf("Child began counting ...\n");
		sleep(20);
		exit(0);

            } else {

	    /* Parent code here */
	   	printf("Parent in execution ...\n");
	   	sleep(22);
	   	if(wait(NULL) > 0) /* Child terminating */
	        	printf("Child Terminating ...\n");
	   	printf("Parent terminating ...\n");
	}


}

