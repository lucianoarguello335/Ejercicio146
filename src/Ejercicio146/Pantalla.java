/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio146;


import comunes.Tablas;
import comunes.Utils;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano
 */
public class Pantalla extends javax.swing.JFrame {

int iteracionesASimular;
int iteracionesAMostrar;
        
float precioLitro;
float precioVenta;
float precioDevolucion;
        
int litrosA;
int litrosB;
int litrosC;
int litrosD;
    
int filasASimular;
int filasAMostrar;

int iteracion;

int rndA; 
int rndB;
int rndC;
int rndD;
        
int demA;
int demB;
int demC;
int demD;
        
int ventasA;
int ventasB;
int ventasC;
int ventasD;

int sobrantesA;
int sobrantesB;
int sobrantesC;
int sobrantesD;

float ingresosA;
float ingresosB;
float ingresosC;
float ingresosD;

float perdidasA;
float perdidasB;
float perdidasC;
float perdidasD;

float resultadosA;
float resultadosB;
float resultadosC;
float resultadosD;
float resultadoTotalDia;

int litrosAOptimo;
int litrosBOptimo;
int litrosCOptimo;
int litrosDOptimo;
float resultadoDiarioMaximo;

String[] vector;

Utils utils;

    /**
     * Creates new form Pantalla
     */
    DefaultTableModel model;

    public Pantalla() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_Simular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_IteracionesAMostrar = new javax.swing.JTextField();
        lbl_iteraciones = new javax.swing.JLabel();
        txt_Iteraciones = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_precioLitro = new javax.swing.JTextField();
        txt_precioVenta = new javax.swing.JTextField();
        txt_PrecioDevolucion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_litrosA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_litrosB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_litrosC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_litrosD = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        litrosAOptimoPantalla = new javax.swing.JTextField();
        litrosBOptimoPantalla = new javax.swing.JTextField();
        litrosCOptimoPantalla = new javax.swing.JTextField();
        litrosDOptimoPantalla = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        gananciaMaximaPantalla = new javax.swing.JTextField();
        textoResultadoPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "LA", "LB", "LC", "LD", "rnd Dem A", "litros Dem A", "VA", "IA", "SA", "PA", "RAl", "rnd Dem B", "litros Dem B", "VB", "IB", "SB", "PB", "RB", "rnd Dem C", "litros Dem C", "VC", "IC", "SC", "PC", "RC", "rnd Dem D", "litros Dem D", "VD", "ID", "SD", "PD", "RD", "Resultado Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_Simular.setText("Simular");
        btn_Simular.setToolTipText("ejemplo christian");
        btn_Simular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SimularActionPerformed(evt);
            }
        });

        jLabel1.setText("Dias a mostrar");

        txt_IteracionesAMostrar.setText("5");
        txt_IteracionesAMostrar.setToolTipText("Ingrese la cant. de dias a simular");
        txt_IteracionesAMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_iteraciones.setText("Dias a simular");

        txt_Iteraciones.setText("10");

        jLabel2.setText("Precio litro");

        jLabel3.setText("Precio Venta");

        jLabel4.setText("Precio Devolucion");

        txt_precioLitro.setText("1.1");

        txt_precioVenta.setText("2");

        txt_PrecioDevolucion.setText("0.2");

        jLabel5.setText("Litros B");

        txt_litrosA.setText("22");

        jLabel6.setText("Litros C");

        txt_litrosB.setText("22");

        jLabel7.setText("Litros A");

        txt_litrosC.setText("22");

        jLabel8.setText("Litros D");

        txt_litrosD.setText("24");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("RESULTADOS:");

        jLabel10.setText("Litros A");

        jLabel11.setText("Litros B");

        jLabel12.setText("Litros C");

        jLabel13.setText("Litros D");

        litrosAOptimoPantalla.setText("A calcular ...");

        litrosBOptimoPantalla.setText("A calcular ...");

        litrosCOptimoPantalla.setText("A calcular ...");

        litrosDOptimoPantalla.setText("A calcular ...");

        jLabel14.setText("Gan. Maxima");

        gananciaMaximaPantalla.setText("A calcular ...");

        textoResultadoPantalla.setText("Resultado a calcular ...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(litrosCOptimoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(litrosDOptimoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(litrosAOptimoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(litrosBOptimoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoResultadoPantalla)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(gananciaMaximaPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(litrosAOptimoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(gananciaMaximaPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(litrosBOptimoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoResultadoPantalla))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(litrosCOptimoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(litrosDOptimoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_IteracionesAMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_iteraciones)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Iteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_PrecioDevolucion)
                    .addComponent(txt_precioVenta)
                    .addComponent(txt_precioLitro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_litrosC)
                                    .addComponent(txt_litrosB)
                                    .addComponent(txt_litrosA, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_litrosD, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Simular, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_precioLitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_precioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbl_iteraciones)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txt_IteracionesAMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txt_Iteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_PrecioDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_litrosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_litrosB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_litrosC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txt_litrosD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btn_Simular)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1570, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SimularActionPerformed

        // PASO 1: Resetear VALORES        
        model = (DefaultTableModel) jTable1.getModel();
        borrarTabla(model);
        

        // PASO 2: Obtener parametros de la GUI
        
        iteracionesASimular = Integer.parseInt(txt_Iteraciones.getText());
        iteracionesAMostrar = Integer.parseInt(txt_IteracionesAMostrar.getText());
        
        precioLitro = Float.parseFloat(txt_precioLitro.getText());
        precioVenta = Float.parseFloat(txt_precioVenta.getText());
        precioDevolucion = Float.parseFloat(txt_PrecioDevolucion.getText());
        
        litrosA = Integer.parseInt(txt_litrosA.getText());
        litrosB = Integer.parseInt(txt_litrosB.getText());
        litrosC = Integer.parseInt(txt_litrosC.getText());
        litrosD = Integer.parseInt(txt_litrosD.getText());
        

        // PASO 3: Valores iniciales primera iteracion
        iteracion = 0;
        utils = new Utils();
        vector = new String[]{};
        litrosAOptimo = 1;
        litrosBOptimo = 1;
        litrosCOptimo = 1;
        litrosDOptimo = 1;
        resultadoDiarioMaximo=0;
        
        // Iteraciones (FOR, WHILE, ETC) ------------------------------------------------------------------------------------------------------------------------
        
        // PASO 4: Calcular nuevos valores
        
        while (iteracion < iteracionesASimular) {

            calcularNumerosAleatorios();
            calcularDemandasAleatorias();
            calcularVentasDeSucursales();
            calcularIngresosDeSucursales();
            calcularSobrantesDeSucursales();
            calcularPerdidasDeSucursales();
            calcularResultadosDeSucursales();
            calcularResultadosTotalDia();
           
            
       // PASO 5: Agregar iteracion a tabla visual.
            if(iteracion < iteracionesAMostrar ){
                model.addRow(calcularVectorDeStrings());
            }
        
            /*
            Si la configuracion actual de litros por sucursal es mayor que la mejor
            hasta el momento, guardar la configuracion y el resultado obtenido 
            en el dia.
            */
            if(resultadoTotalDia > resultadoDiarioMaximo){
                litrosAOptimo = litrosA;
                litrosBOptimo = litrosB;
                litrosCOptimo = litrosC;
                litrosDOptimo = litrosD;
                resultadoDiarioMaximo = resultadoTotalDia;
            }
            
            iteracion++;
        }
        
        actualizarResultadoFinalEnPantalla();

    }//GEN-LAST:event_btn_SimularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Simular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField gananciaMaximaPantalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_iteraciones;
    private javax.swing.JTextField litrosAOptimoPantalla;
    private javax.swing.JTextField litrosBOptimoPantalla;
    private javax.swing.JTextField litrosCOptimoPantalla;
    private javax.swing.JTextField litrosDOptimoPantalla;
    private javax.swing.JLabel textoResultadoPantalla;
    private javax.swing.JTextField txt_Iteraciones;
    private javax.swing.JTextField txt_IteracionesAMostrar;
    private javax.swing.JTextField txt_PrecioDevolucion;
    private javax.swing.JTextField txt_litrosA;
    private javax.swing.JTextField txt_litrosB;
    private javax.swing.JTextField txt_litrosC;
    private javax.swing.JTextField txt_litrosD;
    private javax.swing.JTextField txt_precioLitro;
    private javax.swing.JTextField txt_precioVenta;
    // End of variables declaration//GEN-END:variables

    public void borrarTabla(DefaultTableModel model) {
        if (model.getRowCount() > 0) {
            for (int i = model.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
    }
    
    /*
    Calcula la cantidad de ventas totales del dia para esa sucursal
    en base a la demanda (dem) y la cantidad de litros enviados a la misma (litros)
    */
    public int calcularCantidadVendida(int dem, int litros){
        if(litros >= dem){
            return dem;
        }
       else
            return litros;
    }
     
    /*
    Calcula el sobrante del dia para esa sucursal
    en base a la demanda (dem) y la cantidad de litros enviados a la misma (litros)
    */
    public int calcularCantidadSobrante(int dem, int litros){
        if(litros > dem){
            return litros - dem;
        }
        else{
        return 0;
        }
    }
    
    public void calcularNumerosAleatorios(){
        rndA = utils.getRnd();
        rndB = utils.getRnd();
        rndC = utils.getRnd();
        rndD = utils.getRnd();
    }
    
    public void calcularDemandasAleatorias(){
        demA = Tablas.getValorIntervalo(rndA, Tablas.getTablaDemandaA());
        demB = Tablas.getValorIntervalo(rndB, Tablas.getTablaDemandaB());
        demC = Tablas.getValorIntervalo(rndC, Tablas.getTablaDemandaC());
        demD = Tablas.getValorIntervalo(rndD, Tablas.getTablaDemandaD());
    }
   
    
    public void calcularVentasDeSucursales(){
        ventasA = calcularCantidadVendida(demA, litrosA);
        ventasB = calcularCantidadVendida(demB, litrosA);
        ventasC = calcularCantidadVendida(demC, litrosA);
        ventasD = calcularCantidadVendida(demC, litrosA);
    }
    
    public void calcularSobrantesDeSucursales(){
        sobrantesA = calcularCantidadSobrante(demA, litrosA);
        sobrantesB = calcularCantidadSobrante(demB, litrosB);
        sobrantesC = calcularCantidadSobrante(demC, litrosC);
        sobrantesD = calcularCantidadSobrante(demD, litrosD);
    }
    
    public void calcularIngresosDeSucursales(){
        float gananciaPorVenta = (precioVenta - precioLitro);
        ingresosA = ventasA * gananciaPorVenta;
        ingresosB = ventasB * gananciaPorVenta;
        ingresosC = ventasC * gananciaPorVenta;
        ingresosD = ventasD * gananciaPorVenta;
    }
    
    public void calcularPerdidasDeSucursales(){
       float perdidaPorSobrante = (precioLitro - precioDevolucion);
       perdidasA = sobrantesA * perdidaPorSobrante;
       perdidasB = sobrantesB * perdidaPorSobrante;
       perdidasC = sobrantesC * perdidaPorSobrante;
       perdidasD = sobrantesD * perdidaPorSobrante;
    }
    
    public void calcularResultadosDeSucursales(){
        resultadosA = ingresosA - perdidasA;
        resultadosB = ingresosB - perdidasB;
        resultadosC = ingresosC - perdidasC;
        resultadosD = ingresosD - perdidasD;
    }
    
    public void calcularResultadosTotalDia(){
        resultadoTotalDia = resultadosA + resultadosB +resultadosC + resultadosD;
    }
    
    public void actualizarResultadoFinalEnPantalla(){
        litrosAOptimoPantalla.setText(String.valueOf(litrosAOptimo));
        litrosBOptimoPantalla.setText(String.valueOf(litrosBOptimo));
        litrosCOptimoPantalla.setText(String.valueOf(litrosCOptimo));
        litrosDOptimoPantalla.setText(String.valueOf(litrosDOptimo));
        gananciaMaximaPantalla.setText(String.valueOf(resultadoDiarioMaximo));
        
        String res = String.format("El valor optimo luego de %s dias es %s", String.valueOf(iteracion), String.valueOf(resultadoDiarioMaximo));
        textoResultadoPantalla.setText(res);
    }
    
    public String[] calcularVectorDeStrings(){
        
        String dia = String.valueOf(iteracion);
        
        String la = String.valueOf(litrosA);
        String lb = String.valueOf(litrosB);
        String lc = String.valueOf(litrosC);
        String ld = String.valueOf(litrosD);
 
        String rndDemA = String.valueOf(rndA);
        String demandaA = String.valueOf(demA);
        String cantVentasA = String.valueOf(ventasA);
        String ingresoA = String.valueOf(ingresosA);
        String sobA = String.valueOf(sobrantesA);
        String perdA = String.valueOf(perdidasA);
        String resultA = String.valueOf(resultadosA);
        
        String rndDemB = String.valueOf(rndB);
        String demandaB = String.valueOf(demB);
        String cantVentasB = String.valueOf(ventasB);
        String ingresoB = String.valueOf(ingresosB);
        String sobB = String.valueOf(sobrantesB);
        String perdB = String.valueOf(perdidasB);
        String resultB = String.valueOf(resultadosB);
        
        String rndDemC = String.valueOf(rndC);
        String demandaC = String.valueOf(demC);
        String cantVentasC = String.valueOf(ventasC);
        String ingresoC = String.valueOf(ingresosC);
        String sobC = String.valueOf(sobrantesC);
        String perdC = String.valueOf(perdidasC);
        String resultC = String.valueOf(resultadosC);
        
        String rndDemD = String.valueOf(rndD);
        String demandaD = String.valueOf(demD);
        String cantVentasD = String.valueOf(ventasD);
        String ingresoD = String.valueOf(ingresosD);
        String sobD = String.valueOf(sobrantesD);
        String perdD = String.valueOf(perdidasD);
        String resultD = String.valueOf(resultadosD);
        
        String resulTotalDia = String.valueOf(resultadoTotalDia);
        
        String[] s = new String[]{dia,la,lb,lc,ld,
                                  rndDemA,demandaA,cantVentasA,ingresoA,sobA,perdA,resultA,
                                  rndDemB,demandaB,cantVentasB,ingresoB,sobB,perdB,resultB,
                                  rndDemC,demandaC,cantVentasC,ingresoC,sobC,perdC,resultC,
                                  rndDemD,demandaD,cantVentasD,ingresoD,sobD,perdD,resultD,
                                  resulTotalDia};
        return s;
    }
}
