package com.certification.ttv3.a;

import a.a.a.a;
import com.certification.ttv3.TrainingTool;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public final class k extends JDialog implements ActionListener, KeyListener {
  private TrainingTool a;
  
  private JFormattedTextField b;
  
  private int c;
  
  private JButton d;
  
  public k(TrainingTool paramTrainingTool, int paramInt) {
    super((Frame)paramTrainingTool, "Jump to question", false);
    this.a = paramTrainingTool;
    this.c = 0;
    JPanel jPanel;
    (jPanel = new JPanel()).setBorder(new EmptyBorder(10, 20, 20, 20));
    jPanel.setBackground(Color.WHITE);
    jPanel.setLayout((LayoutManager)new a(10, 10));
    this.b = new JFormattedTextField();
    this.b.setValue(new Integer(1));
    this.b.setColumns(5);
    this.b.setToolTipText((new StringBuilder("1 - 0")).toString());
    this.b.setInputVerifier(new l(this, (byte)0));
    this.b.addKeyListener(this);
    this.d = new JButton("Go >>");
    this.d.addActionListener(this);
    jPanel.add("left", new JLabel("Question number:"));
    jPanel.add("", this.b);
    jPanel.add("br center", this.d);
    add(jPanel, "Center");
    pack();
    setLocationRelativeTo((Component)this.a);
  }
  
  public final void a(int paramInt) {
    this.b.setValue(Integer.valueOf(paramInt));
  }
  
  public final void b(int paramInt) {
    this.c = paramInt;
    this.b.setToolTipText("1 - " + this.c);
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent) {
    try {
      Integer integer;
      if ((integer = (Integer)this.b.getFormatter().stringToValue(this.b.getText())).intValue() > 0 && integer.intValue() <= this.c) {
        this.a.k().a(integer.intValue() - 1);
        this.a.w();
        setVisible(false);
        return;
      } 
    } catch (ParseException parseException) {}
  }
  
  public final void keyPressed(KeyEvent paramKeyEvent) {}
  
  public final void keyReleased(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 10)
      this.d.doClick(); 
  }
  
  public final void keyTyped(KeyEvent paramKeyEvent) {}
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */