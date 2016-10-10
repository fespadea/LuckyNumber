package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int x = 27;
        ArrayList nameList;
        do {
            System.out.println("Give me a number.");
            Scanner giveMeName = new Scanner(System.in);
            String name = giveMeName.nextLine();
            perfectRandom person = new perfectRandom(name);
            System.out.println("ice to meet you " + name + "! Your lucky number is " + person.luckyNumber + ".");
            nameList.add(person.name + ": " + person.luckyNumber + "\n");
        }while(x != 0);
    }
}
