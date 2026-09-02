// Problem : Shape 
/*******************************************************************************************************************************************************
Implement Object-Oriented Inheritance. Create a superclass Shape with length and breadth attributes and an area() method that prints the dimensions. 
Create a subclass Rectangle that inherits from Shape, forwards values via super(), and overrides area() to print the calculated area (length * breadth).
********************************************************************************************************************************************************/
// Solution : 

import java.io.*;
import java.util.*;

class Shape {
    int length;
    int breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println(length + " " + breadth);
    }
}

class Rectangle extends Shape {

    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void area() {
        System.out.println(length * breadth);
    }
}

public class Lec_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int l = sc.nextInt();
            int b = sc.nextInt();

            Shape shape = new Shape(l, b);
            shape.area();

            Rectangle rectangle = new Rectangle(l, b);
            rectangle.area();
        }
        sc.close();
    }
}
