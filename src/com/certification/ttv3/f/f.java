package com.certification.ttv3.f;

import com.certification.ttv3.TrainingTool;
import java.awt.Graphics;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public final class f extends JTableHeader {
  public f(TableColumnModel paramTableColumnModel) {
    super(paramTableColumnModel);
  }
  
  public final void paint(Graphics paramGraphics) {
    (paramGraphics = paramGraphics).addRenderingHints(TrainingTool.e());
    super.paint(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */