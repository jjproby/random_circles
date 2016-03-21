
package random_circles;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;


public class Circle implements Colorable{
    
    double x;
    double y;
    double radius;
    private Color color;
    
    public Circle( double x, double y, double radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color c) {
        
    }
    
    public boolean intersects( Circle c ) {
        double distance = Math.sqrt(Math.pow(c.x - this.x,2) - Math.pow(c.y - this.y,2));
        
        if (this.radius + c.radius < distance) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void draw( Graphics2D g2D, AffineTransform transform) {
        
    }
    
}
