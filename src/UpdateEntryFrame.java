
import DataBase.DbOperations;
import beans.RopaMemberBean;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author Laksh
 */
public class UpdateEntryFrame extends javax.swing.JFrame {

   
    public UpdateEntryFrame() {   
        initComponents();
        //groupButton();   //Only one radio button is selected 
        updateEntryNameField.setText("Lakshitha");
        updateEntryMemberYesField.setActionCommand("1");
        updateEntryMemberNoField.setActionCommand("0");
        //System.out.println(updateEntryMember.getSelection());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateEntryMember = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        updateEntryMemberYesField = new javax.swing.JRadioButton();
        updateEntryMemberNoField = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        updateEntryNameField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        updateEntryPositionField = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        updateEntryMobileField = new javax.swing.JTextField();
        updateEntryResidenceField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        updateEntryYearField = new com.toedter.calendar.JYearChooser();
        jLabel23 = new javax.swing.JLabel();
        updateEntryEmailField = new javax.swing.JTextField();
        updateEntryWorkPlaceField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        updateEntryJobTitleField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        updateEntryNICField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        updateUpdateFrame = new javax.swing.JButton();
        cancelUpdateFrame = new javax.swing.JButton();
        updateEntryAddressField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        memberIDLabel = new javax.swing.JLabel();
        updateEntrymemberIDField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        updateEntryIdField = new javax.swing.JTextField();
        updateEntryBirthdayField = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel15.setText("Update Details");

        jLabel16.setText("Member");

        updateEntryMember.add(updateEntryMemberYesField);
        updateEntryMemberYesField.setText("Yes");
        updateEntryMemberYesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEntryMemberYesFieldActionPerformed(evt);
            }
        });

        updateEntryMember.add(updateEntryMemberNoField);
        updateEntryMemberNoField.setText("No");
        updateEntryMemberNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEntryMemberNoFieldActionPerformed(evt);
            }
        });

        jLabel17.setText("Full Name");

        updateEntryNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEntryNameFieldActionPerformed(evt);
            }
        });

        jLabel18.setText("Highest Poistion");

        jLabel19.setText("Year");

        updateEntryPositionField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senior Prefect", "Head Prefect", "DHP", "Prefect", "Sub Prefect", "Apperentice Prefect", "-" }));
        updateEntryPositionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEntryPositionFieldActionPerformed(evt);
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

        updateUpdateFrame.setText("Update");
        updateUpdateFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUpdateFrameActionPerformed(evt);
            }
        });

        cancelUpdateFrame.setText("Cancel");
        cancelUpdateFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelUpdateFrameActionPerformed(evt);
            }
        });

        jLabel29.setText("Recidence");

        memberIDLabel.setText("Member ID");

        updateEntrymemberIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEntrymemberIDFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Entry");

        updateEntryIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEntryIdFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(updateEntryMemberYesField)
                                .addGap(33, 33, 33)
                                .addComponent(updateEntryMemberNoField)
                                .addGap(0, 189, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateEntryNameField)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(updateEntryPositionField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(updateEntryYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateEntryAddressField)
                            .addComponent(updateEntryEmailField)
                            .addComponent(updateEntryJobTitleField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(updateEntryMobileField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateEntryResidenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(updateEntryWorkPlaceField)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(updateUpdateFrame)
                                .addGap(18, 18, 18)
                                .addComponent(cancelUpdateFrame)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(updateEntryNICField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addGap(34, 34, 34)
                                .addComponent(memberIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateEntrymemberIDField))
                            .addComponent(updateEntryBirthdayField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateEntryIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(updateEntryIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateEntryMemberNoField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateEntryMemberYesField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(4, 4, 4)))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(updateEntryNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(updateEntryPositionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(updateEntryYearField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(updateEntryAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(updateEntryMobileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEntryResidenceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(updateEntryBirthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateEntryEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateEntryWorkPlaceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateEntryJobTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateEntryNICField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(memberIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateEntrymemberIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateUpdateFrame)
                    .addComponent(cancelUpdateFrame))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void cancelUpdateFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelUpdateFrameActionPerformed
        this.setVisible(false);
        //updateUpdateFrame.setLabel("abc");

    }//GEN-LAST:event_cancelUpdateFrameActionPerformed

    private void updateUpdateFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUpdateFrameActionPerformed
        RopaMemberBean ropaMemberBean2 = new RopaMemberBean();
        
        ropaMemberBean2.setMembershipID(updateEntrymemberIDField.getText());
        //ropaMemberBean.isMember()
       updateEntryMemberYesField.setActionCommand("1");
       updateEntryMemberNoField.setActionCommand("0");
       if ("1".equals(updateEntryMember.getSelection().getActionCommand())){
           ropaMemberBean2.setMember(true);
       }
       else {
           ropaMemberBean2.setMember(false);
       }
  
        ropaMemberBean2.setFullName(updateEntryNameField.getText());
        ropaMemberBean2.setPosition(Integer.toString(updateEntryPositionField.getSelectedIndex()));
        ropaMemberBean2.setSeniorYear(Integer.toString(updateEntryYearField.getValue()));
        ropaMemberBean2.setAddress(updateEntryAddressField.getText());
        ropaMemberBean2.setMobile(updateEntryMobileField.getText());
        ropaMemberBean2.setResidence(updateEntryResidenceField.getText());
        Date dateFromDateChooser = updateEntryBirthdayField.getDate();
        //System.out.println(dateFromDateChooser);
        if(dateFromDateChooser== null){
            //System.out.println("Null Date Received");
            ropaMemberBean2.setBirthDay("");
        }
        else{
        //System.out.println(updateEntryBirthdayField.getDate());
        String dateString = String.format("%1$tY.%1$tm.%1$td", dateFromDateChooser);
        ropaMemberBean2.setBirthDay(dateString);}
        
        
        ropaMemberBean2.setEmail(updateEntryEmailField.getText());
        ropaMemberBean2.setWorkPlace(updateEntryWorkPlaceField.getText());
        ropaMemberBean2.setJobTitle(updateEntryJobTitleField.getText());
        ropaMemberBean2.setNic(updateEntryNICField.getText());
        ropaMemberBean2.setId(Integer.parseInt(updateEntryIdField.getText()));
        
        DbOperations.updateEntryFromDb(ropaMemberBean2);
        MainProgramme.fillTable();
      
        this.setVisible(false);
 
       
    }//GEN-LAST:event_updateUpdateFrameActionPerformed

    private void updateEntryPositionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEntryPositionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateEntryPositionFieldActionPerformed

    private void updateEntryNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEntryNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateEntryNameFieldActionPerformed

    private void updateEntryMemberNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEntryMemberNoFieldActionPerformed
        updateEntrymemberIDField.setFocusable(false);
       // memberIDLabel.setVisible(false);
    }//GEN-LAST:event_updateEntryMemberNoFieldActionPerformed

    private void updateEntryMemberYesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEntryMemberYesFieldActionPerformed
        updateEntrymemberIDField.setFocusable(true);
       
    }//GEN-LAST:event_updateEntryMemberYesFieldActionPerformed

    private void updateEntrymemberIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEntrymemberIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateEntrymemberIDFieldActionPerformed

    private void updateEntryIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEntryIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateEntryIdFieldActionPerformed

//    private void groupButton( ) {                   //Only one radio button is selected 
//
//        ButtonGroup bg1 = new ButtonGroup( );
//        bg1.add(updateEntryMemberYesField);
//        bg1.add(updateEntryMemberNoField);
//        
//
//}
    public void fillUpdateField(RopaMemberBean ropaMemberBean) throws ParseException{
        updateEntrymemberIDField.setText(ropaMemberBean.getMembershipID());
        updateEntryNameField.setText(ropaMemberBean.getFullName());
       // updateEntryMember
        if (ropaMemberBean.isMember()){
            updateEntryMemberYesField.setSelected(true);}
            else{
            updateEntryMemberNoField.setSelected(true);
        }
        updateEntryPositionField.setSelectedIndex(Integer.parseInt(ropaMemberBean.getPosition()));
        updateEntryYearField.setYear(Integer.parseInt(ropaMemberBean.getSeniorYear()));
        updateEntryAddressField.setText(ropaMemberBean.getAddress());
        updateEntryMobileField.setText(ropaMemberBean.getMobile());
        updateEntryResidenceField.setText(ropaMemberBean.getResidence());
        String birthDate = ropaMemberBean.getBirthDay();
        if(StringUtils.isEmpty(birthDate)){
            updateEntryBirthdayField.setDateFormatString("MM/DD/YY");
            //System.out.println("Null Birthday");
        }
        else{
        Date date = new SimpleDateFormat("yyyy.MM.dd").parse(birthDate);
           // System.out.println(date);
        updateEntryBirthdayField.setDate(date);}
        //newEntryBirthDayField.setDateFormatString("MM/DD/YY");
        updateEntryEmailField.setText(ropaMemberBean.getEmail());
        updateEntryWorkPlaceField.setText(ropaMemberBean.getWorkPlace());
        updateEntryJobTitleField.setText(ropaMemberBean.getJobTitle());
        updateEntryNICField.setText(ropaMemberBean.getNic());
        updateEntryIdField.setText(Integer.toString(ropaMemberBean.getId()));
        updateEntryIdField.setFocusable(false);
        
    }
    public void clearFields(){
        updateEntrymemberIDField.setText("");
        updateEntryNameField.setText("");
        updateEntryPositionField.setSelectedIndex(0);
        updateEntryYearField.setYear(2016);
        updateEntryAddressField.setText("");
        updateEntryMobileField.setText("");
        updateEntryResidenceField.setText("");
        updateEntryBirthdayField.setDateFormatString("MM/DD/YY");
        updateEntryEmailField.setText("");
        updateEntryWorkPlaceField.setText("");
        updateEntryJobTitleField.setText("");
        updateEntryNICField.setText("");
        updateEntryIdField.setText("");
  
    
    }
    public static void main(String args[]) {
        
       
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UpdateEntryFrame().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelUpdateFrame;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel memberIDLabel;
    private javax.swing.JTextField updateEntryAddressField;
    private com.toedter.calendar.JDateChooser updateEntryBirthdayField;
    private javax.swing.JTextField updateEntryEmailField;
    private javax.swing.JTextField updateEntryIdField;
    private javax.swing.JTextField updateEntryJobTitleField;
    private javax.swing.ButtonGroup updateEntryMember;
    private javax.swing.JRadioButton updateEntryMemberNoField;
    private javax.swing.JRadioButton updateEntryMemberYesField;
    private javax.swing.JTextField updateEntryMobileField;
    private javax.swing.JTextField updateEntryNICField;
    private javax.swing.JTextField updateEntryNameField;
    private javax.swing.JComboBox<String> updateEntryPositionField;
    private javax.swing.JTextField updateEntryResidenceField;
    private javax.swing.JTextField updateEntryWorkPlaceField;
    private com.toedter.calendar.JYearChooser updateEntryYearField;
    private javax.swing.JTextField updateEntrymemberIDField;
    private javax.swing.JButton updateUpdateFrame;
    // End of variables declaration//GEN-END:variables
}
