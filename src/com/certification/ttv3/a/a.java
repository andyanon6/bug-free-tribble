package com.certification.ttv3.a;

import com.certification.ttv3.TrainingTool;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class a extends JDialog implements ActionListener {
  public a(TrainingTool paramTrainingTool) {
    super((Frame)paramTrainingTool, "About " + TrainingTool.a + " Testing Engine", true);
    Font font = new Font("SansSerif", 1, 14);
    setLayout(new BorderLayout());
    URL uRL2 = getClass().getResource("/com/certification/ttv3/images/header-left.png");
    ImageIcon imageIcon1 = new ImageIcon(uRL2);
    JPanel jPanel2;
    (jPanel2 = new JPanel()).setLayout((LayoutManager)new a.a.a.a(0, 0));
    jPanel2.add("left", new JLabel(imageIcon1));
    add(jPanel2, "North");
    (jPanel2 = new JPanel()).setLayout((LayoutManager)new a.a.a.a());
    JLabel jLabel;
    (jLabel = new JLabel(String.valueOf(TrainingTool.a) + " Testing Engine, Version " + TrainingTool.i + "." + TrainingTool.j + "." + TrainingTool.k)).setFont(font);
    jPanel2.add("br left tab", jLabel);
    (jLabel = new JLabel("Copyright (C) 2019, " + TrainingTool.a + ". All rights reserved.")).setFont(font);
    jPanel2.add("br left tab", jLabel);
    (jLabel = new JLabel("")).setFont(font);
    jPanel2.add("br left tab", jLabel);
    (jLabel = new JLabel("Product Information")).setFont(font);
    jPanel2.add("br left tab", jLabel);
    JPanel jPanel3;
    (jPanel3 = new JPanel()).setPreferredSize(new Dimension(560, 100));
    jPanel3.setLayout((LayoutManager)new a.a.a.a());
    jPanel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    if (paramTrainingTool.j() != null) {
      String str = (str = paramTrainingTool.j().g().toUpperCase()).replaceAll("VERSION", "");
      boolean bool = false;
      if (str.indexOf("DEMO") != -1) {
        bool = true;
        str = str.replaceAll("DEMO", "");
      } 
      str = str.trim();
      if (bool) {
        jLabel = new JLabel(String.valueOf(paramTrainingTool.j().e()) + " " + paramTrainingTool.j().d() + ", Demo Version " + str);
      } else {
        jLabel = new JLabel(String.valueOf(paramTrainingTool.j().e()) + " " + paramTrainingTool.j().d() + ", Version " + jLabel);
      } 
      jLabel.setFont(font);
      jPanel3.add("br left tab", jLabel);
      jLabel = new JLabel("<html>" + paramTrainingTool.j().f() + "</html>");
    } 
    jLabel.setFont(font);
    jPanel3.add("br left tab hfill", jLabel);
    (jLabel = new JLabel("Copyright (C) 2019, " + TrainingTool.a + ". All rights reserved.")).setFont(font);
    jPanel3.add("br left tab", jLabel);
    jPanel2.add("br left tab", jPanel3);
    (jLabel = new JLabel("<html>WARNING: This computer program is protected by international treaties and copyright law. Circumvention of any copy protection scheme may result in severe civil and criminal penalties, and will be prosecuted to the maximum extent possible under the law.</html>")).setFont(font);
    jLabel.setPreferredSize(new Dimension(520, 100));
    jPanel2.add("br left tab", jLabel);
    add(jPanel2, "Center");
    URL uRL1 = getClass().getResource("/com/certification/ttv3/images/about-ok.png");
    ImageIcon imageIcon2 = new ImageIcon(uRL1);
    JButton jButton;
    (jButton = new JButton(imageIcon2)).setBorderPainted(false);
    jButton.setMargin(new Insets(0, 0, 0, 0));
    jButton.setOpaque(false);
    jButton.setContentAreaFilled(false);
    jButton.setActionCommand("OK");
    jButton.addActionListener(this);
    JPanel jPanel1;
    (jPanel1 = new JPanel()).setLayout((LayoutManager)new a.a.a.a(0, 0));
    jPanel1.add("left", Box.createHorizontalStrut(400));
    jPanel1.add("", jButton);
    add(jPanel1, "South");
    setSize(560, 500);
    setResizable(false);
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent) {
    setVisible(false);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */