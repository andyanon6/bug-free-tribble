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

final class H extends JPanel {
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
  
  private JButton m;
  
  private JButton n;
  
  private JButton o;
  
  private JButton p;
  
  private JButton q;
  
  private JButton r;
  
  public H(A paramA) {
    Toolkit toolkit = getToolkit();
    this.c = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/settings-hdr.png"));
    this.a = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/left-fill.png"));
    this.b = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/split-bar.png"));
    this.d = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/settings-reset.png")));
    this.e = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/settings-save.png")));
    this.f = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/settings-cancel.png")));
    this.g = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/settings-general.png")));
    this.h = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/settings-general-selected.png")));
    this.i = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/settings-appearance.png")));
    this.j = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/settings-appearance-sel.png")));
    this.k = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/settings-network.png")));
    this.l = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/settings-network-selected.png")));
    this.m = new JButton(this.d);
    this.m.setBorderPainted(false);
    this.m.setMargin(new Insets(0, 0, 0, 0));
    this.m.setOpaque(false);
    this.m.setContentAreaFilled(false);
    this.m.setActionCommand("Reset");
    this.m.setCursor(new Cursor(12));
    this.m.addActionListener(paramA);
    this.m.setFocusable(false);
    this.n = new JButton(this.e);
    this.n.setBorderPainted(false);
    this.n.setMargin(new Insets(0, 0, 0, 0));
    this.n.setOpaque(false);
    this.n.setContentAreaFilled(false);
    this.n.setActionCommand("Save");
    this.n.setCursor(new Cursor(12));
    this.n.addActionListener(paramA);
    this.n.setFocusable(false);
    this.o = new JButton(this.f);
    this.o.setBorderPainted(false);
    this.o.setMargin(new Insets(0, 0, 0, 0));
    this.o.setOpaque(false);
    this.o.setContentAreaFilled(false);
    this.o.setActionCommand("Cancel");
    this.o.setCursor(new Cursor(12));
    this.o.addActionListener(paramA);
    this.o.setFocusable(false);
    this.p = new JButton(this.g);
    this.p.setBorderPainted(false);
    this.p.setMargin(new Insets(0, 0, 0, 0));
    this.p.setOpaque(false);
    this.p.setContentAreaFilled(false);
    this.p.setActionCommand("General");
    this.p.setCursor(new Cursor(12));
    this.p.addActionListener(paramA);
    this.p.setFocusable(false);
    this.q = new JButton(this.i);
    this.q.setBorderPainted(false);
    this.q.setMargin(new Insets(0, 0, 0, 0));
    this.q.setOpaque(false);
    this.q.setContentAreaFilled(false);
    this.q.setActionCommand("Appearance");
    this.q.setCursor(new Cursor(12));
    this.q.addActionListener(paramA);
    this.q.setFocusable(false);
    this.r = new JButton(this.k);
    this.r.setBorderPainted(false);
    this.r.setMargin(new Insets(0, 0, 0, 0));
    this.r.setOpaque(false);
    this.r.setContentAreaFilled(false);
    this.r.setActionCommand("Network");
    this.r.setCursor(new Cursor(12));
    this.r.addActionListener(paramA);
    this.r.setFocusable(false);
    add(this.m);
    add(this.n);
    add(this.o);
    add(this.p);
    add(this.q);
    add(this.r);
    setPreferredSize(new Dimension(194, 1));
    setBackground(Color.WHITE);
  }
  
  public final void a() {
    switch (A.e(this.s)) {
      case 0:
        this.p.setIcon(this.h);
        this.q.setIcon(this.i);
        this.r.setIcon(this.k);
        return;
      case 1:
        this.p.setIcon(this.g);
        this.q.setIcon(this.j);
        this.r.setIcon(this.k);
        return;
      case 2:
        this.p.setIcon(this.g);
        this.q.setIcon(this.i);
        this.r.setIcon(this.l);
        break;
    } 
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension1 = getSize((Dimension)null);
    paramGraphics.drawImage(this.a, 0, 0, this.a.getWidth(this), (int)dimension1.getHeight(), this);
    paramGraphics.drawImage(this.c, 12, 14, this);
    Dimension dimension2 = this.p.getPreferredSize();
    this.p.setBounds(9, 66, dimension2.width, dimension2.height);
    dimension2 = this.q.getPreferredSize();
    this.q.setBounds(9, 94, dimension2.width, dimension2.height);
    dimension2 = this.r.getPreferredSize();
    this.r.setBounds(9, 121, dimension2.width, dimension2.height);
    int i = 170;
    if ((int)dimension1.getHeight() - 142 > 170)
      i = (int)dimension1.getHeight() - 142; 
    dimension2 = this.n.getPreferredSize();
    this.n.setBounds(15, i, dimension2.width, dimension2.height);
    dimension2 = this.o.getPreferredSize();
    this.o.setBounds(15, i + 38, dimension2.width, dimension2.height);
    paramGraphics.drawImage(this.b, 2, i + 90, this);
    dimension2 = this.m.getPreferredSize();
    this.m.setBounds(15, i + 104, dimension2.width, dimension2.height);
    paintChildren(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/H.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */