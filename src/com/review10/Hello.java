package com.review10;

public class Hello {

    Hello(String a){
        this("hello","bye");
        System.out.println("This is the value of a: "+a);
    }
    Hello(String a, String b){
        this("First","Second","Third");
        System.out.println("This is the value of b: "+b);
    }
    Hello(String a, String b, String c){
        System.out.println("This is the value of c: "+c);
    }

    public static void main(String[] args) {
        Hello obj= new Hello("A");
    }

}