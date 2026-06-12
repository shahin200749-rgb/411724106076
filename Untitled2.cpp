#include<iostream>
#include<cstring>
using namespace std;
class student
{
	public:
		char name[20];
		char dept[5];
		int year;
	void display()
	{
		cout<<"name"<<name<< endl;
		cout<<"dept"<<dept<< endl;
		cout<<"year"<<year<< endl;	
	}
	student()
	{
			strcpy(name,"Rahim");
			strcpy(dept,"EEE");
			year=2;
	}
};
int main()
{
	student s1;
	s1.display();
}
