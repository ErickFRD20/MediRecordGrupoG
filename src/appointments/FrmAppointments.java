package appointments;

import clinic.ClinicController;
import clinic.iView;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import patients.Patient;

/**
 *
 * Vista sencilla para citas.
 */
public class FrmAppointments extends javax.swing.JFrame implements iView<Appointment> {

    private ClinicController controller;

    public FrmAppointments() {
        initComponents();
        controller = ClinicController.getInstance(this);
        controller.setView(this);
        txtEstado.setEditable(false);
    }

    @Override
    public void clear() {
        txtCodigo.setText("");
        txtCedula.setText("");
        txtFecha.setText("");
        txtHora.setText("");
        txtMotivo.setText("");
        txtEstado.setText("");
    }

    @Override
    public void showData(Appointment cita) {
        if (cita == null) {
            return;
        }

        txtCodigo.setText(cita.getCode());

        if (cita.getPatient() != null) {
            txtCedula.setText(cita.getPatient().getId());
        }

        txtFecha.setText(cita.getDate().toString());
        txtHora.setText(cita.getTime().toString());
        txtMotivo.setText(cita.getReason());
        txtEstado.setText(cita.getStatus().toString());
    }

    @Override
    public void showError(String error) {
        JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
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
        lblCodigo = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblMotivo = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        pnlBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnReprogramar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Citas");

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la cita"));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblTitulo.setText("CITAS");

        lblCodigo.setText("Codigo:");
        lblCedula.setText("Cedula paciente:");
        lblFecha.setText("Fecha AAAA-MM-DD:");
        lblHora.setText("Hora HH:MM:");
        lblMotivo.setText("Motivo:");
        lblEstado.setText("Estado:");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblTitulo))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblCedula)
                            .addComponent(lblFecha)
                            .addComponent(lblHora)
                            .addComponent(lblMotivo)
                            .addComponent(lblEstado))
                        .addGap(20, 20, 20)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo)
                            .addComponent(txtCedula)
                            .addComponent(txtFecha)
                            .addComponent(txtHora)
                            .addComponent(txtMotivo)
                            .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(20, 20, 20)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHora)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMotivo)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        btnReprogramar.setText("Reprogramar");
        btnReprogramar.addActionListener(this::btnReprogramarActionPerformed);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(this::btnAtrasActionPerformed);

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnGuardar)
                .addGap(10, 10, 10)
                .addComponent(btnBuscar)
                .addGap(10, 10, 10)
                .addComponent(btnReprogramar)
                .addGap(10, 10, 10)
                .addComponent(btnCancelar)
                .addGap(10, 10, 10)
                .addComponent(btnLimpiar)
                .addGap(10, 10, 10)
                .addComponent(btnAtras)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar)
                    .addComponent(btnReprogramar)
                    .addComponent(btnCancelar)
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {

        String codigo = txtCodigo.getText();
        String cedula = txtCedula.getText();
        String fechaTexto = txtFecha.getText();
        String horaTexto = txtHora.getText();
        String motivo = txtMotivo.getText();

        if (codigo.equals("") || cedula.equals("") || fechaTexto.equals("")
                || horaTexto.equals("") || motivo.equals("")) {

            showError("Complete todos los datos");
            return;
        }

        Patient paciente = controller.findPatient(cedula);

        if (paciente == null) {
            return;
        }

        try {
            LocalDate fecha = LocalDate.parse(fechaTexto);
            LocalTime hora = LocalTime.parse(horaTexto);

            Appointment cita = new Appointment(codigo, paciente, fecha, hora, motivo);

            boolean guardada = controller.scheduleAppointment(cita);

            if (guardada) {
                clear();
            }

        } catch (Exception e) {
            showError("Revise la fecha y la hora");
        }
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {

        String codigo = txtCodigo.getText();

        if (codigo.equals("")) {
            showError("Ingrese el codigo de la cita");
            return;
        }

        controller.findAppointment(codigo);
    }

    private void btnReprogramarActionPerformed(java.awt.event.ActionEvent evt) {

        String codigo = txtCodigo.getText();
        String fechaTexto = txtFecha.getText();
        String horaTexto = txtHora.getText();

        if (codigo.equals("") || fechaTexto.equals("") || horaTexto.equals("")) {
            showError("Ingrese codigo, fecha y hora");
            return;
        }

        try {
            LocalDate fecha = LocalDate.parse(fechaTexto);
            LocalTime hora = LocalTime.parse(horaTexto);

            boolean cambio = controller.rescheduleAppointment(codigo, fecha, hora);

            if (cambio) {
                Appointment cita = controller.findAppointment(codigo);

                if (cita != null) {
                    showData(cita);
                }
            }

        } catch (Exception e) {
            showError("Revise la fecha y la hora");
        }
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {

        String codigo = txtCodigo.getText();

        if (codigo.equals("")) {
            showError("Ingrese el codigo de la cita");
            return;
        }

        boolean cancelada = controller.cancelAppointment(codigo);

        if (cancelada) {
            Appointment cita = controller.findAppointment(codigo);

            if (cita != null) {
                showData(cita);
            }
        }
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
                new FrmAppointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReprogramar;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMotivo;
    // End of variables declaration
}
