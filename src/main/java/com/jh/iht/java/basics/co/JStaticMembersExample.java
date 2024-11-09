package com.jh.iht.java.basics.co;

class Counter {
    static int count = 0;  // Static variable

    public Counter() {
        count++;  // Increment the count whenever an object is created
    }

    public static int getCount() {
        return count;  // Static method to access the static variable
    }
}

public class JStaticMembersExample {
    public

 static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Number of Counter objects created: " + Counter.getCount());  // Outputs: 3
    }
}