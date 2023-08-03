package com.certification.ttv3.d;

import a.a.a.a;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JPanel;

final class f extends JPanel {
  public f(b paramb) {
    int i = paramb.c.d();
    int j = paramb.c.e();
    int k = paramb.c.f();
    setLayout((LayoutManager)new a());
    setBackground(Color.WHITE);
    add("center", new e(paramb, (int)(j / i * 100.0F)));
    add("br center", new g(paramb, k, i - k, j, i - j));
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */