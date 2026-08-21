/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

import appointments.Appointment;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import patients.Patient;
import patients.PatientsList;

/**
 *
 * @author Dylan
 */
public class Clinic {
    
    private PatientsList patient;
    private AppointmentsLists appointment;
    private WaitingRoomList waitingRoom;

    //Construc
    public Clinic() {
        this.patient = new PatientsList();
        this.appointment = new AppointmentsLists();
        this.waitingRoom = new WaitingRoomList();
    }
    
    public void addPatient(Patient newpatient){
        patient.add(newpatient);
    }

    public Patient findPatient(String id){
        if (patient.isEmpty()) return null;
        Patient savePat = patient.get(id);
        if (savePat == null) return null;
        return savePat;
    }

    public void removePatient(String id){
        if (patient.isEmpty())return;
        Patient clearPat = patient.get(id);
        if (clearPat == null)return;                        
        patient.remove(clearPat);
    }

    public Iterator<Patient> getPatients(){
        if (patient.isEmpty()) return null;
        return patient.getAll();
    }

    public boolean scheduleAppointment(Appointment newAppointment){
        
        if(findPatient(newAppointment.getPatient().getId()) == null)return false;
        if(appointment.add(newAppointment)) return true;
        return false;
    }

    public Appointment findAppointment(String code){
        if (appointment.isEmpty()) return null;
        Appointment saveApp = appointment.get(code);
        if (saveApp == null) return null;
        return saveApp;
    }

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime){
        
        if (appointment.isEmpty()) return false;
        Appointment saveApp = appointment.get(code);
        if (saveApp == null) return false;
        saveApp.reschedule(newDate, newTime);
        return true;
    }

    public boolean cancelAppointment(String code){
        if (appointment.isEmpty()) return false;
        Appointment cancApp = appointment.get(code);
        if (cancApp == null) return false;
        appointment.remove(cancApp); 
        return true;
    }

    public Iterator<Appointment> getAppointments(){
        
        if (appointment.isEmpty()) return null;
        return appointment.getAll();
    }

    public boolean checkInPatient(String patientId){
        
        Iterator<Appointment> itApp = appointment.getAll();
        while (itApp.hasNext()){ //si hay nueva cita
            Appointment app = itApp.next(); //nos da la cita
            if (app.getPatient().getId().equals(patientId)&&app.isToday()){
                waitingRoom.add(app.getPatient());
                return true;
            }                
        }
        return false;
    }

    public Patient getNextPatient(){
        return null;
    }

    public Patient attendNextPatient(){
        return null;
    }

    public int getWaitingPatientCount(){
        return 0;
    }

    public boolean isPatientWaiting(String patientId){
        return false;
    }
    
    
}
