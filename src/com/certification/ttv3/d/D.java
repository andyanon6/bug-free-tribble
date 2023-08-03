package com.certification.ttv3.d;

import a.a.a.a;
import com.certification.a.a.a;
import com.certification.ttv3.TrainingTool;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import javax.swing.Box;
import javax.swing.JLabel;

final class D extends a {
  public D(C paramC) {
    setLayout((LayoutManager)new a());
    JLabel jLabel;
    C c;
    (jLabel = new JLabel("Screen font:")).setFont(A.c((c = paramC).a));
    add("left", jLabel);
    (jLabel = new JLabel("Font size:")).setFont(A.c((c = paramC).a));
    add("tab", jLabel);
    add("br left", (c = paramC).a.ai);
    add("tab", (c = paramC).a.aj);
    add("br left", (c = paramC).a.x);
    add("br left", Box.createHorizontalStrut(20));
    add("left", (c = paramC).a.y);
    add("left", (c = paramC).a.z);
    add("left", (c = paramC).a.A);
    add("br left", (c = paramC).a.B);
    add("br left", Box.createHorizontalStrut(20));
    add("left", (c = paramC).a.C);
    add("left", (c = paramC).a.D);
    add("left", (c = paramC).a.E);
    add("br left", (c = paramC).a.ag);
    (jLabel = new JLabel("Color of correct answers")).setFont(A.c((c = paramC).a));
    add("left", jLabel);
    add("br left", (c = paramC).a.ah);
    (jLabel = new JLabel("Color of incorrect answers")).setFont(A.c((c = paramC).a));
    add("left", jLabel);
    add("br left", (c = paramC).a.F);
    add("br left", (c = paramC).a.G);
    add("br left", (c = paramC).a.H);
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


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/D.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */