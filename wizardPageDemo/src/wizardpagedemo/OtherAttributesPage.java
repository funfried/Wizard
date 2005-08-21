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
 * OtherAttributesPage.java
 *
 * Created on August 20, 2005, 2:45 PM
 */

package wizardpagedemo;

import org.netbeans.spi.wizard.WizardPage;

/**
 *
 * @author  tim
 */
public class OtherAttributesPage extends WizardPage {
    
    /** Creates new form OtherAttributesPage */
    public OtherAttributesPage() {
        initComponents();
    }
    
    public static final String getDescription() {
        return "Other Attributes";
    }    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();

        setLayout(null);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Furry", "Scaly", "Exoskeleton", "Bare skin" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setName("epidermis");
        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1);
        jScrollPane1.setBounds(90, 40, 200, 120);

        jLabel1.setText("Epidermis");
        jLabel1.setName("epidermis");
        add(jLabel1);
        jLabel1.setBounds(90, 20, 200, 16);

        jCheckBox1.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(0, 0, 0, 0)));
        jCheckBox1.setLabel("Claws");
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox1.setName("claws");
        add(jCheckBox1);
        jCheckBox1.setBounds(40, 190, 59, 18);

        jCheckBox2.setText("Tendrils");
        jCheckBox2.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(0, 0, 0, 0)));
        jCheckBox2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox2.setName("tendrils");
        add(jCheckBox2);
        jCheckBox2.setBounds(140, 190, 73, 18);

        jCheckBox3.setText("Hooves");
        jCheckBox3.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(0, 0, 0, 0)));
        jCheckBox3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox3.setName("hooves");
        add(jCheckBox3);
        jCheckBox3.setBounds(250, 190, 90, 18);

    }
    // </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
