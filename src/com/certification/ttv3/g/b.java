package com.certification.ttv3.g;

import a.a.a.a;
import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.a.p;
import com.certification.ttv3.e.i;
import com.certification.ttv3.e.k;
import com.certification.ttv3.e.m;
import com.certification.ttv3.e.s;
import com.certification.ttv3.e.w;
import com.certification.ttv3.e.y;
import com.certification.ttv3.f.d;
import java.awt.Color;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JEditorPane;
import javax.swing.JPanel;

public final class b {
  private y a;
  
  private TrainingTool b;
  
  private String c;
  
  public b(TrainingTool paramTrainingTool) {
    this.b = paramTrainingTool;
    this.c = this.b.r().getProperty(p.k);
  }
  
  public final void a(JPanel paramJPanel, y paramy) {
    this.a = paramy;
    paramJPanel.setLayout((LayoutManager)new a());
    paramJPanel.setBackground(Color.WHITE);
    paramJPanel.setOpaque(false);
    if (this.a != null) {
      ArrayList arrayList = this.a.c();
      b b1;
      String str = (b1 = this).a(arrayList);
      str = "<table border=\"0\" width=\"100%\"><tr><td style=\"font-family:" + b1.c + "\"><p style=\"font-size:16px;font-weight:bold;\">Topic " + (b1.b.j().b(b1.b.j().a(b1.a.a())) + 1) + ", " + b1.a.b() + "</p>" + str + "</td></tr></table>";
      JEditorPane jEditorPane;
      (jEditorPane = new JEditorPane("text/html", str)).setEditable(false);
      jEditorPane.setFocusable(false);
      jEditorPane.setOpaque(false);
      jEditorPane.setCaretPosition(0);
      paramJPanel.add("hfill", jEditorPane);
    } 
  }
  
  private String a(ArrayList paramArrayList) {
    String str = "";
    Iterator<d> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      d d;
      if (d = iterator.next() instanceof s) {
        s s = (s)d;
        str = String.valueOf(str) + "<p>";
        str = String.valueOf(str) + a((ArrayList)s);
        str = String.valueOf(str) + "</p>";
      } 
      if (d instanceof w) {
        w w = (w)d;
        str = String.valueOf(str) + w.b();
      } 
      if (d instanceof i) {
        i i = (i)d;
        str = String.valueOf(str) + "<img src=\"" + this.b.a(i) + "\" />";
      } 
      if (d instanceof k) {
        k k = (k)d;
        str = String.valueOf(str) + "<ul>";
        for (m m : k.a()) {
          str = String.valueOf(str) + "<li>";
          str = String.valueOf(str) + a(m.a());
          str = String.valueOf(str) + "</li>";
        } 
        str = String.valueOf(str) + "</ul>";
      } 
    } 
    return str;
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */