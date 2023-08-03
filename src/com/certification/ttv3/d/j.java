package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.e.e;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

final class j extends JPanel {
  private JLabel a;
  
  private JLabel b;
  
  private f c;
  
  private JScrollPane d;
  
  public j(b paramb) {
    setBackground(Color.WHITE);
    e e = paramb.a.j();
    this.a = new JLabel(String.valueOf(e.e()) + " " + e.d());
    this.a.setFont(new Font("Arial", 0, 24));
    this.a.setForeground(new Color(4, 50, 96));
    this.b = new JLabel(e.f());
    this.b.setFont(new Font("Arial", 0, 11));
    this.b.setForeground(new Color(63, 63, 63));
    add(this.a);
    add(this.b);
    this.c = new f(paramb);
    add(this.c);
    paramb.b = new Color(221, 221, 221);
    this.d = new JScrollPane(20, 31);
    this.d.setBorder(BorderFactory.createLineBorder(paramb.b));
    this.d.setBackground(Color.WHITE);
    this.d.getViewport().setBackground(Color.WHITE);
    this.d.getViewport().setView(new k(paramb));
    this.d.getVerticalScrollBar().setUnitIncrement(TrainingTool.h);
    add(this.d);
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension2 = getSize((Dimension)null);
    Rectangle rectangle = paramGraphics.getClipBounds();
    Graphics2D graphics2D;
    (graphics2D = (Graphics2D)paramGraphics).addRenderingHints(TrainingTool.e());
    paramGraphics.setColor(Color.WHITE);
    paramGraphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    Dimension dimension1 = this.a.getPreferredSize();
    this.a.setBounds(24, 12, dimension1.width + 10, dimension1.height);
    dimension1 = this.b.getPreferredSize();
    this.b.setBounds(25, 43, dimension1.width + 10, dimension1.height);
    graphics2D.setColor(this.e.b);
    graphics2D.drawLine(20, 66, dimension2.width - 20, 66);
    dimension1 = this.c.getPreferredSize();
    int i = 15;
    if ((dimension2.width - dimension1.getWidth()) / 2.0D > 15.0D)
      i = (dimension2.width - dimension1.width) / 2; 
    this.c.setBounds(i, 70, dimension1.width, dimension1.height);
    this.d.setBounds(16, 170, dimension2.width - 32, dimension2.height - 176);
    this.d.setMaximumSize(new Dimension(dimension2.width - 32, dimension2.height - 176));
    this.d.setPreferredSize(new Dimension(dimension2.width - 32, dimension2.height - 176));
    this.d.setMinimumSize(new Dimension(dimension2.width - 32, dimension2.height - 176));
    this.d.revalidate();
    paintChildren(graphics2D);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */