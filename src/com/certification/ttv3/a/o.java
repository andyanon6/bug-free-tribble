package com.certification.ttv3.a;

import a.a.a.a;
import com.certification.ttv3.TrainingTool;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public final class o extends JDialog implements KeyListener {
  private TrainingTool a;
  
  private JTextArea b;
  
  private static int c = 10000;
  
  public o(TrainingTool paramTrainingTool) {
    super((Frame)paramTrainingTool, "Notes", false);
    this.a = paramTrainingTool;
    setLayout((LayoutManager)new a());
    setBackground(Color.WHITE);
    this.b = new JTextArea();
    this.b.setWrapStyleWord(true);
    this.b.setLineWrap(true);
    this.b.addKeyListener(this);
    add("hfill vfill", new JScrollPane(this.b));
    addKeyListener(this);
    setSize(new Dimension(400, 300));
    setLocationRelativeTo((Component)this.a);
  }
  
  public final String a() {
    return this.b.getText();
  }
  
  public final void a(String paramString) {
    if (paramString.length() > c) {
      JOptionPane.showMessageDialog(this, "Character limit exceeded, text will be truncated to " + c + " characters.", "Max character count", 1);
      paramString.substring(0, c);
    } 
    this.b.setText(paramString);
  }
  
  public final void keyPressed(KeyEvent paramKeyEvent) {}
  
  public final void keyReleased(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 27)
      setVisible(false); 
    o o1;
    if ((o1 = this).b.getText().length() > c) {
      JOptionPane.showMessageDialog(this, "Character limit exceeded, text will be truncated to " + c + " characters.", "Max character count", 1);
      a((o1 = this).b.getText().substring(0, c));
    } 
  }
  
  public final void keyTyped(KeyEvent paramKeyEvent) {}
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */