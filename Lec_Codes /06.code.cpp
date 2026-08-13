#include <iostream>
using namespace std; 


// inheritance 
class Animal {
public:
	void eat() {
		cout << "Eat" << endl; 

	};
	void sleep() {
		cout << "Sleep " << endl;
	};
};

class Dog : public Animal {
public:
	void bark() {
		cout << "Bark" << endl;
	};
};


int main() {
	Dog d; 

	cout << "dog : " << endl;
	 d.bark();
	 d.sleep();
	 d.eat();
	
	return 0; 
}

