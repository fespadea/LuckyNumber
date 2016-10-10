package com.company;

/**
 * Created by fs279 on 10/10/16.
 */
public class perfectRandom {
    public String name;
    public int luckyNumber;
    public perfectRandom(String s){
        name = s;
        luckyNumber = (int)(Math.random()*46340);
        luckyNumber = luckyNumber * luckyNumber;
    }
}
