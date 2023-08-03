package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.b.f;
import java.awt.Cursor;
import java.awt.Insets;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

final class w extends AbstractTableModel {
  private String[] a;
  
  private int b;
  
  private HashMap c;
  
  private HashMap d;
  
  private w(t paramt, int paramInt) {
    this.b = paramInt;
    this.a = new String[] { "Test", "Date/Time", "Questions", "Correct", "Time Left", "Action", "Delete" };
    this.c = new HashMap<Object, Object>();
    this.d = new HashMap<Object, Object>();
  }
  
  public final int getColumnCount() {
    return this.a.length;
  }
  
  public final int getRowCount() {
    int i = 0;
    ArrayList arrayList = q.a(t.a(this.e)).s();
    if (this.b == q.i) {
      Iterator<f> iterator = arrayList.iterator();
      while (iterator.hasNext()) {
        f f;
        if ((f = iterator.next()).g() == f.b)
          i++; 
      } 
    } 
    if (this.b == 0) {
      Iterator<f> iterator = arrayList.iterator();
      while (iterator.hasNext()) {
        f f;
        if ((f = iterator.next()).g() == 0)
          i++; 
      } 
    } 
    if (this.b == q.j)
      i = arrayList.size(); 
    return i;
  }
  
  public final Object getValueAt(int paramInt1, int paramInt2) {
    ArrayList<f> arrayList = q.a(t.a(this.e)).s();
    f f = null;
    DateFormat dateFormat = DateFormat.getDateTimeInstance(2, 2);
    byte b = -1;
    int i = 0;
    if (this.b == q.i) {
      for (i = 0; i < arrayList.size() && b < paramInt1; i++) {
        if (((f)arrayList.get(i)).g() == f.b)
          b++; 
      } 
      f = arrayList.get(i - 1);
    } 
    if (this.b == 0) {
      for (i = 0; i < arrayList.size() && b < paramInt1; i++) {
        if (((f)arrayList.get(i)).g() == 0)
          b++; 
      } 
      f = arrayList.get(i - 1);
    } 
    if (this.b == q.j) {
      i = paramInt1 + 1;
      f = arrayList.get(paramInt1);
    } 
    if (f == null)
      return null; 
    String str = (f.g() == f.b) ? " (P)" : " (V)";
    if (this.c.get(Integer.valueOf(i - 1)) == null) {
      JButton jButton;
      if (f.h()) {
        (jButton = new JButton("Resume")).setActionCommand("Resume " + (i - 1));
      } else {
        (jButton = new JButton("Details")).setActionCommand("ExamDetails " + (i - 1));
      } 
      jButton.addActionListener(t.a(this.e));
      jButton.setFont((t.a(this.e)).e);
      jButton.setCursor(Cursor.getPredefinedCursor(12));
      jButton.setBorderPainted(false);
      jButton.setMargin(new Insets(0, 0, 0, 0));
      jButton.setOpaque(false);
      jButton.setContentAreaFilled(false);
      this.c.put(Integer.valueOf(i - 1), jButton);
    } else {
      JButton jButton = (JButton)this.c.get(Integer.valueOf(i - 1));
      if (!f.h() && jButton.getText().compareTo("Resume") == 0) {
        jButton.setText("Details");
        jButton.setActionCommand("ExamDetails " + (i - 1));
      } 
    } 
    if (this.d.get(Integer.valueOf(i - 1)) == null) {
      JButton jButton;
      (jButton = new JButton("Delete")).setActionCommand("Delete " + (i - 1));
      jButton.addActionListener(t.a(this.e));
      jButton.setFont((t.a(this.e)).e);
      jButton.setCursor(Cursor.getPredefinedCursor(12));
      jButton.setBorderPainted(false);
      jButton.setMargin(new Insets(0, 0, 0, 0));
      jButton.setOpaque(false);
      jButton.setContentAreaFilled(false);
      this.d.put(Integer.valueOf(i - 1), jButton);
    } 
    switch (paramInt2) {
      case 0:
        return String.valueOf(i) + str;
      case 1:
        return (f.l() == null) ? "Date Unknown" : dateFormat.format(f.l());
      case 2:
        return Integer.valueOf(f.d());
      case 3:
        return Integer.valueOf(f.i());
      case 4:
        return TrainingTool.d(f.j());
      case 5:
        return this.c.get(Integer.valueOf(i - 1));
      case 6:
        return this.d.get(Integer.valueOf(i - 1));
    } 
    return null;
  }
  
  public final String getColumnName(int paramInt) {
    return this.a[paramInt];
  }
  
  public final Class getColumnClass(int paramInt) {
    return (Class)((paramInt == 5 || paramInt == 6) ? JButton.class : String.class);
  }
  
  public final boolean isCellEditable(int paramInt1, int paramInt2) {
    return false;
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */