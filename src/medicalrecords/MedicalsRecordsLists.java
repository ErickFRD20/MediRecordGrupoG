/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecords;

import clinic.DynamicLists;
import clinic.SecuentialDynamicLists;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Dylan
 */
public class MedicalsRecordsLists implements SecuentialDynamicLists <MedicalRecord>{
    
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
    
    //Constructor
    public MedicalsRecordsLists(Stack<MedicalRecord> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    
    //Methods
    @Override
    public MedicalRecord get() {
        return medicalHistory.getLast();
    }

    @Override
    public boolean remove() {
        return medicalHistory.removeElement(this);
    }

    @Override
    public boolean add(MedicalRecord item) {
        return medicalHistory.add(item);
    }

    @Override //responde a patrones de diseños ya preestablecidos, son guias, iterator es uno, devuelve una copia de los datos, 
    public Iterator getAll() {
        if (medicalHistory.isEmpty()) return null; 
        return medicalHistory.iterator();        
    }

    @Override
    public int size() {
        return medicalHistory.size();
    }

    @Override
    public boolean isEmpty() {
        return medicalHistory.isEmpty();
    }
    
    
    
    
}
