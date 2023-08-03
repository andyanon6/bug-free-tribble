package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.b.f;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

final class n extends JPanel {
  private Image a;
  
  private Image b;
  
  private Image c;
  
  private Image d;
  
  private ImageIcon e;
  
  private ImageIcon f;
  
  private ImageIcon g;
  
  private ImageIcon h;
  
  private ImageIcon i;
  
  private ImageIcon j;
  
  private ImageIcon k;
  
  private ImageIcon l;
  
  private ImageIcon m;
  
  private ImageIcon n;
  
  private JButton o;
  
  private JButton p;
  
  private JButton q;
  
  private JButton r;
  
  private JButton s;
  
  private JButton t;
  
  private JButton u;
  
  private Font v = new Font("Arial", 0, 13);
  
  public n(l paraml) {
    Toolkit toolkit = getToolkit();
    if (l.b(paraml).g() == f.b) {
      this.c = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-practice-block.png"));
    } else {
      this.c = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-virtual-block.png"));
    } 
    this.a = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-fill.png"));
    this.b = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/split-bar.png"));
    this.d = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-questionnum.png"));
    this.e = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-question.png")));
    this.f = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-question-sel.png")));
    this.g = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-scenario.png")));
    this.h = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-scenario-sel.png")));
    this.i = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-questionlist.png")));
    this.j = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-questionlist-sel.png")));
    this.k = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-prev.png")));
    this.l = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-next.png")));
    this.m = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-reviewmarked.png")));
    this.n = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/examview-endexam.png")));
    this.o = new JButton(this.e);
    this.o.setBorderPainted(false);
    this.o.setMargin(new Insets(0, 0, 0, 0));
    this.o.setOpaque(false);
    this.o.setContentAreaFilled(false);
    this.o.setActionCommand("Question");
    this.o.setCursor(new Cursor(12));
    this.o.addActionListener(paraml);
    this.o.setFocusable(false);
    this.p = new JButton(this.g);
    this.p.setBorderPainted(false);
    this.p.setMargin(new Insets(0, 0, 0, 0));
    this.p.setOpaque(false);
    this.p.setContentAreaFilled(false);
    this.p.setActionCommand("Scenario");
    this.p.setCursor(new Cursor(12));
    this.p.addActionListener(paraml);
    this.p.setFocusable(false);
    this.q = new JButton(this.i);
    this.q.setBorderPainted(false);
    this.q.setMargin(new Insets(0, 0, 0, 0));
    this.q.setOpaque(false);
    this.q.setContentAreaFilled(false);
    this.q.setActionCommand("QuestionList");
    this.q.setCursor(new Cursor(12));
    this.q.addActionListener(paraml);
    this.q.setFocusable(false);
    this.r = new JButton(this.k);
    this.r.setBorderPainted(false);
    this.r.setMargin(new Insets(0, 0, 0, 0));
    this.r.setOpaque(false);
    this.r.setContentAreaFilled(false);
    this.r.setActionCommand("Previous");
    this.r.setCursor(new Cursor(12));
    this.r.addActionListener(paraml);
    this.r.setFocusable(false);
    this.s = new JButton(this.l);
    this.s.setBorderPainted(false);
    this.s.setMargin(new Insets(0, 0, 0, 0));
    this.s.setOpaque(false);
    this.s.setContentAreaFilled(false);
    this.s.setActionCommand("Next");
    this.s.setCursor(new Cursor(12));
    this.s.addActionListener(paraml);
    this.s.setFocusable(false);
    this.t = new JButton(this.m);
    this.t.setBorderPainted(false);
    this.t.setMargin(new Insets(0, 0, 0, 0));
    this.t.setOpaque(false);
    this.t.setContentAreaFilled(false);
    this.t.setActionCommand("Review marked");
    this.t.setCursor(new Cursor(12));
    this.t.addActionListener(paraml);
    this.t.setFocusable(false);
    this.u = new JButton(this.n);
    this.u.setBorderPainted(false);
    this.u.setMargin(new Insets(0, 0, 0, 0));
    this.u.setOpaque(false);
    this.u.setContentAreaFilled(false);
    if (l.b(paraml).h()) {
      this.u.setActionCommand("End exam");
    } else {
      this.u.setActionCommand("Review score");
    } 
    this.u.setCursor(new Cursor(12));
    this.u.addActionListener(paraml);
    this.u.setFocusable(false);
    add(this.o);
    add(this.p);
    add(this.q);
    add(this.r);
    add(this.s);
    add(this.t);
    add(this.u);
    setPreferredSize(new Dimension(194, 1));
    setBackground(Color.WHITE);
  }
  
