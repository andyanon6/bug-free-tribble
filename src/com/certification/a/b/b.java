package com.certification.a.b;

import com.certification.ttv3.e.o;
import com.certification.ttv3.e.q;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class b extends JLabel implements MouseListener {
  o a;
  
  private Point[] c;
  
  private int d;
  
  private int e = 5;
  
  boolean b;
  
  public b(ImageIcon paramImageIcon, o paramo) {
    this(paramImageIcon, paramo, false, false);
  }
  
  public b(ImageIcon paramImageIcon, o paramo, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramImageIcon);
    this.b = paramBoolean1;
    if (paramImageIcon.getImageLoadStatus() != 8)
      setText("Unable to load image: " + paramImageIcon.getDescription()); 
    this.a = paramo;
    this.c = new Point[paramo.a().size()];
    this.d = 0;
    if (!this.b && !paramBoolean2)
      addMouseListener(this); 
  }
  
  public final Point[] a() {
    return this.c;
  }
  
  public final void a(Point[] paramArrayOfPoint) {
    this.c = paramArrayOfPoint;
  }
  
  public final void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    paramGraphics = paramGraphics;
    if (!this.b) {
      paramGraphics.setColor(Color.BLACK);
      paramGraphics.setStroke(new BasicStroke(3.0F));
      Point[] arrayOfPoint;
      int i = (arrayOfPoint = this.c).length;
      for (byte b1 = 0; b1 < i; b1++) {
        Point point;
        if ((point = arrayOfPoint[b1]) != null) {
          paramGraphics.drawLine((int)(point.getX() - this.e), (int)(point.getY() - this.e), (int)(point.getX() + this.e), (int)(point.getY() + this.e));
          paramGraphics.drawLine((int)(point.getX() + this.e), (int)(point.getY() - this.e), (int)(point.getX() - this.e), (int)(point.getY() + this.e));
        } 
      } 
      return;
    } 
    paramGraphics.setColor(Color.GREEN);
    paramGraphics.setStroke(new BasicStroke(2.0F));
    Iterator<q> iterator = this.a.a().iterator();
    while (iterator.hasNext()) {
      q q;
      Rectangle rectangle = (q = iterator.next()).b();
      paramGraphics.drawRect((int)rectangle.getX(), (int)rectangle.getY(), (int)rectangle.getWidth(), (int)rectangle.getHeight());
    } 
  }
  
  public final void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getClickCount() == 1) {
      this.c[this.d] = paramMouseEvent.getPoint();
      this.d++;
      if (this.d >= this.c.length)
        this.d = 0; 
      repaint();
    } 
  }
  
  public final void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public final void mouseExited(MouseEvent paramMouseEvent) {}
  
  public final void mousePressed(MouseEvent paramMouseEvent) {}
  
  public final void mouseReleased(MouseEvent paramMouseEvent) {}
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */