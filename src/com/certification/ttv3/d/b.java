package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.a.p;
import com.certification.ttv3.b.f;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import javax.swing.JPanel;

public final class b extends JPanel implements ActionListener {
  TrainingTool a;
  
  private z d;
  
  private i e;
  
  private K f;
  
  Color b = new Color(221, 221, 221);
  
  f c;
  
  public b(TrainingTool paramTrainingTool, f paramf) {
    this.a = paramTrainingTool;
    this.c = paramf;
    DateFormat.getDateTimeInstance(2, 2);
    if (paramf.g() == 0) {
      Integer.parseInt(this.a.r().getProperty(p.b));
    } else {
      Integer.parseInt(this.a.r().getProperty(p.e));
    } 
    this.c.e();
    this.c.d();
    setLayout(new BorderLayout());
    this.d = new z();
    this.f = new K(paramTrainingTool, this.d);
    this.e = new i(this);
    add(this.f, "North");
    add(new a(), "South");
    add(this.d, "East");
    add(this.e, "West");
    add(new j(this), "Center");
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getActionCommand().compareTo("Home") == 0) {
      this.a.x();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Review Exam") == 0) {
      this.a.c(this.c);
      return;
    } 
  }
  
  public final int a() {
    return this.c.d();
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */