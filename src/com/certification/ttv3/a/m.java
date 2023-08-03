package com.certification.ttv3.a;

import a.a.a.a;
import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.f.h;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public final class m extends JDialog implements ActionListener {
  JTextField a;
  
  JPasswordField b;
  
  private JPanel h;
  
  JProgressBar c;
  
  JButton d;
  
  JButton e;
  
  private JPanel i;
  
  private JPanel j;
  
  TrainingTool f;
  
  public static String g = "http://www." + TrainingTool.b + "/auth/licensev3.php";
  
  static {
    (new StringBuilder("http://www.")).append(TrainingTool.b).append("/auth/license.php");
    (new StringBuilder("http://www.")).append(TrainingTool.b).append("/auth/licenseupdatev3.php");
  }
  
  public m(TrainingTool paramTrainingTool) {
    super((Frame)paramTrainingTool, true);
    this.f = paramTrainingTool;
    setTitle(String.valueOf(TrainingTool.a) + " Questions and Answers Login");
    Toolkit toolkit = getToolkit();
    URL uRL1 = getClass().getResource("/com/certification/ttv3/images/icon-16px.png");
    setIconImage(toolkit.getImage(uRL1));
    setLayout(new BorderLayout());
    m m1 = this;
    JPanel jPanel = new JPanel();
    URL uRL2 = m1.getClass().getResource("/com/certification/ttv3/images/activation.png");
    jPanel.add(new JLabel(new ImageIcon(uRL2)), "Center");
    jPanel.setBorder(new EmptyBorder(8, 8, 8, 8));
    add(jPanel, "West");
    if (this.i == null) {
      m1 = this;
      (jPanel = new JPanel()).setLayout((LayoutManager)new a());
      JLabel jLabel = new JLabel("By logging in, you are licensing this");
      jPanel.add("left", jLabel);
      jLabel = new JLabel("product to be used on this computer by the");
      jPanel.add("br left", jLabel);
      jLabel = new JLabel("licensed user only.");
      jPanel.add("br left", jLabel);
      jLabel = new JLabel("");
      jPanel.add("br left", jLabel);
      jLabel = new JLabel("");
      jPanel.add("br left", jLabel);
      jLabel = new JLabel("User email:");
      jPanel.add("br left", jLabel);
      m1.a = new JTextField(30);
      jPanel.add("br left", m1.a);
      jLabel = new JLabel("Password:");
      jPanel.add("br left", jLabel);
      m1.b = new JPasswordField(30);
      jPanel.add("br left", m1.b);
      jPanel.setBorder(new EmptyBorder(8, 8, 8, 8));
      this.i = jPanel;
    } 
    add(this.i, "Center");
    m1 = this;
    (jPanel = new JPanel()).setLayout((LayoutManager)new a());
    m1.c = new JProgressBar();
    m1.c.setPreferredSize(new Dimension(550, 25));
    m1.c.setMinimum(0);
    m1.c.setMaximum(100);
    m1.c.setBorder(new LineBorder(new Color(160, 160, 160), 1));
    m1.c.setString("");
    m1.c.setStringPainted(true);
    m1.h = new JPanel();
    m1.h.setPreferredSize(new Dimension(550, 25));
    m1.h.add(m1.c);
    jPanel.add("hfill", m1.h);
    m1.d = new JButton("Log In");
    m1.d.setMargin(new Insets(2, 20, 2, 20));
    m1.d.addActionListener(m1);
    jPanel.add("right", m1.d);
    m1.e = new JButton("Cancel");
    m1.e.setMargin(new Insets(2, 20, 2, 20));
    m1.e.addActionListener(m1);
    jPanel.add("right", m1.e);
    jPanel.setBorder(new EmptyBorder(8, 8, 8, 8));
    this.j = jPanel;
    add(this.j, "South");
    setSize(new Dimension(600, 370));
    setResizable(false);
    setLocationRelativeTo((Component)null);
  }
  
  public final void a() {
    this.b.setText("");
    setVisible(true);
    this.d.setEnabled(true);
    this.e.setEnabled(true);
    this.a.setFocusable(true);
    this.b.setFocusable(true);
    this.c.setValue(0);
    this.c.setString("");
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getActionCommand().compareTo("Cancel") == 0)
      setVisible(false); 
    if (paramActionEvent.getActionCommand().compareTo("Log In") == 0) {
      if (this.a.getText().length() == 0) {
        JOptionPane.showMessageDialog(this, "Please enter the email address used in your " + TrainingTool.a + " member area");
        this.a.requestFocus();
        return;
      } 
      if ((this.b.getPassword()).length == 0) {
        JOptionPane.showMessageDialog(this, "Please enter the password used in your " + TrainingTool.a + " member area");
        this.b.requestFocus();
        return;
      } 
      this.d.setEnabled(false);
      this.e.setEnabled(false);
      this.a.setFocusable(false);
      this.b.setFocusable(false);
      n n = new n(this, this.a.getText(), h.a(this.b.getPassword()), this.c);
      Thread thread;
      (thread = new Thread(n)).start();
      return;
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */