/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patients;

import java.util.HashMap;

/**
 *
 * @author josed
 */
public class PatientsList implements KeyDynamicsLists<Patient,String> {
    
    private HashMap<String,Patient> patients;
    
    public PatientsList(){
        this.patients = new HashMap();
        
    }
    
}
