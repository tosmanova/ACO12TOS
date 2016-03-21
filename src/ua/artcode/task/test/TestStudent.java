package ua.artcode.task.test;

import ua.artcode.task.model.Student;

/**
 * Created by tos on 3/19/16.
 */
public class TestStudent {

    public static void main(String[] args) {
       Student student1 = new Student();
/*
        student1.city = "Kyiv";
        student1.name = "Sasha";
        student1.email = "sasha@gmail.com";
        student1.paidMoney = 4000;
*/
        Student st = new Student("Sasha","0934","Kyiv", 34.34,1988);
        //System.out.println(student1.houseNum);
        //System.out.println(student1.street.toLowerCase());

        //System.out.println(convertStudent(student1) );

        System.out.println(student1.convertStudent());
    }
/*
    public  static String convertStudent(Student student){
        if (student == null){
            return "null";
        }
        //"name %s, phone %s, money %.2f, birthYear %d"
        String res = String.format("name %s, phone %s, money %.2f, birthYear %d", student.name, student.phone, student.paidMoney, student.birthYear);

        return res;
    }
    */
}
