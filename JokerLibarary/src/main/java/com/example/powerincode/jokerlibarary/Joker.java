package com.example.powerincode.jokerlibarary;

public class Joker {
    private static int mJokerCounter = 0;
    public static String getJoke() {
        return new StringBuilder("Funny joke ").append(++mJokerCounter).toString();
    }
}
