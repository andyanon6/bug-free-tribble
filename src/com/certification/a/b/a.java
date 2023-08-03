package com.certification.a.b;

import com.certification.ttv3.e.o;
import com.certification.ttv3.e.p;
import com.certification.ttv3.e.q;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class a extends JLabel implements MouseListener, MouseMotionListener {
  o a;
  
  private ImageIcon e;
  
  private boolean f;
  
  boolean b;
  
  private ArrayList g;
  
  ArrayList c;
  
  ArrayList d;
  
  private int[] h;
  
  private BasicStroke i = new BasicStroke(2.0F);
  
  private BasicStroke j = new BasicStroke(4.0F);
  
  private Point k;
  
  private Point l;
  
  private int m;
  
  public a(ImageIcon paramImageIcon, o paramo) {
    this(paramImageIcon, paramo, false, false);
  }
  
  public a(ImageIcon paramImageIcon, o paramo, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramImageIcon);
    this.f = paramBoolean1;
    if (paramImageIcon.getImageLoadStatus() != 8)
      setText("Unable to load image: " + paramImageIcon.getDescription()); 
    this.e = paramImageIcon;
    this.a = paramo;
    a();
    if (!this.f && !paramBoolean2) {
      addMouseListener(this);
      addMouseMotionListener(this);
    } 
  }
  
  public final void a() {
    if (this.a == null || this.a.a() == null)
      return; 
    this.g = new ArrayList();
    this.c = new ArrayList();
    this.d = new ArrayList();
    Iterator<q> iterator = this.a.a().iterator();
    while (iterator.hasNext()) {
      q q;
      if ((q = iterator.next()).a()) {
        if (!this.b) {
          Rectangle rectangle;
          if ((rectangle = q.b()).getHeight() <= 0.0D || rectangle.getWidth() <= 0.0D) {
            System.out.println("Bad map");
          } else {
            BufferedImage bufferedImage;
            Graphics2D graphics2D;
            (graphics2D = (Graphics2D)(bufferedImage = new BufferedImage((int)rectangle.getWidth(), (int)rectangle.getHeight(), 2)).getGraphics()).drawImage(this.e.getImage(), new AffineTransform(1.0D, 0.0D, 0.0D, 1.0D, -rectangle.getX(), -rectangle.getY()), (ImageObserver)null);
            this.g.add(bufferedImage);
          } 
        } 
        this.c.add(q);
        continue;
      } 
      this.d.add(q);
    } 
    this.h = new int[this.d.size()];
    Arrays.fill(this.h, -1);
    if (this.f)
      try {
        for (p p : this.a.b())
          this.h[p.b()] = p.a(); 
      } catch (Exception exception2) {
        Exception exception1;
        (exception1 = null).printStackTrace();
      }  
    this.m = -1;
  }
  
  public final int[] b() {
    return this.h;
  }
  
  public final void a(int[] paramArrayOfint) {
    this.h = paramArrayOfint;
  }
  
  public final void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    if (this.a == null || this.a.a() == null)
      return; 
    (paramGraphics = paramGraphics).setColor(Color.GREEN);
    paramGraphics.setStroke(this.i);
    Iterator<q> iterator = this.c.iterator();
    while (iterator.hasNext()) {
      q q;
      Rectangle rectangle = (q = iterator.next()).b();
      if (this.k != null)
        if (rectangle.contains(this.k)) {
          paramGraphics.setStroke(this.j);
        } else {
          paramGraphics.setStroke(this.i);
        }  
      paramGraphics.drawRect((int)rectangle.getX(), (int)rectangle.getY(), (int)rectangle.getWidth(), (int)rectangle.getHeight());
    } 
    paramGraphics.setColor(Color.RED);
    iterator = this.d.iterator();
    while (iterator.hasNext()) {
      q q;
      Rectangle rectangle = (q = iterator.next()).b();
      if (this.k != null)
        if (rectangle.contains(this.k)) {
          paramGraphics.setStroke(this.j);
        } else {
          paramGraphics.setStroke(this.i);
        }  
      paramGraphics.drawRect((int)rectangle.getX(), (int)rectangle.getY(), (int)rectangle.getWidth(), (int)rectangle.getHeight());
    } 
    if (this.b) {
      paramGraphics.setColor(Color.RED);
      paramGraphics.setStroke(this.i);
      ArrayList<?> arrayList;
      for (p p : arrayList = new ArrayList(this.a.b())) {
        try {
          Rectangle rectangle1 = ((q)this.c.get(p.a())).b();
          Rectangle rectangle2 = ((q)this.d.get(p.b())).b();
          paramGraphics.drawLine((int)rectangle1.getCenterX(), (int)rectangle1.getCenterY(), (int)rectangle2.getCenterX(), (int)rectangle2.getCenterY());
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          this.a.b().remove(p);
        } 
      } 
      return;
    } 
    for (byte b = 0; b < this.h.length; b++) {
      int i;
      if ((i = this.h[b]) >= 0 && this.d.size() > b && this.c.size() > i && this.g.size() > i) {
        Rectangle rectangle1 = ((q)this.d.get(b)).b();
        Rectangle rectangle2 = ((q)this.c.get(i)).b();
        paramGraphics.drawImage(this.g.get(i), (int)(rectangle1.getX() - (rectangle2.getWidth() - rectangle1.getWidth()) / 2.0D), (int)(rectangle1.getY() - (rectangle2.getHeight() - rectangle1.getHeight()) / 2.0D), (ImageObserver)null);
      } 
    } 
    if (this.m >= 0)
      paramGraphics.drawImage(this.g.get(this.m), (int)(this.k.getX() - this.l.getX()), (int)(this.k.getY() - this.l.getY()), (ImageObserver)null); 
  }
  
  public final void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public final void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public final void mouseExited(MouseEvent paramMouseEvent) {}
  
  public final void mousePressed(MouseEvent paramMouseEvent) {
    for (byte b = 0; b < this.c.size(); b++) {
      q q;
      if ((q = this.c.get(b)).b().contains(paramMouseEvent.getPoint())) {
        this.m = b;
        this.k = paramMouseEvent.getPoint();
        this.l = new Point((int)(this.k.getX() - q.b().getX()), (int)(this.k.getY() - q.b().getY()));
        repaint();
      } 
    } 
  }
  
  public final void mouseReleased(MouseEvent paramMouseEvent) {
    for (byte b = 0; b < this.d.size(); b++) {
      q q;
      if ((q = this.d.get(b)).b().contains(paramMouseEvent.getPoint()))
        this.h[b] = this.m; 
    } 
    this.m = -1;
    repaint();
  }
  
  public final void mouseDragged(MouseEvent paramMouseEvent) {
    if (this.m >= 0) {
      this.k = paramMouseEvent.getPoint();
      repaint();
    } 
  }
  
  public final void mouseMoved(MouseEvent paramMouseEvent) {
    this.k = paramMouseEvent.getPoint();
    repaint();
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */