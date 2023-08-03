package com.certification.ttv3.a;

import java.awt.Component;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

final class i extends DefaultTableCellRenderer {
  i(d paramd) {}
  
  public final Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    return (paramObject instanceof JProgressBar) ? (JProgressBar)paramObject : super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */