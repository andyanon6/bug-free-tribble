package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

final class h extends JLabel {
  private Color a;
  
  private Color b;
  
  public h(g paramg, String paramString, Color paramColor) {
    super(paramString);
    this.a = paramColor;
    this.b = new Color(43, 87, 122);
    setForeground(this.a);
  }
  
  public final void paint(Graphics paramGraphics) {
    (paramGraphics = paramGraphics).addRenderingHints(TrainingTool.e());
    paramGraphics.setFont(getFont());
    paramGraphics.setColor(this.b);
    paramGraphics.drawString(getText(), 1, 16);
    paramGraphics.setColor(this.a);
    paramGraphics.drawString(getText(), 0, 15);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */