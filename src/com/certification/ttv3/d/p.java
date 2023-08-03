package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import java.awt.Graphics;
import javax.swing.JScrollBar;

final class p extends JScrollBar {
  public p(o paramo) {
    setBlockIncrement(TrainingTool.h << 1);
    setUnitIncrement(TrainingTool.h);
  }
  
  public final void paint(Graphics paramGraphics) {
    if (this.a.b && getValue() > 0) {
      setValue(0);
      this.a.b = false;
    } 
    super.paint(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */