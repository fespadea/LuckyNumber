package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String x = "2";
        String nameList = "";
        do {
            System.out.println("Give me a name.");
            Scanner giveMeName = new Scanner(System.in);
            String name = giveMeName.nextLine();
            perfectRandom person = new perfectRandom(name);
            System.out.println("Nice to meet you " + name + "! Your lucky number is " + person.luckyNumber + ".");
            nameList = nameList + (String.valueOf(person.name)) + ": " + (String.valueOf(person.luckyNumber)) + "\n";
            System.out.println("What next?");
            Scanner number = new Scanner(System.in);
            x = number.next();
            if(x.equals("1")){
                System.out.print(nameList);
            }
        }while(x.equals("2"));
    }
}
