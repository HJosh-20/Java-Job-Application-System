/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Josh
 */
public class FileReadPeoplesInfo {
    public static void fileReadPeoplesInfo() {
        try {
            File myObj;
            myObj = new File("peoplesInfo.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String people = myReader.nextLine();
                System.out.println(people);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
    
    /*
    public static void readPeopleInfo(String[] args){
        String[] text = readArray("peoplesInfo.txt");
        System.out.println(text);
    }
    
    public static String readString(String file)
    
    
    public static String[] readArray(String file){
        //Step 1: Counter num of lines in a file.
        //Step 2: Create array and copy the elements 
        int count = 0;
        try{
            Scanner s1 = new Scanner(new File(file));
            while(s1.hasNextLine()){
                count += 1;
            }
            String[] words = new String[count];
            
            Scanner s2 = new Scanner(new File(file));
            for(int i = 0; i < count; i = i + 1){
                words[i] = s2.next();
            }
            return words;
        }
        catch(FileNotFoundException e){
            
        }
        return null;
    }
    */
    

