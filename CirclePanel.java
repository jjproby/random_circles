
package random_circles;

import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.RED;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
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
        Circle c = new Circle(.5, .5, .5, RED);
        AffineTransform transform = new AffineTransform();
        AffineTransform translate = new AffineTransform();
        AffineTransform scale = new AffineTransform();
        translate.setToTranslation(1,1);
        scale.setToScale(w/2, h/2);
        transform.concatenate(scale);
        c.draw(g2D, transform);
    }
    
}
