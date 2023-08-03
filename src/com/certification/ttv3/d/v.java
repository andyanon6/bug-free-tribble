package com.certification.ttv3.d;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

final class v implements TableCellRenderer {
  private TableCellRenderer a;
  
  public v(t paramt, TableCellRenderer paramTableCellRenderer) {
    this.a = paramTableCellRenderer;
  }
  
  public final Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Component component;
    return (paramObject instanceof Component) ? (Component)paramObject : (component = this.a.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2));
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */