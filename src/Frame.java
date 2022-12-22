import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Frame extends Component {



    public static class JFrame extends javax.swing.JFrame {

        public JFrame() {
            super("Design Preview [New JFrame]");
            initComponents();

        }


        @SuppressWarnings("unchecked")

        private void initComponents() {

            InvoiceNo = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            InvoiceTotal = new javax.swing.JLabel();
            DateTextField = new javax.swing.JTextField();
            CstNameTextField = new javax.swing.JTextField();
            jScrollPane1 = new javax.swing.JScrollPane();
            jTable1 = new javax.swing.JTable();
            SaveButton = new javax.swing.JButton();
            CancelButton = new javax.swing.JButton();
            jSeparator1 = new javax.swing.JSeparator();
            jScrollPane2 = new javax.swing.JScrollPane();
            jTable2 = new javax.swing.JTable();
            CreateNewInvoice = new javax.swing.JButton();
            DeleteInvoice = new javax.swing.JButton();
            jMenuBar1 = new javax.swing.JMenuBar();
            FileJMenu = new javax.swing.JMenu();
            LoadFile = new javax.swing.JMenuItem();
            SaveFile = new javax.swing.JMenuItem();


            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            InvoiceNo.setText("Invoice Number:");

            jLabel2.setText("Invoice Date");

            jLabel3.setText("Customer Name");

            InvoiceTotal.setText("Invoice total:");

            DateTextField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    DateTextFieldActionPerformed(evt);
                }
            });

            CstNameTextField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CstNameTextFieldActionPerformed(evt);
                }
            });

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                            {null, null, null, null, null},
                            {null, null, null, null, null},
                            {null, null, null, null, null},
                            {null, null, null, null, null},
                            {null, null, null, null, null},
                            {null, null, null, null, null}
                    },
                    new String [] {
                            "No.", "Item Name", "Item Price", "Count", "Item Total"
                    }
            ));
            jScrollPane1.setViewportView(jTable1);

            SaveButton.setText("Save");
            SaveButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SaveButtonActionPerformed(evt);
                }
            });

            CancelButton.setText("Cancel");
            CancelButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CancelButtonActionPerformed(evt);
                }
            });

            jTable2.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null}
                    },
                    new String [] {
                            "No.", "Date", "Customer", "Total"
                    }
            ));
            jScrollPane2.setViewportView(jTable2);

            CreateNewInvoice.setText("Create New Invoice");

            DeleteInvoice.setText("Delete Invoice");

            //MENU BAR STARTS
            jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
            jMenuBar1.setPreferredSize(new java.awt.Dimension(40, 35));

            FileJMenu.setText("File");
            FileJMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
                public void componentHidden(java.awt.event.ComponentEvent evt) {
                    FileJMenuComponentHidden(evt);
                }
            });

            LoadFile.setText("Load File");
            LoadFile.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            }); {
               /* public void actionPerformed(java.awt.event.ActionEvent evt) {
                    JFileChooser fc= new JFileChooser();
                    int result;
                    result = fc.showOpenDialog(this);
                    if (result==JFileChooser.APPROVE_OPTION){

                        String path =fc.getSelectedFile().getPath();
                        FileInputStream fis= null;


                }

                }*/
            }
            FileJMenu.add(LoadFile);

            SaveFile.setText("Save File");
            FileJMenu.add(SaveFile);

            jMenuBar1.add(FileJMenu);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(51, 51, 51)
                                                    .addComponent(CreateNewInvoice)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                                    .addComponent(DeleteInvoice)
                                                    .addGap(114, 114, 114))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(InvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGap(28, 28, 28)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(CstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGap(273, 273, 273))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(SaveButton)
                                                    .addGap(53, 53, 53)
                                                    .addComponent(CancelButton)
                                                    .addGap(291, 291, 291))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(InvoiceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addContainerGap())))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(InvoiceNo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(CstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(InvoiceTotal)
                                    .addGap(24, 24, 24)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(SaveButton)
                                            .addComponent(CancelButton))
                                    .addGap(45, 45, 45))
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(83, 83, 83)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(CreateNewInvoice)
                                            .addComponent(DeleteInvoice))
                                    .addGap(48, 48, 48))
            );

            pack();
        }// </editor-fold>

        private void DateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void CstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void FileJMenuComponentHidden(java.awt.event.ComponentEvent evt) {
            // TODO add your handling code here:
        }

        private void LoadFileActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException {


            }





        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {

            JFrame frame = new JFrame();

            frame.setVisible(true);
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {

                }
            });
        }

        // Variables declaration - do not modify
        private javax.swing.JButton CancelButton;
        private javax.swing.JButton CreateNewInvoice;
        private javax.swing.JTextField CstNameTextField;
        private javax.swing.JTextField DateTextField;
        private javax.swing.JButton DeleteInvoice;
        private javax.swing.JMenu FileJMenu;
        private javax.swing.JLabel InvoiceNo;
        private javax.swing.JLabel InvoiceTotal;
        private javax.swing.JMenuItem LoadFile;
        private javax.swing.JButton SaveButton;
        private javax.swing.JMenuItem SaveFile;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JTable jTable1;
        private javax.swing.JTable jTable2;


        // End of variables declaration
    }

}
