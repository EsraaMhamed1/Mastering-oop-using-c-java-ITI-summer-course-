
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

/**********************************/

class Base
{
private:
    int a;
    int b;

public:
    Base()
    {
        a = 0;
        b = 0;
        cout << "Base Default Constructor" << endl;
    }

    Base(int n)
    {
        a = n;
        b = n;
        cout << "Base(int) Constructor" << endl;
    }

    Base(int x, int y)
    {
        a = x;
        b = y;
        cout << "Base(int, int) Constructor" << endl;
    }

    void setA(int x)
    {
        a = x;
    }

    void setB(int y)
    {
        b = y;
    }

    int getA()
    {
        return a;
    }

    int getB()
    {
        return b;
    }

    int productAB()
    {
        return a * b;
    }
};

class Derived : public Base
{
private:
    int c;

public:
    Derived() : Base()
    {
        c = 0;
        cout << "Derived Default Constructor" << endl;
    }

    Derived(int n) : Base(n)
    {
        c = n;
        cout << "Derived(int) Constructor" << endl;
    }

    Derived(int x, int y, int z) : Base(x, y)
    {
        c = z;
        cout << "Derived(int, int, int) Constructor" << endl;
    }

    void setC(int z)
    {
        c = z;
    }

    int getC()
    {
        return c;
    }

    int productABC()
    {
        return productAB() * c;
    }
};

int main()
{
    cout << " Object 1" << endl;
    Derived d1;

    cout << "A = " << d1.getA() << endl;
    cout << "B = " << d1.getB() << endl;
    cout << "C = " << d1.getC() << endl;
    cout << "Product ABC = " << d1.productABC() << endl;


    cout << "\n Object 2 " << endl;

    Derived d2(5);

    cout << "A = " << d2.getA() << endl;
    cout << "B = " << d2.getB() << endl;
    cout << "C = " << d2.getC() << endl;
    cout << "Product ABC = " << d2.productABC() << endl;


    cout << "\n Object 3 " << endl;

    Derived d3(2, 3, 4);

    cout << "A = " << d3.getA() << endl;
    cout << "B = " << d3.getB() << endl;
    cout << "C = " << d3.getC() << endl;
    cout << "Product ABC = " << d3.productABC() << endl;


    return 0;
}

/************************************/
// access modyfires 

class Base
{
private:
    int a;

protected:
    int b;

public:
    int c;

    void setValues()
    {
        a = 10;
        b = 20;
        c = 30;
    }
};

class Derived : public Base
{
public:
    void show()
    {
        // a = 5;   

        b = 50;     
        c = 60;     

        cout << "b = " << b << endl;
        cout << "c = " << c << endl;
    }
};

int main()
{
    Derived d;

    d.show();

    // d.a = 1;   // ❌ private
    // d.b = 2;   // ❌ protected

    d.c = 3;       // ✅ public

    cout << "c from main = " << d.c << endl;

    return 0;
}

/*****************************************/

// polymorphism (override) 

class Base
{
public:
    void basePublicMember()
    {
        cout << "Base Member" << endl;
    }
};

class Derived : public Base
{
public:
    void derivedPublicMember()
    {
        cout << "Derived Member" << endl;
    }
};

void someFunction(Base t)
{
    t.basePublicMember();
}

void anotherFunction(Derived t)
{
    t.derivedPublicMember();
}

int main()
{
    Base b;
    Derived d;

    someFunction(b);   // ✅ Base object
    someFunction(d);   // ✅ Derived object

    cout << "****************" << endl;

    anotherFunction(d);   // ✅ Derived object

    // anotherFunction(b);   // ❌ Error
    // Base cannot be sent to a function that expects Derived

    return 0;
}

/************************************************************/
// multi level inheritance
class Base
{
protected:
    int a;

public:
    Base()
    {
        a = 10;
    }

    void setA(int x)
    {
        a = x;
    }

    int getA()
    {
        return a;
    }
};

class Derived : public Base
{
protected:
    int b;

public:
    Derived() : Base()
    {
        b = 20;
    }

    void setB(int x)
    {
        b = x;
    }

    int getB()
    {
        return b;
    }
};

class SecondDerived : public Derived
{
private:
    int c;

public:
    SecondDerived() : Derived()
    {
        c = 30;
    }

    void setC(int x)
    {
        c = x;
    }

    int getC()
    {
        return c;
    }

    int product()
    {
        return a * b * c;
    }
};

int main()
{
    SecondDerived obj;

    cout << "a = " << obj.getA() << endl;
    cout << "b = " << obj.getB() << endl;
    cout << "c = " << obj.getC() << endl;

    cout << "Product = " << obj.product() << endl;

    return 0;
}
