package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.e.e;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

final class F extends JPanel {
  private JLabel b;
  
  private JLabel c;
  
  private JLabel d;
  
  private JScrollPane e;
  
  public F(A paramA) {
    setBackground(Color.WHITE);
    e e;
    if ((e = A.a(paramA).j()) != null) {
      this.b = new JLabel(String.valueOf(e.e()) + " " + e.d());
    } else {
      this.b = new JLabel("Exam data not available");
    } 
    this.b.setFont(new Font("Arial", 0, 24));
    this.b.setForeground(new Color(4, 50, 96));
    if (e != null) {
      this.c = new JLabel(e.f());
    } else {
      this.c = new JLabel("");
    } 
    this.c.setFont(new Font("Arial", 0, 11));
    this.c.setForeground(new Color(132, 135, 140));
    this.d = new JLabel("General Settings");
    this.d.setFont(new Font("Arial", 0, 14));
    this.d.setForeground(new Color(4, 50, 96));
    add(this.b);
    add(this.c);
    add(this.d);
    this.e = new JScrollPane(20, 30);
    this.e.setBorder(BorderFactory.createLineBorder(paramA.a));
    this.e.setBackground(Color.WHITE);
    if (e != null)
      this.e.getViewport().setView((Component)new G(this)); 
    this.e.getVerticalScrollBar().setUnitIncrement(TrainingTool.h);
    add(this.e);
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension2 = getSize((Dimension)null);
    Rectangle rectangle = paramGraphics.getClipBounds();
    Graphics2D graphics2D;
    (graphics2D = (Graphics2D)paramGraphics).addRenderingHints(TrainingTool.e());
    paramGraphics.setColor(Color.WHITE);
    paramGraphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    Dimension dimension1 = this.b.getPreferredSize();
    this.b.setBounds(24, 12, dimension1.width + 10, dimension1.height);
    dimension1 = this.c.getPreferredSize();
    this.c.setBounds(25, 43, dimension1.width + 10, dimension1.height);
    dimension1 = this.d.getPreferredSize();
    this.d.setBounds(25, 84, dimension1.width, dimension1.height);
    graphics2D.setColor(this.a.a);
    graphics2D.drawLine(20, 78, dimension2.width - 20, 78);
    this.e.setBounds(16, 110, dimension2.width - 32, dimension2.height - 116);
    this.e.setMaximumSize(new Dimension(dimension2.width - 32, dimension2.height - 116));
    this.e.setPreferredSize(new Dimension(dimension2.width - 32, dimension2.height - 116));
    this.e.setMinimumSize(new Dimension(dimension2.width - 32, dimension2.height - 116));
    this.e.revalidate();
    paintChildren(graphics2D);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/F.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */