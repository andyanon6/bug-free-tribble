package com.certification.ttv3.d;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

final class e extends JPanel {
  private double a = 10.0D;
  
  private int b;
  
  private int c = 13;
  
  private Image d;
  
  private Image e;
  
  private Image f;
  
  private Image g;
  
  private Image h;
  
  private Image i;
  
  public e(b paramb, int paramInt) {
    Toolkit toolkit = getToolkit();
    this.d = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/score-gray-left.png"));
    this.e = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/score-gray-fill.png"));
    this.f = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/score-gray-right.png"));
    this.g = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/score-green-left.png"));
    this.h = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/score-green-fill.png"));
    this.i = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/score-green-right.png"));
    this.b = paramInt;
    setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
    setPreferredSize(new Dimension(700, 40));
    setMaximumSize(new Dimension(700, 40));
    setOpaque(false);
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension = getSize();
    (paramGraphics = paramGraphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    paramGraphics.drawImage(this.d, (int)this.a, this.c, this);
    int i = (int)(dimension.width - this.a - this.d.getWidth(this) - this.f.getWidth(this));
    paramGraphics.drawImage(this.e, this.d.getWidth(this), this.c, i, this.e.getHeight(this), this);
    paramGraphics.drawImage(this.f, (int)((dimension.width - this.f.getWidth(this)) - this.a), this.c, this);
    if (this.b > 0) {
      int j;
      if ((i = (int)((j = (int)((dimension.getWidth() - this.a) * this.b / 100.0D)) - this.a - this.g.getWidth(this) - this.i.getWidth(this))) > 0) {
        paramGraphics.drawImage(this.g, (int)this.a + 1, this.c + 2, this);
        i = (int)(j - this.a - this.g.getWidth(this) - this.i.getWidth(this));
        paramGraphics.drawImage(this.h, (int)(this.g.getWidth(this) + this.a + 1.0D), this.c + 2, i, this.h.getHeight(this), this);
        paramGraphics.drawImage(this.i, j - this.i.getWidth(this), this.c + 2, this);
      } else {
        paramGraphics.drawImage(this.g, (int)this.a + 1, this.c + 2, j / 2, this.g.getHeight(this), this);
        paramGraphics.drawImage(this.g, (int)(j + this.a), this.c + 2, -j / 2, this.g.getHeight(this), this);
      } 
    } 
    paramGraphics.setFont(new Font("Arial", 0, 10));
    paramGraphics.setColor(Color.BLACK);
    FontMetrics fontMetrics = paramGraphics.getFontMetrics();
    for (i = 0; i <= 100; i += 10) {
      String str = Integer.toString(i);
      Rectangle2D rectangle2D = fontMetrics.getStringBounds(str, paramGraphics);
      int j = (j = (int)(i * (dimension.getWidth() - this.a * 2.0D) / 100.0D + this.a)) - (int)(rectangle2D.getWidth() / 2.0D);
      paramGraphics.drawString(Integer.toString(i), j, 10);
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */