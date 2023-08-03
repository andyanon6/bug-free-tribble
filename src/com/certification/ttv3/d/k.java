package com.certification.ttv3.d;

import a.a.a.a;
import com.certification.ttv3.e.y;
import java.awt.Font;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

final class k extends JPanel {
  public k(b paramb) {
    setLayout((LayoutManager)new a());
    setOpaque(false);
    ArrayList<y> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < paramb.c.d(); b1++) {
      y y = paramb.c.b(b1).b();
      if (arrayList.indexOf(y) == -1)
        arrayList.add(y); 
    } 
    JLabel jLabel;
    (jLabel = new JLabel("Exam Topics")).setFont(new Font("SansSerif", 1, 18));
    jLabel.setOpaque(false);
    add("left", jLabel);
    for (y y : arrayList) {
      int i = paramb.c.a(y);
      int j = paramb.c.b(y);
      int m = paramb.c.c(y);
      if (y != null) {
        add("br center", new c(paramb, y.b(), i, (int)(j / i * 100.0D)));
      } else {
        add("br center", new c(paramb, "Unknown", i, (int)(j / i * 100.0D)));
      } 
      add("br center", new d(paramb, m, i - m, j, i - j));
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */