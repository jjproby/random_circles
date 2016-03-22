
package random_circles;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class CirclePanel extends JPanel {
    
    public static final Color BG_COLOR = new Color(180, 224, 248);
    private double nearness = 0.0;
    private int phase = 0;
    private double bankAngle = 0.0;
    private double climb = 0.0;

    
    public CirclePanel() {
        this.setBackground(BG_COLOR);
    }
       
    @Override
    public void paintComponent( Graphics g ) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        int w = this.getWidth();
        int h = this.getHeight();
    }
    
}
