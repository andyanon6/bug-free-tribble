package com.certification.ttv3.c;

import com.certification.ttv3.TrainingTool;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JMenu;

final class b extends JMenu {
  public b(a parama, String paramString) {
    super(paramString);
    setFont(parama.a);
    setBorder(BorderFactory.createEmptyBorder(2, 4, 2, 4));
    setBackground(Color.WHITE);
  }
  
  public final void paint(Graphics paramGraphics) {
    (paramGraphics = paramGraphics).addRenderingHints(TrainingTool.e());
    super.paint(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */