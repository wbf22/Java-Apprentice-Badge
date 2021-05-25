package com.nonagon;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileSorterReverse {


    public static void main(String[] args) throws IOException {
        File input = new File("C:\\FAMILY_SEARCH_PROJECTS\\Java-Apprentice-Badge\\src\\com\\nonagon\\resources\\lorem.txt");
        Scanner reader = new Scanner(input);
        ArrayList<String> inputSerialized = new ArrayList<>();

        while(reader.hasNextLine()){
            inputSerialized.add(reader.nextLine());

        }

        inputSerialized.sort(Collections.reverseOrder());

        FileWriter writer = new FileWriter("C:\\FAMILY_SEARCH_PROJECTS\\Java-Apprentice-Badge\\src\\com\\nonagon\\resources\\loremSortedReversed.txt");
        for(String s : inputSerialized){
            writer.write(s + "\n");
        }

        writer.close();


    }
}
