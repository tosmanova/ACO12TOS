package ua.artcode.utils.time;

/**
 * Created by tos on 4/11/16.
 */
public class TimeCounter {

    public static long count(ITimeAction action) {

        long start = System.currentTimeMillis();
        action.doAction();
        long end = System.currentTimeMillis();

        return end - start;
    }

}
