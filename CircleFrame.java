
package random_circles;


import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class CircleFrame extends JFrame {

    public static final int FRAME_WIDTH = 1280;
    public static final int FRAME_HEIGHT = 1280;
    public static final String TITLE = "Random Circles";
    
    public CircleFrame() {
        this.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        this.setTitle( TITLE );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        
        Container pane = this.getContentPane();
        CirclePanel panel = new CirclePanel();
        pane.add( panel );
        
        this.setVisible( true  );
    } // Spitfire()
    
    public static void main(String[] args) {
        CircleFrame circleFrame = new CircleFrame();
    } // main( String [] )
    
} // Spitfire
