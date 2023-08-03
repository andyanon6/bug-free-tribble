package com.certification.ttv3.a;

import a.a.a.a;
import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.f.e;
import com.certification.ttv3.f.h;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import java.util.prefs.Preferences;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumn;

public final class d extends JDialog implements ActionListener, ListSelectionListener {
  TrainingTool a;
  
  Image b;
  
  private ImageIcon k;
  
  private ImageIcon l;
  
  JButton c;
  
  JButton d;
  
  JLabel e;
  
  JLabel f;
  
  Color g;
  
  JScrollPane h;
  
  j i;
  
  JTable j;
  
  private JPanel m;
  
  private Font n;
  
  public d(TrainingTool paramTrainingTool) {
    super((Frame)paramTrainingTool, true);
    this.a = paramTrainingTool;
    setTitle(String.valueOf(TrainingTool.a) + " Exam Manager");
    Toolkit toolkit = getToolkit();
    this.b = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/history-icon.png"));
    this.k = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/em_select.png")));
    this.l = new ImageIcon(toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/em_cancel.png")));
    setBackground(Color.WHITE);
    this.n = new Font("Arial", 0, 12);
    this.e = new JLabel("Exam Manager");
    this.e.setFont(new Font("Arial", 0, 24));
    this.e.setForeground(new Color(4, 50, 96));
    this.f = new JLabel("Select and monitor licensed exams");
    this.f.setFont(new Font("Arial", 0, 11));
    this.f.setForeground(new Color(132, 135, 140));
    this.c = new JButton(this.k);
    this.c.setBorderPainted(false);
    this.c.setMargin(new Insets(0, 0, 0, 0));
    this.c.setOpaque(false);
    this.c.setContentAreaFilled(false);
    this.c.setActionCommand("Select Exam");
    this.c.setCursor(new Cursor(12));
    this.c.addActionListener(this);
    this.c.setFocusable(false);
    this.c.setEnabled(false);
    this.d = new JButton(this.l);
    this.d.setBorderPainted(false);
    this.d.setMargin(new Insets(0, 0, 0, 0));
    this.d.setOpaque(false);
    this.d.setContentAreaFilled(false);
    this.d.setActionCommand("Cancel");
    this.d.setCursor(new Cursor(12));
    this.d.addActionListener(this);
    this.d.setFocusable(false);
    h h;
    (h = new h(this)).add(this.e);
    h.add(this.f);
    h.add(this.c);
    h.add(this.d);
    this.g = new Color(221, 221, 221);
    this.m = new JPanel();
    this.m.setLayout((LayoutManager)new a());
    JLabel jLabel;
    (jLabel = new JLabel("No Exams Available")).setFont(new Font("Arial", 0, 18));
    jLabel.setHorizontalTextPosition(0);
    this.m.add("br hfill center", jLabel);
    this.m.setBackground(Color.WHITE);
    d d1;
    (d1 = this).i = new j(d1);
    e e;
    (e = new e(d1.i)).setSelectionMode(0);
    e.getSelectionModel().addListSelectionListener(d1);
    e.setCellSelectionEnabled(false);
    e.setRowSelectionAllowed(true);
    e.setBackground(Color.WHITE);
    e.setOpaque(false);
    e.setFont(d1.n);
    e.setFocusable(false);
    e.setRowHeight(24);
    e.setIntercellSpacing(new Dimension(10, 1));
    TableColumn tableColumn;
    (tableColumn = e.getColumnModel().getColumn(0)).setPreferredWidth(120);
    (tableColumn = e.getColumnModel().getColumn(1)).setPreferredWidth(80);
    (tableColumn = e.getColumnModel().getColumn(2)).setPreferredWidth(80);
    (tableColumn = e.getColumnModel().getColumn(3)).setPreferredWidth(120);
    (tableColumn = e.getColumnModel().getColumn(4)).setPreferredWidth(160);
    tableColumn.setCellRenderer(new i(d1));
    e e1 = new e(d1, "Download Exam");
    this.j = (JTable)e;
    this.h = new JScrollPane(20, 31);
    this.h.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10), BorderFactory.createLineBorder(this.g)));
    this.h.setBackground(Color.WHITE);
    this.h.getViewport().setBackground(Color.WHITE);
    if (this.i.getRowCount() > 0) {
      this.h.getViewport().setView(this.j);
    } else {
      this.h.getViewport().setView(this.m);
    } 
    h.add(this.h);
    add(h);
    setSize(new Dimension(600, 370));
    setResizable(false);
    setLocationRelativeTo((Component)null);
  }
  
  public final void a() {
    this.i.a();
    if (this.i.getRowCount() > 0) {
      this.h.getViewport().setView(this.j);
      return;
    } 
    this.h.getViewport().setView(this.m);
  }
  
  public final void b() {
    j j1 = this.i;
    byte b = 0;
    if (j1.a.size() > 4) {
      for (Integer integer : j1.a) {
        if (j1.d.a.b(integer.intValue()) == 1) {
          String str;
          Properties properties = h.a(str = h.a(integer.intValue()));
          System.out.println("auto-download:");
          System.out.println(properties);
          j1.a(integer.intValue());
          j1.d.i.fireTableCellUpdated(b, 5);
        } 
        b++;
      } 
      return;
    } 
    for (Integer integer : j1.a) {
      if (j1.d.a.b(integer.intValue()) == 0) {
        JProgressBar jProgressBar;
        (jProgressBar = new JProgressBar(0, 100)).setString("Downloading...");
        jProgressBar.setStringPainted(true);
        j1.b.put(integer, jProgressBar);
        String str1;
        Properties properties = h.a(str1 = h.a(integer.intValue()));
        Preferences preferences;
        String str2 = (preferences = (preferences = TrainingTool.q()).node("license" + integer)).get("file", "");
        File file = j1.d.a.a(str2);
        long l = 0L;
        try {
          l = Long.parseLong(properties.getProperty("filesize"));
        } catch (Exception exception) {}
        f f = new f(j1.d, integer.intValue(), l, file, jProgressBar);
        j1.c.put(integer, f);
        Thread thread;
        (thread = new Thread(f)).start();
        j1.d.i.fireTableCellUpdated(b, 5);
      } 
      b++;
    } 
  }
  
  public final void a(int paramInt) {
    this.i.a(paramInt);
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getActionCommand().compareTo("Cancel") == 0)
      setVisible(false); 
    if (paramActionEvent.getActionCommand().compareTo("Select Exam") == 0)
      c(); 
    try {
      int i = Integer.valueOf(paramActionEvent.getActionCommand()).intValue();
      int k = ((Integer)this.i.a.get(i)).intValue();
      int m;
      if ((m = this.a.b(k)) == 0) {
        a(k);
        this.i.fireTableCellUpdated(i, 5);
        return;
      } 
    } catch (Exception exception) {}
  }
  
  private void c() {
    try {
      this.a.a(((Integer)this.i.a.get(this.j.getSelectionModel().getLeadSelectionIndex())).intValue());
      setVisible(false);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    this.i.b();
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */