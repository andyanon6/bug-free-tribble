package com.certification.ttv3.a;

import a.a.a.a;
import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.c.a;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public final class b extends JDialog implements ActionListener {
  TrainingTool a;
  
  JProgressBar b;
  
  private Thread e;
  
  boolean c = false;
  
  File d;
  
  public b(TrainingTool paramTrainingTool, a parama) {
    super((Frame)paramTrainingTool, "Downloading update...");
    this.a = paramTrainingTool;
    this.e = new Thread(new c(this, (byte)0));
    setLayout((LayoutManager)new a());
    JLabel jLabel = new JLabel("You may continue while the update is being downloaded");
    add("center", jLabel);
    this.b = new JProgressBar(0, 1000);
    this.b.setStringPainted(true);
    add("br hfill", this.b);
    JButton jButton;
    (jButton = new JButton("Cancel")).addActionListener(this);
    add("br center", jButton);
    setSize(new Dimension(400, 120));
    setLocationRelativeTo((Component)this.a);
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getActionCommand().compareTo("Cancel") == 0)
      this.c = true; 
  }
  
  public final void setVisible(boolean paramBoolean) {
    if (paramBoolean)
      this.e.start(); 
    super.setVisible(paramBoolean);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */