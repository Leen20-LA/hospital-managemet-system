/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author USER
 */
public class Appointment implements BookAndAppointment {
    private String appointment; 
    private int month; 
    private int day; 
    private int hour; 
    private boolean checkAvailability; 
    private double price; 
 
    public Appointment(String appointment, int month, int day, int hour, boolean 
checkAvailability) { 
        this.appointment = appointment; 
        this.month = month; 
        this.day = day; 
        this.hour = hour; 
    } 
 
    public Appointment() { 
        this("", 0, 0, 0, false); 
    } 
 
    public String getAppointment() { 
        return appointment; 
    } 
 
    public void setAppointment(String appointment) { 
        this.appointment = appointment; 
    } 
 
    public int getMonth() { 
 
        return month; 
    } 
 
    public void setMonth(int month) { 
        if (month < 1 || 12 > month) { 
            System.out.println("inalid month"); 
        } else { 
 
            this.month = month; 
        } 
    } 
 
    public int getDay() { 
        return day; 
    } 
 
    public void setDay(int day) { 
        if (day < 1 || 30 > day) { 
            System.out.println("inalid day"); 
        } else { 
 
            this.day = day; 
        } 
    } 
 
    public double getPrice() { 
        return price; 
    } 
 
    public void setPrice(double price) { 
        this.price = price; 
    } 
 
    public int getHour() { 
        return hour; 
    } 
 
    public void setHour(int hour) { 
        if (hour < 1 || 24 > hour) { 
            System.out.println("inalid hour"); 
        } else { 
 
            this.hour = hour; 
        } 
    } 
 
    public boolean getCheckAvailability() { 
        boolean chois = false; 
        if (chois) { 
            return true; 
        } else { 
            return false; 
        } 
 
    } 
 
    public void setCheckAvailability(boolean checkAvailability) { 
        this.checkAvailability = checkAvailability; 
    } 
 
    @Override 
    public boolean canAcceptBooking() { 
        if (checkAvailability) { 
            return true; 
        } else { 
            return false; 
        } 
    } 
 
    @Override 
    public void reserveSlot() { 
 
        setCheckAvailability(false); 
        System.out.println("its not valid"); 
 
    } 
 
    ; 
 @Override 
    public String toString() { 
        return String.format( 
                "Appointment Details:\n" 
                + "ID: %s\n" 
                + "Date: %02d/%02d\n" 
                + "Hour: %02d:00\n" 
                , 
                appointment, 
                day, 
                month, 
                hour 
                
        ); 
    } 
 

}
