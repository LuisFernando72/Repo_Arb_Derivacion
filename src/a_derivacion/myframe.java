package a_derivacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.io.File.separator;
import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javafx.scene.text.Text;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Fernando Paxel
 */
public class myframe extends JFrame {

    fondopanel fondo1 = new fondopanel();
    ArrayList<String> Array_reglas = new ArrayList<>();
    final List<String> result1 = new ArrayList<>();
    final List<String> result2 = new ArrayList<>();
    public HashMap<Integer, String> no_terminales = new HashMap<>();
    public HashMap<Integer, String> producciones = new HashMap<>();
    public ArrayList<String> P_resultado = new ArrayList<>();
    DefaultTableModel modelo2;
    private int filasTabla;
    OperacionesIz funciones = new OperacionesIz();

    public myframe() {
        this.setContentPane(fondo1);
        initComponents();
        pintar();
        setLocationRelativeTo(null);
        this.lbl_titulo.setText("Hola Mundo");
        this.text_resultado.append("S=>OPQ\nQ=>RST\nT=>a\nS=>i\nP=>Vni\nR=>eU\nO=>ing\nU=>r\nV=>e");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        PanelAgregar = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JButton();
        txt_regla = new javax.swing.JTextField();
        PanelTable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_reglas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        PanelResultado = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        text_resultado = new javax.swing.JTextArea();
        lbl_titulo = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        PanelAnalizar = new javax.swing.JPanel();
        Derecha = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btn_analizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.darkGray);

        PanelAgregar.setBackground(new java.awt.Color(255, 255, 255));
        PanelAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        PanelAgregar.setForeground(new java.awt.Color(0, 204, 51));
        PanelAgregar.setOpaque(false);

        btn_agregar.setBackground(new java.awt.Color(0, 204, 51));
        btn_agregar.setFont(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-button.png"))); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.setDefaultCapable(false);
        btn_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_agregar.setIconTextGap(6);
        btn_agregar.setSelected(true);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        txt_regla.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        txt_regla.setForeground(new java.awt.Color(0, 0, 0));
        txt_regla.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        PanelTable.setBackground(new java.awt.Color(0, 0, 0));
        PanelTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PanelTable.setLayout(null);

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(200, 406));

