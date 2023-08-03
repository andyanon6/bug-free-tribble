package com.certification.ttv3.f;

import com.certification.ttv3.TrainingTool;
import java.awt.Graphics;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public final class e extends JTable {
  public e(AbstractTableModel paramAbstractTableModel) {
    super(paramAbstractTableModel);
    setTableHeader(new f(getColumnModel()));
  }
  
  public final void paint(Graphics paramGraphics) {
    (paramGraphics = paramGraphics).addRenderingHints(TrainingTool.e());
    super.paint(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */