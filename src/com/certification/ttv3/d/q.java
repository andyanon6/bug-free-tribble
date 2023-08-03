package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public final class q extends JPanel implements ActionListener {
  private TrainingTool k;
  
  private z l;
  
  private y m;
  
  private K n;
  
  private int o = 0;
  
  private int p = 0;
  
  private JScrollPane q;
  
  public s a;
  
  public x b;
  
  public t c;
  
  Font d;
  
  Font e;
  
  Color f = new Color(64, 64, 64);
  
  Color g = new Color(221, 221, 221);
  
  public static int h = 0;
  
  public static int i = 1;
  
  public static int j = 2;
  
  public q(TrainingTool paramTrainingTool) {
    this.k = paramTrainingTool;
    setLayout(new BorderLayout());
    HashMap<Object, Object> hashMap;
    (hashMap = new HashMap<Object, Object>()).put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    this.d = new Font("Arial", 0, 12);
    this.e = this.d.deriveFont((Map)hashMap);
    this.q = new JScrollPane(20, 31);
    this.q.getViewport().setBackground(Color.WHITE);
    this.q.setBackground(Color.WHITE);
    this.q.setBorder((Border)null);
    this.a = new s(this, this.q);
    this.b = new x(this, this.q);
    this.c = new t(this);
    this.q.setViewportView(this.a);
    add(this.q, "Center");
    add(new a(), "South");
    this.l = new z();
    add(this.l, "East");
    this.n = new K(paramTrainingTool, this.l);
    add(this.n, "North");
    this.m = new y(this);
    add(this.m, "West");
    this.m.a();
  }
  
  public final void a() {
    this.o = 0;
    this.m.a();
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getActionCommand().compareTo("Settings") == 0)
      this.k.n(); 
    if (paramActionEvent.getActionCommand().compareTo("Details") == 0)
      a(); 
    if (paramActionEvent.getActionCommand().compareTo("Topics") == 0) {
      this.o = 1;
      this.m.a();
    } 
    if (paramActionEvent.getActionCommand().compareTo("History") == 0) {
      this.o = 2;
      this.m.a();
      switch (this.p) {
        case 0:
          if (this.c.c.getRowCount() > 0) {
            this.c.b.getViewport().setView(this.c.f);
            break;
          } 
          this.c.b.getViewport().setView(this.c.a);
          break;
        case 1:
          if (this.c.d.getRowCount() > 0) {
            this.c.b.getViewport().setView(this.c.g);
            break;
          } 
          this.c.b.getViewport().setView(this.c.a);
          break;
        case 2:
          if (this.c.e.getRowCount() > 0) {
            this.c.b.getViewport().setView(this.c.h);
            break;
          } 
          this.c.b.getViewport().setView(this.c.a);
          break;
      } 
    } 
    if (paramActionEvent.getActionCommand().compareTo("HistoryAE") == 0) {
      this.o = 2;
      this.p = 0;
      this.m.a();
      if (this.c.c.getRowCount() > 0) {
        this.c.b.getViewport().setView(this.c.f);
      } else {
        this.c.b.getViewport().setView(this.c.a);
      } 
    } 
    if (paramActionEvent.getActionCommand().compareTo("HistoryPE") == 0) {
      this.o = 2;
      this.p = 1;
      this.m.a();
      if (this.c.d.getRowCount() > 0) {
        this.c.b.getViewport().setView(this.c.g);
      } else {
        this.c.b.getViewport().setView(this.c.a);
      } 
    } 
    if (paramActionEvent.getActionCommand().compareTo("HistoryVE") == 0) {
      this.o = 2;
      this.p = 2;
      this.m.a();
      if (this.c.e.getRowCount() > 0) {
        this.c.b.getViewport().setView(this.c.h);
      } else {
        this.c.b.getViewport().setView(this.c.a);
      } 
    } 
    if (paramActionEvent.getActionCommand().indexOf("ExamDetails") == 0) {
      this.k.f(Integer.parseInt(paramActionEvent.getActionCommand().substring(12, paramActionEvent.getActionCommand().length())));
      return;
    } 
    if (paramActionEvent.getActionCommand().indexOf("Resume") == 0) {
      this.k.g(Integer.parseInt(paramActionEvent.getActionCommand().substring(7, paramActionEvent.getActionCommand().length())));
      return;
    } 
    if (paramActionEvent.getActionCommand().indexOf("Delete") == 0) {
      this.k.c(Integer.parseInt(paramActionEvent.getActionCommand().substring(7, paramActionEvent.getActionCommand().length())));
      return;
    } 
  }
  
  public final void b() {
    if (this.c.c != null)
      this.c.c.fireTableDataChanged(); 
    if (this.c.d != null)
      this.c.d.fireTableDataChanged(); 
    if (this.c.e != null)
      this.c.e.fireTableDataChanged(); 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */