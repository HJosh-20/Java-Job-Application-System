/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Josh
 */
public class Jobs {
    private String ID;
    private String JobName;
    private String JobInfo;
    
    public Jobs(String id, String jobName, String jobInfo){
        this.ID= id;
        this.JobName = jobName;
        this.JobInfo = jobInfo;
    }
    
     public String getID(){
        return this.ID;
    }
     
    public String getID(String newID){
        return(this.ID = newID);
    }
    
    public String getJobName(){
        return this.JobName;
    }
    
    public String getJobName(String newJobName){
        return(this.JobName = newJobName);
    }
    public String getJobInfo(){
        return this.JobInfo;
    }
    
    public String getJobInfo(String newJobInfo){
        return(this.JobInfo = newJobInfo);
    }
    
    @Override
    public String toString(){
        return String.format("%s, %s: %s", this.ID, this.JobName, this.JobInfo);
    }
}
