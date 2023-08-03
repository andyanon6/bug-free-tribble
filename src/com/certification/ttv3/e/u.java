package com.certification.ttv3.e;

import com.certification.ttv3.f.d;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.xml.sax.helpers.DefaultHandler;

public final class u implements d {
  public static String a = "question";
  
  public static String b = "qcontent";
  
  public static String c = "qextra";
  
  public static String d = "qerrors";
  
  public static String e = "aexplanation";
  
  public static final String[] f = new String[] { "Unknown", "Single Choice", "Multiple Choice", "Hotspot", "Correct Text", "Drag Drop", "Reorder", "Connect", "Simulation" };
  
  public static final String[] g = new String[] { "hidden", "ok", "pending" };
  
  private ArrayList h = new ArrayList();
  
  private ArrayList i = new ArrayList();
  
  private o j;
  
  private g k;
  
  private HashMap l = new HashMap<Object, Object>();
  
  private ArrayList m = new ArrayList();
  
  private ArrayList n = new ArrayList();
  
  private y o;
  
  private int p;
  
  private int q = 2;
  
  private int r = 0;
  
  private UUID s = null;
  
  private String t;
  
  private String u;
  
  public final UUID a() {
    if (this.s == null) {
      u u1;
      (u1 = this).s = UUID.randomUUID();
    } 
    return this.s;
  }
  
  public final void a(int paramInt) {
    this.p = paramInt;
  }
  
  public final void a(y paramy) {
    this.o = paramy;
  }
  
  public final y b() {
    return this.o;
  }
  
  public final int c() {
    return this.q;
  }
  
  public final int d() {
    return this.r;
  }
  
  public final void a(c paramc) {
    this.n.add(paramc);
  }
  
  public final void a(g paramg) {
    this.k = paramg;
  }
  
  public final g e() {
    return this.k;
  }
  
  public final boolean f() {
    if (this.k == null)
      return false; 
    g g1 = this.k;
    String str = "";
    for (d d1 : g1.b)
      str = String.valueOf(str) + d1.toString().trim(); 
    return (str.length() > 0);
  }
  
  public final void a(g paramg, ArrayList paramArrayList) {
    this.l.put(paramg, paramArrayList);
  }
  
  public final HashMap g() {
    return this.l;
  }
  
  public final void a(a parama) {
    this.i.add(parama);
  }
  
  public final ArrayList h() {
    return this.i;
  }
  
  public final o i() {
    if (this.j == null)
      this.j = new o(); 
    return this.j;
  }
  
  public final void a(d paramd) {
    this.h.add(paramd);
  }
  
  public final ArrayList j() {
    return this.h;
  }
  
  public final void b(d paramd) {
    this.m.add(paramd);
  }
  
  public final ArrayList k() {
    return this.m;
  }
  
  public final i l() {
    i i = null;
    u u1;
    Iterator<d> iterator = (u1 = this).h.iterator();
    while (iterator.hasNext()) {
      d d1;
      if (d1 = iterator.next() instanceof i)
        i = (i)d1; 
      if (d1 instanceof s && (d1 = d1).a() != null)
        i = d1.a(); 
    } 
    return i;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (d d1 : this.h)
      stringBuilder.append(d1.toString()); 
    return stringBuilder.toString();
  }
  
  public final void a(OutputStream paramOutputStream) {
    u u1;
    paramOutputStream.write(("<" + a + " type=\"" + f[(u1 = this).r] + "\" status=\"" + g[this.q] + "\"").getBytes("UTF-8"));
    if (a() != null)
      paramOutputStream.write((" nQuestionId=\"" + a() + "\"").getBytes("UTF-8")); 
    paramOutputStream.write((" nQuestionNum=\"" + this.p + "\"").getBytes("UTF-8"));
    if (this.t != null)
      paramOutputStream.write((" dCreate=\"" + this.t + "\"").getBytes("UTF-8")); 
    if (this.u != null)
      paramOutputStream.write((" dModify=\"" + this.u + "\"").getBytes("UTF-8")); 
    if (this.o != null)
      paramOutputStream.write((" nTopicId=\"" + this.o.a() + "\"").getBytes("UTF-8")); 
    paramOutputStream.write(">".getBytes("UTF-8"));
    paramOutputStream.write(("<" + b + ">").getBytes("UTF-8"));
    Iterator<d> iterator = this.h.iterator();
    while (iterator.hasNext()) {
      d d1;
      (d1 = iterator.next()).a(paramOutputStream);
    } 
    paramOutputStream.write(("</" + b + ">").getBytes("UTF-8"));
    iterator = this.i.iterator();
    while (iterator.hasNext()) {
      a a;
      (a = (a)iterator.next()).a(paramOutputStream);
    } 
    if (this.j != null)
      this.j.a(paramOutputStream); 
    if (this.k != null)
      this.k.a(paramOutputStream); 
    StringBuilder stringBuilder = new StringBuilder();
    for (g g1 : this.l.keySet()) {
      ArrayList<?> arrayList;
      for (Integer integer : arrayList = (ArrayList)this.l.get(g1))
        stringBuilder.append(integer + ","); 
      paramOutputStream.write(("<" + e + " answers=\"" + stringBuilder.substring(0, stringBuilder.length() - 1) + "\">").getBytes("UTF-8"));
      g1.a(paramOutputStream);
      paramOutputStream.write(("</" + e + ">").getBytes("UTF-8"));
      stringBuilder.delete(0, stringBuilder.length());
    } 
    if (this.m.size() > 0) {
      paramOutputStream.write(("<" + c + ">").getBytes("UTF-8"));
      Iterator<d> iterator1 = this.m.iterator();
      while (iterator1.hasNext()) {
        d d1;
        (d1 = iterator1.next()).a(paramOutputStream);
      } 
      paramOutputStream.write(("</" + c + ">").getBytes("UTF-8"));
    } 
    if (this.n.size() > 0) {
      paramOutputStream.write(("<" + d + ">").getBytes("UTF-8"));
      Iterator<c> iterator1 = this.n.iterator();
      while (iterator1.hasNext()) {
        c c;
        (c = iterator1.next()).a(paramOutputStream);
      } 
      paramOutputStream.write(("</" + d + ">").getBytes("UTF-8"));
    } 
    paramOutputStream.write(("</" + a + ">").getBytes("UTF-8"));
  }
  
  public final DefaultHandler m() {
    return new v(this, (byte)0);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */