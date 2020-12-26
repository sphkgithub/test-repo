package com.poc;

public class Greeting {
    public Greeting() {
        super();
    }
    
    public void printDummy()
    {
        System.out.println("JAVA POC---> DUMMY");
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.printDummy();
        System.out.println("JAVA POC---> HELLO WORLD");
    }
}

