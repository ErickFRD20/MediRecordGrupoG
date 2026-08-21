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
    if (patient.isEmpty()) return false;
    return patient.remove(id);
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
        cancApp.cancel();
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
        return waitingRoom.get();
    }

    public Patient attendNextPatient(){
        Patient patient = waitingRoom.get();

    if (patient == null) {
        return null;
    }
    waitingRoom.remove();
    return patient;
    }

    public int getWaitingPatientCount(){
        return waitingRoom.size();
    }

    public Iterator<Patient> getWaitingPatients(){
        return waitingRoom.getAll();
}

    
public boolean isPatientWaiting(String patientId){
    Iterator<Patient> patients = waitingRoom.getAll();
    while (patients.hasNext()) {
        Patient patient = patients.next();
        if (patient.getId().equals(patientId)) {
            return true;
        }
    }

    return false;
}

}

