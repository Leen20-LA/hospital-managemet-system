/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author USER
 */
public abstract class surgeon {
    private String TypeOfSurgery; 
    private int SurgeryAppintment; 
    private Doctor[] doctor; 
    private static int operatingRoom; 
    private int numSurgeonClinics; 
 
    public surgeon(int numSurgeonClinics, String TypeOfSurgery, Doctor[] doctor) { 
        this.TypeOfSurgery = TypeOfSurgery; 
this.numSurgeonClinics=numSurgeonClinics; 
        this.doctor = doctor; 
        this.SurgeryAppintment=SurgeryAppintment; 
        operatingRoom++; 
 
    } 
 
    public surgeon() { 
        this(0,"",null); 
    } 
 
    public String getTypeOfSurgery() { 
        return TypeOfSurgery; 
    } 
 
    public void setTypeOfSurgery(String TypeOfSurgery) { 
        this.TypeOfSurgery = TypeOfSurgery; 
    } 
 
    public static void setOperatingRoom(int operatingRoom) { 
        surgeon.operatingRoom = operatingRoom; 
    } 
 
    public int getSurgeryAppintment() { 
        return SurgeryAppintment; 
    } 
 
    public void setSurgeryAppintment(int SurgeryAppintment) { 
        this.SurgeryAppintment = SurgeryAppintment; 
    } 
 
    public Doctor[] getDoctor() { 
        return doctor; 
    } 
 
    public void setDoctor(Doctor[] doctor) { 
        this.doctor = doctor; 
    } 
 
    public int getNumSurgeonClinics() { 
        return numSurgeonClinics; 
    } 
 
    public void setNumSurgeonClinics(int numSurgeonClinics) { 
        this.numSurgeonClinics = numSurgeonClinics; 
} 
public static int getOperatingRoom() { 
return operatingRoom; 
} 
public final void disblySurgeonDoctors() { 
for (int i = 0; i < doctor.length; i++) { 
System.out.println((i + 1) + "Dr." + doctor[i].getFullName() + "," + 
doctor[i].getSpecialty()); 
} 
} 
public abstract double costOfTheSurgery(); 
@Override 
public String toString() { 
String result = "Type Of Surgery: " + TypeOfSurgery + "\nDoctor:\n"; 
for (Doctor d : doctor) result += d + "\n"; 
return result; 
} 

}
