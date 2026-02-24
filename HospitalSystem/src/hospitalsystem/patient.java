/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author USER
 */
public class patient extends person {
      private String illness; 
    private String recordNumber; 
 
    public patient(String illness, String recordNumber, int ID, String FullName, char gender) 
{ 
        super(ID, FullName, gender); 
        this.illness = illness; 
        this.recordNumber = recordNumber; 
 
    } 
 
    public patient() { 
        this("", "", 0, "", ' '); 
    } 
 
    public String getIllness() { 
        return illness; 
    } 
 
    public void setIllness(String illness) { 
        this.illness = illness; 
    } 
 
    public String getRecordNmber() { 
        return recordNumber; 
    } 
 
    public void setRecordNmber(String recordNmber) { 
        this.recordNumber = recordNmber; 
    } 
 
    @Override 
    public String toString() { 
        return String.format(super.toString() 
                + "Illness: %s\n" 
                + "Record Number: %s\n", 
                illness, 
                recordNumber 
        ); 
    }
}
