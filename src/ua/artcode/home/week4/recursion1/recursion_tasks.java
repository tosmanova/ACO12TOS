package ua.artcode.home.week4.recursion1;

/**
 * Created by tos on 4/11/16.
 */
public class recursion_tasks {


    public int factorial(int n) {
        int result = 0;
        if (n == 0) {
            result = 0;
        }
        else if (n == 1){
            result = 1;
        }
        else{
            result = n*factorial(n-1);
        }
        return result;
    }

    

}
