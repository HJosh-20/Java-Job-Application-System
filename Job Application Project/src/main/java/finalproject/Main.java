/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

import static finalproject.FileCreateJobList.createJobFile;
import static finalproject.FileCreatePeopleInfo.createPeopleFile;
import static finalproject.FileReadJobList.fileReadJoblist;
import static finalproject.FileReadPeoplesInfo.fileReadPeoplesInfo;
import static finalproject.WriteListofJobs.writeFileJobList;
import static finalproject.WritePeoplesInfoFile.writeFile;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Josh
 */
public class Main {
    public static void main(String[] args){
        //User Choice
        int choice;
        //Display Menu
        
        createPeopleFile();
        createJobFile();
        
        ArrayList<Jobs> jobs = new ArrayList<>();
        
        ArrayList<People> pep = new ArrayList<>();
        
        Menu obj = new Menu();
        Menu obj2 = new AgentMenu();
        Menu obj3 = new StaffMenu();
        
        JobActions apply = new JobActions();
        
        obj.printMe();
        
        Scanner in = new Scanner(System.in);
        choice = in.nextInt();
        
        while (choice != 3){
            //This Below is all free agent
            if (choice == 1){
                System.out.println("Welcome Free Agent");
                
                int ch;
                //Display Agent menu
                obj2.printMe();
                
                Scanner in2 = new Scanner(System.in);
                ch = in2.nextInt();
                
                while(ch != 6){
                    if(ch == 1){
                        System.out.println("Please enter info for example: John doe, True: History (or  just) False");
                        
                        pep.add(new People("Kevin H","True: Nursing"));
                        
                        writeFile("peoplesInfo.txt", pep);
                    }
                    else if(ch == 2){
                        //Reading the job list
                        fileReadJoblist();
                        
                    }
                    else if(ch == 3){
                        //applying for jobs function
                        apply.ApplyForJobs();
                    }
                    else if(ch == 4){
                        //accepting jobs function
                        apply.AcceptJobs();
                       
                    }
                    else if(ch == 5){
                        //declining jobs function
                        apply.DeclineJobs();
                        
                    }
                    
                    //Display Agent menu 
                    obj2.printMe();
                    
                    ch = in2.nextInt();
                }
            }
            //No more free agent Here below is all Management/Staff.
            else if (choice == 2){
                
                int ch;
                //Display Management and Staff menu once correct password is inplemented.
                obj3.printMe();
                
                Scanner in2 = new Scanner(System.in);
                ch = in2.nextInt();
                
                while(ch != 5){
                    if(ch == 1){
                        System.out.println("To add job follow the format below.");
                        System.out.println("ID, Job name: Starting pay and days in the week you will and the times.");
                        
                        jobs.add(new Jobs("1567","Janitor","Starting pay is $14 per hour and you will work Monday - Friday from 6pm - 4am."));
        
                        writeFileJobList("joblist.txt", jobs);
                    }
                    else if(ch == 2){
                        System.out.println("Please enter which person you would like to remove.");
                        
                        pep.remove("Kevin H");
                    }
                    else if(ch == 3){
                        fileReadPeoplesInfo();
                    }
                    else if(ch == 4){
                        apply.OfferJobs();
                    }
                    obj3.printMe();
                    
                    ch = in2.nextInt();
                }
            }
            //Display Menu
            obj.printMe();
            
            choice = in.nextInt();
        }
    }

}

