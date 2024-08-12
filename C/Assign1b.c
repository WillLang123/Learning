#include <sys/wait.h>
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdlib.h>

int main (void){
int sume = 0;
int sumo = 0;
	    if (fork()==0){   // Starts child process
		//child code
		printf("Child Process Starting ");
		for(int i = 1; i <= 1000; i+=2){
			sumo+=i;
		}
		printf("The sum of odd numbers from 1-1000 is %d\n.",sumo );
		printf("Child Exiting.\n");
		exit(0);
            } else {
	    	// Parent code 
	    	printf("Parent Process Starting ");
		for(int j = 0; j <= 1000; j+=2){
			sume+=j;
		}
		printf("The sum of the even numbers from 1-1000 is %d\n.",sume);
	   	wait(NULL); // Child terminating
	        printf("Parent detects terminating child. Exiting.");
	}
}
