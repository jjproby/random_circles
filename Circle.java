
package random_circles;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;


public class Circle implements Colorable{
    
    double x;
    double y;
    double radius;
    private Color color;
    
    public Circle( double x, double y, double radius) {
        
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color c) {
        
    }
    
    public boolean intersects( Circle c ) {
        
    }
    
    public void draw( Graphics2D g2D, AffineTransform transform) {
        
    }
    
}
