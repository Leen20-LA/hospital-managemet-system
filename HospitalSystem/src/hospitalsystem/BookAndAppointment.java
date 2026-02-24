/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author USER
 */
public interface BookAndAppointment {
    int MAX_APPOINTMENTS = 10;
    int DEFAULT_ROOM = 2;
    
    boolean canAcceptBooking();
    void reserveSlot();
}
