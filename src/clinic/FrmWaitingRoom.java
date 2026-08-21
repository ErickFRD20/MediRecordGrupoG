/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinic;

import appointments.Appointment;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import medicalrecords.MedicalRecord;
import patients.Patient;

/**
 *
 * @author Student
 */
public class FrmWaitingRoom extends javax.swing.JFrame {

    private Clinic clinic;
    private ArrayList<Appointment> citasHoy;
    private Patient pacienteActual;

    public FrmWaitingRoom() {
        this(new Clinic());
    }

    public FrmWaitingRoom(Clinic clinic) {
        initComponents();
        this.clinic = clinic;
        this.citasHoy = new ArrayList<>();
        cargarCitasDeHoy();
        cargarSalaEspera();
        habilitarRegistro(false);
    }

    private void cargarCitasDeHoy() {
        DefaultListModel<String> model = new DefaultListModel<>();
        citasHoy.clear();

        Iterator<Appointment> citas = clinic.getAppointments();

        if (citas != null) {
            while (citas.hasNext()) {
                Appointment cita = citas.next();

                if (cita.isToday() && cita.isPending()
                        && !clinic.isPatientWaiting(cita.getPatient().getId())) {
                    citasHoy.add(cita);
                    model.addElement(cita.getTime() + " - " + cita.getPatient().getFullName());
                }
            }
        }

        lstCitasHoy.setModel(model);
    }

    private void cargarSalaEspera() {
        DefaultListModel<String> model = new DefaultListModel<>();
        Iterator<Patient> pacientes = clinic.getWaitingPatients();

        if (pacientes != null) {
            while (pacientes.hasNext()) {
                Patient patient = pacientes.next();
                model.addElement(patient.getFullName());
            }
        }

        lstSalaEspera.setModel(model);
    }

    private void habilitarRegistro(boolean enabled) {
        txtMotivo.setEnabled(enabled);
        txtDiagnostico.setEnabled(enabled);
        txtTratamiento.setEnabled(enabled);
        txtNotas.setEnabled(enabled);
        btnGuardarFinalizar.setEnabled(enabled);
    }

    private void limpiarRegistro() {
        lblPacienteActual.setText("Paciente: -");
        txtMotivo.setText("");
        txtDiagnostico.setText("");
        txtTratamiento.setText("");
        txtNotas.setText("");
        pacienteActual = null;
        habilitarRegistro(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnlCitas = new javax.swing.JPanel();
        lblCitas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCitasHoy = new javax.swing.JList<>();
        btnAgregarEspera = new javax.swing.JButton();
        pnlEspera = new javax.swing.JPanel();
        lblEspera = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSalaEspera = new javax.swing.JList<>();
        btnAbrirRegistro = new javax.swing.JButton();
        pnlRegistro = new javax.swing.JPanel();
        lblRegistro = new javax.swing.JLabel();
        lblPacienteActual = new javax.swing.JLabel();
        lblMotivo = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        lblDiagnostico = new javax.swing.JLabel();
        txtDiagnostico = new javax.swing.JTextField();
        lblTratamiento = new javax.swing.JLabel();
        txtTratamiento = new javax.swing.JTextField();
        lblNotas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNotas = new javax.swing.JTextArea();
        btnGuardarFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MediRecord - Sala de espera");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("SALA DE ESPERA");

        lblCitas.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblCitas.setText("Citas de hoy");

        lstCitasHoy.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstCitasHoy);

        btnAgregarEspera.setText("Agregar a espera →");
        btnAgregarEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEsperaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCitasLayout = new javax.swing.GroupLayout(pnlCitas);
        pnlCitas.setLayout(pnlCitasLayout);
        pnlCitasLayout.setHorizontalGroup(
            pnlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(pnlCitasLayout.createSequentialGroup()
                        .addComponent(lblCitas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAgregarEspera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCitasLayout.setVerticalGroup(
            pnlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarEspera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblEspera.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEspera.setText("Pacientes en espera");

        lstSalaEspera.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstSalaEspera);

        btnAbrirRegistro.setText("Abrir registro medico →");
        btnAbrirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEsperaLayout = new javax.swing.GroupLayout(pnlEspera);
        pnlEspera.setLayout(pnlEsperaLayout);
        pnlEsperaLayout.setHorizontalGroup(
            pnlEsperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEsperaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEsperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(pnlEsperaLayout.createSequentialGroup()
                        .addComponent(lblEspera)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAbrirRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEsperaLayout.setVerticalGroup(
            pnlEsperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEsperaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEspera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAbrirRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblRegistro.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblRegistro.setText("Registro medico");

        lblPacienteActual.setText("Paciente: -");

        lblMotivo.setText("Motivo:");

        lblDiagnostico.setText("Diagnostico:");

        lblTratamiento.setText("Tratamiento:");

        lblNotas.setText("Notas:");

        txtNotas.setColumns(20);
        txtNotas.setRows(5);
        jScrollPane3.setViewportView(txtNotas);

        btnGuardarFinalizar.setText("Guardar y finalizar atencion");
        btnGuardarFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMotivo)
                    .addComponent(txtDiagnostico)
                    .addComponent(txtTratamiento)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(btnGuardarFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegistro)
                            .addComponent(lblPacienteActual)
                            .addComponent(lblMotivo)
                            .addComponent(lblDiagnostico)
                            .addComponent(lblTratamiento)
                            .addComponent(lblNotas))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPacienteActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMotivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDiagnostico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTratamiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarFinalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pnlEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEspera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEsperaActionPerformed
        int index = lstCitasHoy.getSelectedIndex();

        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una cita.");
            return;
        }

        Appointment cita = citasHoy.get(index);
        String patientId = cita.getPatient().getId();

        if (clinic.isPatientWaiting(patientId)) {
            JOptionPane.showMessageDialog(this, "El paciente ya está en sala de espera.");
            return;
        }

        if (clinic.checkInPatient(patientId)) {
            cargarCitasDeHoy();
            cargarSalaEspera();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el paciente.");
        }
    }//GEN-LAST:event_btnAgregarEsperaActionPerformed

    private void btnAbrirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirRegistroActionPerformed
        pacienteActual = clinic.getNextPatient();

        if (pacienteActual == null) {
            JOptionPane.showMessageDialog(this, "No hay pacientes en espera.");
            return;
        }

        lblPacienteActual.setText("Paciente: " + pacienteActual.getFullName());
        habilitarRegistro(true);
    }//GEN-LAST:event_btnAbrirRegistroActionPerformed

    private void btnGuardarFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFinalizarActionPerformed
        if (pacienteActual == null) {
            return;
        }

        if (txtMotivo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el motivo de consulta.");
            return;
        }

        MedicalRecord record = new MedicalRecord(
                txtMotivo.getText().trim(),
                txtDiagnostico.getText().trim(),
                txtTratamiento.getText().trim(),
                txtNotas.getText().trim()
        );

        pacienteActual.addMedicalRecord(record);

        // Se elimina de la Queue solo después de guardar el registro.
        clinic.attendNextPatient();

        JOptionPane.showMessageDialog(this, "Registro guardado. Atención finalizada.");

        limpiarRegistro();
        cargarSalaEspera();
        cargarCitasDeHoy();
    }//GEN-LAST:event_btnGuardarFinalizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmWaitingRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirRegistro;
    private javax.swing.JButton btnAgregarEspera;
    private javax.swing.JButton btnGuardarFinalizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCitas;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblEspera;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblPacienteActual;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTratamiento;
    private javax.swing.JList<String> lstCitasHoy;
    private javax.swing.JList<String> lstSalaEspera;
    private javax.swing.JPanel pnlCitas;
    private javax.swing.JPanel pnlEspera;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextArea txtNotas;
    private javax.swing.JTextField txtTratamiento;
    // End of variables declaration//GEN-END:variables
}
