package com.certification.ttv3.d;

import a.a.a.a;
import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.a.p;
import com.certification.ttv3.e.e;
import com.certification.ttv3.e.y;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public final class x extends JPanel implements ChangeListener {
  private Image a;
  
  private JLabel b;
  
  private JLabel c;
  
  private Color d;
  
  private JPanel e;
  
  private JScrollPane f;
  
  private r g;
  
  private ArrayList h;
  
  public x(q paramq, JScrollPane paramJScrollPane) {
    this.f = paramJScrollPane;
    Toolkit toolkit = getToolkit();
    this.a = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/topic-icon.png"));
    setBackground(Color.WHITE);
    this.b = new JLabel("Exam Topics");
    this.b.setFont(new Font("Arial", 0, 24));
    this.b.setForeground(new Color(4, 50, 96));
    e e;
    if ((e = q.a(paramq).j()) != null) {
      this.c = new JLabel(String.valueOf(e.e()) + " " + e.d() + " - " + e.f());
    } else {
      this.c = new JLabel("Exam data not available");
    } 
    this.c.setFont(new Font("Arial", 0, 11));
    this.c.setForeground(new Color(132, 135, 140));
    add(this.b);
    add(this.c);
    this.d = new Color(221, 221, 221);
    this.e = new JPanel();
    this.e.setLayout((LayoutManager)new a(8, 2));
    this.e.setOpaque(false);
    if (e == null) {
      this.h = new ArrayList();
      this.g = new r(paramq, "All Topics", (byte)0);
      this.g.a(this);
      this.e.add("hfill", this.g);
    } else {
      ArrayList<y> arrayList = e.a();
      this.h = new ArrayList(arrayList.size());
      this.g = new r(paramq, "All Topics (" + e.c() + " questions)", (byte)0);
      this.g.a(this);
      this.e.add("hfill", this.g);
      for (byte b = 0; b < arrayList.size(); b++) {
        y y = arrayList.get(b);
        r r1;
        (r1 = new r(paramq, String.valueOf(y.b()) + " (" + e.c(y) + " questions)", (byte)0)).a(this);
        this.h.add(r1);
        this.e.add("br hfill", r1);
      } 
    } 
    a();
    add(this.e);
  }
  
  public final void a() {
    Iterator<r> iterator;
    Properties properties;
    if ((properties = q.a(this.i).r()).getProperty(p.i).compareTo("All") == 0) {
      this.g.a(true);
      iterator = this.h.iterator();
      while (iterator.hasNext()) {
        r r1;
        (r1 = iterator.next()).a(false);
      } 
      return;
    } 
    this.g.a(false);
    for (byte b = 0; b < this.h.size(); b++) {
      if (iterator.getProperty(String.valueOf(p.j) + b) != null && iterator.getProperty(String.valueOf(p.j) + b).compareTo("Y") == 0) {
        ((r)this.h.get(b)).a(true);
      } else {
        ((r)this.h.get(b)).a(false);
      } 
    } 
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension1 = this.f.getViewport().getSize();
    Rectangle rectangle = paramGraphics.getClipBounds();
    Graphics2D graphics2D;
    (graphics2D = (Graphics2D)paramGraphics).addRenderingHints(TrainingTool.e());
    paramGraphics.setColor(Color.WHITE);
    paramGraphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    paramGraphics.drawImage(this.a, 18, 12, this);
    Dimension dimension2 = this.b.getPreferredSize();
    this.b.setBounds(96, 12, dimension2.width + 10, dimension2.height);
    dimension2 = this.c.getPreferredSize();
    this.c.setBounds(98, 43, dimension2.width + 10, dimension2.height);
    dimension2 = this.e.getPreferredSize();
    this.e.setBounds(23, 98, dimension2.width + 10, dimension2.height);
    int i;
    if ((i = dimension1.width) < 46 + dimension2.width)
      i = 46 + dimension2.width; 
    graphics2D.setColor(this.d);
    graphics2D.drawLine(20, 78, i - 20, 78);
    RoundRectangle2D.Double double_ = new RoundRectangle2D.Double(20.0D, 92.0D, (i - 40), (dimension2.height + 20), 12.0D, 12.0D);
    graphics2D.setPaint(new GradientPaint(0.0F, 92.0F, Color.WHITE, 0.0F, (dimension2.height + 20 + 92), new Color(240, 243, 246)));
    graphics2D.fill(double_);
    graphics2D.setPaint(this.d);
    graphics2D.draw(double_);
    setPreferredSize(new Dimension(dimension1.width, 110 + dimension2.height));
    setMinimumSize(new Dimension(46 + dimension2.width, 110 + dimension2.height));
    paintChildren(paramGraphics);
  }
  
  public final void stateChanged(ChangeEvent paramChangeEvent) {
    Properties properties = q.a(this.i).r();
    if (paramChangeEvent.getSource() == this.g) {
      r r1;
      if ((r1 = this.g).a) {
        Iterator<r> iterator = this.h.iterator();
        while (iterator.hasNext()) {
          r r2;
          (r2 = iterator.next()).a(false);
        } 
        properties.setProperty(p.i, "All");
      } else {
        for (byte b = 0; b < this.h.size(); b++) {
          if (properties.getProperty(String.valueOf(p.j) + b) != null && properties.getProperty(String.valueOf(p.j) + b).compareTo("Y") == 0) {
            ((r)this.h.get(b)).a(true);
          } else {
            ((r)this.h.get(b)).a(false);
          } 
        } 
        properties.setProperty(p.i, "Topics");
      } 
    } else {
      this.g.a(false);
      properties.setProperty(p.i, "Topics");
      for (byte b = 0; b < this.h.size(); b++) {
        r r1;
        properties.setProperty(String.valueOf(p.j) + b, (r1 = this.h.get(b)).a ? "Y" : "N");
      } 
    } 
    q.a(this.i).a(properties);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */