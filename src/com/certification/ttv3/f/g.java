package com.certification.ttv3.f;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public final class g extends JButton implements ActionListener {
  private String a;
  
  public g(Icon paramIcon) {
    super(paramIcon);
    addActionListener(this);
  }
  
  public final void a(String paramString) {
    this.a = paramString;
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent) {
    g g1 = this;
    try {
      if (g1.a.indexOf("mailto") != -1) {
        Desktop.getDesktop().mail(URI.create(g1.a));
        return;
      } 
      Desktop.getDesktop().browse(URI.create(g1.a));
      return;
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(g1, "Unable to open browser", "Default browser unavailable", 0);
      return;
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */