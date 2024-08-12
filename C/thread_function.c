#include<stdio.h>
#include<pthread.h>
void *count_lines(void *arg){
// Hope file handler is arg
	int count=1;
	char c;
	while(!feof(arg)){
//if not end of file, count line.
	c=fgetc(arg);
        if (c == '\n'){     
	count++;
}
}
	pthread_exit((void *)count);
	fclose(arg);
//closes file and uses weird thread method to return the value
}