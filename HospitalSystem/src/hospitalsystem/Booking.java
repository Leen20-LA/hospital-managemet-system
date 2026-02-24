/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author USER
 */
public class Booking {
     private final int ID; 
    private patient patient; 
    private Appointment appointment; 
    private String doctorName; 
    private String surgeonType; 
    private String status; 
 
    public Booking(patient patient, Appointment appointment, String doctorName, String 
surgeonType) { 
        this.ID = generateId(); 
        setPatient(patient); 
        setAppointment(appointment); 
        setDoctorName(doctorName); 
        setSurgeonType(surgeonType); 
        setStatus("New"); 
    } 
 
    public Booking() { 
        this(null, null, "", ""); 
    } 
 
    //methods 
    private final int generateId() { 
        int min = 1; 
        int max = 1000; 
        int num = (int) (Math.random() * ((max - min) + 1)) + min; 
        return num; 
    } 
 
    public double calcCost() { 
        double price = appointment.getPrice(); 
 
        return price; 
    } 
 
    public int getID() { 
        return ID; 
    } 
 
    public patient getPatient() { 
        return patient; 
    } 
 
    public void setPatient(patient patient) { 
        this.patient = patient; 
    } 
 
    public Appointment getAppointment() { 
        return appointment; 
    } 
 
    public void setAppointment(Appointment appointment) { 
        this.appointment = appointment; 
    } 
 
    public String getDoctorName() { 
        return doctorName; 
    } 
 
    public void setDoctorName(String doctorName) { 
        this.doctorName = doctorName; 
    } 
 
    public String getSurgeonType() { 
        return surgeonType; 
    } 
 
    public void setSurgeonType(String surgeonType) { 
        this.surgeonType = surgeonType; 
    } 
 
    public String getStatus() { 
        return status; 
    } 
 
    public void setStatus(String status) { 
        this.status = status; 
    } 
 
    @Override 
    public String toString() { 
        return String.format("Booking ID: %d\nClinic Type:%s\nDoctor Name: %s\nPatient: \n%s\nAppointment: %s\nStatus: %s\nTotal Payemnt: %.2f SAR.", 
                getID(), surgeonType, getDoctorName(), getPatient(), getAppointment(), getStatus(), calcCost()); 
    }
}
