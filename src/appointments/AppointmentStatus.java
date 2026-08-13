/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package appointments;

/**
 *
 * @author jprod
 */
public enum AppointmentStatus {
    SCHEDULED("Programado"),
    CHECKED_IN("Registrado"),
    COMPLETED("Completado"),
    CANCELLED("Cancelado");
    private String status;

    public String getStatus() {
        return status;
    }

    private AppointmentStatus(String status) {
        this.status = status;
    }
    
}
