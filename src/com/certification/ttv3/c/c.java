package com.certification.ttv3.c;

import com.certification.ttv3.TrainingTool;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JMenuItem;

final class c extends JMenuItem {
  public c(a parama, String paramString) {
    super(paramString);
    setFont(parama.a);
    setBorder(BorderFactory.createEmptyBorder(2, 8, 3, 6));
    setBackground(Color.WHITE);
  }
  
  public final void paint(Graphics paramGraphics) {
    (paramGraphics = paramGraphics).addRenderingHints(TrainingTool.e());
    super.paint(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */