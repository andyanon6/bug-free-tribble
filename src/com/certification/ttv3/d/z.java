package com.certification.ttv3.d;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JPanel;

public final class z extends JPanel {
  private Image a;
  
  public z() {
    Toolkit toolkit = getToolkit();
    this.a = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/right-fill.png"));
    setPreferredSize(new Dimension(9, 1));
    setBackground(Color.WHITE);
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension = getSize(null);
    Rectangle rectangle = paramGraphics.getClipBounds();
    paramGraphics.setColor(Color.WHITE);
    paramGraphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    paramGraphics.drawImage(this.a, 0, 0, this.a.getWidth(this), (int)dimension.getHeight(), this);
    paintChildren(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */