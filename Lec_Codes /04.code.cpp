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

// objects 

