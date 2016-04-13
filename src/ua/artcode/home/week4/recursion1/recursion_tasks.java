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
        int result = 0;
        if (bunnies == 0) {
            result = 0;
        } else if (bunnies == 1) {
            result = 2;
        }
        result = (bunnies % 2 == 0) ? (3 + bunnyEars2(bunnies - 1)) : (2 + bunnyEars2(bunnies - 1));
        return result;
    }

    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else {
            return rows + (triangle(rows - 1));
        }
    }

    public int sumDigits(int n) {
        /*if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumDigits(n / 10);
        }*/
        return (n == 0) ? 0 : n % 10 + sumDigits(n / 10);
    }

    public int count7(int n) {
        int is7 = (n % 10 == 7) ? 1 : 0;
        return (n == 0) ? 0 : is7 + count7(n / 10);
    }

    public int count8(int n) {
        int is8 = (n % 10 == 8) ? 1 : 0;
        int is88 = (n % 100 == 88) ? 2 : 0;
        return (n == 0) ? 0 : ((is88 == 2) ? is88 + count8(n / 10) : is8 + count8(n / 10));
    }

    public int powerN(int base, int n) {
        if (n == 1) {
            return base;
        } else {
            return base * powerN(base, n - 1);
        }
    }

}