        table_reglas.setBackground(new java.awt.Color(255, 255, 255));
        table_reglas.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        table_reglas.setForeground(new java.awt.Color(0, 0, 0));
        table_reglas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Regla", ""
            }
        ));
        table_reglas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_reglas.setGridColor(new java.awt.Color(0, 0, 0));
        table_reglas.setRowHeight(22);
        table_reglas.setRowMargin(2);
        table_reglas.setSelectionBackground(new java.awt.Color(255, 0, 51));
        table_reglas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        table_reglas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_reglasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_reglas);

        PanelTable.add(jScrollPane3);
        jScrollPane3.setBounds(0, 30, 270, 240);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("         Reglas de Producción");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelTable.add(jLabel1);
        jLabel1.setBounds(0, 0, 270, 30);

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addComponent(txt_regla, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_regla)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        PanelResultado.setBackground(new java.awt.Color(255, 255, 255));
        PanelResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        PanelResultado.setOpaque(false);

        text_resultado.setEditable(false);
        text_resultado.setBackground(new java.awt.Color(255, 255, 255));
        text_resultado.setColumns(20);
        text_resultado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        text_resultado.setForeground(new java.awt.Color(0, 0, 0));
        text_resultado.setRows(5);
        text_resultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jScrollPane2.setViewportView(text_resultado);

        lbl_titulo.setFont(new java.awt.Font("Open Sans", 3, 16)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 0, 0));

        btn_limpiar.setBackground(new java.awt.Color(204, 0, 0));
        btn_limpiar.setFont(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Limpiar.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelResultadoLayout = new javax.swing.GroupLayout(PanelResultado);
        PanelResultado.setLayout(PanelResultadoLayout);
        PanelResultadoLayout.setHorizontalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelResultadoLayout.createSequentialGroup()
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelResultadoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelResultadoLayout.createSequentialGroup()
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        PanelResultadoLayout.setVerticalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelAnalizar.setBackground(new java.awt.Color(255, 255, 255));
        PanelAnalizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        PanelAnalizar.setOpaque(false);

        Derecha.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Derecha);
        Derecha.setFont(new java.awt.Font("Open Sans", 3, 14)); // NOI18N
        Derecha.setForeground(new java.awt.Color(0, 0, 0));
        Derecha.setText("Derecha");
        Derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DerechaActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Open Sans", 3, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Izquierda");
        jRadioButton2.setIconTextGap(12);
        jRadioButton2.setMargin(new java.awt.Insets(4, 4, 4, 4));
        jRadioButton2.setOpaque(true);

        btn_analizar.setBackground(new java.awt.Color(0, 51, 204));
        btn_analizar.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        btn_analizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_analizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/archivo.png"))); // NOI18N
        btn_analizar.setText("Analizar");
        btn_analizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_analizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_analizar.setHideActionText(true);
        btn_analizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_analizar.setIconTextGap(12);
        btn_analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_analizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAnalizarLayout = new javax.swing.GroupLayout(PanelAnalizar);
        PanelAnalizar.setLayout(PanelAnalizarLayout);
        PanelAnalizarLayout.setHorizontalGroup(
            PanelAnalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAnalizarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btn_analizar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelAnalizarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Derecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(23, 23, 23))
        );
        PanelAnalizarLayout.setVerticalGroup(
            PanelAnalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAnalizarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelAnalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(Derecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_analizar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jLabel2.setFont(new java.awt.Font("Open Sans", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Árbol de Derivación o Parseo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DerechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DerechaActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        //Agregando datos a la tabla
        modelo2 = (DefaultTableModel) this.table_reglas.getModel();

        String separator = "=>";
        boolean emptyStrings = true;
        int contador = 0;
        String produccion = this.txt_regla.getText();
        if (produccion.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor no dejar el campo vacio", "Error", HEIGHT, new ImageIcon("src/img/error.png"));
        } else {

            if (produccion != null && produccion.length() > 0) {

                int index1 = 0;
                int index2 = produccion.indexOf(separator);
                int sepLen = separator.length();
                while (index2 >= 0) {
                    String token = produccion.substring(index1, index2);
                    if (!token.isEmpty() || emptyStrings) {

                        for (int i = 0; i < token.length(); i++) {
                            if (Character.isLowerCase(token.charAt(i))) {
                                contador++;
                            }
                        }
                    }
                    index1 = index2 + sepLen;
                    index2 = produccion.indexOf(separator, index1);

                }

                if (contador > 0) {
                    System.out.println("Error No se puede insertar");

                    filasTabla = modelo2.getRowCount() + 1;
                    modelo2.addRow(new Object[]{filasTabla, produccion, "Eliminar"});
                    this.txt_regla.setText("");
                } else {
                    Agregar(produccion);
                    this.txt_regla.setText("");
                }
            }
        }


    }//GEN-LAST:event_btn_agregarActionPerformed

    /////////////ANALIZANDO LAS CADENAS ANALIZANDO LAS CADENAS

    private void btn_analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_analizarActionPerformed
        // HE AQUI LA MAGIA BROO :33
        for (int i = 0; i < Array_reglas.size(); i++) {
            fastSplit2(Array_reglas.get(i), i, "=>", true);
        }

        anazalizando();
        Resultado(producciones.get(0));
        buscandoHojas();
    }//GEN-LAST:event_btn_analizarActionPerformed

    public int Resultado(String inicio) {
        String inicio1 = inicio.replaceAll("\\s+", "");
        char[] myChars = inicio1.toCharArray();
        int hojas = 0, cont = 0, no_term = 0;
        for (int i = 0; i < myChars.length; i++) {
            System.out.println(i + ") " + myChars[i]);
            P_resultado.add(String.valueOf(myChars[i]));
        }

        for (int i = 0; i < P_resultado.size(); i++) {
            for (HashMap.Entry<Integer, String> entry : no_terminales.entrySet()) {
                if (P_resultado.get(i).equals(entry.getValue())) { //MOSTRANDO EL RESULTADO SI ENCUENTRA DATO IGUAL

                    String terminal = producciones.get(entry.getKey());
                    // System.out.println("T: " + terminal);
                    //  System.out.println("value: " + entry.getValue());
                    cont++;
                    if (terminal.equals(terminal.toLowerCase())) {
                        System.out.println(entry.getValue() + "=>" + terminal);
                        this.text_resultado.append("\n" + entry.getValue() + "=>" + terminal);
                        hojas++;
                    }

                    for (int u = 0; u < cont; u++) {
                        if (Character.isUpperCase(terminal.charAt(u))) {
                            System.out.println(u + ") " + entry.getValue() + " => " + terminal);
                            no_term++;
                            funciones.BuscarMayus(terminal);

                            break;

//                            removeDuplicates(buscarDu);
                        }
                    }

                }
            }
        }
        System.out.println("Array: " + funciones.getMyArray());
        System.out.println("Size: " + funciones.getMyArray().size());
//        System.out.println("No terminales: " + no_terminales);
        return 0;
    }

    public void buscandoHojas() {
        for (int i = 0; i < funciones.getMyArray().size(); i++) {
            for (HashMap.Entry<Integer, String> entry : no_terminales.entrySet()) {
                String no_ter = entry.getValue();
                if (funciones.getMyArray().get(i).equals(no_ter)) {
                    System.out.println("hOJA: " + entry.getValue() + "=> " + producciones.get(entry.getKey()));
///DEFINIR AQUI CUAL SERIA LA SIGUIENTE LISTA A RECORRER, RECORDAR RECURSIVIDAD
                    funciones.BuscarMayus(producciones.get(entry.getKey()));
                    if (funciones.getMyArray().size() > 0) {
                        System.out.println("Hojass2 :" + funciones.getMyArray());
                    }

                }
            }

        }
    }

    public void anazalizando() {
        this.text_resultado.append("Entrada");
        no_terminales.forEach((k, v) -> {
            this.text_resultado.append("\n Key = " + k + ", Value = " + v);

        });

        this.text_resultado.append("\nSalida");
        producciones.forEach((Integer k, String v) -> {
            this.text_resultado.append("\n Key = " + k + " , Value = " + v);
        });

        this.text_resultado.append("\n----------------------------------------------------------------------------------\n");
        this.text_resultado.append(Array_reglas.get(0));

    }

///VERIFICAR CUANDO AGREGAGAMOS ALGO DE INICIAL MINUSCULA ESO TRAE PROBLEMA
    public List<String> fastSplit2(final String text, final int contador, final String separator, final boolean emptyStrings) {

        if (text != null && text.length() > 0) {
            int index1 = 0;
            int index2 = text.indexOf(separator);
            int sepLen = separator.length();
            while (index2 >= 0) {
                String token = text.substring(index1, index2);
                if (!token.isEmpty() || emptyStrings) {
                    result1.add(token);
                    no_terminales.put(contador, token);
                }
                index1 = index2 + sepLen;
                index2 = text.indexOf(separator, index1);
            }
            result2.add(text.substring(index1));
            producciones.put(contador, text.substring(index1));
        }

        return result2;
    }


    private void table_reglasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_reglasMouseClicked

        modelo2 = (DefaultTableModel) this.table_reglas.getModel();
        int fila = table_reglas.rowAtPoint(evt.getPoint());

        System.out.println("Fila: " + fila);
        modelo2.removeRow(fila);
        this.Array_reglas.remove(fila);
        ActualizarNo();
        result1.clear();
        result2.clear();
        no_terminales.keySet().removeIf(key -> key != fila);
        producciones.keySet().removeIf(key -> key != fila);

    }//GEN-LAST:event_table_reglasMouseClicked

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        modelo2 = (DefaultTableModel) this.table_reglas.getModel();
        Array_reglas.clear();
        modelo2.setRowCount(0);
        result1.clear();
        result2.clear();
        txt_regla.setText("");
        this.text_resultado.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    public int ActualizarNo() {
        modelo2 = (DefaultTableModel) this.table_reglas.getModel();
        int filas = modelo2.getRowCount();
        int c = 0;
        for (int i = 0; i < filas; i++) {
            c++;
            modelo2.setValueAt(c, i, 0);
        }
        System.out.println("Actualizado: " + Array_reglas);
        return 0;
    }

    public int Agregar(String regla) {
        modelo2 = (DefaultTableModel) this.table_reglas.getModel();
        filasTabla = modelo2.getRowCount() + 1;

        if (regla.matches("[a-z|A-Z]{1,5}+[=]+[>]+[a-z|A-Z]{1,5}")) {
            try {

                modelo2.addRow(new Object[]{filasTabla, regla, "Eliminar"});
                Array_reglas.add(regla);
            } catch (Exception ex) {
                System.out.println("Error " + ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Escriba bien pendejo >:l", "Error", HEIGHT, new ImageIcon("src/img/error.png"));
        }
        //  System.out.println("Agregando... " + Array_reglas);
        return 0;
    }

    public void pintar() {
        ColorearTable color = new ColorearTable(1);
        table_reglas.getColumnModel().getColumn(2).setCellRenderer(color);
        table_reglas.getColumnModel().getColumn(0).setPreferredWidth(14);
        table_reglas.getColumnModel().getColumn(2).setPreferredWidth(18);
        table_reglas.getTableHeader().setBackground(new Color(51, 51, 51));
        table_reglas.getTableHeader().setForeground(Color.WHITE);
    }

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
            java.util.logging.Logger.getLogger(myframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myframe().setVisible(true);
            }
        });
    }

    class fondopanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("fondo7.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Derecha;
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JPanel PanelAnalizar;
    private javax.swing.JPanel PanelResultado;
    private javax.swing.JPanel PanelTable;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_analizar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable table_reglas;
    private javax.swing.JTextArea text_resultado;
    private javax.swing.JTextField txt_regla;
    // End of variables declaration//GEN-END:variables
}
