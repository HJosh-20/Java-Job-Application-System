/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

import static finalproject.SearchingJobList.SearchJobs;
import static finalproject.SearchingPeopleList.SearchPeople;

/**
 *
 * @author Josh
 */
public class JobActions implements Action {

    @Override
    public void ApplyForJobs() {
        System.out.println("Please enter the job name or ID that you are applying for.");
        SearchJobs();
        
        System.out.println("");
        System.out.println("you have successfully applied for a job.");
    }

    @Override
    public void AcceptJobs() {
        System.out.println("Please enter the job name or ID that you have accepted.");
        SearchJobs();
        
        System.out.println("If the name of what your searching for doesnt not show up then please try again");
        System.out.println("you have successfully accepted a job.");
    }

    @Override
    public void DeclineJobs() {
        System.out.println("Please enter the job name or ID you wish to decline.");
        SearchJobs();
        
        System.out.println("If the name of what your searching for doesnt not show up then please try again");
        System.out.println("you have successfully declined a job.");
    }

    @Override
    public void OfferJobs() {
        System.out.println("Please enter who you wish to offer a job too.");
        SearchPeople();
        
        System.out.println("If the name of what your searching for doesnt not show up then please try again");
        System.out.println("you have successfully offered a job.");
    }
    
}
