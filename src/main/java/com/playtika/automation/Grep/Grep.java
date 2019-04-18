package com.playtika.automation.Grep;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Grep  {

public String getInputData(){
    return new Scanner(System.in).nextLine();
}

public Path getPath(String inputPath){
    return Paths.get(inputPath);
}

public void phraseChecker(Path path, String phrase) throws IOException {
    LineNumberReader reader = new LineNumberReader(Files.newBufferedReader(path));
    String resultLine;
    while ((resultLine = reader.readLine()) != null){
        if(resultLine.contains(phrase)){
            System.out.printf("\t%d: %s%n", reader.getLineNumber(), resultLine);
        }
    }
}

    public static void main(String[] args) throws IOException {
        Grep grep = new Grep();

        System.out.println("Enter path: ");
        Path path = grep.getPath(grep.getInputData());

        System.out.println("Enter phrase: ");
        String phrase = grep.getInputData();

        grep.phraseChecker(path, phrase);

    }
}