package ua.artcode.task.model;

/**
 * Created by tos on 3/19/16.
 */
public class Student {

    private String name;
    private String phone;
    private String email;

    private MyDate myDate ;
    private double paidMoney;

    private String city;
    private String street;
    private String houseNum;

    private int TaskCount;

    //return this
    public Student(){
        System.out.println("Default constructor");
    }

    public Student(String name, String phone, String city, double money, int birthYear){
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.paidMoney = money;
        //this.birthYear = birthYear;
    }

    public  String convertStudent(){
        //"name %s, phone %s, money %.2f, birthYear %d"

        String res = String.format("name %s, phone %s, money %.2f, birthYear %d", name,  phone,  paidMoney,  myDate.birthYear);

        return res;
    }
}

