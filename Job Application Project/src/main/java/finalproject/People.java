/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Josh
 */
public class People {
    private String Name;
    private String Info;
    
    public People(String name, String info){
        this.Name = name;
        this.Info = info;
    }
    
    public String getName(){
        return this.Name;
    }
    
    public String getName(String newName){
        return(this.Name = newName);
    }

    public String getInfo() {
        return Info;
    }
    
    public String getInfo(String newInfo){
        return (this.Info = newInfo);
    } 
    
    @Override
    public String toString(){
        return String.format("%s, %s",this.Name, this.Info);
    }
}
