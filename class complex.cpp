#include<iostream>
using namespace std;
class complex 
{
  public:
  int real;
  int imag;
  void display()
  {
  	cout<<real<<"+i"<< imag;
	  }
	  complex()
 {
	  	real=7,imag=9;
} 
};
int main()
{
	complex c1;
	c1.display();
}
