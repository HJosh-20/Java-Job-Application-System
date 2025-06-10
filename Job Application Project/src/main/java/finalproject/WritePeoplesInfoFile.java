/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author Josh
 */
public class WritePeoplesInfoFile {
    //Writting the File with peoples info
    //Use of FileIO
    public static void writeFile(String fileName, ArrayList<People> people){
        try{
            FileWriter fw = new FileWriter(fileName, true);
            PrintWriter pw = new PrintWriter(fw);
            //Actually adding the array list into the file
            for(int i = 0; i < people.size(); i++){
                pw.println(people.get(i));
            }
            pw.close();
        }
        //Use of exception
        catch(IOException e){
            System.out.println("Errow - Can't write into file" + fileName);
        }
    }
}   
    //Creating some data
        //Use of collections & Lambda exception i think?          
/*
//Below is how to read a file that has info in.
public static void readFile(String fileName, ArrayList<String> data){
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            //line = br.readLine() will read each line and store in String line once it reaches the end it will be = to null
            while((line = br.readLine()) != null){
                //Adding all the info into the file.
                data.add(line);
            }
            br.close();
        }
        catch(IOException e){
            System.out.println("Errow - Can't write into file" + fileName);
        }
    }

                        people.add("Liam H, True: Computer Science");
                        people.add("James L, False");
                        people.add("Linda A, True: Health Professions");
                        people.add("Kim K, False");        
                        people.add("Sarah M, True: Business");       
                        people.add("William F, True: Education");
                        people.add("Susan H, True: Finance");       
                        people.add("Karen R, False");        
                        people.add("Thomas K, False");        
                        people.add("Cynthia E, True: Engineering");        
                        people.add("Nick G, False");        
                        people.add("Eric H, True: Communication");        
                        people.add("Larry Z, True: Performing Arts");        
                        people.add("Helen S, False");        
                        people.add("Rebecca D, True: Psychology");        
                        people.add("Anna N, True: Finance");        
                        people.add("Samantha R, True: Communication");        
                        people.add("Julie A, False");        
                        people.add("Nathan B, False");       
                        people.add("Jack O, True: Engineering");        
                        people.add("Emma R, True: Engineering");        
                        people.add("Joyce A, False");        
                        people.add("Noah M, True: Computer Science");        
                        people.add("Joshua H, True: Computer Science");        
                        people.add("Travis C, False");        
                        people.add("Jessica M, True: Health Professions");        
                        people.add("Alice K, False");        
                        people.add("Madison G, True: Performing Arts");        
                        people.add("Jordan D, False");        
                        people.add("Alexis H,  False");        
                        people.add("Kayla C, False");        
                        people.add("Russel W, True: Health Professions");
                        people.add("Hunter M, True: Computer Science");
                        people.add("Garrett L, False");
                        people.add("Sophie R, True: Health Professions");
                        people.add("Amber H, True: Education");        
                        people.add("Scott C, True: Business");       
                        people.add("Jose J, False");
                        people.add("Tyler H, True: Finance");       
                        people.add("Carolyn B, False");        
                        people.add("Joe E, False");        
                        people.add("Adam S, True: Performing Arts");        
                        people.add("Henry R, False");        
                        people.add("Kelly Y, True: Communication");        
                        people.add("Olivia G, True: Performing Arts");        
                        people.add("Alex F, False");        
                        people.add("Johnny D, True: Psychology");        
                        people.add("Heather T, True: Finance");        
                        people.add("Andrea A, True: Communication");        
                        people.add("Keith E, False");        
                        people.add("Judith F, False");       
                        people.add("Grace P, True: Engineering");        
                        people.add("Logan P, True: Psychology");
                        jobs.add("2314, Nuclear Engineer: Starting pay is $95k and you will work Monday - Friday from 7am - 4pm.");
                        jobs.add("2075, Software Engineer: Starting pay is $80k and you will work Monday - Friday from 9am - 4pm.");
                        jobs.add("3741, PreSchool Teacher: Starting pay is $25k and you will work Monday - Friday from 7am - 3pm.");
                        jobs.add("3123, High School Teacher: Starting pay is $30k and you will work Monday - Friday from 9am - 5pm.");
                        jobs.add("1892, Journalist: Starting pay is $50k and you will work Sunday - Thursday from TBD.");
                        jobs.add("4001, Nursing: Starting pay is $65k and you will work Monday - Thursday from 6am - 6pm");
                        jobs.add("4567, Pediatrician: Starting pay is $125k and you will work Monday - Friday from 8am - 4pm.");
                        jobs.add("4123, Financial Analyst: Starting pay is $69k and you will work Monday - Friday from 8am - 4:30pm.");
                        jobs.add("1061, Retail Sales Rep: Starting pay is $40k and you will work Monday - Sunday from 9am - 10pm Note: 3 days off and when youll be scheduled vary.");
                        jobs.add("5351, Accountant: Starting pay is $70k and you will work Monday - Friday from 10am - 6pm.");
                        jobs.add("6032, Orchestra: Starting pay is $72k and you will work TBD and practice Monday - Thursday from 11am - 3pm.");
                        jobs.add("1278, Customer Service Rep: Starting pay is $31k and you will work Monday - Sunday from 6am - 11pm Note: 2 days off and when youll be scheduled vary.");
                        jobs.add("2346, Electrical Engineer: Starting pay is $86k and you will work Monday - Friday from 9am - 4pm.");
                        jobs.add("1145, Marketing Rep: Starting pay is $48k and you will work Monday - Friday from 9am - 5pm.");
                        jobs.add("6320, Actor: Starting pay is $40k and you will work TBD.");
                        jobs.add("2913, Hardware Engineer: Starting pay is $75k and you will work Monday - Friday from 9am - 4pm.");
                        jobs.add("3896, High School Counselor: Starting pay is $35k and you will work Monday - Friday from 9am - 5pm.");
*/

