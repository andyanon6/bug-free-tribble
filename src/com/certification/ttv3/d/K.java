package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.f.g;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public final class K extends JPanel {
  private Image a;
  
  private Image b;
  
  private Image c;
  
  private g d;
  
  private g e;
  
  private z f;
  
  public K(TrainingTool paramTrainingTool, z paramz) {
    this.f = paramz;
    Toolkit toolkit = getToolkit();
    this.a = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/top-left.png"));
    this.b = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/top-right.png"));
    this.c = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/top-fill.png"));
    toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/top-spacer.png"));
    this.e = new g(new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/top-feedback.png"))));
    this.e.a(TrainingTool.d);
    this.e.setBorderPainted(false);
    this.e.setMargin(new Insets(0, 0, 0, 0));
    this.e.setOpaque(false);
    this.e.setContentAreaFilled(false);
    this.e.setFocusable(false);
    this.e.setCursor(new Cursor(12));
    this.d = new g(new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/top-support.png"))));
    this.d.a(TrainingTool.e);
    this.d.setBorderPainted(false);
    this.d.setMargin(new Insets(0, 0, 0, 0));
    this.d.setOpaque(false);
    this.d.setContentAreaFilled(false);
    this.d.setFocusable(false);
    this.d.setCursor(new Cursor(12));
    add((Component)this.e);
    add((Component)this.d);
    setBackground(Color.WHITE);
    setMinimumSize(new Dimension(500, 98));
    setPreferredSize(new Dimension(950, 98));
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension;
    int i;
    if ((i = (dimension = getSize((Dimension)null)).width - 363) < 0)
      i = 0; 
    if (i > 9)
      i = 9; 
    this.f.setPreferredSize(new Dimension(i, 1));
    paramGraphics.drawImage(this.a, 0, 0, this);
    if ((i = dimension.width) < 500)
      i = 500; 
    paramGraphics.drawImage(this.b, i - this.b.getWidth(this), 0, this);
    if (i - this.a.getWidth(this) - this.b.getWidth(this) > 0)
      paramGraphics.drawImage(this.c, this.a.getWidth(this), 0, i - this.b.getWidth(this) - this.a.getWidth(this), this.c.getHeight(this), this); 
    i -= 270;
    this.e.getPreferredSize();
    this.e.setBounds(i, 57, 114, 33);
    i += 114;
    this.d.getPreferredSize();
    this.d.setBounds(i, 57, 114, 33);
    paintChildren(paramGraphics);
    if (i > dimension.width) {
      paramGraphics.setColor(Color.WHITE);
      paramGraphics.fillRect(dimension.width - 2, 0, 2, dimension.height);
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/K.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */