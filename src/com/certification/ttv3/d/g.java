package com.certification.ttv3.d;

import com.certification.ttv3.a.p;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

final class g extends JPanel {
  public g(b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i;
    Font font = new Font("SansSerif", 1, 14);
    setLayout(new BoxLayout(this, 0));
    setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(218, 222, 226), 1), BorderFactory.createEmptyBorder(7, 20, 7, 20)));
    setBackground(new Color(251, 252, 253));
    JLabel jLabel;
    (jLabel = new JLabel("Answered: ")).setFont(font);
    add(jLabel);
    (jLabel = new JLabel(Integer.toString(paramInt1))).setFont(font);
    add(jLabel);
    add(Box.createHorizontalStrut(30));
    (jLabel = new JLabel("Unanswered: ")).setFont(font);
    add(jLabel);
    (jLabel = new JLabel(Integer.toString(paramInt2))).setFont(font);
    add(jLabel);
    add(Box.createHorizontalStrut(30));
    (jLabel = new JLabel("Correct: ")).setFont(font);
    add(jLabel);
    (jLabel = new JLabel(Integer.toString(paramInt3))).setFont(font);
    add(jLabel);
    add(Box.createHorizontalStrut(30));
    (jLabel = new JLabel("Incorrect: ")).setFont(font);
    add(jLabel);
    (jLabel = new JLabel(Integer.toString(paramInt4))).setFont(font);
    add(jLabel);
    add(Box.createHorizontalStrut(30));
    paramInt1 = (int)(paramInt3 / (paramInt3 + paramInt4) * 100.0F);
    if (paramb.c.g() == 0) {
      i = Integer.parseInt(paramb.a.r().getProperty(p.b));
    } else {
      i = Integer.parseInt(i.a.r().getProperty(p.e));
    } 
    if (paramInt1 >= i) {
      jLabel = new h(this, "YOU PASSED! " + paramInt1 + "%  ", new Color(5, 177, 36));
    } else {
      jLabel = new h(this, "YOU FAILED " + paramInt1 + "%  ", new Color(190, 12, 12));
    } 
    jLabel.setFont(font);
    add(jLabel);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */