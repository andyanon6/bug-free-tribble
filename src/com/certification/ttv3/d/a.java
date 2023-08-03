package com.certification.ttv3.d;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JPanel;

public final class a extends JPanel {
  private Image a;
  
  private Image b;
  
  private Image c;
  
  public a() {
    Toolkit toolkit = getToolkit();
    this.a = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/bottom-left.png"));
    this.b = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/bottom-right.png"));
    this.c = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/bottom-fill.png"));
    setMinimumSize(new Dimension(500, 17));
    setPreferredSize(new Dimension(950, 17));
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension = getSize(null);
    Rectangle rectangle = paramGraphics.getClipBounds();
    paramGraphics.setColor(Color.WHITE);
    paramGraphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    paramGraphics.drawImage(this.a, 0, 0, this);
    if (dimension.width > 372) {
      paramGraphics.drawImage(this.b, dimension.width - this.b.getWidth(this), 0, this);
      paramGraphics.drawImage(this.c, this.a.getWidth(this), 0, dimension.width - this.b.getWidth(this) - this.a.getWidth(this), this.c.getHeight(this), this);
    } else {
      paramGraphics.drawImage(this.c, this.a.getWidth(this), 0, dimension.width - this.a.getWidth(this), this.c.getHeight(this), this);
      paramGraphics.drawImage(this.b, 356, 0, this);
    } 
    paintChildren(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */