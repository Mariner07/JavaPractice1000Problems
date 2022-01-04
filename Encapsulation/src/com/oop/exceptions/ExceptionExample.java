package com.oop.exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
//        int a =10, b=20;
//        int ar[] =new int[]{1,2,3,4,5};
//
//        try {
//            System.out.println(ar[5]);
//        }catch (ArithmeticException e){
//            System.out.println("Error! index out of bound");
//        }catch(Exception e){
//            System.out.println("Error!");
//        }
//
//        String str= "Hello";
//        System.out.println(str);
        String cost= "12*";
        try{
        int costInt= Integer.parseInt(cost);
            System.out.println(costInt);}
        catch(NumberFormatException e){
            for(char i: cost.toCharArray()){
                if(i>='0' && i<='9'){
                    continue;
                }
                else{
                    System.out.println("Please change the following into integer: "+ i);
                    break;
                }
            }

        }




    }
}
