package com.modloaded.nicedialog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author MasterProvider
 */
public class NiceDialog extends JPanel implements ActionListener {
    private static JDialog dialog; 
    private String mTitleText;
    private String mDescritionText;
    private String mConfirmText;
    private ActionEvent mActionEvent;
    public static final int INFO_TYPE = 0;
    public static final int ERROR_TYPE = 1;
    public static final int SUCCESS_TYPE = 2;
    public static final int WARNING_TYPE = 3;
    private OnActionListener mConfirmListener;
    private OnActionListener mCancelListener;
    /**
     * Creates new form NiceDialog
     */
    
   public static interface OnActionListener {
        public void actionPerformed(NiceDialog niceDialog);
    }
   
    public NiceDialog() {
        this(INFO_TYPE);
        
       
    }
    
     public static JPanel newPanel(JPanel labelText) {
        JPanel pane = new JPanel(new BorderLayout());
        pane.add(labelText);
        
        return pane;
    }
     
     
     private static JLabel newLabel(String label) {
        JLabel l = new JLabel(label);
        l.setFont(l.getFont().deriveFont(24.0f));
        return l;
    }
    
    public NiceDialog(int dialogType){
        initComponents();
        dialog = new JDialog();
        dialog.setUndecorated(true);
        dialog.setModal(true);//bug
        dialog.add(this);
        dialog.setSize(300,400);  
        dialog.setLocationRelativeTo(null);
        confirm.addActionListener(this);
        cancel.addActionListener(this);
        changeDialogType(dialogType);
    }
    
    
   
        private void changeDialogType(int dialogType) {
      
            switch (dialogType) {
                case INFO_TYPE:
                     bannerLayout.setBackground(new Color(51,153,255));
                     icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info_icon.png")));
                    break;
                case ERROR_TYPE:
                    bannerLayout.setBackground(new Color(204,0,0));
                    icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/error_icon.png")));
                  
                    break;
                case SUCCESS_TYPE:
                     bannerLayout.setBackground(new Color(51,204,0));
                     icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/success_icon.png")));
                 
                    break;
                case WARNING_TYPE:
                    bannerLayout.setBackground(new Color(255,204,0));
                    icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/warning_icon.png")));
                  
                    break;
            }
           
        
    }
        
    public void changeAlertType(int dialogType) {
        changeDialogType(dialogType);
    }
    
   public NiceDialog setTitleText (String text) {
        mTitleText = text;
        if (titleText != null && mTitleText != null) {
            titleText.setText(mTitleText);
        }
        return this;
    }
   
   public NiceDialog setDescriptionText (String text) {
        mDescritionText = text;
        if (description != null && mDescritionText != null) {
            description.setText(mDescritionText);
        }
        return this;
    }
   
    public NiceDialog setConfirmText (String text) {
        mConfirmText = text;
        if (confirm != null && mConfirmText != null) {
            confirm.setText(mConfirmText);
        }
        return this;
    }
    
     public NiceDialog setConfirmListener (OnActionListener listener) {
        mConfirmListener = listener;
        return this;
    }
     
    public NiceDialog setCancelListener (OnActionListener listener) {
        mCancelListener = listener;
        return this;
    }
     
    
     
    public NiceDialog dismiss() {
          dialog.setVisible(false);
        return this;
    }
    
    public NiceDialog display() {
          dialog.setVisible(true);
        return this;
    }
   
   @Override
    public void actionPerformed(ActionEvent event) {
       
         if(event.getSource()==confirm){
             if (mConfirmListener != null) {
                 mConfirmListener.actionPerformed(NiceDialog.this);
             } else {
                   dismiss();
             }
         }else if(event.getSource()==cancel){
             if (mCancelListener != null) {
                 mCancelListener.actionPerformed(NiceDialog.this);
             } else {
                   dismiss();
             }
             
         }
         
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bannerLayout = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        titleText = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        dScroll = new javax.swing.JScrollPane();
        description = new javax.swing.JTextPane();

        setMaximumSize(new java.awt.Dimension(300, 400));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(300, 400));
        setLayout(null);

        icon.setMaximumSize(new java.awt.Dimension(50, 50));
        icon.setMinimumSize(new java.awt.Dimension(50, 50));
        icon.setPreferredSize(new java.awt.Dimension(50, 50));

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_icon.png"))); // NOI18N
        cancel.setBorderPainted(false);
        cancel.setContentAreaFilled(false);
        cancel.setOpaque(false);

        javax.swing.GroupLayout bannerLayoutLayout = new javax.swing.GroupLayout(bannerLayout);
        bannerLayout.setLayout(bannerLayoutLayout);
        bannerLayoutLayout.setHorizontalGroup(
            bannerLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerLayoutLayout.createSequentialGroup()
                .addGap(0, 125, Short.MAX_VALUE)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bannerLayoutLayout.setVerticalGroup(
            bannerLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerLayoutLayout.createSequentialGroup()
                .addGroup(bannerLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bannerLayoutLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(bannerLayout);
        bannerLayout.setBounds(0, 0, 300, 114);

        titleText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(titleText);
        titleText.setBounds(10, 120, 280, 20);

        confirm.setText("OK");
        add(confirm);
        confirm.setBounds(10, 360, 280, 30);

        dScroll.setBorder(null);

        description.setEditable(false);
        description.setBackground(new java.awt.Color(240, 240, 240));
        description.setToolTipText("");
        dScroll.setViewportView(description);
        description.getAccessibleContext().setAccessibleParent(this);

        add(dScroll);
        dScroll.setBounds(10, 150, 280, 200);
    }// </editor-fold>//GEN-END:initComponents

   public static void main(String args[]){ 
        new NiceDialog();
      
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bannerLayout;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JScrollPane dScroll;
    private javax.swing.JTextPane description;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel titleText;
    // End of variables declaration//GEN-END:variables

    
}
