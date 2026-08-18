/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

import java.util.Iterator;

/**
 *
 * @author Dylan
 */
public class Clinic {
    
    private PatientsLists patient;
    private AppointmentsLists appointment;
    private WaitingRoomLists waitingRoom;

    //Construc
    public Clinic() {
        this.patient = new PatientsLists();
        this.appointment = new AppointmentsLists();
        this.waitingRoom = new WaitingRoomLists();
    }
    
    public void addPatient(Patient patient){

    }

    public void findPatient(String id){
        
    }

    public void removePatient(String id){
        
    }

    public Iterator<Patient> getPatients(){
        
    }

    public boolean scheduleAppointment(Appointment appointment){
        return false;
    }

    public Appointment findAppointment(String code){
        return null;
    }

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime){
        
        if (appointment.isEmpty()) return false;
        Appointment saveApp = appointment.get(code);
        if (saveApp == null) return false;
        saveApp.reschedule(newDate, newTime);
        return true;
    }

    public boolean cancelAppointment(String code){
        return false;
    }

    public Iterator<Appointment> getAppointments(){
        return null;
    }

    public boolean checkInPatient(String patientId){
        
        Iterator<Appointnment> itApp = appointment.getAll();
        while (itApp.hasNext()){ //si hay nueva cita
            appointment app = itApp.next(); //nos da la cita
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
