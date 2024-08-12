#include <sys/wait.h>
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdlib.h>

int main()
{

char *cmd[] = { "ls", "-l", (char *)0 };

	execv("/bin/ls", cmd);
	//execv("ls", cmd);
//	execvp("ls", cmd);
//	execvp("/bin/ls", cmd);

	exit(0);
}
