package com.certification.ttv3.d;

import a.a.a.a;
import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.a.p;
import com.certification.ttv3.e.e;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.util.Properties;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public final class s extends JPanel {
  private Image a;
  
  private JLabel b;
  
  private JLabel c;
  
  private JLabel d;
  
  private JLabel e;
  
  private JLabel f;
  
  private JLabel g;
  
  private JLabel h;
  
  private JLabel i;
  
  private JPanel j;
  
  private JScrollPane k;
  
  public s(q paramq, JScrollPane paramJScrollPane) {
    this.k = paramJScrollPane;
    Toolkit toolkit = getToolkit();
    this.a = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/ed-mag.png"));
    setBackground(Color.WHITE);
    this.b = new JLabel("Exam Details");
    this.b.setFont(new Font("Arial", 0, 24));
    this.b.setForeground(new Color(4, 50, 96));
    e e;
    if ((e = q.a(paramq).j()) == null) {
      this.c = new JLabel("Exam data not available");
    } else if (e.g().toUpperCase().indexOf("DEMO") != -1) {
      this.c = new JLabel(String.valueOf(e.e()) + " " + e.d() + " - " + e.f() + " - Demo Version");
    } else {
      this.c = new JLabel(String.valueOf(e.e()) + " " + e.d() + " - " + e.f());
    } 
    this.c.setFont(new Font("Arial", 0, 11));
    this.c.setForeground(new Color(132, 135, 140));
    add(this.b);
    add(this.c);
    Font font = new Font("Arial", 0, 12);
    Color color = new Color(64, 64, 64);
    this.j = new JPanel();
    this.j.setLayout((LayoutManager)new a(5, 8));
    this.j.setOpaque(false);
    this.j.setBorder(BorderFactory.createEmptyBorder(0, 6, 4, 0));
    JLabel jLabel;
    (jLabel = new JLabel("Exam Code:")).setFont(font);
    jLabel.setForeground(color);
    jLabel.setOpaque(false);
    this.j.add("left", jLabel);
    if (e == null) {
      jLabel = new JLabel("");
    } else {
      jLabel = new JLabel(e.d());
    } 
    jLabel.setFont(font);
    jLabel.setForeground(Color.BLACK);
    jLabel.setOpaque(false);
    this.j.add("tab", jLabel);
    (jLabel = new JLabel("Exam Name:")).setFont(font);
    jLabel.setForeground(color);
    jLabel.setOpaque(false);
    this.j.add("br left", jLabel);
    if (e == null) {
      jLabel = new JLabel("");
    } else {
      jLabel = new JLabel(e.f());
    } 
    jLabel.setFont(font);
    jLabel.setForeground(Color.BLACK);
    jLabel.setOpaque(false);
    this.j.add("tab", jLabel);
    (jLabel = new JLabel("Topics Selected:")).setFont(font);
    jLabel.setForeground(color);
    jLabel.setOpaque(false);
    this.j.add("br left top", jLabel);
    this.d = new JLabel("");
    this.d.setFont(font);
    this.d.setForeground(Color.BLACK);
    this.d.setOpaque(false);
    this.j.add("tab", this.d);
    (jLabel = new JLabel("Avail questions:")).setFont(font);
    jLabel.setForeground(color);
    jLabel.setOpaque(false);
    this.j.add("br left", jLabel);
    this.e = new JLabel("");
    this.e.setFont(font);
    this.e.setForeground(Color.BLACK);
    this.e.setOpaque(false);
    this.j.add("tab", this.e);
    (jLabel = new JLabel("Total questions:")).setFont(font);
    jLabel.setForeground(color);
    jLabel.setOpaque(false);
    this.j.add("br left", jLabel);
    if (e == null) {
      jLabel = new JLabel("");
    } else {
      jLabel = new JLabel(Integer.toString(e.c()));
    } 
    jLabel.setFont(font);
    jLabel.setForeground(Color.BLACK);
    jLabel.setOpaque(false);
    this.j.add("tab", jLabel);
    (jLabel = new JLabel("Virtual Exam:")).setFont(font);
    jLabel.setForeground(color);
    jLabel.setOpaque(false);
    this.j.add("br left", jLabel);
    this.f = new JLabel("");
    this.f.setFont(font);
    this.f.setForeground(Color.BLACK);
    this.f.setOpaque(false);
    this.j.add("tab", this.f);
    (jLabel = new JLabel("Practice Exam:")).setFont(font);
    jLabel.setForeground(color);
    jLabel.setOpaque(false);
    this.j.add("br left", jLabel);
    this.g = new JLabel("");
    this.g.setFont(font);
    this.g.setForeground(Color.BLACK);
    this.g.setOpaque(false);
    this.j.add("tab", this.g);
    (jLabel = new JLabel("Show Answers:")).setFont(font);
    jLabel.setForeground(color);
    jLabel.setOpaque(false);
    this.j.add("br left", jLabel);
    this.h = new JLabel("");
    this.h.setFont(font);
    this.h.setForeground(Color.BLACK);
    this.h.setOpaque(false);
    this.j.add("tab", this.h);
    (jLabel = new JLabel("Version:")).setFont(font);
    jLabel.setForeground(color);
    jLabel.setOpaque(false);
    this.j.add("br left", jLabel);
    if (e == null) {
      this.i = new JLabel("");
    } else {
      String str = (str = e.g().toUpperCase()).replaceAll("VERSION", "");
      boolean bool = false;
      if (str.indexOf("DEMO") != -1) {
        bool = true;
        str = str.replaceAll("DEMO", "");
      } 
      str = str.trim();
      if (bool) {
        this.i = new JLabel("Pass4Sure Version " + str + " - Demo Version");
      } else {
        this.i = new JLabel("Pass4Sure Version " + str);
      } 
    } 
    this.i.setFont(font);
    this.i.setForeground(Color.BLACK);
    this.i.setOpaque(false);
    this.j.add("tab", this.i);
    add(this.j);
  }
  
  public final void a() {
    if (q.a(this.l).j() != null) {
      s s1 = this;
      String str = "All Topics";
      Properties properties2;
      if ((properties2 = q.a(s1.l).r()).getProperty(p.i, "All").compareTo("All") != 0 && q.a(s1.l).j() != null) {
        e e = q.a(s1.l).j();
        str = "<html>";
        for (byte b = 0; b < e.b(); b++) {
          if (properties2.getProperty(String.valueOf(p.j) + b) != null && properties2.getProperty(String.valueOf(p.j) + b).compareTo("Y") == 0)
            str = String.valueOf(str) + e.a(b).b() + " (" + e.c(e.a(b)) + " Questions)<p>"; 
        } 
        if (str.length() > 6) {
          str = String.valueOf(str.substring(0, str.length() - 3)) + "</html>";
        } else {
          str = "No topics selected";
        } 
      } 
      this.d.setText(str);
      this.e.setText(Integer.toString(b()));
      Properties properties1 = q.a((s1 = this).l).r();
      this.f.setText(String.valueOf(properties1.getProperty(p.c)) + " questions - " + properties1.getProperty(p.a) + " minutes - " + properties1.getProperty(p.b) + "% passing score");
      properties1 = q.a((s1 = this).l).r();
      this.g.setText(String.valueOf(properties1.getProperty(p.f)) + " questions - " + properties1.getProperty(p.d) + " minutes - " + properties1.getProperty(p.e) + "% passing score");
      this.h.setText(((properties1 = q.a((s1 = this).l).r()).getProperty(p.g).compareTo("Y") == 0) ? ((properties1.getProperty(p.h).compareTo("Always") == 0) ? "Always - answers are shown when switching questions" : "On Click - answers are hidden when switching questions") : "Never - answers are always hidden");
    } 
  }
  
  private int b() {
    int i = 0;
    Properties properties = q.a(this.l).r();
    e e = q.a(this.l).j();
    if (properties.getProperty(p.i, "All").compareTo("All") == 0) {
      i = e.c();
    } else {
      for (byte b = 0; b < e.b(); b++) {
        if (properties.getProperty(String.valueOf(p.j) + b) != null && properties.getProperty(String.valueOf(p.j) + b).compareTo("Y") == 0)
          i += e.c(e.a(b)); 
      } 
    } 
    return i;
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension2 = this.k.getViewport().getSize();
    Rectangle rectangle = paramGraphics.getClipBounds();
    Graphics2D graphics2D;
    (graphics2D = (Graphics2D)paramGraphics).addRenderingHints(TrainingTool.e());
    paramGraphics.setColor(Color.WHITE);
    paramGraphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    paramGraphics.drawImage(this.a, 26, 6, this);
    Dimension dimension1 = this.b.getPreferredSize();
    this.b.setBounds(96, 12, dimension1.width + 10, dimension1.height);
    dimension1 = this.c.getPreferredSize();
    this.c.setBounds(98, 43, dimension1.width + 10, dimension1.height);
    dimension1 = this.j.getPreferredSize();
    this.j.setBounds(23, 98, dimension1.width + 10, dimension1.height);
    int i;
    if ((i = dimension2.width) < 46 + dimension1.width)
      i = 46 + dimension1.width; 
    graphics2D.setColor(this.l.g);
    graphics2D.drawLine(20, 78, i - 20, 78);
    RoundRectangle2D.Double double_ = new RoundRectangle2D.Double(20.0D, 92.0D, (i - 40), (dimension1.height + 20), 12.0D, 12.0D);
    graphics2D.setPaint(new GradientPaint(0.0F, 92.0F, Color.WHITE, 0.0F, (dimension1.height + 20 + 92), new Color(240, 243, 246)));
    graphics2D.fill(double_);
    graphics2D.setPaint(this.l.g);
    graphics2D.draw(double_);
    setPreferredSize(new Dimension(dimension2.width, 124 + dimension1.height));
    setMinimumSize(new Dimension(46 + dimension1.width, 124 + dimension1.height));
    paintChildren(graphics2D);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */