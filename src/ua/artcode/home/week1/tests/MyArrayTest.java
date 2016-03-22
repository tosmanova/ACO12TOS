package ua.artcode.home.week1.tests;

import ua.artcode.home.week1.model.MyArray;

/**
 * Created by tos on 3/21/16.
 */
public class MyArrayTest {

    public static void main(String[] args) {
        findMinimumTest();
    }

    public static void findMinimumTest(){

        MyArray testArray = new MyArray(5);
        int[] mytestArray = {34,0,87,-23, 55};
        testArray.setMyArray(mytestArray);

        System.out.println(testArray.getMinimumNumberOfArray() + " must be -23");
    }

}
