/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author USER
 */
public class CardiacSurgeo extends surgeon {
     private String heartSpecialty; 
    private static final int MIN_AGE = 10; 
 
    public CardiacSurgeo(int numSurgeonClinics, String TypeOfSurgery, Doctor[] doctor, 
String heartSpecialty) { 
        super(numSurgeonClinics, TypeOfSurgery, doctor); 
        this.heartSpecialty = heartSpecialty; 
    } 
 
    public CardiacSurgeo() { 
       this(0,"",null,""); 
    } 
 
    public static int getMIN_AGE() { 
        return MIN_AGE; 
    } 
 
    public String getHeartSpecialty() { 
        return heartSpecialty; 
    } 
 
    public void setHeartSpecialty(String heartSpecialty) { 
        this.heartSpecialty = heartSpecialty; 
    } 
 
    public void performECGCheck() { 
        System.out.println("Performing ECG check for the patient..."); 
        System.out.println("Connecting ECG electrodes..."); 
        System.out.println("Recording heart's electrical activity..."); 
        System.out.println("ECG completed. Report will be analyzed."); 
    } 
 
    @Override 
    public String toString() { 
        return String.format(super.toString()+ " heartSpecialty: %s\n", heartSpecialty); 
    } 
 
    @Override 
    public double costOfTheSurgery() { 
        return 20000.0; 
    }
}
