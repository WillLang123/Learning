/*
Please read Lab Exercise 9.1 – Background on Textbook: p. 363 -> Lab 9.1 first.
After reading the background, please work on the following problem: 
a.	The source process reads information from a file 
(Therefore, you need to prepare a small text file for testing purpose). 
b.	The source process calls fork() to create the filter process.
c.	The filter process reads information from the source process 
(passed via an anonymous pipe), 
converts the uppercase characters to lowercase ones and vice versa, 
and then prints out the converted characters to the screen.
 
How to create an anonymous pipe: pipe() API.
*/
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/wait.h>
#include <fcntl.h>
#include <ctype.h>
#define FILE "input.txt"
#define maxlen 255

int main(){
    int pipeID[2];
    char input_str[maxlen];
    int fh = open(FILE, 'r');
    //creates pipe, opens file, and makes an input string to hold file contents

    if(fh < -1){
        printf("Error: File not found.");
    }
    int l = read(fh, input_str, maxlen);
    //pipe read API, makes the last char a fancy one to identify the end, and closes the file
    input_str[l] = '\0';
    close(fh);
    if (pipe(pipeID)==-1){
        perror("Pipe Failed" );
        return 0;
	//if pipe fails, exit main
    }
    int pid = fork();
    if(pid == 0){
	//child process
	close(pipeID[1]);  
	//closes writing end of first pipe
        //reads a string using first pipe
        char str[maxlen];
        read(pipeID[0], str, maxlen);
        int k = strlen(str);
        for (int i=0; i < strlen(str); i++){
	if(islower(str[i])){
            str[i] = toupper(str[i]);
	}else if(isupper(str[i])){
	    str[i] = tolower(str[i]);
	}
}
	//switches chars from capitalized to lower and vice versa
        str[k] = '\0';   // string ends with '\0'
        printf("Child process: \n%s\n", str);
        close(pipeID[0]);
	//prints affected strings and closes pipe
    }else{ 
	//parent process
        close(pipeID[0]);  
        int k = strlen(input_str);
        write(pipeID[1], input_str, k+1);
        close(pipeID[1]);
        //waits for child send string
        wait(NULL);
    }
}