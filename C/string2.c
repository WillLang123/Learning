#include <string.h>
#include <stdio.h>
#include <unistd.h>

#define WHITESPACE	" .,\t\n"

int main()
{
	int i, j;

	char* p;
	char *strsep_processed[100];

	p = (char*)malloc(100);
	strcpy(p, "This is a test string.\n");

	i = 0;
	strsep_processed[i] = (char*)malloc(30);
	strcpy (strsep_processed[i], "test\n");
	printf(strsep_processed[0]);

	while ((strsep_processed[i]=strsep(&p, WHITESPACE)) != NULL){

		i ++;
		strsep_processed[i] = (char*)malloc(20);
	}

	i --;

	for (j = 0; j < i; j ++)
		printf("%s\n", strsep_processed[j]);

	return 0;

}
