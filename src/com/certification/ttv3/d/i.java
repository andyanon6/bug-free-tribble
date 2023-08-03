package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

final class i extends JPanel {
  private Image a;
  
  private Image b;
  
  private Image c;
  
  private ImageIcon d;
  
  private ImageIcon e;
  
  private JButton f;
  
  private JButton g;
  
  public i(b paramb) {
    Toolkit toolkit = getToolkit();
    this.c = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examresults.png"));
    this.a = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-fill.png"));
    this.b = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/split-bar.png"));
    this.d = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examresults-review.png")));
    this.e = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examresults-home.png")));
    this.f = new JButton(this.d);
    this.f.setBorderPainted(false);
    this.f.setMargin(new Insets(0, 0, 0, 0));
    this.f.setOpaque(false);
    this.f.setContentAreaFilled(false);
    this.f.setActionCommand("Review Exam");
    this.f.setCursor(new Cursor(12));
    this.f.addActionListener(paramb);
    this.f.setFocusable(false);
    this.g = new JButton(this.e);
    this.g.setBorderPainted(false);
    this.g.setMargin(new Insets(0, 0, 0, 0));
    this.g.setOpaque(false);
    this.g.setContentAreaFilled(false);
    this.g.setActionCommand("Home");
    this.g.setCursor(new Cursor(12));
    this.g.addActionListener(paramb);
    this.g.setFocusable(false);
    add(this.f);
    add(this.g);
    setPreferredSize(new Dimension(194, 1));
    setBackground(Color.WHITE);
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension = getSize((Dimension)null);
    Graphics2D graphics2D;
    (graphics2D = (Graphics2D)paramGraphics).addRenderingHints(TrainingTool.e());
    paramGraphics.drawImage(this.a, 0, 0, this.a.getWidth(this), (int)dimension.getHeight(), this);
    paramGraphics.drawImage(this.c, 11, 14, this);
    int j = 120;
    if ((int)dimension.getHeight() - 80 > 120)
      j = (int)dimension.getHeight() - 80; 
    paramGraphics.drawImage(this.b, 2, j - 20, this);
    dimension = this.f.getPreferredSize();
    this.f.setBounds(15, j, dimension.width, dimension.height);
    dimension = this.g.getPreferredSize();
    this.g.setBounds(15, j + 38, dimension.width, dimension.height);
    paintChildren(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */