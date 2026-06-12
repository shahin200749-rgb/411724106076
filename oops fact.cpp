#include<iostream>
using namespace std;
int main()
{
	int n,i,fact;
	fact=1;
	cout<<"enter a number";
	cin>>n;
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	cout<<"fact="<<fact;
	return 0;
}
