#include <fcntl.h>
#include <errno.h>
#include <stdio.h>
#include <unistd.h>

void set_fl(int fd, int flags);

char buf[10];

int main()
{

        int noread;

        set_fl(STDIN_FILENO, O_NONBLOCK);
        //set_fl(0, O_NONBLOCK);
        noread = read(0, buf, sizeof(buf));

        printf("INPUT: %s\n", buf);

        return 0;
}


void set_fl(int fd, int flags)
{
        int val;

        if ((val = fcntl(fd, F_GETFL, 0)) < 0)
                printf("ERROR: %s\n", "fcntl F_GETFL error");

        val |= flags;

        if (fcntl(fd, F_SETFL, val) < 0)
                printf("ERROR: %s\n", "fcntl F_SETFL error");

}
