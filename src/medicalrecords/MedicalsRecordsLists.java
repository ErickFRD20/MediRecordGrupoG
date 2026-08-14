/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecords;

import clinic.DynamicLists;
import java.util.Stack;

/**
 *
 * @author Dylan
 */
public class MedicalsRecordsLists implements SequentialDynamicLists <MedicalRecord>{
    
    Stack <MedicalRecord> medicalHistory;
    
    public MedicalsRecordsLists(){
        this.medicalHistory = new Stack();
    }

    public Stack<MedicalRecord> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(Stack<MedicalRecord> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public MedicalsRecordsLists(Stack<MedicalRecord> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    
    
    
    
}
