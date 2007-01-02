/*
 * Main.java
 *
 * Created on January 2, 2007, 11:06 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package customcomponentlisteningdemo;

import java.awt.Color;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.netbeans.api.wizard.WizardDisplayer;
import org.netbeans.spi.wizard.Summary;
import org.netbeans.spi.wizard.WizardException;
import org.netbeans.spi.wizard.WizardPage;
import org.netbeans.spi.wizard.WizardPage.WizardResultProducer;

/**
 *
 * @author Tim Boudreau
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName());
        
        WizardDisplayer.showWizard(WizardPage.createWizard("Custom Listening Demo",
                new WizardPage[] { new PickColorPanel() }, new WRP()));
    }
    
    private static class WRP implements WizardResultProducer {
        public Object finish(Map wizardData) throws WizardException {
            Color c = (Color) wizardData.get("color");
            JLabel lbl = new JLabel ("You chose " + c);
            lbl.setOpaque (true);
            lbl.setBackground (c);
            int avg = (c.getRed() + c.getGreen() + c.getBlue()) / 3;
            if (avg <= 128) {
                lbl.setForeground (Color.WHITE);
            }
            Summary s = Summary.create(lbl, c);
            return s;
        }

        public boolean cancel(Map settings) {
            int result = JOptionPane.showConfirmDialog(null, "Really cancel?", "Cancel", 
                    JOptionPane.OK_CANCEL_OPTION);
            return result == JOptionPane.OK_OPTION;
        }
    }
}
