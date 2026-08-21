package patients;

import clinic.ClinicController;
import clinic.iView;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 * Vista sencilla de pacientes hecha para NetBeans GUI Builder.
 */
public class FrmPatients extends javax.swing.JFrame implements iView<Patient> {

    private ClinicController controller;

    public FrmPatients() {
        initComponents();
        controller = ClinicController.getInstance(this);
        controller.setView(this);
        setLocationRelativeTo(null);
    }

    @Override
    public void clear() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtFecha.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
    }

    @Override
    public void showData(Patient patient) {
        if (patient == null) {
            return;
        }

        txtCedula.setText(patient.getId());
        txtNombre.setText(patient.getFullName());

        if (patient.getBirthDate() != null) {
            txtFecha.setText(patient.getBirthDate().toString());
        } else {
            txtFecha.setText("");
        }

        txtTelefono.setText(patient.getPhone());
        txtEmail.setText(patient.getEmail());
    }

    @Override
    public void showError(String error) {
        JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }

    private Patient crearPaciente() {
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String fecha = txtFecha.getText();
        String telefono = txtTelefono.getText();
        String email = txtEmail.getText();

        if (cedula.equals("") || nombre.equals("") || fecha.equals("")) {
            JOptionPane.showMessageDialog(this, "Complete los datos");
            return null;
        }

        LocalDate fechaNacimiento;

        try {
            fechaNacimiento = LocalDate.parse(fecha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fecha incorrecta. Use AAAA-MM-DD");
            return null;
        }

        Patient paciente = new Patient(cedula, nombre, fechaNacimiento, telefono, email);
        return paciente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnlDatos = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblFormatoFecha = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pnlBotones = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRegistros = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pacientes");

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del paciente"));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PACIENTES");

        lblCedula.setFont(new java.awt.Font("Segoe UI", 0, 16));
        lblCedula.setText("Cedula:");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 16));
        lblNombre.setText("Nombre completo:");

        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 16));
        lblFecha.setText("Fecha nacimiento:");

        lblFormatoFecha.setText("AAAA-MM-DD");

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 16));
        lblTelefono.setText("Telefono:");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 16));
        lblEmail.setText("Email:");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedula)
                    .addComponent(txtNombre)
                    .addComponent(txtTelefono)
                    .addComponent(txtEmail)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFormatoFecha)
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFormatoFecha))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnlBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        btnRegistros.setText("Registros");
        btnRegistros.addActionListener(this::btnRegistrosActionPerformed);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(this::btnAtrasActionPerformed);

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        Patient paciente = crearPaciente();

        if (paciente != null) {
            controller.addPatient(paciente);
            clear();
        }
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        String cedula = txtCedula.getText();

        if (cedula.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese una cedula");
            return;
        }

        Patient paciente = controller.findPatient(cedula);

        if (paciente != null) {
            showData(paciente);
        }
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        String cedula = txtCedula.getText();
        Patient paciente = controller.findPatient(cedula);

        if (paciente == null) {
            return;
        }

        paciente.setPhone(txtTelefono.getText());
        paciente.setEmail(txtEmail.getText());
        JOptionPane.showMessageDialog(this, "Paciente editado");
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        String cedula = txtCedula.getText();

        if (cedula.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese una cedula");
            return;
        }

        controller.removePatient(cedula);
        clear();
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        clear();
    }

    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {
        String cedula = txtCedula.getText();
        Patient paciente = controller.findPatient(cedula);

        if (paciente == null) {
            return;
        }

        if (paciente.hasMedicalHistory()) {
            JOptionPane.showMessageDialog(this, "El paciente tiene registros medicos");
        } else {
            JOptionPane.showMessageDialog(this, "El paciente no tiene registros medicos");
        }
    }

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FrmPatients().setVisible(true));
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistros;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFormatoFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration
}
