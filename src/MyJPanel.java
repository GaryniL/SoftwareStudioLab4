import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class MyJPanel extends JPanel implements MouseMotionListener{
    
    private Square square = new Square(100);
    int centerX;
    int centerY;
    
    public MyJPanel(){
        addMouseMotionListener(this);
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        // TODO Draw square and fill it with random color decided by method getRandomColor()
        // You should use fillRect()
        g.drawRect(centerX - square.getShapeHeight()/2, centerY - square.getShapeHeight()/2, square.getShapeWidth(), square.getShapeHeight());
        g.setColor(square.getRandomColor());
        g.getColor();
        g.fillRect(centerX - square.getShapeHeight()/2, centerY - square.getShapeHeight()/2, square.getShapeWidth(), square.getShapeHeight());
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Get mouse dragged position and change suqare's position
        centerX = e.getX();
        centerY = e.getY();
        repaint();
        //centerX = square.getCenterX(e.getX());
        //centerY = square.getCenterY(e.getY());
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        // No need to implement
    }
}