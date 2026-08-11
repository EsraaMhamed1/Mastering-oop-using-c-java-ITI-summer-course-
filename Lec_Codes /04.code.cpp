#includ <iostream> ;
using namespace std;

// copy by value (attributes ) 
int main()
{
    int x = 5;
    int y = 7;

    y = x;

    cout <<"x : "<< x << endl;
    cout << "y : "<<y << endl;

    x = 3;

    cout <<"x : "<< x << endl;
    cout << "y : "<<y << endl;
}

/* objects */
class Stack
{
private:
    int* st;
    int size;
    int tos;

public:

    Stack(int s)
    {
        size = s;
        tos = 0;
        st = new int[size];
    }

    void push(int value)
    {
        if (tos < size)
        {
            st[tos] = value;
            tos++;
        }
    }


    void print()
    {
        for (int i = 0; i < tos; i++)
        {
            cout << st[i] << " ";
        }

        cout << endl;
    }

    void operator=(Stack s)
    {
        delete[] this->st;

        this->tos = s.tos;
        this->size = s.size;

        this->st = new int[size];

        for (int i = 0; i < tos; i++)
        {
            this->st[i] = s.st[i];
        }
    }
};

int main()
{
    Stack s1(3);

    s1.push(10);
    s1.push(20);
    s1.push(30);

    Stack s2(2);

    s2.push(100);
    s2.push(200);

    cout << "Before assignment:" << endl;

    cout << "s1: ";
    s1.print();

    cout << "s2: ";
    s2.print();

    s2 = s1;

    cout << "\nAfter assignment:" << endl;

    cout << "s1: ";
    s1.print();

    cout << "s2: ";
    s2.print();

    return 0;
}

/*************************/




