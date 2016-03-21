package ua.artcode.task.utils;

import ua.artcode.task.model.Student;

/**
 * Created by tos on 3/19/16.
 */
public class StudentUtils {
/*
    public  static String convertStudent(Student student){
        if (student == null){
            return "null";
        }
        //"name %s, phone %s, money %.2f, birthYear %d"

        String res = String.format("name %s, phone %s, money %.2f, birthYear %d", student.name, student.phone, student.paidMoney, student.birthYear);

        return res;



    }*/
    public static Student generateStudent(){

        String name = generateName();
        String date = generateDate();
        return null;
    }

    private static String generateDate() {
        return null;
    }

    private static String generateName() {
        return null;
    }


}
