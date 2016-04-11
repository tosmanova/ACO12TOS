package ua.artcode.home.week4.recursion1;

/**
 * Created by tos on 4/11/16.
 */
public class recursion_tasks {


    public int factorial(int n) {
        int result = 0;
        if (n == 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }

    public int bunnyEars(int bunnies) {
        int result = 0;
        if (bunnies == 0) {
            result = 0;
        }
        result = result + 2 + bunnyEars(bunnies - 1);
        return result;
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if ((n == 1) || (n == 2)) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies == 1) {
            return 2;
        }
        if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        } else {
            return 2 + bunnyEars2(bunnies - 1);
        }

    }
    

}
