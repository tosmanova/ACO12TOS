package ua.artcode.home.week1.utils;

/**
 * Created by tos on 3/21/16.
 */
public class ArrayUtils {

    public static int[] generateRandomArray(int size, int range){
        int[] mas = new int[size] ;
        for (int i = 0; i < mas.length; i++) {
            int randomNum = getRandomNumber(range);
            mas[i] = randomNum ;
        }
        return mas;
    }

    private static int getRandomNumber(int range) {

        return (int)(Math.random() * range);
    }

}
