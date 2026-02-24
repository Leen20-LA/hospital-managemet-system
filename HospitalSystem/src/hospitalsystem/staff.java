/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author USER
 */
public class staff extends person{
     private String jobTitle; 
    private String Sdepartment; 
 
    public staff(String jobTitle, String Sdepartment,int ID, String FullName, char gender) { 
       super(ID, FullName, gender); 
        this.jobTitle = jobTitle; 
        this.Sdepartment = Sdepartment; 
    } 
 
 
    public staff() { 
        this("","",0,"",' '); 
    } 
 
 
    public String getJobTitle() { 
        return jobTitle; 
    } 
 
    public void setJobTitle(String jobTitle) { 
        this.jobTitle = jobTitle; 
    } 
 
    public String getSdepartment() { 
        return Sdepartment; 
    } 
 
    public void setSdepartment(String Sdepartment) { 
        this.Sdepartment = Sdepartment; 
    } 
@Override 
public String toString() { 
    return String.format( 
        "Staff Information:\n" + 
        "Job Title: %s\n" + 
        "Department: %s\n", 
        jobTitle, 
        Sdepartment 
    ); 
} 
    
}
