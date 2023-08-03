package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.a.o;
import com.certification.ttv3.a.p;
import com.certification.ttv3.b.f;
import com.certification.ttv3.f.e;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.TableColumn;

public final class l extends JPanel implements ActionListener, MouseListener {
  private TrainingTool c;
  
  private z d;
  
  private n e;
  
  private K f;
  
  private int g = 0;
  
  private int h;
  
  private int i;
  
  private Timer j;
  
  Color a = new Color(221, 221, 221);
  
  Color b = new Color(96, 96, 96);
  
  private e k;
  
  private m l;
  
  private o m;
  
  private f n;
  
  private o o;
  
  private boolean p = false;
  
  public l(TrainingTool paramTrainingTool, f paramf) {
    this.c = paramTrainingTool;
    this.n = paramf;
    setLayout(new BorderLayout());
    this.h = paramf.j();
    this.i = 0;
    this.l = new m(this, (byte)0);
    this.k = new e(this.l);
    this.k.setOpaque(false);
    this.k.setRowHeight(24);
    this.k.setIntercellSpacing(new Dimension(10, 1));
    byte b = 0;
    b++;
    TableColumn tableColumn;
    (tableColumn = this.k.getColumnModel().getColumn(0)).setPreferredWidth(80);
    b++;
    (tableColumn = this.k.getColumnModel().getColumn(1)).setPreferredWidth(100);
    if (this.n.g() == f.b || !this.n.h()) {
      b++;
      (tableColumn = this.k.getColumnModel().getColumn(2)).setPreferredWidth(80);
    } 
    (tableColumn = this.k.getColumnModel().getColumn(b++)).setPreferredWidth(50);
    (tableColumn = this.k.getColumnModel().getColumn(b)).setPreferredWidth(600);
    this.k.setSelectionMode(0);
    this.k.addMouseListener(this);
    this.d = new z();
    this.f = new K(paramTrainingTool, this.d);
    this.e = new n(this);
    this.m = new o(this);
    this.o = new o(this.c);
    this.o.a(this.n.a(this.i).c());
    add(this.f, "North");
    add(new a(), "South");
    add(this.d, "East");
    add(this.e, "West");
    add(this.m, "Center");
    a(this.i);
    if (paramf.h()) {
      this.j = new Timer(1000, this);
      this.j.start();
    } 
    this.e.a();
  }
  
  public final void a(int paramInt) {
    this.n.a(this.i).a(this.o.a());
    o o2;
    this.n.a(this.i).a((o2 = this.m).a.isSelected());
    if (this.c.r().getProperty(A.az).compareTo("OnClick") == 0 && this.i != paramInt && this.m.c)
      this.m.a(); 
    this.i = paramInt;
    this.e.repaint();
    if (this.g == 0 || this.g == 1)
      this.m.b(); 
    if (this.g == 2)
      this.k.changeSelection(this.i, 0, false, false); 
    l l1;
    (l1 = this).o.setTitle("Notes: Question #" + (l1.i + 1));
    l1.o.a(l1.n.a(l1.i).c());
    boolean bool = this.n.a(this.i).d();
    o o1;
    (o1 = this.m).a.setSelected(bool);
    if (!this.n.a(this.i).d())
      this.p = false; 
  }
  
  public final int a() {
    return this.i;
  }
  
  public final int b() {
    return this.n.d();
  }
  
  public final void c() {
    for (byte b = 0; b < this.n.d(); b++) {
      if (this.n.a(b).d()) {
        this.p = true;
        a(b);
        return;
      } 
    } 
    JOptionPane.showMessageDialog((Component)this.c, "No questions marked for review", "Notice", 2);
    this.p = false;
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() == this.j) {
      this.h--;
      if (this.h <= 0) {
        JOptionPane.showMessageDialog((Component)this.c, "Exam is finished, press OK to see your exam score.", "Exam is finished", 1);
        j();
      } 
      this.e.repaint();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Previous") == 0) {
      h();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Next") == 0) {
      g();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Show notes") == 0) {
      if (this.o.isVisible()) {
        this.o.setVisible(false);
        return;
      } 
      this.o.setVisible(true);
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Show answers") == 0) {
      this.m.a();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("End exam") == 0)
      d(); 
    if (paramActionEvent.getActionCommand().compareTo("Review marked") == 0) {
      c();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Home") == 0) {
      this.c.x();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Review score") == 0) {
      this.c.d(this.n);
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("ToggleTimer") == 0) {
      if (this.j != null && this.j.isRunning()) {
        this.j.stop();
        return;
      } 
      this.j.start();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Question") == 0 && this.g != 0) {
      this.g = 0;
      this.e.a();
      this.m.b();
    } 
    if (paramActionEvent.getActionCommand().compareTo("Scenario") == 0 && this.g != 1) {
      this.g = 1;
      this.e.a();
      this.m.b();
    } 
    if (paramActionEvent.getActionCommand().compareTo("QuestionList") == 0 && this.g != 2) {
      this.g = 2;
      this.e.a();
      this.m.b();
    } 
  }
  
  public final void d() {
    this.j.stop();
    boolean bool = true;
    if (this.c.r().getProperty(p.w).compareTo("Y") == 0)
      bool = (JOptionPane.showConfirmDialog((Component)this.c, "Ending the exam will take you to the score screen,\nyou will not be able to answer any more questions.\nAre you sure?", "Finish exam", 0) == 0) ? true : false; 
    if (bool) {
      j();
      return;
    } 
    this.j.start();
  }
  
  private void j() {
    this.j.stop();
    this.o.setVisible(false);
    this.n.a(this.i).a(this.o.a());
    this.n.b(new Date());
    this.n.d(this.h);
    this.n.n();
    this.c.b(this.n);
    this.n = this.c.a(this.n);
    this.c.h();
    if (this.n != null) {
      this.c.e(this.n);
      return;
    } 
    this.c.x();
  }
  
  public final void e() {
    this.n.a(this.i).a(this.o.a());
    this.n.d(this.h);
    this.n.n();
    this.n = this.c.a(this.n);
    this.c.h();
  }
  
  public final boolean f() {
    return (this.n == null) ? false : this.n.h();
  }
  
  public final void g() {
    if (this.i < this.n.d() - 1) {
      if (this.p) {
        for (int i = this.i + 1; i < this.n.d(); i++) {
          if (this.n.a(i).d()) {
            a(i);
            return;
          } 
        } 
        return;
      } 
      a(this.i + 1);
      return;
    } 
  }
  
  public final void h() {
    if (this.i > 0) {
      if (this.p) {
        for (int i = this.i - 1; i >= 0; i--) {
          if (this.n.a(i).d()) {
            a(i);
            return;
          } 
        } 
        return;
      } 
      a(this.i - 1);
    } 
  }
  
  public final void i() {
    a(this.n.d() - 1);
  }
  
  public final void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getButton() == 1 && paramMouseEvent.getClickCount() == 2) {
      this.g = 0;
      this.e.a();
      a(this.k.rowAtPoint(paramMouseEvent.getPoint()));
      return;
    } 
    if (paramMouseEvent.getButton() == 1 && paramMouseEvent.getClickCount() == 1)
      a(this.k.rowAtPoint(paramMouseEvent.getPoint())); 
  }
  
  public final void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public final void mouseExited(MouseEvent paramMouseEvent) {}
  
  public final void mousePressed(MouseEvent paramMouseEvent) {}
  
  public final void mouseReleased(MouseEvent paramMouseEvent) {}
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */