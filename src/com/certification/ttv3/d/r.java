package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;

final class r extends JLabel implements MouseListener {
  private EventListenerList b = new EventListenerList();
  
  boolean a;
  
  private r(q paramq, String paramString) {
    super(paramString);
    setFont(paramq.d);
    setOpaque(false);
    setBorder(BorderFactory.createEmptyBorder(4, 6, 4, 6));
    a(false);
    addMouseListener(this);
    setCursor(new Cursor(12));
  }
  
  public final void a(ChangeListener paramChangeListener) {
    this.b.add(ChangeListener.class, paramChangeListener);
  }
  
  public final void a(boolean paramBoolean) {
    this.a = paramBoolean;
    if (this.a) {
      setBorder(BorderFactory.createEmptyBorder(4, 10, 4, 6));
      return;
    } 
    setBorder(BorderFactory.createEmptyBorder(4, 14, 4, 6));
  }
  
  public final void paint(Graphics paramGraphics) {
    RoundRectangle2D.Double double_;
    Dimension dimension = getSize((Dimension)null);
    (paramGraphics = paramGraphics).addRenderingHints(TrainingTool.e());
    r r1;
    if ((r1 = this).a) {
      double_ = new RoundRectangle2D.Double(0.0D, 0.0D, (dimension.width - 1), (dimension.height - 1), 12.0D, 12.0D);
      paramGraphics.setPaint(new GradientPaint(0.0F, 0.0F, new Color(154, 189, 226), 200.0F, 0.0F, Color.WHITE));
      paramGraphics.fill(double_);
      paramGraphics.setPaint(this.c.g);
      paramGraphics.draw(double_);
      paramGraphics.setPaint(Color.BLACK);
    } else {
      double_ = new RoundRectangle2D.Double(4.0D, 0.0D, (((Dimension)double_).width - 5), (((Dimension)double_).height - 1), 12.0D, 12.0D);
      paramGraphics.setPaint(this.c.g);
      paramGraphics.draw(double_);
      paramGraphics.setPaint(this.c.f);
    } 
    super.paint(paramGraphics);
  }
  
  public final void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public final void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public final void mouseExited(MouseEvent paramMouseEvent) {}
  
  public final void mousePressed(MouseEvent paramMouseEvent) {}
  
  public final void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 1) {
      r r1;
      a(!(r1 = this).a);
      Object[] arrayOfObject = (r1 = this).b.getListenerList();
      ChangeEvent changeEvent = null;
      for (int i = arrayOfObject.length - 2; i >= 0; i -= 2) {
        if (arrayOfObject[i] == ChangeListener.class) {
          if (changeEvent == null)
            changeEvent = new ChangeEvent(r1); 
          ((ChangeListener)arrayOfObject[i + 1]).stateChanged(changeEvent);
        } 
      } 
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */