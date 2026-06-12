#include<stdio.h>
main()
{
	int data[10],search_element,i,j,n;
	printf("enter the number of search_element ");
	scanf("%d",&n);
	printf("enter array_element");
	scanf("%d",& search_element);
	for(i=0;i<=n;i++)
    scanf("%d"& data[i]);
    for (i=0;i<10;i++)
	if(search_element==data[i])
	{
		printf("present");
		break;
	}
	if(i==n)
	{
		printf("not present");
	}
}

