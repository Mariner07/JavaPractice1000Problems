package com.oop.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UseOfThrows {
    //when reading files, they should always be wrapped with try catch

    public static void main(String[] args) throws FileNotFoundException {

        //Reading files are of compile-time exceptions, but others are run-time exceptions:
        FileReader fr= new FileReader(new File(""));
        BufferedReader br= new BufferedReader(new FileReader(new File("")));

    }
}
