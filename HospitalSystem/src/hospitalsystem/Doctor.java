/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author USER
 */
public class Doctor extends person implements BookAndAppointment{
     private String licenseNumber; 
    private Appointment[] appointments; 
    private String specialty; 
 
    public Doctor(int ID, String FullName, char gender, String licenseNumber, 
Appointment[] appointments, String specialty) { 
        super(ID, FullName, gender); 
        this.licenseNumber = licenseNumber; 
        this.appointments = appointments; 
        this.specialty = specialty; 
 
    } 
 
    public Doctor() { 
        this(0," ",' ',"",null," "); 
    } 
 
    public String getLicenseNumber() { 
        return licenseNumber; 
    } 
 
    public void setLicenseNumber(String licenseNumber) { 
        this.licenseNumber = licenseNumber; 
    } 
 
    public Appointment[] getAppointments() { 
        return appointments; 
    } 
 
    public void setAppointments(Appointment[] appointments) { 
        this.appointments = appointments; 
    } 
 
    public String getSpecialty() { 
        return specialty; 
    } 
 
    public void setSpecialty(String specialty) { 
        this.specialty = specialty; 
    } 
 
    public final void displayAvailableAppointments() { 
        System.out.println("available Appointments"); 
        for (Appointment app : appointments) { 
            if (app != null && app.canAcceptBooking()) { 
                System.out.println(app); 
            } 
        } 
    } 
 
    public Appointment getAppointmentNumber(int index) { 
        if (index >= 0 && index < appointments.length) { 
        } 
        return appointments[index]; 
    } 
 
    @Override 
    public boolean canAcceptBooking() { 
        int openslots = 0; 
        if (openslots > 0 || openslots > 5) { 
            return true; 
        } else { 
            return false; 
        } 
    } 
 
    @Override 
    public void reserveSlot() { 
        if (canAcceptBooking()) { 
            System.out.println("Slot reserved for doctor."); 
        } else { 
            System.out.println("Cannot reserve: no available slots."); 
        } 
 
    } 
 
    public String getApp() { 
 
        String a = ""; 
        for (Appointment aa : appointments) { 
            a += aa + "\n"; 
        } 
 
        return a; 
    } 
 
    @Override 
    public String toString() { 
        return String.format( super.toString()+ 
                 "Doctor Information:\n" 
                + "License Number: %s\n" 
                + "Appointments: \n%s\n" 
                + "Specialty: %s\n", 
                licenseNumber, 
                getApp(), 
                specialty 
        ); 
    }
}
