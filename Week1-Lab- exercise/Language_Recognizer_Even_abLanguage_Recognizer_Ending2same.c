// Implementation of Language recognizer for set of all strings ending with two symbols of
// same type.


#include <stdio.h>
#define max 100
int main()
{
    
    char yes[]="String accepted";
    char no[]="String not accepted";
    char str[max], f = 'a';
    scanf("%s",str);
    int i;
    for (i = 0; str[i] != '\0'; i++)
    {
        switch(f)
        {
        case 'a':
            if (str[i] == '0')
                f = 'b';
            else if (str[i] == '1')
                f = 'd';
            break;
        case 'b':
            if (str[i] == '1')
                f = 'd';
            else if (str[i] == '0')
                f = 'c';
            break;
        case 'c':
            if (str[i] == '0')
                f = 'c';
            else if (str[i] == '1')
                f = 'd';
            break;
        case 'd':
            if (str[i] == '0')
                f = 'b';
            else if (str[i] == '1')
                f = 'e';
            break;
        case 'e':
            if (str[i] == '0')
                f = 'b';
            else if (str[i] == '1')
                f = 'e';
            break;
        }
    }
    if (f == 'e' || f == 'c')
        printf("%s",yes);
    else
        printf("%s",no);
    return 0;
}
