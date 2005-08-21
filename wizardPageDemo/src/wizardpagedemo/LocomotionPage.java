/*
 *                 Sun Public License Notice
 * 
 * The contents of this file are subject to the Sun Public License
 * Version 1.0 (the "License"). You may not use this file except in
 * compliance with the License. A copy of the License is available at
 * http://www.sun.com/
 * 
 * The Original Code is NetBeans. The Initial Developer of the Original
 * Code is Sun Microsystems, Inc. Portions Copyright 1997-2005 Sun
 * Microsystems, Inc. All Rights Reserved.
 */
/*
 * LocomotionPage.java
 *
 * Created on August 20, 2005, 2:37 PM
 */

package wizardpagedemo;

import org.netbeans.spi.wizard.WizardPage;

/**
 *
 * @author Tim Boudreau
 */
public class LocomotionPage extends WizardPage  {
    
    /** Creates new form LocomotionPage */
    public LocomotionPage() {
        initComponents();
    }

    
    public static final String getDescription() {
        return "Locomotion style";
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setLayout(null);

        jSpinner1.setName("legCount");
        jSpinner1.setValue(new Integer(1));
        add(jSpinner1);
        jSpinner1.setBounds(30, 120, 130, 24);

        jLabel1.setText("Number of legs");
        add(jLabel1);
        jLabel1.setBounds(30, 100, 200, 16);

        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(1);
        jSlider1.setName("headcount");
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        add(jSlider1);
        jSlider1.setBounds(30, 190, 190, 38);

        jLabel2.setText("Number of heads");
        add(jLabel2);
        jLabel2.setBounds(30, 170, 210, 16);

        jLabel3.setText("1");
        add(jLabel3);
        jLabel3.setBounds(220, 196, 110, 16);

        jCheckBox1.setText("Can swim");
        jCheckBox1.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(0, 0, 0, 0)));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox1.setName("canSwim");
        add(jCheckBox1);
        jCheckBox1.setBounds(30, 250, 83, 18);

    }
    // </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        jLabel3.setText (Integer.toString(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1StateChanged
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
    
}
