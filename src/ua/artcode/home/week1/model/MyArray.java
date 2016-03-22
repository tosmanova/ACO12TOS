package ua.artcode.home.week1.model;

/**
 * Created by tos on 3/21/16.
 */
public class MyArray {

    public int[] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    private int[] myArray;


    public MyArray(int length){
        this.myArray = new int[length];

    }

    public int[] fillWithRandom(int range){
        for (int i = 0; i < this.myArray.length ; i++) {
            int randomNum = getRandomNumber(range);
            myArray[i] = randomNum;
        }
        return myArray;
    }

    public int getMinimumNumberOfArray(){
        int minElement = this.myArray[0];
        for (int i = 0; i <this.myArray.length ; i++) {
            minElement = (this.myArray[i]<=minElement?this.myArray[i]:minElement);
        }
        return minElement;
    }

    public int getMaximumNumberOfArray(){
        int maxElement = this.myArray[0];
        for (int i = 0; i <this.myArray.length; i++) {
            maxElement = (this.myArray[i]>=maxElement?this.myArray[i]:maxElement);
        }
        return maxElement;
    }

    private static int getRandomNumber(int range) {
        return (int)(Math.random() * range);
    }

}
