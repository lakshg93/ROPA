
import DataBase.DbOperations;
import beans.RopaMemberBean;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;



/**
 *
 * @author Laksh
 */
public class NewEntryFrame extends javax.swing.JFrame {

 
    public NewEntryFrame() {
        
        initComponents();
        newEntryMemberYesField.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newEntryMember = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        newEntryMemberYesField = new javax.swing.JRadioButton();
        newEntryMemberNoField = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        newEntryNameField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        newEntryPositionField = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        newEntryMobileField = new javax.swing.JTextField();
        newEntryResidenceField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        NewEntryYearField = new com.toedter.calendar.JYearChooser();
        newEntryBirthDayField = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        newEntryEmailField = new javax.swing.JTextField();
        newEntryWorkPlaceField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        newEntryJobTitleField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        newEntryNICField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        newEntryMemberIDPannel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        newEntryMemberIDField = new javax.swing.JTextField();
        newEntryCreate = new javax.swing.JButton();
        newEntryCancel = new javax.swing.JButton();
        newEntryAddressField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel15.setText("New Entry");

        jLabel16.setText("Member");

        newEntryMember.add(newEntryMemberYesField);
        newEntryMemberYesField.setText("Yes");
        newEntryMemberYesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEntryMemberYesFieldActionPerformed(evt);
            }
        });

        newEntryMember.add(newEntryMemberNoField);
        newEntryMemberNoField.setText("No");
        newEntryMemberNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEntryMemberNoFieldActionPerformed(evt);
            }
        });

        jLabel17.setText("Full Name");

        newEntryNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEntryNameFieldActionPerformed(evt);
            }
        });

        jLabel18.setText("Highest Poistion");

        jLabel19.setText("Year");

        newEntryPositionField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senior Prefect", "DHP", "Head Prefect", "Prefect", "Sub Prefect", "Apperentice Prefect" }));
        newEntryPositionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEntryPositionFieldActionPerformed(evt);
            }
        });

        jLabel20.setText("Address");

        jLabel21.setText("Mobile");

        jLabel22.setText("Date of Birth");

        jLabel23.setText("Email Address");

        jLabel24.setText("Work Place");

        jLabel25.setText("Job Title");

        jLabel26.setText("NIC");

        jLabel27.setText("V");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel28.setText("Member ID");

        newEntryMemberIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEntryMemberIDFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newEntryMemberIDPannelLayout = new javax.swing.GroupLayout(newEntryMemberIDPannel);
        newEntryMemberIDPannel.setLayout(newEntryMemberIDPannelLayout);
        newEntryMemberIDPannelLayout.setHorizontalGroup(
            newEntryMemberIDPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newEntryMemberIDPannelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(newEntryMemberIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        newEntryMemberIDPannelLayout.setVerticalGroup(
            newEntryMemberIDPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newEntryMemberIDPannelLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(newEntryMemberIDPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newEntryMemberIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        newEntryCreate.setText("Create");
        newEntryCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEntryCreateActionPerformed(evt);
            }
        });

        newEntryCancel.setText("Cancel");
        newEntryCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEntryCancelActionPerformed(evt);
            }
        });

        jLabel29.setText("Recidence");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newEntryEmailField)
                                    .addComponent(newEntryJobTitleField)
                                    .addComponent(newEntryBirthDayField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newEntryWorkPlaceField)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(newEntryNICField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel27))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(newEntryCreate)
                                                .addGap(18, 18, 18)
                                                .addComponent(newEntryCancel))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(newEntryMobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel29)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(newEntryResidenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 8, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newEntryAddressField)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(newEntryPositionField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NewEntryYearField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(newEntryNameField)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(newEntryMemberYesField)
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(newEntryMemberIDPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(newEntryMemberNoField))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(240, 240, 240)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addGap(1, 1, 1)
                        .addComponent(newEntryMemberIDPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newEntryMemberYesField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(newEntryMemberNoField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 119, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(4, 4, 4)))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(newEntryNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(newEntryPositionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(NewEntryYearField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(newEntryAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(newEntryMobileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newEntryResidenceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(newEntryBirthDayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newEntryEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newEntryWorkPlaceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newEntryJobTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newEntryNICField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newEntryCreate)
                            .addComponent(newEntryCancel))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newEntryMemberYesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryMemberYesFieldActionPerformed
        //this.setVisible(false);
    }//GEN-LAST:event_newEntryMemberYesFieldActionPerformed

    private void newEntryNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newEntryNameFieldActionPerformed

    private void newEntryPositionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryPositionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newEntryPositionFieldActionPerformed

    private void newEntryMemberIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryMemberIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newEntryMemberIDFieldActionPerformed

    private void newEntryMemberNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryMemberNoFieldActionPerformed
        //newEntryMemberIDField.setFocusable(false);
    }//GEN-LAST:event_newEntryMemberNoFieldActionPerformed

    private void newEntryCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryCreateActionPerformed
        
        RopaMemberBean ropaMemberBean = new RopaMemberBean();
        
        
        //ropaMemberBean.isMember()
       
       newEntryMemberYesField.setActionCommand("1");
       newEntryMemberNoField.setActionCommand("0");
       ropaMemberBean.setMembershipID(newEntryMemberIDField.getText());
       
       if ("1".equals(newEntryMember.getSelection().getActionCommand())){
           ropaMemberBean.setMember(true);
           
       }
       else {
           ropaMemberBean.setMember(false);
           
       }
  
        ropaMemberBean.setFullName(newEntryNameField.getText()); 
        ropaMemberBean.setPosition(Integer.toString(newEntryPositionField.getSelectedIndex()));
        ropaMemberBean.setSeniorYear(Integer.toString(NewEntryYearField.getValue()));
        ropaMemberBean.setAddress(newEntryAddressField.getText());
        ropaMemberBean.setMobile(newEntryMobileField.getText());
        ropaMemberBean.setResidence(newEntryResidenceField.getText());
        Date dateFromDateChooser = newEntryBirthDayField.getDate();
        if(dateFromDateChooser== null){
            //System.out.println("Null Date Received");
            ropaMemberBean.setBirthDay(" ");
        }
        else{
           
        String dateString = String.format("%1$tY.%1$tm.%1$td", dateFromDateChooser);
        // System.out.println(dateString);
        ropaMemberBean.setBirthDay(dateString);}
        //System.out.println(newEntryBirthDayField.getDate());
        //String dateString = String.format("%1$tY.%1$tm.%1$td", dateFromDateChooser);
        //ropaMemberBean.setBirthDay(dateString);
        ropaMemberBean.setEmail(newEntryEmailField.getText());
        ropaMemberBean.setWorkPlace(newEntryWorkPlaceField.getText());
        ropaMemberBean.setJobTitle(newEntryJobTitleField.getText());
        ropaMemberBean.setNic(newEntryNICField.getText());
        
        DbOperations.insertEntryToDb(ropaMemberBean);
        MainProgramme.fillTable();
      
        this.setVisible(false);
        
       
       
    }//GEN-LAST:event_newEntryCreateActionPerformed

    private void newEntryCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_newEntryCancelActionPerformed


  
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JYearChooser NewEntryYearField;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField newEntryAddressField;
    private com.toedter.calendar.JDateChooser newEntryBirthDayField;
    private javax.swing.JButton newEntryCancel;
    private javax.swing.JButton newEntryCreate;
    private javax.swing.JTextField newEntryEmailField;
    private javax.swing.JTextField newEntryJobTitleField;
    private javax.swing.ButtonGroup newEntryMember;
    private javax.swing.JTextField newEntryMemberIDField;
    private javax.swing.JPanel newEntryMemberIDPannel;
    private javax.swing.JRadioButton newEntryMemberNoField;
    private javax.swing.JRadioButton newEntryMemberYesField;
    private javax.swing.JTextField newEntryMobileField;
    private javax.swing.JTextField newEntryNICField;
    private javax.swing.JTextField newEntryNameField;
    private javax.swing.JComboBox<String> newEntryPositionField;
    private javax.swing.JTextField newEntryResidenceField;
    private javax.swing.JTextField newEntryWorkPlaceField;
    // End of variables declaration//GEN-END:variables
}
