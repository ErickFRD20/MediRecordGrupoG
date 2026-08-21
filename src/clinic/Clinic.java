/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

import appointments.Appointment;
import appointments.AppointmentStatus;
import appointments.AppointmentsList;
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
    private AppointmentsList appointment;
    private WaitingRoomList waitingRoom;

    //Construc
    public Clinic() {
        this.patient = new PatientsList();
        this.appointment = new AppointmentsList();
        this.waitingRoom = new WaitingRoomList();
    }
    
    public boolean addPatient(Patient newpatient){
        patient.add(newpatient);
        return true;
    }

    public Patient findPatient(String id){
        if (patient.isEmpty()) return null;
        Patient savePat = patient.get(id);
        if (savePat == null) return null;
        return savePat;
    }

    public boolean removePatient(String id){
        if (patient.isEmpty())return false ;
        Patient clearPat = patient.get(id);
        if (clearPat == null)return false;                        
        patient.remove(clearPat);
        return true;
    }

    public Iterator<Patient> getPatients(){
        if (patient.isEmpty()) return null;
        return patient.getAll();
    }

    public boolean scheduleAppointment(Appointment newAppointment){        
        if(findPatient(newAppointment.getPatient().getId()) == null)return false;
        return appointment.add(newAppointment);
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
        appointment.cancel();
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
                app.setStatus(AppointmentStatus.CHECKED_IN);
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
