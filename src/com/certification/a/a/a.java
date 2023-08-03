package com.certification.a.a;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.Scrollable;

public class a extends JPanel implements Scrollable {
  private RenderingHints a = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
  
  public a() {
    this.a.put(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
  }
  
  public Dimension getPreferredScrollableViewportSize() {
    Dimension dimension;
    return dimension = getMinimumSize();
  }
  
  public int getScrollableBlockIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) {
    return 10;
  }
  
  public boolean getScrollableTracksViewportHeight() {
    return (getParent() instanceof JViewport) ? ((((JViewport)getParent()).getHeight() > (getPreferredSize()).height)) : false;
  }
  
  public boolean getScrollableTracksViewportWidth() {
    return (getParent() instanceof JViewport) ? ((((JViewport)getParent()).getWidth() > (getMinimumSize()).width)) : false;
  }
  
  public int getScrollableUnitIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) {
    return 10;
  }
  
  public void paint(Graphics paramGraphics) {
    (paramGraphics = paramGraphics).addRenderingHints(this.a);
    super.paint(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */