package com.certification.ttv3.d;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

final class d extends JPanel {
  public d(b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Font font = new Font("SansSerif", 1, 12);
    setLayout(new BoxLayout(this, 0));
    setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(218, 222, 226), 1), BorderFactory.createEmptyBorder(7, 12, 7, 12)));
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
    float f = paramInt3 / (paramInt3 + paramInt4) * 100.0F;
    (jLabel = new JLabel(String.valueOf(Integer.toString((int)f)) + "% correct")).setFont(font);
    add(jLabel);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */