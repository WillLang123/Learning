#include <stdio.h>
#include <string.h>

int main()
{
	int a[10], x, sum;
	int *pa;

	for (x = 0; x < 10; x++)
		a[x] = x;

	sum = 0;
	for (x = 0; x < 10; x++)
		sum += x;

	printf("sum (using array) is %d\n", sum);

	pa = a;
	sum = 0;
	x = 0;
	while (x < 10) {
		sum += *pa;
		pa++;
		x++;
	}
	printf("sum (using pointer) is %d\n", sum);


	return 0;

}
