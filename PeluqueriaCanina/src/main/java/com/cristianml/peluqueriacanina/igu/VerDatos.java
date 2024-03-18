package com.cristianml.peluqueriacanina.igu;

import com.cristianml.peluqueriacanina.logica.ControladoraLogica;
import com.cristianml.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {
    
    
    ControladoraLogica control = null;

    public VerDatos() {
        control = new ControladoraLogica();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolverAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Ver lista de Datos");
        jLabel1.setName("lblTitulo"); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setViewportView(tabla);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Lista de mascotas:");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconEditar.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconBorrar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVolverAtras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolverAtras.setText("Volver");
        btnVolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(634, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolverAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnVolverAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(253, 253, 253))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarDatos();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Verificamos si la tabla tiene elementos
        if(tabla.getRowCount()>0) {
            // Verificamos que haya un elemento seleccionado
            if(tabla.getSelectedRow()!=-1) {
                int idMasco = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
                System.out.println(idMasco);
                control.eliminarMascota(idMasco);
                mostrarMensaje("Eliminado existoso.", "info", "Iformación");
                cargarDatos();
            } else {
                mostrarMensaje("No seleccionó ningún elemento.", "error", "Error elemento no seleccionado");
            }
        } else {
            mostrarMensaje("La tabla está vacía.", "error", "Error, tabla vacía");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if (tabla.getRowCount() > 0){
            if (tabla.getSelectedRow() != -1) {
                int idMasco = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
                EditarDatos editar = new EditarDatos(idMasco);
                editar.setVisible(true);
                editar.setLocationRelativeTo(null);
                this.dispose();
            } else {
                mostrarMensaje("Ningún elemento seleccionado.", "error", "Error elemento no seleccionado.");
            }
        } else {
            mostrarMensaje("La tabla se encuentra vacía.", "error", "Tabla vacía.");
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtrasActionPerformed
        Principal pantallaPrinc = new Principal();
        pantallaPrinc.setVisible(true);
        pantallaPrinc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolverAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    // Definimos el método cargar datos
    private void cargarDatos() {
        // Definimos el modelo de la tabla
        DefaultTableModel tablaModel = new DefaultTableModel(){
        
        // Hacer que filas y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        // Establecemos nombres de las columnas
        String[] titulos = {"Id", "Nombre", "Raza", "Color", "Alérgico", "At. Especial", "Dueño", "Celular"};
        tablaModel.setColumnIdentifiers(titulos);
        
        // Cargar los datos desde la bd
        List <Mascota> listaMasco = control.traerListaMascota();
        
        // Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if (listaMasco != null) {
            for(Mascota masco : listaMasco) {
                Object[] objMasco = {masco.getNum_cliente(), masco.getNombre(), masco.getRaza(), masco.getColor(), masco.getAlergico()
                , masco.getAtencio_especial(), masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCelular()};
                tablaModel.addRow(objMasco);
            }
        }
        tabla.setModel(tablaModel);
    }
    
    // Actualizar tabla
    public void actualizarTabla() {
        tabla.setModel(null);
        cargarDatos();
    }
    
    // Mostrar mensaje
    public void mostrarMensaje (String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
