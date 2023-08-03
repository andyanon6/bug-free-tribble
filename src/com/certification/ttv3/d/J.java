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

final class J extends a {
  public J(I paramI) {
    setLayout((LayoutManager)new a());
    I i;
    add("left", (i = paramI).a.Z);
    add("br left", (i = paramI).a.aa);
    add("br left", Box.createHorizontalStrut(20));
    JLabel jLabel;
    (jLabel = new JLabel("Host:")).setFont(A.c((i = paramI).a));
    add("", jLabel);
    add("", (i = paramI).a.b);
    (jLabel = new JLabel("Port:")).setFont(A.c((i = paramI).a));
    add("", jLabel);
    add("", (i = paramI).a.c);
    add("br left", (i = paramI).a.I);
    add("br left", Box.createHorizontalStrut(20));
    (jLabel = new JLabel("Username:")).setFont(A.c((i = paramI).a));
    add("", jLabel);
    add("", (i = paramI).a.d);
    add("br left", Box.createHorizontalStrut(20));
    (jLabel = new JLabel("Password:")).setFont(A.c((i = paramI).a));
    add("", jLabel);
    add("", (i = paramI).a.e);
    add("br left", (i = paramI).a.af);
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


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/J.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */