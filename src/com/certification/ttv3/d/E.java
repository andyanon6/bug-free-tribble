package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

final class E extends JPanel {
  private Color a = new Color(251, 252, 253);
  
  public E(A paramA) {
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension = getSize(null);
    (paramGraphics = paramGraphics).addRenderingHints(TrainingTool.e());
    RoundRectangle2D.Double double_ = new RoundRectangle2D.Double(0.0D, 0.0D, (dimension.width - 1), (dimension.height - 1), 12.0D, 12.0D);
    paramGraphics.setPaint(this.a);
    paramGraphics.fill(double_);
    paramGraphics.setPaint(this.b.a);
    paramGraphics.draw(double_);
    paintChildren(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/E.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */