package com.certification.ttv3.a;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.f.h;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.prefs.Preferences;
import javax.swing.JProgressBar;
import javax.swing.table.AbstractTableModel;

final class j extends AbstractTableModel {
  private String[] e = new String[] { "Vendor", "Code", "Version", "Expires", "Status" };
  
  public ArrayList a;
  
  HashMap b = new HashMap<Object, Object>();
  
  HashMap c = new HashMap<Object, Object>();
  
  public j(d paramd) {
    a();
  }
  
  public final void a() {
    this.a = h.a(this.d.a.c(), this.d.a.d(), null);
    fireTableDataChanged();
  }
  
  public final void a(int paramInt) {
    JProgressBar jProgressBar;
    (jProgressBar = new JProgressBar(0, 100)).setString("Downloading...");
    jProgressBar.setStringPainted(true);
    this.b.put(Integer.valueOf(paramInt), jProgressBar);
    String str1;
    Properties properties = h.a(str1 = h.a(paramInt));
    Preferences preferences;
    String str2 = (preferences = (preferences = TrainingTool.q()).node("license" + paramInt)).get("file", "");
    File file = this.d.a.a(str2);
    long l = 0L;
    try {
      l = Long.parseLong(properties.getProperty("filesize"));
    } catch (Exception exception) {}
    f f = new f(this.d, paramInt, l, file, jProgressBar);
    this.c.put(Integer.valueOf(paramInt), f);
    Thread thread;
    (thread = new Thread(f)).start();
  }
  
  public final int getColumnCount() {
    return this.e.length;
  }
  
  public final int getRowCount() {
    return this.a.size();
  }
  
  public final Object getValueAt(int paramInt1, int paramInt2) {
    Properties properties = h.a(h.a(((Integer)this.a.get(paramInt1)).intValue()));
    switch (paramInt2) {
      case 0:
        return properties.getProperty("vendor");
      case 1:
        return properties.getProperty("code");
      case 2:
        return properties.getProperty("version");
      case 3:
        return properties.getProperty("expiredate");
      case 4:
        return ((paramInt2 = this.d.a.b(((Integer)this.a.get(paramInt1)).intValue())) == 0) ? "Download Exam" : ((paramInt2 == 1) ? this.b.get(this.a.get(paramInt1)) : ((paramInt2 == 2) ? "Available" : ((paramInt2 == 3) ? "Expired" : Integer.toString(paramInt2))));
    } 
    return null;
  }
  
  public final String getColumnName(int paramInt) {
    return this.e[paramInt];
  }
  
  public final boolean isCellEditable(int paramInt1, int paramInt2) {
    return (paramInt2 == 4 && (paramInt1 = this.d.a.b(((Integer)this.d.i.a.get(paramInt1)).intValue())) == 0);
  }
  
  public final void b(int paramInt) {
    fireTableCellUpdated(this.a.indexOf(Integer.valueOf(paramInt)), 4);
    b();
  }
  
  public final void b() {
    try {
      int i;
      if ((i = this.d.a.b(((Integer)this.d.i.a.get(this.d.j.getSelectionModel().getLeadSelectionIndex())).intValue())) != 2) {
        this.d.c.setEnabled(false);
        return;
      } 
      this.d.c.setEnabled(true);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */