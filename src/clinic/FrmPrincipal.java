package clinic;

import appointments.FrmAppointments;
import medicalrecords.FrmMedicalRecord;
import patients.FrmPatients;

/**
 *
 * Ventana principal sencilla del sistema.
 */
public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnPacientes = new javax.swing.JButton();
        btnCitas = new javax.swing.JButton();
        btnSalaEspera = new javax.swing.JButton();
        btnExpediente = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        lblBienvenida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MediRecord");

        pnlMenu.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblTitulo.setText("MEDIRECORD");

        btnPacientes.setText("Pacientes");
        btnPacientes.addActionListener(this::btnPacientesActionPerformed);

        btnCitas.setText("Citas");
        btnCitas.addActionListener(this::btnCitasActionPerformed);

        btnSalaEspera.setText("Sala de Espera");
        btnSalaEspera.addActionListener(this::btnSalaEsperaActionPerformed);

        btnExpediente.setText("Expediente Medico");
        btnExpediente.addActionListener(this::btnExpedienteActionPerformed);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);

        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo)
                    .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btnCitas, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btnSalaEspera, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btnExpediente, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(35, 35, 35)
                .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnSalaEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        desktopPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Area de trabajo"));

        lblBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 28));
        lblBienvenida.setText("Bienvenido a MediRecord");

        desktopPane.setLayer(lblBienvenida, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);

        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(lblBienvenida)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(lblBienvenida)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane)
                .addContainerGap())
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktopPane))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {

        FrmPatients frm = new FrmPatients();
        frm.setVisible(true);
    }

    private void btnCitasActionPerformed(java.awt.event.ActionEvent evt) {

        FrmAppointments frm = new FrmAppointments();
        frm.setVisible(true);
    }

    private void btnSalaEsperaActionPerformed(java.awt.event.ActionEvent evt) {

        FrmWaitingRoom frm = new FrmWaitingRoom();
        frm.setVisible(true);
    }

    private void btnExpedienteActionPerformed(java.awt.event.ActionEvent evt) {

        FrmMedicalRecord frm = new FrmMedicalRecord();
        frm.setVisible(true);
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {

        System.exit(0);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnExpediente;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JButton btnSalaEspera;
    private javax.swing.JButton btnSalir;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration
}
