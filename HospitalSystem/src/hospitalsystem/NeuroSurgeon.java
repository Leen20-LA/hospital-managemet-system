/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author USER
 */
public class NeuroSurgeon extends surgeon { 
 
    private String brainArea; 
   private String NeroSpecialty; 
    public NeuroSurgeon(int numSurgeonClinics,String TypeOfSurgery, Doctor[] doctor, 
String NeroSpecialty) { 
        super( numSurgeonClinics,TypeOfSurgery,  doctor); 
        this.brainArea=NeroSpecialty; 
         
    } 
 
    public NeuroSurgeon() { 
 this(0,"",null,""); 
    } 
 
    public void setBrainArea(String brainArea) { 
        this.brainArea = brainArea; 
    } 
 
    public String getBrainArea() { 
        return brainArea; 
    } 
 
    public String getNeroSpecialty() { 
        return NeroSpecialty; 
    } 
 
    public void setNeroSpecialty(String NeroSpecialty) { 
        this.NeroSpecialty = NeroSpecialty; 
    } 
 
    
    @Override 
    public double costOfTheSurgery() { 
        double cost = 15000.0; 
 
        return cost; 
    } 
@Override 
public String toString() { 
    return String.format(super.toString()+ 
       "%s: brainArea", brainArea 
    ); 
}
}