  public final void a() {
    o o;
    l.b(this.w).a(l.c(this.w)).a((o = l.f(this.w)).a.isSelected());
    switch (l.d(this.w)) {
      case 0:
        this.o.setIcon(this.f);
        this.p.setIcon(this.g);
        this.q.setIcon(this.i);
        return;
      case 1:
        this.o.setIcon(this.e);
        this.p.setIcon(this.h);
        this.q.setIcon(this.i);
        return;
      case 2:
        this.o.setIcon(this.e);
        this.p.setIcon(this.g);
        this.q.setIcon(this.j);
        break;
    } 
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension1 = getSize((Dimension)null);
    Graphics2D graphics2D;
    (graphics2D = (Graphics2D)paramGraphics).addRenderingHints(TrainingTool.e());
    String str = TrainingTool.d(l.g(this.w));
    paramGraphics.drawImage(this.a, 0, 0, this.a.getWidth(this), (int)dimension1.getHeight(), this);
    paramGraphics.drawImage(this.c, 11, 14, this);
    FontMetrics fontMetrics;
    Rectangle2D rectangle2D2 = (fontMetrics = graphics2D.getFontMetrics(this.v)).getStringBounds("Time Remaining:", graphics2D);
    Rectangle2D rectangle2D1 = fontMetrics.getStringBounds(str, graphics2D);
    graphics2D.setFont(this.v);
    graphics2D.setColor(this.w.b);
    graphics2D.drawString("Time Remaining:", (float)((180.0D - rectangle2D2.getWidth()) / 2.0D + 10.0D), 87.0F);
    graphics2D.drawString(str, (float)((180.0D - rectangle2D1.getWidth()) / 2.0D + 10.0D), 106.0F);
    paramGraphics.drawImage(this.d, 11, 120, this);
    graphics2D.setColor(this.w.b);
    graphics2D.drawString("QUESTION # " + (l.c(this.w) + 1), (float)((180.0D - rectangle2D2.getWidth()) / 2.0D + 10.0D), 150.0F);
    Dimension dimension2 = this.o.getPreferredSize();
    this.o.setBounds(8, 170, dimension2.width, dimension2.height);
    dimension2 = this.p.getPreferredSize();
    this.p.setBounds(8, 196, dimension2.width, dimension2.height);
    dimension2 = this.q.getPreferredSize();
    this.q.setBounds(8, 222, dimension2.width, dimension2.height);
    int j = 340;
    if ((int)dimension1.getHeight() - 80 > 340)
      j = (int)dimension1.getHeight() - 80; 
    int i = (j - 80 - 260) / 2 + 260;
    dimension2 = this.s.getPreferredSize();
    this.s.setBounds(96, i, dimension2.width, dimension2.height);
    dimension2 = this.r.getPreferredSize();
    this.r.setBounds(52, i, dimension2.width, dimension2.height);
    paramGraphics.drawImage(this.b, 16, j - 20, this);
    dimension2 = this.t.getPreferredSize();
    this.t.setBounds(15, j, dimension2.width, dimension2.height);
    dimension2 = this.u.getPreferredSize();
    this.u.setBounds(15, j + 38, dimension2.width, dimension2.height);
    paintChildren(paramGraphics);
    graphics2D.setFont(this.v);
    if (this.o.getIcon() == this.f) {
      graphics2D.setColor(Color.WHITE);
    } else {
      graphics2D.setColor(this.w.b);
    } 
    graphics2D.drawString("Question " + (l.c(this.w) + 1) + " of " + l.b(this.w).d(), 41, 190);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */