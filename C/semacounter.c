#include<stdio.h>
#include<pthread.h>
#include<semaphore.h>
static int counter=0;
static sem_t s;

void *thread1(){
	while(1){
//running indefinitely
	sem_wait(&s);
//equivalent to P(s);
	counter++;
	printf("\nThe counter while thread1 is going: %d\n", counter);
	sem_post(&s);
//equivalent to V(s);
	}
}

void *thread2(){
	while(1){
//running indefinitely
	sem_wait(&s);
//P(s)
	counter--;
	printf("\nThe counter while thread2 is going: %d\n", counter);
	sem_post(&s);
//V(s)
	}
}

int main(){
	pthread_t tid1, tid2;
	sem_init(&s, 0, 1);
// semaphore initialization
	pthread_create (&tid1, NULL, thread1,NULL);
//thread creation
	pthread_create (&tid2, NULL, thread2,NULL);
//thread creation
	pthread_join(tid1, NULL);
//thread joining
	pthread_join(tid2, NULL);
//thread joining
	sem_destroy(&s);
//semaphore removed

return 0;
}