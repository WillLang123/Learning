#include    <stdio.h>
#include    <fcntl.h>
#include <errno.h>
#include <sys/wait.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdlib.h>


extern int errno;

int main() {

	int inFile, outFile;
	char *inFileName = "in_test";
	char *outFileName = "out_test";
	int len;
	char c;

	inFile = open(inFileName, O_RDONLY);
	if (inFile < 0)
	{
//		printf("%s", sys_errlist[errno]);
		exit(0);
	}	

	outFile = open(outFileName, O_WRONLY);
	if (outFile < 0)
	{
//		printf("%s", sys_errlist[errno]);
		exit(0);
	}	
	/* Loop through the input file */
	while ((len = read(inFile, &c, 1)) > 0)
	        write(outFile, &c, 1);
		/* Close files and quite */
	close(inFile);
	close(outFile);
}

