/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author USER
 */
import java.util.ArrayList; 
import java.util.InputMismatchException; 
import java.util.Scanner;
public class HospitalSystem {

    /**
     * @param args the command line arguments
     */
    static ArrayList<surgeon> surgeonList = new ArrayList<surgeon>(); 
    static ArrayList<person> person = new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in); 
        int ch = 0; 
        Booking booking = null; 
        fillList(surgeonList); 
        System.out.println("***WELCOOM TO HOSPITA SYSTEM***"); 
 
        do { 
            try { 
                menu(); 
                ch = input.nextInt(); 
                switch (ch) { 
                    case 1: 
                        for (surgeon s : surgeonList) { 
                            System.out.println(s); 
                            System.out.println("cost of the surgery" + s.costOfTheSurgery() + "SAR"); 
 
                            if (s instanceof CardiacSurgeo) { 
                                ((CardiacSurgeo) s).performECGCheck(); 
                                System.out.println("should your age: " + CardiacSurgeo.getMIN_AGE()); 
                            } 
 
                            System.out.println("NUMER OF ROOMS: " + s.getOperatingRoom() + "\n"); 
                            System.out.println("----------------------------------------------------"); 
                        } 
 
                        break; 
 
                    case 2: 
 
                        System.out.println("Enter your Surgeon Clinics Number:"); 
                        int num = input.nextInt(); 
                        boolean found = false; 
 
                        for (surgeon s : surgeonList) { 
 
                            int clinicNum = s.getNumSurgeonClinics(); 
 
                            if (clinicNum == num) { 
                                System.out.println("\nSurgeon Found:"); 
                                System.out.println(s); 
                                s.disblySurgeonDoctors(); 
                                 
                                found = true; 
                                break; 
                            } 
                        } 
 
                        if (!found) { 
                            System.out.println("Surgeon Clinics Number " + num + " not found"); 
                        } 
 
                        break; 
 
                    case 3: 
                        System.out.println("Displaying all Appointments:\n"); 
 
                        for (surgeon s : surgeonList) { 
                            Doctor[] doctors = s.getDoctor(); 
 
                            if (doctors != null && doctors.length > 0) { 
                                for (Doctor d : doctors) { 
                                    System.out.print("Appointments for Dr." + d.getFullName() + ":\n"); 
 
                                    Appointment[] appointments = d.getAppointments(); 
 
                                    if (appointments != null && appointments.length > 0) { 
                                        for (Appointment app : appointments) { 
                                            if (app != null) { 
                                                System.out.println(app); 
                                            } 
                                        } 
                                    } else { 
                                        System.out.println("No appointments assigned."); 
                                    } 
 
                                    System.out.println("----------------------------------------"); 
                                } 
                            } 
                        } 
 
                        break; 
 
                    case 4: 
                        int totalSurgeons = surgeonList.size(); 
                        int totalDoctors = 0; 
 
                        for (surgeon s : surgeonList) { 
                            totalDoctors += s.getDoctor().length; 
                        } 
                        System.out.println("--- System Summary ---"); 
                        System.out.println("Total Surgeons: " + totalSurgeons); 
                        System.out.println("Total Doctors: " + totalDoctors); 
                        System.out.println("-----------------------"); 
 
                        break; 
 
                    case 5: 
                        System.out.print("Enter surgeon number: "); 
                        num = input.nextInt(); 
                        surgeon surgeon = null; 
                        for (surgeon c : surgeonList) { 
                            if (c.getNumSurgeonClinics() == num) { 
                                surgeon = c; 
                                break; 
                            } 
                        } 
                        if (surgeon == null) { 
                            System.out.println("surgeon with number " + num + " is not found."); 
                            continue; 
                        } 
                        surgeon.disblySurgeonDoctors(); 
                        Doctor[] doctors = surgeon.getDoctor(); 
                        System.out.print("Enter doctor number: "); 
                        int doctorNum = input.nextInt(); 
                        doctorNum--; 
                        if (doctorNum < 0 || doctorNum >= doctors.length) { 
                            System.out.println("Invalid doctor number."); 
                            continue; 
                        } 
                        Doctor doctor = doctors[doctorNum]; 
                        doctor.displayAvailableAppointments(); 
                        System.out.print("Enter appintment number: "); 
                        int appNumber = input.nextInt(); 
                        Appointment appointment = doctor.getAppointmentNumber(appNumber); 
                        appointment.setPrice(200.0); 
 
                        if (appointment == null) { 
                            System.out.println("Sorry, this appointment is not available or it's invalid number."); 
                            continue; 
                        } 
                        System.out.print("Enter your id: "); 
                        int patientId = input.nextInt(); 
                        input.nextLine(); 
                        System.out.print("Enter your full name: "); 
                        String patintFName = input.nextLine(); 
                        System.out.print("Enter your gender(M,F): "); 
                        char gender = input.next().charAt(0); 
                        System.out.print("Enter your illness: "); 
                        String illness = input.next(); 
                        input.nextLine(); 
                        System.out.print("Enter your medical record id(e.g. 1249): "); 
                        String medRecordNumber = input.nextLine(); 
                        patient patient = new patient(illness, medRecordNumber, patientId, 
patintFName, gender); 
                        booking = new Booking(patient, appointment, doctor.getFullName(), 
surgeon.getClass().getSimpleName()); 
                        System.out.println(booking); 
                        break; 
 
                    case 6: 
                        if (booking != null) { 
                            System.out.println("---- Booking info ----"); 
                            System.out.println(booking); 
                            System.out.println("-----------------------"); 
                        } else { 
                            System.out.println("No appointment booked yet"); 
                        } 
                        break; 
 
                    case 7: 
                        GUI.main(null); 
                        break; 
 
                    case 8: 
 
                        ReadText rt = new ReadText(); 
                        rt.openTextFile("surgeon.txt"); 
                        rt.readFromFile(); 
                        rt.closeFile(); 
 
                        break; 
                    case 9: 
 
                        WriteText wf = new WriteText(); 
                        wf.openTextFile("surgeon.txt"); 
                        if (surgeonList.isEmpty()) { 
                            System.out.println("No surgeon yet."); 
                        } else { 
                            for (surgeon ele : surgeonList) { 
                                wf.writeToFile(ele); 
                            } 
                        } 
                        wf.closeFile(); 
                        System.out.println("All surgeon saved to the text file surgeon.txt"); 
 
                        break; 
 
                    default: 
                        System.err.println("Invalid choice number"); 
 
                } 
            } catch (InputMismatchException ex) { 
                System.err.println("Invalid input"); 
                input.nextLine(); 
            } catch (Exception ex) { 
                System.err.println(ex); 
            } 
 
        } while (ch != 10); 
 
    } 
 
    public static void menu() { 
 
        System.out.println("\n1.display All Surgeons\n" 
                + "2.display Surgeons info\n" 
                + "3.Disblay Appointment\n" 
                + "4.Total Doctors and Surgeons\n" 
                + "5.Make booking \n" 
                + "6.Show booking \n" 
                + "7.GUI \n " 
                + "8.Read from file \n" 
                + "9.Save Surgeons \n" 
                + "\n>> "); 
    } 
 
    public static void fillList(ArrayList<surgeon> List) { 
        Appointment appointment1 = new Appointment("A120", 5, 25, 2, false); 
        Appointment appointment2 = new Appointment("B130", 5, 26, 8, true); 
        Appointment appointment3 = new Appointment("C140", 5, 29, 4, true); 
        Appointment appointment4 = new Appointment("D150", 5, 30, 7, true); 
 
        Appointment[] doctorAppointment1 = {appointment1, appointment2}; 
 
        Appointment[] doctorAppointment2 = {appointment3, appointment4}; 
 
        Doctor[] CardiacSurgeo911 = { 
            new Doctor(53, "lama Ali", 'F', "Q921", doctorAppointment1, "CardiacSurgeon")}; 
        Doctor[] NeuroSurgeon21 = { 
            new Doctor(19, "saad fahad", 'M', "A830", doctorAppointment2, "NeuroSurgeon")}; 
        person.add(CardiacSurgeo911[0]); 
        person.add(NeuroSurgeon21[0]); 
        surgeon s1 = new CardiacSurgeo(7, "Hart", CardiacSurgeo911, "Open Harh Surgery"); 
        surgeon s2 = new NeuroSurgeon(9, "In The brain", NeuroSurgeon21, "brain surgery"); 
 
        List.add(s1); 
        List.add(s2);
    }
    
}
