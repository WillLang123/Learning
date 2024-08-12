#include<stdio.h>
#include<pthread.h>
void *count_lines(void *arg);
//need to declare method early
int main(void) {
	FILE *fh;
	fh=fopen("data.txt","r");
	//Open the file data.txt and obtain the file handler fh;

	pthread_t threadtid;
	pthread_create(&threadtid,NULL,count_lines, (void*)fh);
	//Create a thread my_thread using pthread_create; pass fh to my_thread;

	int *count;
	pthread_join(threadtid, (void **)&count);
	//Wait until my_thread terminates, using pthread_join;

	printf("The number of lines in the file is %d\n", count);
	//Print out how many lines exist in data.txt.

}  