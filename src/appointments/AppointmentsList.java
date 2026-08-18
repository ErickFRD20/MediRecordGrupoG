/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointments;

import clinic.KeyDynamicsLists;
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
    
}
