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

/************************************/

class Animal
{
private:
	int age;

protected:
	int weight;

public:
	void eat() {
		cout << "Eating..." << endl; 

	};
};

class Dog : public Animal {
public:
	void setWeight(int w) {
		weight = w;      // ✅ Dog يقدر يوصل
		cout << w << endl; 
	}
	void bark() {
		cout << "Bark" << endl;
	};
};


int main() {
	Dog d;
	
	cout << "dog weight : "  ;
	d.setWeight(40); 

	d.bark();
	d.eat();

	return 0;
}
