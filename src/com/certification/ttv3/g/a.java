package com.certification.ttv3.g;

import com.certification.ttv3.a.p;
import com.certification.ttv3.b.h;
import com.certification.ttv3.e.g;
import com.certification.ttv3.e.i;
import com.certification.ttv3.e.k;
import com.certification.ttv3.e.m;
import com.certification.ttv3.e.s;
import com.certification.ttv3.e.u;
import com.certification.ttv3.e.w;
import com.certification.ttv3.f.c;
import com.certification.ttv3.f.d;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public final class a implements HyperlinkListener {
  private i a;
  
  private h b;
  
  private u c;
  
  private c d;
  
  private boolean e;
  
  private boolean f;
  
  private Color g;
  
  private Color h;
  
  private String i;
  
  private String j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private boolean n;
  
  private boolean o;
  
  private boolean p;
  
  private boolean q;
  
  private boolean r;
  
  public a(c paramc, Properties paramProperties) {
    this.d = paramc;
    this.g = new Color(Integer.parseInt(paramProperties.getProperty(p.u)));
    this.h = new Color(Integer.parseInt(paramProperties.getProperty(p.v)));
    this.i = paramProperties.getProperty(p.k);
    this.j = paramProperties.getProperty(p.l);
    this.k = (paramProperties.getProperty(p.m).compareTo("Y") == 0);
    if (this.k) {
      this.l = (paramProperties.getProperty(p.n).compareTo("Y") == 0);
      this.m = (paramProperties.getProperty(p.o).compareTo("Y") == 0);
      this.n = (paramProperties.getProperty(p.p).compareTo("Y") == 0);
    } else {
      this.l = false;
      this.m = false;
      this.n = false;
    } 
    this.o = (paramProperties.getProperty(p.q).compareTo("Y") == 0);
    if (this.o) {
      this.p = (paramProperties.getProperty(p.r).compareTo("Y") == 0);
      this.q = (paramProperties.getProperty(p.s).compareTo("Y") == 0);
      this.r = (paramProperties.getProperty(p.t).compareTo("Y") == 0);
    } else {
      this.p = false;
      this.q = false;
      this.r = false;
    } 
    this.f = false;
  }
  
  public final void a(JPanel paramJPanel, h paramh, boolean paramBoolean) {
    boolean bool = false;
    boolean bool1 = paramBoolean;
    h h1 = paramh;
    JPanel jPanel = paramJPanel;
    a a1;
    (a1 = this).b = h1;
    a1.c = a1.b.a();
    a1.e = bool1;
    a1.f = false;
    jPanel.setLayout((LayoutManager)new a.a.a.a());
    a1.a = null;
    if (a1.c.d() == 5 || a1.c.d() == 3)
      a1.a = a1.c.l(); 
    boolean bool4 = a1.n;
    boolean bool3 = a1.m;
    boolean bool2 = a1.l;
    ArrayList arrayList = a1.c.j();
    a a2;
    jPanel.add("left hfill", (a2 = a1).a(arrayList, Color.BLACK, bool2, bool3, bool4));
    if (a1.c.d() == 1 || a1.c.d() == 2 || a1.c.d() == 0) {
      u u1 = a1.c;
      a2 = a1;
      com.certification.a.a.a a3;
      (a3 = new com.certification.a.a.a()).setLayout((LayoutManager)new a.a.a.a());
      bool3 = false;
      Iterator iterator = a2.b.b().iterator();
    } 
    if (a1.c.d() == 5 && a1.a != null) {
      jPanel.add("br hfill", a1.b());
      if (bool1) {
        jPanel.add("br hfill", a1.c());
        JEditorPane jEditorPane;
        g g;
        if (a1.c.e() != null && (g = a1.c.e()).b != null && (g = a1.c.e()).b.size() > 0 && a1.c.e().toString().trim().length() > 10 && (jEditorPane = a1.a(a1.c.e())) != null)
          jPanel.add("br hfill", jEditorPane); 
        if ((jEditorPane = a1.a(a1.c)) != null) {
          jPanel.add("br hfill", a1.a(a1.c));
          jEditorPane.addHyperlinkListener(a1);
        } 
        jPanel.add("br hfill", a1.b(a1.c));
      } 
    } 
    if (a1.c.d() == 3 && a1.a != null) {
      jPanel.add("br hfill", a1.d());
      if (bool1) {
        jPanel.add("br hfill", a1.e());
        JEditorPane jEditorPane;
        g g;
        if (a1.c.e() != null && (g = a1.c.e()).b != null && (g = a1.c.e()).b.size() > 0 && a1.c.e().toString().trim().length() > 10 && (jEditorPane = a1.a(a1.c.e())) != null)
          jPanel.add("br hfill", jEditorPane); 
        if ((jEditorPane = a1.a(a1.c)) != null) {
          jPanel.add("br hfill", a1.a(a1.c));
          jEditorPane.addHyperlinkListener(a1);
        } 
        jPanel.add("br hfill", a1.b(a1.c));
      } 
    } 
    if (a1.c.d() == 4) {
      a2 = a1;
      com.certification.a.a.a a3;
      (a3 = new com.certification.a.a.a()).setLayout((LayoutManager)new a.a.a.a());
      a3.setOpaque(false);
      a3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      a3.add("hfill", a2.b.j());
      jPanel.add("br hfill", (Component)a3);
      if (bool1) {
        jPanel.add("br hfill", a1.f());
        g g;
        JEditorPane jEditorPane;
        if (a1.c.e() != null && (g = a1.c.e()).b != null && (g = a1.c.e()).b.size() > 0 && a1.c.e().toString().trim().length() > 10 && (jEditorPane = a1.a(a1.c.e())) != null)
          jPanel.add("br hfill", jEditorPane); 
        if ((jEditorPane = a1.a(a1.c)) != null) {
          jPanel.add("br hfill", a1.a(a1.c));
          jEditorPane.addHyperlinkListener(a1);
        } 
        jPanel.add("br hfill", a1.b(a1.c));
      } 
    } 
  }
  
  private JEditorPane a() {
    String str1 = "Answer: ";
    byte b = 0;
    Iterator<com.certification.ttv3.e.a> iterator = this.b.b().iterator();
    while (iterator.hasNext()) {
      com.certification.ttv3.e.a a1;
      if ((a1 = iterator.next()).b())
        str1 = String.valueOf(str1) + (char)(b + 65) + ", "; 
      b++;
    } 
    if (str1.length() > 8) {
      str1 = str1.substring(0, str1.length() - 2);
    } else {
      str1 = "Answer: ?";
    } 
    String str2 = "<table width=\"100%\" style=\"border-width:0px;border-spacing:0px;border-style:none;\"><tr><td style=\"font-family:" + this.i + ";font-size:" + this.j + "px;" + (this.q ? "font-style:italic;" : "") + (this.r ? "text-decoration:underline;" : "") + (this.p ? "font-weight:bold;" : "") + "padding:0px;margin:0px;font-weight:bold;\">" + str1 + "</td></tr></table>";
    JEditorPane jEditorPane;
    (jEditorPane = new JEditorPane("text/html", str2)).addHyperlinkListener(this);
    if (!this.f) {
      jEditorPane.setEditable(false);
      jEditorPane.setFocusable(false);
    } 
    jEditorPane.setOpaque(false);
    return jEditorPane;
  }
  
  private JEditorPane a(g paramg) {
    if (paramg == null)
      return null; 
    c c1 = this.d;
    String str1;
    ArrayList arrayList;
    String str2;
    if ((str2 = (str1 = a(arrayList = (paramg = paramg).b, c1, null, false)).replaceAll("<[^\\/>][^\\/>]*><\\/[^>]+>", "").trim()).length() > 6) {
      str1 = "<table width=\"100%\" style=\"border-width:0px;border-spacing:0px;border-style:none;\"><tr><td style=\"vertical-align:middle;font-family:" + this.i + ";font-size:" + this.j + "px;" + (this.q ? "font-style:italic;" : "") + (this.r ? "text-decoration:underline;" : "") + (this.p ? "font-weight:bold;" : "") + "padding:0px;margin:0px;\"><span style=\"font-weight:bold;\">Explanation:</span> " + str1 + "</td></tr></table>";
    } else {
      return null;
    } 
    JEditorPane jEditorPane;
    (jEditorPane = new JEditorPane("text/html", str1)).addHyperlinkListener(this);
    if (!this.f) {
      jEditorPane.setEditable(false);
      jEditorPane.setFocusable(false);
    } 
    jEditorPane.setOpaque(false);
    return jEditorPane;
  }
  
  private JEditorPane a(u paramu) {
    String str = "<span style=\"font-weight:bold;\">Incorrect answers:</span><br />";
    HashMap<?, ?> hashMap;
    if ((hashMap = paramu.g()).size() == 0)
      return null; 
    for (g g2 : hashMap.keySet()) {
      ArrayList arrayList = (ArrayList)hashMap.get(g2);
      String str2 = "";
      for (Integer integer : arrayList)
        str2 = String.valueOf(str2) + (char)(integer.intValue() + 65) + ", "; 
      if (str2.length() > 2)
        str2 = str2.substring(0, str2.length() - 2); 
      g g1;
      String str1;
      if ((str1 = a((g1 = g2).b, this.d)).indexOf("<p>") == 0)
        str1 = str1.substring(3, str1.length() - 4); 
      str = String.valueOf(str) + "<p style=\"text-indent:-15px;margin-left:15px;\"><span style=\"font-weight:bold;\">" + str2 + ":</span> " + str1 + "</p>";
    } 
    str = "<table width=\"100%\" style=\"border-width:0px;border-spacing:0px;border-style:none;\"><tr><td style=\"font-family:" + this.i + ";font-size:" + this.j + "px;" + (this.q ? "font-style:italic;" : "") + (this.r ? "text-decoration:underline;" : "") + (this.p ? "font-weight:bold;" : "") + "padding:0px;margin:0px;\">" + str + "</td></tr></table>";
    JEditorPane jEditorPane;
    (jEditorPane = new JEditorPane("text/html", str)).addHyperlinkListener(this);
    if (!this.f) {
      jEditorPane.setEditable(false);
      jEditorPane.setFocusable(false);
    } 
    jEditorPane.setOpaque(false);
    return jEditorPane;
  }
  
  private JEditorPane b(u paramu) {
    c c1 = this.d;
    ArrayList arrayList;
    String str = a(arrayList = paramu.k(), c1, null, false);
    str = "<table width=\"100%\" style=\"border-width:0px;border-spacing:0px;border-style:none;\"><tr><td style=\"font-family:" + this.i + ";font-size:" + this.j + "px;" + (this.q ? "font-style:italic;" : "") + (this.r ? "text-decoration:underline;" : "") + (this.p ? "font-weight:bold;" : "") + "padding:0px;margin:0px;\">" + str + "</td></tr></table>";
    JEditorPane jEditorPane;
    (jEditorPane = new JEditorPane("text/html", str)).addHyperlinkListener(this);
    if (!this.f) {
      jEditorPane.setEditable(false);
      jEditorPane.setFocusable(false);
    } 
    jEditorPane.setOpaque(false);
    return jEditorPane;
  }
  
  private JEditorPane a(ArrayList paramArrayList, Color paramColor, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    String str1 = a(paramArrayList, this.d, this.a, this.k);
    String str2 = "#" + Integer.toHexString(paramColor.getRGB() & 0xFFFFFF);
    str1 = "<table width=\"100%\" style=\"border-width:0px;border-spacing:0px;border-style:none;\"><tr><td style=\"font-family:" + this.i + ";font-size:" + this.j + "px;color:" + str2 + ";" + (paramBoolean2 ? "font-style:italic;" : "") + (paramBoolean3 ? "text-decoration:underline;" : "") + (paramBoolean1 ? "font-weight:bold;" : "") + "padding:0px;margin:0px;\">" + str1 + "</td></tr></table>";
    JEditorPane jEditorPane;
    (jEditorPane = new JEditorPane("text/html", str1)).addHyperlinkListener(this);
    if (!this.f) {
      jEditorPane.setEditable(false);
      jEditorPane.setFocusable(false);
    } 
    jEditorPane.setCaretPosition(0);
    jEditorPane.setOpaque(false);
    return jEditorPane;
  }
  
  private static String a(ArrayList paramArrayList, c paramc) {
    return a(paramArrayList, paramc, null, false);
  }
  
  private static String a(ArrayList paramArrayList, c paramc, i parami, boolean paramBoolean) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<d> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      d d;
      if (d = iterator.next() instanceof s) {
        s s = (s)d;
        stringBuilder.append("<p>");
        stringBuilder.append(a((ArrayList)s, paramc, parami, paramBoolean));
        stringBuilder.append("</p>");
      } 
      if (d instanceof w) {
        String str;
        w w = (w)d;
        boolean bool = false;
        if (w.a().indexOf("http://") != -1 || w.a().indexOf("https://") != -1)
          bool = true; 
        if (bool) {
          str = "<a href=\"" + w.a(paramBoolean) + "\">" + w.a(paramBoolean) + "</a>";
          stringBuilder.append(str);
        } else {
          stringBuilder.append(str.a(paramBoolean));
        } 
      } 
      i i1;
      if (d instanceof i && (i1 = (i)d) != parami)
        stringBuilder.append("<img src=\"" + paramc.a(i1) + "\" />"); 
      if (d instanceof k) {
        k k = (k)d;
        stringBuilder.append("<ul>");
        for (m m : k.a()) {
          stringBuilder.append("<li>");
          stringBuilder.append(a(m.a(), paramc, parami, paramBoolean));
          stringBuilder.append("</li>");
        } 
        stringBuilder.append("</ul>");
      } 
    } 
    return stringBuilder.toString();
  }
  
  private JPanel b() {
    com.certification.a.a.a a1;
    (a1 = new com.certification.a.a.a()).setLayout((LayoutManager)new a.a.a.a());
    a1.setOpaque(false);
    try {
      ImageIcon imageIcon = new ImageIcon(this.d.a(this.a));
      a1.add((Component)this.b.a(imageIcon));
    } catch (Exception exception) {}
    return (JPanel)a1;
  }
  
  private JPanel c() {
    com.certification.a.a.a a1;
    (a1 = new com.certification.a.a.a()).setLayout((LayoutManager)new a.a.a.a());
    a1.setOpaque(false);
    a1.add(new JLabel("Answer:"));
    try {
      ImageIcon imageIcon = new ImageIcon(this.d.a(this.a));
      a1.add("br", (Component)this.b.b(imageIcon));
    } catch (Exception exception) {}
    return (JPanel)a1;
  }
  
  private JPanel d() {
    com.certification.a.a.a a1;
    (a1 = new com.certification.a.a.a()).setLayout((LayoutManager)new a.a.a.a());
    a1.setOpaque(false);
    try {
      ImageIcon imageIcon = new ImageIcon(this.d.a(this.a));
      a1.add((Component)this.b.c(imageIcon));
    } catch (Exception exception) {}
    return (JPanel)a1;
  }
  
  private JPanel e() {
    com.certification.a.a.a a1;
    (a1 = new com.certification.a.a.a()).setLayout((LayoutManager)new a.a.a.a());
    a1.setOpaque(false);
    a1.add(new JLabel("Answer:"));
    try {
      ImageIcon imageIcon = new ImageIcon(this.d.a(this.a));
      a1.add("br", (Component)this.b.d(imageIcon));
    } catch (Exception exception) {}
    return (JPanel)a1;
  }
  
  private JPanel f() {
    com.certification.a.a.a a1;
    (a1 = new com.certification.a.a.a()).setLayout((LayoutManager)new a.a.a.a());
    a1.setOpaque(false);
    a1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    for (com.certification.ttv3.e.a a2 : this.b.a().h()) {
      a1.add("br left", new JLabel("Correct Answer:"));
      ArrayList arrayList = a2.a();
      String str = "";
      Iterator<d> iterator = arrayList.iterator();
      while (iterator.hasNext()) {
        d d;
        if (d = iterator.next() instanceof w)
          str = String.valueOf(str) + ((w)d).a(); 
        if (d instanceof s)
          str = String.valueOf(str) + ((s)d).toString() + "\n"; 
      } 
      JTextArea jTextArea = new JTextArea(str);
      if (!this.f) {
        jTextArea.setFocusable(false);
        jTextArea.setEditable(false);
      } 
      a1.add("br hfill", jTextArea);
    } 
    return (JPanel)a1;
  }
  
  public final void hyperlinkUpdate(HyperlinkEvent paramHyperlinkEvent) {
    try {
      if (paramHyperlinkEvent.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
        Desktop.getDesktop().browse(paramHyperlinkEvent.getURL().toURI());
        return;
      } 
    } catch (Exception exception) {}
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */