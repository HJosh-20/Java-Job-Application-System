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
public class SearchingPeopleList {
    public static void SearchPeople(){
        File file = new File("peoplesInfo.txt");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        Scanner scanner;
        
        try {
        scanner = new Scanner(file);

            while (scanner.hasNext()) {
            final String lineFromFile = scanner.nextLine();
                if (lineFromFile.contains(name)) {
                // a match!
                    System.out.println(name);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Cannot write to file " + file.toString());
        }

    }
}