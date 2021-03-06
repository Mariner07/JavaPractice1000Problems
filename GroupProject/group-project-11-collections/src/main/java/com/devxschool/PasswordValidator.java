package com.devxschool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class PasswordValidator {

    public static void main(String[] args) {
        /**
         * Ask user to enter a new password.
         * If the password does not match any of the requirements below, print a message based on what requirement it is breaking and return false.
         * If it does not break any requirement, print ‘Password accepted’ and return true.
         *
         * Password requirements:
         * Be a minimum of eight (8) characters in length
         * Contain at least one uppercase letter (A-Z)
         * Contain at least one lowercase letter (a-z)
         * Contain at least one digit (0-9) - tip: regex to match (.)*(\d)(.)*)
         * Contain at least one special character (!@#$%^&*()) - note: use List.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();

        PasswordValidator passwordValidator = new PasswordValidator();
        System.out.println("valid password: " + passwordValidator.isValid(password));
    }

    public boolean isValid(String password) {
        //TODO implement validation logic
        if( !checkSize(password) ) {
            return errorMessage("Size");
        }
        if( !hasUpperCase(password)) {
            return errorMessage("Upper Case");
        }
        if( !hasLowerCase(password)) {
            return errorMessage("Lower Case");
        }
        if( !hasNumber(password) ) {
            return errorMessage("Number");
        }
        if( !hasSpecialCharacter(password) ) {
            return errorMessage("Special Character");
        }
        System.out.println("Password accepted");
        return true;
    }

    public boolean hasSpecialCharacter(String password) {
        String special="!@#%$*,";
//        for(int i=0; i<password.length(); i++){
//
//            if(password.charAt(i)=='!'
//            || password.charAt(i)=='@'
//                    || password.charAt(i)=='#'
//                    || password.charAt(i)=='$'
//                    || password.charAt(i)=='%'
//                    || password.charAt(i)=='^'
//                    || password.charAt(i)=='*'
//            ){
//                return true;
//            }
//            else{
//                return false;
//            }
//        }
//        for (int i = 0; i < password.length(); i++) {
//
//            if (special.contains(Character.toString(password.charAt(i))))
//            {
//                return true;
//            }
//
//        }
        List<String> specialCharTable= new ArrayList<>(Arrays.asList("!", "@", "#", "$", "%", "^", "^", "*", "("));
        //String[] specARR= {"!", "@", "#", "$", "%", "^", "^", "*", "("};
        for(String c: specialCharTable ){
            if(password.contains(c)){
                return true;
            }
        }
        //TODO check if password has one of special characters "!", "@", "#", "$", "%", "^", "^", "*", "(", ")"
        return false;
    }

    public boolean hasNumber(String password) {
        //TODO check if password has a number ->tip: pattern is (.)*(\d)(.)*
        for(char uppercase: password.toCharArray() ){
            if(Character.isDigit(uppercase)){
                return true;
            }
        }

        return false;
    }

    public boolean hasLowerCase(String password) {
        //TODO check if password has a Lower Case
        for(char uppercase: password.toCharArray() ){
            if(Character.isLowerCase(uppercase)){
                return true;
            }
        }
        return false;
    }

    public boolean hasUpperCase(String password) {
        //TODO check if password has an Upper Case
        for(char uppercase: password.toCharArray() ){
            if(Character.isUpperCase(uppercase)){
                return true;
            }
        }
        return false;
    }

    public boolean checkSize(String password) {
        //TODO check size is valid
        int len= password.length();
        if(len==8){
            return true;
        }
        return false;
    }

    public boolean errorMessage(String error){
        //TODO print out error message and return
        System.out.println(error);
        return false;
    }
}
