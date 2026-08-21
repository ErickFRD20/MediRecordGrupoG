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

/**
 *
 * @author josed
 */
public class ClinicController {
    private Clinic clinic;
    private iView view;
    
    public void setView(iView view){
        this.view = view;
        
    }
    
    private ClinicController(iView view){
        this.clinic = new Clinic();
        this.view = view;
        
    }
    
    private static ClinicController controller;
    public static ClinicController getInstance(iView view){
        if(controller == null)
            controller=new ClinicController(view);
        return controller;
        
    }
            
    
    
    
    public void addPatient(Patient patient){
        boolean status=clinic.addPatient(patient);
        if(status){
            view.showMessage("se registro correctamente");
        }else{
            view.showError("no se pudo registrar el paciente");
        }

    }

    public Patient findPatient(String id){
        Patient patient=clinic.findPatient(id);
        if(patient==null){
            view.showError("no existe ningun paciente con es ID");
            view.clear();
        }
        return patient;
    
        
    }

    public void removePatient(String id){
        boolean status=clinic.removePatient(id);
        if(status){
            view.showMessage("se elimino el paciente");
        }else{
            view.showError("no se pudo eliminar el paciente");
        }
        
    }

    public Iterator<Patient> getPatients(){
        return clinic.getPatients();
    }

    public boolean scheduleAppointment(Appointment appointment){
       boolean status=clinic.scheduleAppointment(appointment);
        if(status){
            view.showMessage("se agendo la cita correctamente");
        }else{
            view.showError("No se pudo agendar la cita");
        }
        return status;
    }

    public Appointment findAppointment(String code){
       Appointment appo = clinic.findAppointment(code);
       if(appo == null){
        view.showError("no existen citas con el codigo ingresado");
        view.clear();
        return null;
    }

    view.showData(appo);
    return appo;
}

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime){
        boolean status = clinic.rescheduleAppointment(code, newDate, newTime);
        if(status){
        view.showMessage("se reagendo la cita correctamente");
        }else{
        view.showError("No se pudo reagendar la cita");
         }
        return status;
    }

    public boolean cancelAppointment(String code){
       boolean status=clinic.cancelAppointment(code);
        if(status){
            view.showMessage("La cita a sido cancelada");
        }else{
            view.showError("no se pudo cancelar la cita");
        }
        return status;
    }

    public Iterator<Appointment> getAppointments(){
        return clinic.getAppointments();
    }

    public boolean checkInPatient(String patientId){
        boolean status = clinic.checkInPatient(patientId);
        if (status){
            view.showMessage("registro completado con exito");
        }else{
            view.showError("No se pudo completar el registro");
        }
        return status;
              
    }

    public Patient getNextPatient(){
        Patient patient=clinic.getNextPatient();
        if(patient==null){
            view.showError("no existen pacientes en la sala de espera");
            view.clear();
        }
        view.showData(patient);
        return patient;
    }

    public Patient attendNextPatient(){
      Patient pat = clinic.getNextPatient();
      if(pat==null){
          view.showError("no existen mas pacientes en la clinica");
      }
      clinic.attendNextPatient();
      return pat;
      
    }

    public int getWaitingPatientCount(){
        return clinic.getWaitingPatientCount();
    }

    public boolean isPatientWaiting(String patientId){
        return clinic.isPatientWaiting(patientId);
    }
    
}
