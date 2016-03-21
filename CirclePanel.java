
package random_circles;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class CirclePanel extends JPanel {
    
    public static final Color BG_COLOR = new Color(180, 224, 248);
    
    public CirclePanel() {
        this.setBackground(BG_COLOR);
    }
       
    @Override
    public void paintComponent( Graphics g ) {
        
    }
    
}
