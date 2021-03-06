package com;

import com.gFilter.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // 原型模式
//        ShapeCache.loadCache();
//
//        Shape clonedShape = ShapeCache.getShape("1");
//        System.out.println("Shape : " + clonedShape.getType());
//
//        Shape clonedShape2 = ShapeCache.getShape("2");
//        System.out.println("Shape : " + clonedShape2.getType());

        // 适配器模式
//        AudioPlayer audioPlayer = new AudioPlayer();
//        audioPlayer.play("mp3", "beyond the horizon.mp3");
//        audioPlayer.play("mp4", "alone.mp4");
//        audioPlayer.play("vlc", "far far away.vlc");
//        audioPlayer.play("avi", "mind me.avi");

        // 桥接模式
//        Shape1 redCircle = new Circle(100, 100, 10, new RedCircle());
//        Shape1 greenCircle = new Circle(100, 100, 10, new GreenCircle());
//
//        redCircle.draw();
//        greenCircle.draw();

//        Scanner scanner = new Scanner(System.in);
//        // 将输入的一行赋值给 string1
//        String string1 = scanner.nextLine();
//        // 将输入单词到第一个空白符为止的字符串赋值给 string2
//        String string2 = scanner.next();
//        // 将输入的数字赋值给变量
//        int a = scanner.nextInt();
//        System.out.println("---录入的信息如下---");
//        System.out.println(string1);
//        System.out.println(string2);
//        System.out.println(a * 10);

        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
