package ua.artcode.home.week4.test;

import ua.artcode.home.week4.data_structure.MyArrayStack;
import ua.artcode.home.week4.data_structure.MyStack;

/**
 * Created by tos on 4/14/16.
 */
public class MyArrayStackTest {

    public static void main(String[] args) {
        MyStack myStack = new MyArrayStack(10);
        myStack.push(60);
        myStack.push(4);
        myStack.push(25);
        myStack.pop();
        System.out.println(myStack.toString() + "Have to be 4,60");
    }

}
