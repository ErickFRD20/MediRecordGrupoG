/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

import java.util.LinkedList;
import java.util.Queue;
import patients.Patient;

/**
 *
 * @author Student
 */
public class WaitingRoomList implements SecuentialDynamicLists<Patient> {
    private Queue<Patient> waitingList;
    
    public WaitingRoomList(){
        this.waitingList = new LinkedList();
    }
}
