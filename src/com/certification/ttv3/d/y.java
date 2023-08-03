package com.certification.ttv3.d;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

final class y extends JPanel {
  private Image a;
  
  private Image b;
  
  private Image c;
  
  private ImageIcon d;
  
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
  
  private ImageIcon o;
  
  private ImageIcon p;
  
  private ImageIcon q;
  
  private ImageIcon r;
  
  private ImageIcon s;
  
  private ImageIcon t;
  
  private ImageIcon u;
  
  private JButton v;
  
  private JButton w;
  
  private JButton x;
  
  private JButton y;
  
  private JButton z;
  
  private JButton A;
  
  private JButton B;
  
  private JButton C;
  
  private JButton D;
  
  public y(q paramq) {
    Toolkit toolkit = getToolkit();
    this.a = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-fill.png"));
    this.b = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/split-bar.png"));
    this.l = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/settings.png")));
    this.c = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-welcome.png"));
    this.d = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-examdetails.png")));
    this.e = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-topics.png")));
    this.f = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-history.png")));
    this.g = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-examdetails-behind.png")));
    this.h = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-topics-behind.png")));
    this.i = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-history-behind.png")));
    this.j = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/start-virtual.png")));
    this.k = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/start-practice.png")));
    this.m = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-history-ae-behind.png")));
    this.n = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-history-ae.png")));
    this.o = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-history-ae-selected.png")));
    this.p = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-history-pe-behind.png")));
    this.q = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-history-pe.png")));
    this.r = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-history-pe-selected.png")));
    this.s = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-history-ve-behind.png")));
    this.t = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-history-ve.png")));
    this.u = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-history-ve-selected.png")));
    this.v = new JButton(this.l);
    this.v.setBorderPainted(false);
    this.v.setMargin(new Insets(0, 0, 0, 0));
    this.v.setOpaque(false);
    this.v.setContentAreaFilled(false);
    this.v.setActionCommand("Settings");
    this.v.setCursor(new Cursor(12));
    this.v.addActionListener(q.a(paramq).y());
    this.v.setFocusable(false);
    this.w = new JButton(this.d);
    this.w.setBorderPainted(false);
    this.w.setMargin(new Insets(0, 0, 0, 0));
    this.w.setOpaque(false);
    this.w.setContentAreaFilled(false);
    this.w.setActionCommand("Details");
    this.w.setCursor(new Cursor(12));
    this.w.addActionListener(paramq);
    this.w.setFocusable(false);
    this.x = new JButton(this.e);
    this.x.setBorderPainted(false);
    this.x.setMargin(new Insets(0, 0, 0, 0));
    this.x.setOpaque(false);
    this.x.setContentAreaFilled(false);
    this.x.setActionCommand("Topics");
    this.x.setCursor(new Cursor(12));
    this.x.addActionListener(paramq);
    this.x.setFocusable(false);
    this.y = new JButton(this.f);
    this.y.setBorderPainted(false);
    this.y.setMargin(new Insets(0, 0, 0, 0));
    this.y.setOpaque(false);
    this.y.setContentAreaFilled(false);
    this.y.setActionCommand("History");
    this.y.setCursor(new Cursor(12));
    this.y.addActionListener(paramq);
    this.y.setFocusable(false);
    this.z = new JButton(this.m);
    this.z.setBorderPainted(false);
    this.z.setMargin(new Insets(0, 0, 0, 0));
    this.z.setOpaque(false);
    this.z.setContentAreaFilled(false);
    this.z.setActionCommand("HistoryAE");
    this.z.setCursor(new Cursor(12));
    this.z.addActionListener(paramq);
    this.z.setFocusable(false);
    this.A = new JButton(this.p);
    this.A.setBorderPainted(false);
    this.A.setMargin(new Insets(0, 0, 0, 0));
    this.A.setOpaque(false);
    this.A.setContentAreaFilled(false);
    this.A.setActionCommand("HistoryPE");
    this.A.setCursor(new Cursor(12));
    this.A.addActionListener(paramq);
    this.A.setFocusable(false);
    this.B = new JButton(this.s);
    this.B.setBorderPainted(false);
    this.B.setMargin(new Insets(0, 0, 0, 0));
    this.B.setOpaque(false);
    this.B.setContentAreaFilled(false);
    this.B.setActionCommand("HistoryVE");
    this.B.setCursor(new Cursor(12));
    this.B.addActionListener(paramq);
    this.B.setFocusable(false);
    this.C = new JButton(this.j);
    this.C.setBorderPainted(false);
    this.C.setMargin(new Insets(0, 0, 0, 0));
    this.C.setOpaque(false);
    this.C.setContentAreaFilled(false);
    this.C.setActionCommand("Start Virtual");
    this.C.setCursor(new Cursor(12));
    this.C.addActionListener(q.a(paramq).y());
    this.C.setFocusable(false);
    this.D = new JButton(this.k);
    this.D.setBorderPainted(false);
    this.D.setMargin(new Insets(0, 0, 0, 0));
    this.D.setOpaque(false);
    this.D.setContentAreaFilled(false);
    this.D.setActionCommand("Start Practice");
    this.D.setCursor(new Cursor(12));
    this.D.addActionListener(q.a(paramq).y());
    this.D.setFocusable(false);
    add(this.v);
    add(this.w);
    add(this.x);
    add(this.y);
    add(this.z);
    add(this.A);
    add(this.B);
    add(this.C);
    add(this.D);
    setPreferredSize(new Dimension(194, 1));
    setBackground(Color.WHITE);
  }
  
  public final void a() {
    switch (q.b(this.E)) {
      case 0:
        this.w.setIcon(this.d);
        this.x.setIcon(this.h);
        this.y.setIcon(this.i);
        this.z.setIcon(this.m);
        this.A.setIcon(this.p);
        this.B.setIcon(this.s);
        this.E.a.a();
        q.c(this.E).setViewportView(this.E.a);
        return;
      case 1:
        this.w.setIcon(this.g);
        this.x.setIcon(this.e);
        this.y.setIcon(this.i);
        this.z.setIcon(this.m);
        this.A.setIcon(this.p);
        this.B.setIcon(this.s);
        q.c(this.E).setViewportView(this.E.b);
        return;
      case 2:
        this.w.setIcon(this.g);
        this.x.setIcon(this.h);
        this.y.setIcon(this.f);
        switch (q.d(this.E)) {
          case 0:
            this.z.setIcon(this.o);
            this.A.setIcon(this.q);
            this.B.setIcon(this.t);
            break;
          case 1:
            this.z.setIcon(this.n);
            this.A.setIcon(this.r);
            this.B.setIcon(this.t);
            break;
          case 2:
            this.z.setIcon(this.n);
            this.A.setIcon(this.q);
            this.B.setIcon(this.u);
            break;
        } 
        q.c(this.E).setViewportView(this.E.c);
        break;
    } 
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension1 = getSize((Dimension)null);
    paramGraphics.drawImage(this.a, 0, 0, this.a.getWidth(this), (int)dimension1.getHeight(), this);
    paramGraphics.drawImage(this.c, 11, 14, this);
    Dimension dimension2 = this.w.getPreferredSize();
    q.b(this.E);
    this.w.setBounds(9, 67, dimension2.width, dimension2.height);
    dimension2 = this.x.getPreferredSize();
    true;
    this.x.setBounds(9, 120, dimension2.width, dimension2.height);
    dimension2 = this.y.getPreferredSize();
    2;
    this.y.setBounds(9, 173, dimension2.width, dimension2.height);
    this.z.setBounds(10, 230, dimension2.width, 28);
    this.A.setBounds(10, 257, dimension2.width, 28);
    this.B.setBounds(10, 285, dimension2.width, 30);
    int i = 320;
    if ((int)dimension1.getHeight() - 142 > 320)
      i = (int)dimension1.getHeight() - 142; 
    dimension2 = this.C.getPreferredSize();
    this.C.setBounds(15, i, dimension2.width, dimension2.height);
    if (q.a(this.E).j() == null) {
      this.C.setVisible(false);
    } else {
      this.C.setVisible(true);
    } 
    dimension2 = this.D.getPreferredSize();
    this.D.setBounds(15, i + 38, dimension2.width, dimension2.height);
    if (q.a(this.E).j() == null) {
      this.D.setVisible(false);
    } else {
      this.D.setVisible(true);
    } 
    paramGraphics.drawImage(this.b, 2, i + 90, this);
    dimension2 = this.v.getPreferredSize();
    this.v.setBounds(15, i + 104, dimension2.width, dimension2.height);
    paintChildren(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */