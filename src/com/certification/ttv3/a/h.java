package com.certification.ttv3.a;

import com.certification.ttv3.TrainingTool;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

public final class h extends JPanel {
  public h(d paramd) {}
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension1 = getSize();
    Rectangle rectangle = paramGraphics.getClipBounds();
    Graphics2D graphics2D;
    (graphics2D = (Graphics2D)paramGraphics).addRenderingHints(TrainingTool.e());
    paramGraphics.setColor(Color.WHITE);
    paramGraphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    Dimension dimension2 = this.a.e.getPreferredSize();
    this.a.e.setBounds(96, 12, dimension2.width, dimension2.height);
    dimension2 = this.a.f.getPreferredSize();
    this.a.f.setBounds(98, 43, dimension2.width, dimension2.height);
    this.a.h.setBounds(0, 92, dimension1.width, dimension1.height - 130);
    this.a.h.revalidate();
    int i;
    if ((i = dimension1.width) < 46 + dimension2.width)
      i = 46 + dimension2.width; 
    graphics2D.setColor(this.a.g);
    graphics2D.drawLine(20, 78, i - 20, 78);
    paramGraphics.drawImage(this.a.b, 16, 8, this);
    dimension2 = this.a.c.getPreferredSize();
    this.a.c.setBounds(300, dimension1.height - dimension2.height - 8, dimension2.width, dimension2.height);
    dimension2 = this.a.d.getPreferredSize();
    this.a.d.setBounds(460, dimension1.height - dimension2.height - 8, dimension2.width, dimension2.height);
    paintChildren(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */