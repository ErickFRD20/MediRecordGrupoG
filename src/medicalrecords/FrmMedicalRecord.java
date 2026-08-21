package medicalrecords;

import clinic.ClinicController;
import clinic.iView;
import javax.swing.JOptionPane;
import patients.Patient;

/**
 *
 * Vista sencilla para expedientes medicos.
 */
public class FrmMedicalRecord extends javax.swing.JFrame implements iView<Patient> {

    private ClinicController controller;

    public FrmMedicalRecord() {
        initComponents();
        controller = ClinicController.getInstance(this);
        controller.setView(this);

        txtNombre.setEditable(false);
        txtFecha.setEditable(false);
    }

    @Override
    public void clear() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtFecha.setText("");
        txtMotivo.setText("");
        txtDiagnostico.setText("");
        txtTratamiento.setText("");
        txtNotas.setText("");
    }

    @Override
    public void showData(Patient patient) {

        if (patient == null) {
            return;
        }

        txtCedula.setText(patient.getId());
        txtNombre.setText(patient.getFullName());
    }

    @Override
    public void showError(String error) {
        JOptionPane.showMessageDialog(
                this,
                error,
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }

    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnlDatos = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblMotivo = new javax.swing.JLabel();
        lblDiagnostico = new javax.swing.JLabel();
        lblTratamiento = new javax.swing.JLabel();
        lblNotas = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        txtDiagnostico = new javax.swing.JTextField();
        txtTratamiento = new javax.swing.JTextField();
        txtNotas = new javax.swing.JTextField();
        pnlBotones = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnVerUltimo = new javax.swing.JButton();
        btnEliminarUltimo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Expediente Medico");

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del expediente"));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblTitulo.setText("EXPEDIENTE MEDICO");

        lblCedula.setText("Cedula paciente:");
        lblNombre.setText("Nombre:");
        lblFecha.setText("Fecha:");
        lblMotivo.setText("Motivo consulta:");
        lblDiagnostico.setText("Diagnostico:");
        lblTratamiento.setText("Tratamiento:");
        lblNotas.setText("Notas:");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);

        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(lblTitulo))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedula)
                            .addComponent(lblNombre)
                            .addComponent(lblFecha)
                            .addComponent(lblMotivo)
                            .addComponent(lblDiagnostico)
                            .addComponent(lblTratamiento)
                            .addComponent(lblNotas))
                        .addGap(20, 20, 20)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedula)
                            .addComponent(txtNombre)
                            .addComponent(txtFecha)
                            .addComponent(txtMotivo)
                            .addComponent(txtDiagnostico)
                            .addComponent(txtTratamiento)
                            .addComponent(txtNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(20, 20, 20)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMotivo)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiagnostico)
                    .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTratamiento)
                    .addComponent(txtTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNotas)
                    .addComponent(txtNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnBuscar.setText("Buscar Paciente");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        btnGuardar.setText("Guardar Registro");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnVerUltimo.setText("Ver Ultimo");
        btnVerUltimo.addActionListener(this::btnVerUltimoActionPerformed);

        btnEliminarUltimo.setText("Eliminar Ultimo");
        btnEliminarUltimo.addActionListener(this::btnEliminarUltimoActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(this::btnAtrasActionPerformed);

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);

        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBuscar)
                .addGap(8, 8, 8)
                .addComponent(btnGuardar)
                .addGap(8, 8, 8)
                .addComponent(btnVerUltimo)
                .addGap(8, 8, 8)
                .addComponent(btnEliminarUltimo)
                .addGap(8, 8, 8)
                .addComponent(btnLimpiar)
                .addGap(8, 8, 8)
                .addComponent(btnAtras)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnGuardar)
                    .addComponent(btnVerUltimo)
                    .addComponent(btnEliminarUltimo)
                    .addComponent(btnLimpiar)
                    .addComponent(btnAtras))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {

        String cedula = txtCedula.getText();

        if (cedula.equals("")) {
            showError("Ingrese la cedula del paciente");
            return;
        }

        Patient paciente = controller.findPatient(cedula);

        if (paciente != null) {
            showData(paciente);
        }
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {

        String cedula = txtCedula.getText();
        String motivo = txtMotivo.getText();
        String diagnostico = txtDiagnostico.getText();
        String tratamiento = txtTratamiento.getText();
        String notas = txtNotas.getText();

        if (cedula.equals("")) {
            showError("Ingrese la cedula del paciente");
            return;
        }

        if (motivo.equals("") || diagnostico.equals("")
                || tratamiento.equals("") || notas.equals("")) {

            showError("Complete los datos del registro");
            return;
        }

        Patient paciente = controller.findPatient(cedula);

        if (paciente == null) {
            return;
        }

        MedicalRecord registro = new MedicalRecord(
                motivo,
                diagnostico,
                tratamiento,
                notas
        );

        paciente.addMedicalRecord(registro);

        txtNombre.setText(paciente.getFullName());
        txtFecha.setText(registro.getDate().toString());

        showMessage("Registro guardado correctamente");
    }

    private void btnVerUltimoActionPerformed(java.awt.event.ActionEvent evt) {

        String cedula = txtCedula.getText();

        if (cedula.equals("")) {
            showError("Ingrese la cedula del paciente");
            return;
        }

        Patient paciente = controller.findPatient(cedula);

        if (paciente == null) {
            return;
        }

        if (!paciente.hasMedicalHistory()) {
            showError("El paciente no tiene registros");
            return;
        }

        MedicalRecord registro = paciente.getLatestMedicalRecord();

        if (registro == null) {
            showError("No existe ningun registro");
            return;
        }

        txtNombre.setText(paciente.getFullName());
        txtFecha.setText(registro.getDate().toString());
        txtMotivo.setText(registro.getConsultationReason());
        txtDiagnostico.setText(registro.getDiagnosis());
        txtTratamiento.setText(registro.getTreatment());
        txtNotas.setText(registro.getNotes());
    }

    private void btnEliminarUltimoActionPerformed(java.awt.event.ActionEvent evt) {

        String cedula = txtCedula.getText();

        if (cedula.equals("")) {
            showError("Ingrese la cedula del paciente");
            return;
        }

        Patient paciente = controller.findPatient(cedula);

        if (paciente == null) {
            return;
        }

        if (!paciente.hasMedicalHistory()) {
            showError("El paciente no tiene registros");
            return;
        }

        paciente.removeLatestMedicalRecord();

        txtFecha.setText("");
        txtMotivo.setText("");
        txtDiagnostico.setText("");
        txtTratamiento.setText("");
        txtNotas.setText("");

        showMessage("Ultimo registro eliminado");
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        clear();
    }

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmMedicalRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarUltimo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVerUltimo;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTratamiento;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNotas;
    private javax.swing.JTextField txtTratamiento;
    // End of variables declaration
}
