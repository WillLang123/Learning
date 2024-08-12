#include <stdio.h>

int main()
{

	char p[10];
	int i, sum = 0;

	strcpy(p, "hello");
	printf ("The value is : %s", p);

	for (i = 0; i < 100; i ++)
	  sum += i;

	printf("The value of sum is : %d\n", sum);

	return 0;
}

/*
gcc -g

break/clear

run

next 
continue

*/
