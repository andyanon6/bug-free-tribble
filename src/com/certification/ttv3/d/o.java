package com.certification.ttv3.d;

import com.certification.a.a.a;
import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.b.f;
import com.certification.ttv3.e.e;
import com.certification.ttv3.f.c;
import com.certification.ttv3.g.a;
import com.certification.ttv3.g.b;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

final class o extends JPanel {
  private JLabel d;
  
  private JLabel e;
  
  private JLabel f;
  
  JCheckBox a;
  
  private JButton g;
  
  private JButton h;
  
  private JScrollPane i;
  
  private a j;
  
  private b k;
  
  private a l;
  
  boolean b = true;
  
  private ImageIcon m;
  
  boolean c = false;
  
  public o(l paraml) {
    setBackground(Color.WHITE);
    e e = l.a(paraml).j();
    Toolkit toolkit = getToolkit();
    this.m = new ImageIcon(toolkit.getImage(l.a(paraml).getClass().getResource("/com/certification/ttv3/images/examview-qtop-bg.png")));
    this.g = new JButton("View Answers", this.m);
    this.g.setFont(new Font("Arial", 0, 11));
    this.g.setIconTextGap(-89);
    this.g.setForeground(new Color(63, 63, 63));
    this.g.setBorderPainted(false);
    this.g.setMargin(new Insets(0, 0, 0, 0));
    this.g.setOpaque(false);
    this.g.setContentAreaFilled(false);
    this.g.setActionCommand("Show answers");
    this.g.setCursor(new Cursor(12));
    this.g.addActionListener(paraml);
    this.g.setFocusable(false);
    this.h = new JButton("Make Notes", this.m);
    this.h.setFont(new Font("Arial", 0, 11));
    this.h.setIconTextGap(-83);
    this.h.setForeground(new Color(63, 63, 63));
    this.h.setBorderPainted(false);
    this.h.setMargin(new Insets(0, 0, 0, 0));
    this.h.setOpaque(false);
    this.h.setContentAreaFilled(false);
    this.h.setActionCommand("Show notes");
    this.h.setCursor(new Cursor(12));
    this.h.addActionListener(paraml);
    this.h.setFocusable(false);
    this.d = new JLabel(String.valueOf(e.e()) + " " + e.d());
    this.d.setFont(new Font("Arial", 0, 24));
    this.d.setForeground(new Color(4, 50, 96));
    this.e = new JLabel(e.f());
    this.e.setFont(new Font("Arial", 0, 11));
    this.e.setForeground(new Color(63, 63, 63));
    this.f = new JLabel(String.valueOf((l.b(paraml).g() == f.b) ? "Practice Exam" : "Virtual Exam") + " - Question List");
    this.f.setFont(new Font("Arial", 0, 15));
    this.f.setForeground(new Color(4, 50, 96));
    this.f.setVisible(false);
    this.a = new JCheckBox("Mark for review");
    this.a.setFont(new Font("Arial", 0, 12));
    this.a.setForeground(Color.BLACK);
    this.a.setOpaque(false);
    this.a.setFocusable(false);
    add(this.d);
    add(this.e);
    add(this.f);
    add(this.g);
    add(this.h);
    add(this.a);
    this.i = new JScrollPane(20, 30);
    this.i.setBorder(BorderFactory.createLineBorder(paraml.a));
    this.i.setBackground(Color.WHITE);
    this.i.setVerticalScrollBar(new p(this));
    this.i.getViewport().setBackground(Color.WHITE);
    this.j = new a((c)l.a(paraml), l.a(paraml).r());
    this.l = new a();
    this.l.setBackground(Color.WHITE);
    this.j.a((JPanel)this.l, l.b(paraml).a(l.c(paraml)), this.c);
    this.i.getViewport().setView((Component)this.l);
    this.k = new b(l.a(paraml));
    add(this.i);
  }
  
  public final void a() {
    this.c = !this.c;
    if (this.c) {
      this.g.setText("Hide Answers");
    } else {
      this.g.setText("View Answers");
    } 
    b();
  }
  
  public final void b() {
    this.l.removeAll();
    switch (l.d(this.n)) {
      case 0:
        this.j.a((JPanel)this.l, l.b(this.n).a(l.c(this.n)), this.c);
        this.i.getViewport().setView((Component)this.l);
        this.a.setVisible(true);
        if ((l.b(this.n).g() == 0 || l.a(this.n).r().getProperty(A.ay).compareTo("N") == 0) && l.b(this.n).h()) {
          this.g.setVisible(false);
        } else {
          this.g.setVisible(true);
        } 
        this.h.setVisible(true);
        this.f.setVisible(false);
        this.l.requestFocusInWindow();
        break;
      case 1:
        this.k.a((JPanel)this.l, l.b(this.n).a(l.c(this.n)).a().b());
        this.i.getViewport().setView((Component)this.l);
        this.a.setVisible(true);
        if ((l.b(this.n).g() == 0 || l.a(this.n).r().getProperty(A.ay).compareTo("N") == 0) && l.b(this.n).h()) {
          this.g.setVisible(false);
        } else {
          this.g.setVisible(true);
        } 
        this.h.setVisible(true);
        this.f.setVisible(false);
        this.l.requestFocusInWindow();
        break;
      case 2:
        this.i.getViewport().setView((Component)l.e(this.n));
        this.a.setVisible(false);
        this.g.setVisible(false);
        this.h.setVisible(false);
        this.f.setVisible(true);
        l.e(this.n).requestFocusInWindow();
        break;
    } 
    this.l.revalidate();
    this.b = true;
    repaint();
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension2 = getSize((Dimension)null);
    Rectangle rectangle = paramGraphics.getClipBounds();
    Graphics2D graphics2D;
    (graphics2D = (Graphics2D)paramGraphics).addRenderingHints(TrainingTool.e());
    paramGraphics.setColor(Color.WHITE);
    paramGraphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    Dimension dimension1 = this.d.getPreferredSize();
    this.d.setBounds(24, 12, dimension1.width + 10, dimension1.height);
    dimension1 = this.e.getPreferredSize();
    this.e.setBounds(25, 43, dimension1.width + 10, dimension1.height);
    dimension1 = this.f.getPreferredSize();
    this.f.setBounds(25, 72, dimension1.width + 30, dimension1.height);
    dimension1 = this.a.getPreferredSize();
    this.a.setBounds(20, 71, dimension1.width, dimension1.height);
    int i = 140;
    if (dimension2.width > 380)
      i = dimension2.width - 240; 
    dimension1 = this.g.getPreferredSize();
    this.g.setBounds(i, 71, dimension1.width, dimension1.height);
    dimension1 = this.h.getPreferredSize();
    this.h.setBounds(i + 114, 71, dimension1.width, dimension1.height);
    graphics2D.setColor(this.n.a);
    graphics2D.drawLine(20, 66, dimension2.width - 20, 66);
    this.i.setBounds(16, 100, dimension2.width - 32, dimension2.height - 106);
    this.i.setMaximumSize(new Dimension(dimension2.width - 32, dimension2.height - 106));
    this.i.setPreferredSize(new Dimension(dimension2.width - 32, dimension2.height - 106));
    this.i.setMinimumSize(new Dimension(dimension2.width - 32, dimension2.height - 106));
    this.i.revalidate();
    paintChildren(graphics2D);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */