package com.barton;

public class Scope {

    boolean b = true;
    int x = 88;

    Scope() {
        double d = 9.0;//original value of d
        example(d);
        classVariable();
    }
    void example(double x) {
        System.out.println("Initial value of Local Variable 'x' : "
                + x + "\n");//d gets reassigned to x

        x = 4.4;//reassigns the local variable in the programme this is what it changes to

        System.out.println("New value of local variable 'x' : " + x + "\n");

        for(int b = 0; b < 4; b++) {//not 100% here
            int i = b + 4;
            System.out.println("For Loop 1 in example(double x):\n"
            + "Local variable 'b' (local to loop): " + b + "\n"//calls different variable names here b the boolean variable 0 cos nowt
            + "Local Variable 'i' (local to loop): " + i + "\n"//i the variable reassigned to b
            + "Local Variable 'x' (method parameter): " + x + "\n");//from the method example
        }
        System.out.println("Local Variable 'x' after loop 2: " + x + "\n");
    }
    void classVariable() {
        System.out.println("classVariable" + "instance variable b :" + b + "\n"
                + "instance variable 'x'" + x);
    }


    public static void main(String[] args) {
        Scope sc = new Scope();
    }

}
