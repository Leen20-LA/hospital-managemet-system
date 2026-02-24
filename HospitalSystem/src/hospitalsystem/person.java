/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author USER
 */
public abstract class person {
     private int ID; 
    private String FullName; 
    private char gender; 
 
    public person(int ID, String FullName, char gender) { 
        this.ID = ID; 
        this.FullName = FullName; 
        this.gender = gender; 
    } 
 
    public person() { 
        this(0, "", ' '); 
    } 
 
    public int getID() { 
        return ID; 
    } 
 
    public void setID(int ID) { 
        this.ID = ID; 
    } 
 
    public String getFullName() { 
        return FullName; 
    } 
 
    public void setFullName(String FullName) { 
        this.FullName = FullName; 
    } 
 
    public char getGender() { 
        return gender; 
    } 
 
    public void setGender(char gender) { 
        this.gender = gender; 
    } 
 
    public final String getTitaleBasedOnGender() { 
 
        if (gender == 'm' || gender == 'M') { 
            return "Mr." + FullName; 
        } else if (gender == 'f' || gender == 'F') { 
 
            return "Ms." + FullName; 
        } else { 
            return FullName; 
        } 
    } 
 
    ; 
@Override 
    public String toString() { 
        return String.format( 
                 "ID: %s\n" 
                + "Full Name: %s\n" 
                + "Gender: %s\n", 
                ID, 
                FullName, 
                gender 
        ); 
    }
}
