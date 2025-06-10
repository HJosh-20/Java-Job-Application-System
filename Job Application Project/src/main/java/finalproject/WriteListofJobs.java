/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author Josh
 */
public class WriteListofJobs {
    //Below is how to read a file that has info in.
    public static void writeFileJobList(String fileName, ArrayList<Jobs> jobs){
        try{
            FileWriter fw2 = new FileWriter(fileName, true);
            //Actually adding the array list into the file
            try (PrintWriter pw2 = new PrintWriter(fw2)) {
                //Actually adding the array list into the file
                for(int i = 0; i < jobs.size(); i++){
                    pw2.println(jobs.get(i));
                }
            }
        }
        //Use of exception
        catch(IOException e){
            System.out.println("Errow - Can't write into file" + fileName);
        }
    }
}

