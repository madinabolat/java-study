package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckedException {
    public static void main(String[] args){
        Path path = Paths.get("config.txt");
        String content = Files.readString(path);
        //compile time error
        //this needs exception
        //checked exception
    }
}
