/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointments;

import clinic.KeyDynamicsLists;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author mr117
 */
public class AppointmentsList implements
        KeyDynamicsLists<Appointment, String>{
    private TreeSet<Appointment> appointments;
    
    public AppointmentsList(){
        this.appointments = new TreeSet();
    }

    @Override
    public Appointment get(String id) {
        for(Appointment appointment : this.appointments){
            if(appointment.getCode().equals(id)){
                return appointment;
            }
        }
        return null;    }

    @Override
    public boolean remove(String id) {
        Appointment found = get(id);
        if(found == null){
            return false;
        }
        return this.appointments.remove(found);
    }

    @Override
    public boolean add(Appointment item) {
        return this.appointments.add(item);

    }

    @Override
    public Iterator getAll() {
        return this.appointments.iterator();

    }

    @Override
    public int size() {
        return this.appointments.size();

    }

    @Override
    public boolean isEmpty() {
        return this.appointments.isEmpty();

    }
    public boolean cancel(String id) {
    Appointment appointment = get(id);
    if (appointment == null) {
        return false;
    }
    appointment.cancel();
    return true;
}
}
