package com.certification.ttv3.c;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.b.f;
import com.certification.ttv3.d.l;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import javax.swing.BorderFactory;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public final class a extends JMenuBar implements ActionListener {
  private TrainingTool b;
  
  private b c;
  
  private b d;
  
  private b e;
  
  private b f;
  
  private c g;
  
  private c h;
  
  private c i;
  
  private c j;
  
  private c k;
  
  private c l;
  
  private c m;
  
  private c n;
  
  private c o;
  
  private c p;
  
  private c q;
  
  private c r;
  
  private c s;
  
  private c t;
  
  private c u;
  
  private c v;
  
  private c w;
  
  private c x;
  
  private c y;
  
  private c z;
  
  private c A;
  
  Font a;
  
  public a(TrainingTool paramTrainingTool) {
    this.b = paramTrainingTool;
    setBackground(Color.WHITE);
    setBorder(BorderFactory.createEmptyBorder(2, 4, 1, 4));
    this.a = new Font("Arial", 0, 13);
    this.c = new b(this, "Exam");
    this.c.setMnemonic(69);
    add(this.c);
    this.g = new c(this, "Start Practice");
    this.g.setMnemonic(80);
    this.g.setAccelerator(KeyStroke.getKeyStroke(80, 2));
    this.g.addActionListener(this);
    this.c.add(this.g);
    this.h = new c(this, "Start Virtual");
    this.h.setMnemonic(83);
    this.h.setAccelerator(KeyStroke.getKeyStroke(83, 2));
    this.h.addActionListener(this);
    this.c.add(this.h);
    this.i = new c(this, "Finish");
    this.i.setMnemonic(70);
    this.i.setAccelerator(KeyStroke.getKeyStroke(70, 2));
    this.i.addActionListener(this);
    this.c.add(this.i);
    this.j = new c(this, "Exam History");
    this.j.setMnemonic(72);
    this.j.addActionListener(this);
    this.k = new c(this, "Document View");
    this.k.setMnemonic(86);
    this.k.setAccelerator(KeyStroke.getKeyStroke(86, 2));
    this.k.addActionListener(this);
    this.c.addSeparator();
    this.l = new c(this, "Select Exam");
    this.l.setMnemonic(83);
    this.l.addActionListener(this);
    this.c.add(this.l);
    this.m = new c(this, "Log In/Out");
    this.m.setMnemonic(76);
    this.m.addActionListener(this);
    this.c.add(this.m);
    this.c.addSeparator();
    this.n = new c(this, "Exit");
    this.n.setMnemonic(88);
    this.n.setAccelerator(KeyStroke.getKeyStroke(115, 8));
    this.n.addActionListener(this);
    this.c.add(this.n);
    this.d = new b(this, "Navigation");
    this.d.setMnemonic(78);
    add(this.d);
    this.o = new c(this, "First");
    this.o.setMnemonic(70);
    this.o.setAccelerator(KeyStroke.getKeyStroke(36, 2));
    this.o.addActionListener(this);
    this.d.add(this.o);
    this.p = new c(this, "Last");
    this.p.setMnemonic(76);
    this.p.setAccelerator(KeyStroke.getKeyStroke(35, 2));
    this.p.addActionListener(this);
    this.d.add(this.p);
    this.q = new c(this, "Previous");
    this.q.setMnemonic(80);
    this.q.setAccelerator(KeyStroke.getKeyStroke(37, 2));
    this.q.addActionListener(this);
    this.d.add(this.q);
    this.r = new c(this, "Next");
    this.r.setMnemonic(78);
    this.r.setAccelerator(KeyStroke.getKeyStroke(39, 2));
    this.r.addActionListener(this);
    this.d.add(this.r);
    this.d.addSeparator();
    this.s = new c(this, "Review marked");
    this.s.setMnemonic(82);
    this.s.setAccelerator(KeyStroke.getKeyStroke(82, 2));
    this.s.addActionListener(this);
    this.d.add(this.s);
    this.t = new c(this, "Jump to");
    this.t.setMnemonic(74);
    this.t.setAccelerator(KeyStroke.getKeyStroke(71, 2));
    this.t.addActionListener(this);
    this.d.add(this.t);
    this.d.addSeparator();
    this.u = new c(this, "Full screen");
    this.u.setMnemonic(83);
    this.u.setAccelerator(KeyStroke.getKeyStroke(122, 0));
    this.u.addActionListener(this);
    this.d.add(this.u);
    this.e = new b(this, "Tools");
    this.e.setMnemonic(84);
    add(this.e);
    this.v = new c(this, "Calculator");
    this.v.setMnemonic(67);
    this.v.addActionListener(this);
    this.e.add(this.v);
    this.w = new c(this, "Notepad");
    this.w.setMnemonic(78);
    this.w.addActionListener(this);
    this.e.add(this.w);
    this.e.addSeparator();
    this.x = new c(this, "Settings");
    this.x.setMnemonic(83);
    this.x.addActionListener(this);
    this.e.add(this.x);
    this.f = new b(this, "Help");
    this.f.setMnemonic(72);
    add(this.f);
    this.y = new c(this, "Product home");
    this.y.setMnemonic(72);
    this.y.addActionListener(this);
    this.f.add(this.y);
    this.z = new c(this, "Send feedback");
    this.z.setActionCommand("feedback");
    this.z.setMnemonic(70);
    this.z.addActionListener(this);
    this.f.add(this.z);
    this.f.addSeparator();
    this.A = new c(this, "About this software");
    this.A.setMnemonic(65);
    this.A.addActionListener(this);
    this.f.add(this.A);
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent) {
    l l;
    String str;
    if (paramActionEvent.getActionCommand().compareTo("Exit") == 0) {
      this.b.l();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Start Virtual") == 0) {
      this.b.e(0);
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Start Practice") == 0) {
      this.b.e(f.b);
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Document View") == 0) {
      System.out.println("Doc view");
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Full screen") == 0) {
      this.b.m();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Calculator") == 0)
      try {
        Runtime.getRuntime().exec(String.valueOf(System.getenv("windir")) + "/system32/calc.exe");
        return;
      } catch (IOException iOException) {
        JOptionPane.showMessageDialog((Component)this.b, "Unable to find Calculator at " + System.getenv("windir") + "/system32/calc.exe", "Calculator", 0);
        return;
      }  
    if (paramActionEvent.getActionCommand().compareTo("Notepad") == 0)
      try {
        Runtime.getRuntime().exec(String.valueOf(System.getenv("windir")) + "/system32/notepad");
        return;
      } catch (IOException iOException) {
        JOptionPane.showMessageDialog((Component)this.b, "Unable to find Notepad at " + System.getenv("windir") + "/system32/notepad", "Notepad", 0);
        return;
      }  
    if (paramActionEvent.getActionCommand().compareTo("Settings") == 0) {
      this.b.n();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Next") == 0) {
      this.b.k().g();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("Previous") == 0) {
      this.b.k().h();
      return;
    } 
    if (paramActionEvent.getActionCommand().compareTo("First") == 0) {
      (l = this.b.k()).a(0);
      return;
    } 
    if (l.getActionCommand().compareTo("Last") == 0) {
      this.b.k().i();
      return;
    } 
    if (l.getActionCommand().compareTo("Review marked") == 0) {
      this.b.k().c();
      return;
    } 
    if (l.getActionCommand().compareTo("Jump to") == 0) {
      this.b.p();
      return;
    } 
    if (l.getActionCommand().compareTo("Finish") == 0) {
      this.b.v();
      return;
    } 
    if (l.getActionCommand().compareTo("Product home") == 0)
      try {
        Desktop.getDesktop().browse(URI.create(TrainingTool.c));
        return;
      } catch (Exception exception) {
        JOptionPane.showMessageDialog(this, "Unable to open browser", "Default browser unavailable", 0);
        return;
      }  
    if (l.getActionCommand().compareTo("feedback") == 0)
      try {
        if ((str = TrainingTool.d).indexOf("mailto") != -1) {
          Desktop.getDesktop().mail(URI.create(str));
          return;
        } 
        Desktop.getDesktop().browse(URI.create(str));
        return;
      } catch (Exception exception) {
        JOptionPane.showMessageDialog(this, "Unable to open browser", "Default browser unavailable", 0);
        return;
      }  
    if (str.getActionCommand().compareTo("About this software") == 0)
      this.b.o(); 
    if (str.getActionCommand().compareTo("Log In/Out") == 0)
      this.b.a(); 
    if (str.getActionCommand().compareTo("Select Exam") == 0)
      this.b.b(); 
  }
  
  public final void a(int paramInt) {
    if (paramInt == 0) {
      if (this.b.j() != null) {
        this.g.setEnabled(true);
      } else {
        this.g.setEnabled(false);
      } 
      if (this.b.j() != null) {
        this.h.setEnabled(true);
      } else {
        this.h.setEnabled(false);
      } 
      this.i.setEnabled(false);
      this.j.setEnabled(true);
      this.k.setEnabled(true);
      this.l.setEnabled(true);
      this.m.setEnabled(true);
      this.n.setEnabled(true);
      this.o.setEnabled(false);
      this.p.setEnabled(false);
      this.q.setEnabled(false);
      this.r.setEnabled(false);
      this.s.setEnabled(false);
      this.t.setEnabled(false);
      this.u.setEnabled(true);
      this.v.setEnabled(true);
      this.w.setEnabled(true);
      this.x.setEnabled(true);
      this.y.setEnabled(true);
      this.z.setEnabled(true);
      this.A.setEnabled(true);
      return;
    } 
    if (paramInt == TrainingTool.g) {
      this.g.setEnabled(false);
      this.h.setEnabled(false);
      this.i.setEnabled(true);
      this.j.setEnabled(false);
      this.k.setEnabled(true);
      this.l.setEnabled(false);
      this.m.setEnabled(false);
      this.n.setEnabled(true);
      this.o.setEnabled(true);
      this.p.setEnabled(true);
      this.q.setEnabled(true);
      this.r.setEnabled(true);
      this.s.setEnabled(true);
      this.t.setEnabled(true);
      this.u.setEnabled(true);
      this.v.setEnabled(true);
      this.w.setEnabled(true);
      this.x.setEnabled(false);
      this.y.setEnabled(true);
      this.z.setEnabled(true);
      this.A.setEnabled(true);
      return;
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */