package com.certification.ttv3.d;

import com.certification.ttv3.b.f;
import com.certification.ttv3.b.h;
import javax.swing.table.AbstractTableModel;

final class m extends AbstractTableModel {
  private String[] a;
  
  private m(l paraml) {
    if (l.b(paraml).g() == f.b || !l.b(paraml).h()) {
      this.a = new String[] { "Marked", "Answered", "Correct", "Q #", "Question Text" };
      return;
    } 
    this.a = new String[] { "Marked", "Answered", "Q #", "Question Text" };
  }
  
  public final int getColumnCount() {
    return this.a.length;
  }
  
  public final int getRowCount() {
    return l.b(this.b).d();
  }
  
  public final Object getValueAt(int paramInt1, int paramInt2) {
    h h = l.b(this.b).a(paramInt1);
    if (l.b(this.b).g() == f.b || !l.b(this.b).h()) {
      switch (paramInt2) {
        case 0:
          return new Boolean(h.d());
        case 1:
          return h.e();
        case 2:
          return h.f() ? "Yes" : "No";
        case 3:
          return Integer.valueOf(paramInt1 + 1);
        case 4:
          return h.a().toString();
      } 
    } else {
      switch (paramInt2) {
        case 0:
          return new Boolean(h.d());
        case 1:
          return h.e();
        case 2:
          return Integer.valueOf(paramInt1 + 1);
        case 3:
          return h.a().toString();
      } 
    } 
    return null;
  }
  
  public final String getColumnName(int paramInt) {
    return this.a[paramInt];
  }
  
  public final Class getColumnClass(int paramInt) {
    return (Class)((paramInt == 0) ? Boolean.class : String.class);
  }
  
  public final boolean isCellEditable(int paramInt1, int paramInt2) {
    return (paramInt2 == 0);
  }
  
  public final void setValueAt(Object paramObject, int paramInt1, int paramInt2) {
    if (paramInt2 == 0 && paramObject instanceof Boolean) {
      h h;
      (h = l.b(this.b).a(paramInt1)).a(((Boolean)paramObject).booleanValue());
      fireTableCellUpdated(paramInt1, 0);
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */