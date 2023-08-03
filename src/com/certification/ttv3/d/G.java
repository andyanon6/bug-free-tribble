package com.certification.ttv3.d;

import a.a.a.a;
import com.certification.a.a.a;
import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.e.e;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

final class G extends a {
  public G(F paramF) {
    setLayout((LayoutManager)new a());
    F f;
    e e1 = A.a((f = paramF).a).j();
    E e;
    (e = new E((f = paramF).a)).setOpaque(false);
    e.setLayout((LayoutManager)new a(6, 6));
    JLabel jLabel;
    (jLabel = new JLabel("Virtual Exam Settings")).setFont(A.b((f = paramF).a));
    e.add("left", jLabel);
    (jLabel = new JLabel("Test time: ")).setFont(A.c((f = paramF).a));
    e.add("br left", jLabel);
    e.add("tab", (f = paramF).a.f);
    (jLabel = new JLabel("minutes")).setFont(A.c((f = paramF).a));
    e.add("", jLabel);
    (jLabel = new JLabel("Passing score: ")).setFont(A.c((f = paramF).a));
    e.add("br left", jLabel);
    e.add("tab", (f = paramF).a.g);
    (jLabel = new JLabel("%")).setFont(A.c((f = paramF).a));
    e.add("", jLabel);
    e.add("br left", (f = paramF).a.K);
    e.add("tab", (f = paramF).a.h);
    if (e1 == null) {
      jLabel = new JLabel("(? questions total)");
    } else {
      jLabel = new JLabel("(" + e1.c() + " questions total)");
    } 
    jLabel.setFont(A.c((f = paramF).a));
    e.add("tab", jLabel);
    e.add("br left", (f = paramF).a.L);
    e.add("tab", (f = paramF).a.i);
    (jLabel = new JLabel(" to ")).setFont(A.c((f = paramF).a));
    e.add("", jLabel);
    e.add("", (f = paramF).a.j);
    (jLabel = new JLabel(" Note: this setting ignores filter settings")).setFont(A.d((f = paramF).a));
    e.add(jLabel);
    e.add("br left", (f = paramF).a.r);
    add("hfill", e);
    (e = new E((f = paramF).a)).setOpaque(false);
    e.setLayout((LayoutManager)new a(6, 6));
    (jLabel = new JLabel("Practice Exam Settings")).setFont(A.b((f = paramF).a));
    e.add("left", jLabel);
    (jLabel = new JLabel("Test time: ")).setFont(A.c((f = paramF).a));
    e.add("br left", jLabel);
    e.add("tab", (f = paramF).a.k);
    (jLabel = new JLabel("minutes")).setFont(A.c((f = paramF).a));
    e.add("", jLabel);
    (jLabel = new JLabel("Passing score: ")).setFont(A.c((f = paramF).a));
    e.add("br left", jLabel);
    e.add("tab", (f = paramF).a.l);
    jLabel = new JLabel("%");
    e.add("", jLabel);
    e.add("br left", (f = paramF).a.M);
    e.add("tab", (f = paramF).a.m);
    if (e1 == null) {
      jLabel = new JLabel("(? questions total)");
    } else {
      jLabel = new JLabel("(" + e1.c() + " questions total)");
    } 
    jLabel.setFont(A.c((f = paramF).a));
    e.add("tab", jLabel);
    e.add("br left", (f = paramF).a.N);
    e.add("tab", (f = paramF).a.n);
    (jLabel = new JLabel(" to ")).setFont(A.c((f = paramF).a));
    e.add("", jLabel);
    e.add("", (f = paramF).a.o);
    (jLabel = new JLabel(" Note: this setting ignores filter settings")).setFont(A.d((f = paramF).a));
    e.add(jLabel);
    e.add("br left", (f = paramF).a.s);
    e.add("br left", (f = paramF).a.t);
    e.add("br", Box.createHorizontalStrut(20));
    e.add("", (f = paramF).a.O);
    e.add("br", Box.createHorizontalStrut(20));
    e.add("", (f = paramF).a.P);
    add("br hfill", e);
    (e = new E((f = paramF).a)).setOpaque(false);
    e.setLayout((LayoutManager)new a(6, 6));
    (jLabel = new JLabel("Filter options")).setFont(A.b((f = paramF).a));
    e.add("left", jLabel);
    if ((f = paramF).a.ac.size() > 0) {
      e.add("br", (f = paramF).a.Q);
      e.add("br", (f = paramF).a.R);
      for (JCheckBox jCheckBox : (f = paramF).a.ac.values()) {
        e.add("br", Box.createHorizontalStrut(20));
        e.add(jCheckBox);
      } 
    } 
    e.add("br", (f = paramF).a.S);
    e.add("br", (f = paramF).a.T);
    for (JCheckBox jCheckBox : (f = paramF).a.ab) {
      e.add("br", Box.createHorizontalStrut(20));
      e.add(jCheckBox);
    } 
    add("br hfill", e);
    (e = new E((f = paramF).a)).setOpaque(false);
    e.setLayout((LayoutManager)new a(6, 6));
    (jLabel = new JLabel("Additional constraints")).setFont(A.b((f = paramF).a));
    e.add("left", jLabel);
    e.add("br", (f = paramF).a.u);
    byte b = 0;
    for (JTextField jTextField : (f = paramF).a.ad) {
      if (b % 2 == 0) {
        e.add("br", Box.createHorizontalStrut(20));
        e.add(jTextField);
      } else {
        e.add(jTextField);
      } 
      b++;
    } 
    e.add("br", (f = paramF).a.v);
    add("br hfill", e);
    (e = new E((f = paramF).a)).setOpaque(false);
    e.setLayout((LayoutManager)new a(6, 6));
    (jLabel = new JLabel("Item Optimizer")).setFont(A.b((f = paramF).a));
    e.add("left", jLabel);
    e.add("br", (f = paramF).a.w);
    e.add("br", Box.createHorizontalStrut(20));
    e.add((f = paramF).a.U);
    e.add("br", Box.createHorizontalStrut(20));
    e.add((f = paramF).a.V);
    e.add("br", Box.createHorizontalStrut(20));
    e.add((f = paramF).a.W);
    e.add("br", Box.createHorizontalStrut(20));
    e.add((f = paramF).a.X);
    e.add((f = paramF).a.p);
    (jLabel = new JLabel("times (0-10)")).setFont(A.c((f = paramF).a));
    e.add(jLabel);
    e.add("br", Box.createHorizontalStrut(20));
    e.add((f = paramF).a.Y);
    e.add((f = paramF).a.q);
    (jLabel = new JLabel("times (1-10)")).setFont(A.c((f = paramF).a));
    e.add(jLabel);
    e.add("br", Box.createHorizontalStrut(20));
    e.add((f = paramF).a.ae);
    add("br hfill", e);
  }
  
  public final void paint(Graphics paramGraphics) {
    Rectangle rectangle = paramGraphics.getClipBounds();
    Graphics2D graphics2D;
    (graphics2D = (Graphics2D)paramGraphics).addRenderingHints(TrainingTool.e());
    paramGraphics.setColor(Color.WHITE);
    paramGraphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    paintChildren(graphics2D);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/G.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */