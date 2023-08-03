package com.certification.ttv3.d;

import a.a.a.a;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JPanel;

final class c extends JPanel {
  public c(b paramb, String paramString, int paramInt1, int paramInt2) {
    Font font1 = new Font("SansSerif", 1, 16);
    Font font2 = new Font("SansSerif", 1, 14);
    setLayout((LayoutManager)new a());
    setPreferredSize(new Dimension(700, 70));
    setOpaque(false);
    JLabel jLabel1;
    (jLabel1 = new JLabel(paramString)).setOpaque(false);
    jLabel1.setFont(font1);
    add("left", jLabel1);
    JLabel jLabel2 = new JLabel();
    if (paramInt1 > 1) {
      jLabel2.setText("(" + paramInt1 + " Questions)");
    } else {
      jLabel2.setText("(" + paramInt1 + " Question)");
    } 
    jLabel2.setOpaque(false);
    jLabel2.setFont(font2);
    add("left", jLabel2);
    int i;
    if ((i = (jLabel1.getPreferredSize()).width + (jLabel2.getPreferredSize()).width) > (getPreferredSize()).width)
      setPreferredSize(new Dimension(i + 20, (getPreferredSize()).height)); 
    add("br center", new e(paramb, paramInt2));
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */