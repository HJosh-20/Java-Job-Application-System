/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Josh
 */
public class StaffMenu extends Menu {
    @Override
    public void printMe(){
        System.out.println("----WORKERS MENU----");
        System.out.println("======================");
        System.out.println("1. Need to add more jobs?");
        System.out.println("2. Need to remove free agents?");
        System.out.println("3. Need to see list of free agents?");
        System.out.println("4. Need to offer a free agent a job?");
        System.out.println("5. Exit");
        System.out.println("======================");
        System.out.println("Enter choice: ");
    }
}
