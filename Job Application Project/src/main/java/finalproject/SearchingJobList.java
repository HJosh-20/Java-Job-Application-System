/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Josh
 */
public class SearchingJobList {
    public static void SearchJobs(){
        File file = new File("joblist.txt");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        Scanner scanner;
        
        try {
        scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
            final String lineFromFile = scanner.nextLine();
                if (lineFromFile.contains(name)) {
                // a match!
                    System.out.println(name);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println(" cannot write to file " + file.toString());
        }

    }
}
