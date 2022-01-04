package com.oop.exceptions;

public class ThrowExample {
    public static void main(String[] args) {
        int dayNumber=22;

        switch(dayNumber){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                throw new IllegalArgumentException("Enter valid number");
        }
        System.out.println("We are using entered number");
    }
}
