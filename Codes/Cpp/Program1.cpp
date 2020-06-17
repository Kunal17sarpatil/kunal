#include<iostream>

using namespace std;

class Employee {

	int no;
	char name[50];

	public:
		void getdata();
		void displayData();
	
	void Employee::getdata(void) {
	
		cout<<"Enter roll no = ";
		cin>>no;
		cout<<"Enter Name = ";
		cin>>name;
	}

	void Employee::displayData(void) {
	
		cout<<"Roll no = "<<no<<endl;
		cout<<"Name = "<<name<<endl;
	}
};

int main() {

	Employee emp;
	emp.getData();
	emp.displayData();

	return 0;
}

