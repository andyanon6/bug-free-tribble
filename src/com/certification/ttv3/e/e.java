package com.certification.ttv3.e;

import com.certification.ttv3.f.d;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import org.xml.sax.helpers.DefaultHandler;

public final class e implements d {
  public static String a = "exam";
  
  protected String b = "";
  
  protected String c = "";
  
  protected String d = "";
  
  protected String e = "";
  
  protected Long f;
  
  protected UUID g;
  
  protected ArrayList h = new ArrayList();
  
  private ArrayList i = new ArrayList();
  
  public final boolean a(u paramu) {
    for (byte b = 0; b < this.h.size(); b++) {
      if (((u)this.h.get(b)).a().compareTo(paramu.a()) == 0) {
        paramu.a(b);
        this.h.set(b, paramu);
        return true;
      } 
    } 
    paramu.a(this.h.size());
    this.h.add(paramu);
    return false;
  }
  
  public final boolean a(y paramy) {
    for (byte b = 0; b < this.i.size(); b++) {
      if (((y)this.i.get(b)).a().compareTo(paramy.a()) == 0) {
        y y1 = this.i.get(b);
        Iterator<u> iterator = this.h.iterator();
        while (iterator.hasNext()) {
          u u;
          if ((u = iterator.next()).b() == y1)
            u.a(paramy); 
        } 
        this.i.set(b, paramy);
        return true;
      } 
    } 
    this.i.add(paramy);
    return false;
  }
  
  public final ArrayList a() {
    return this.i;
  }
  
  public final int b() {
    return this.i.size();
  }
  
  public final y a(int paramInt) {
    return (paramInt >= this.i.size()) ? null : this.i.get(paramInt);
  }
  
  public final y a(UUID paramUUID) {
    Iterator<y> iterator = this.i.iterator();
    while (iterator.hasNext()) {
      y y;
      if ((y = iterator.next()).a().compareTo(paramUUID) == 0)
        return y; 
    } 
    return null;
  }
  
  public final int b(y paramy) {
    return this.i.indexOf(paramy);
  }
  
  public final u b(UUID paramUUID) {
    Iterator<u> iterator = this.h.iterator();
    while (iterator.hasNext()) {
      u u;
      if ((u = iterator.next()).a().compareTo(paramUUID) == 0)
        return u; 
    } 
    return null;
  }
  
  public final u b(int paramInt) {
    return this.h.get(paramInt);
  }
  
  public final int c() {
    return this.h.size();
  }
  
  public final int c(y paramy) {
    byte b = 0;
    e e1;
    Iterator<u> iterator = (e1 = this).h.iterator();
    while (iterator.hasNext()) {
      u u;
      if ((u = iterator.next()).b() == paramy)
        b++; 
    } 
    return b;
  }
  
  public final String d() {
    return this.b;
  }
  
  public final void a(String paramString) {
    this.b = paramString;
  }
  
  public final String e() {
    return this.e;
  }
  
  public final void b(String paramString) {
    this.e = paramString;
  }
  
  public final String f() {
    return this.c;
  }
  
  public final void c(String paramString) {
    this.c = paramString;
  }
  
  public final String g() {
    return this.d;
  }
  
  public final void d(String paramString) {
    this.d = paramString;
  }
  
  public final ArrayList h() {
    return this.h;
  }
  
  public final boolean i() {
    Iterator<u> iterator = this.h.iterator();
    while (iterator.hasNext()) {
      u u;
      if ((u = iterator.next()).f())
        return true; 
    } 
    return false;
  }
  
  public final void a(OutputStream paramOutputStream) {
    if (this.f == null)
      this.f = Long.valueOf(0L); 
    e e1;
    if ((e1 = this).g == null)
      e1.g = UUID.randomUUID(); 
    paramOutputStream.write(("<" + a + " nExamId=\"" + e1.g + "\" code=\"" + w.b(this.b) + "\" vendor=\"" + w.b(this.e) + "\" description=\"" + w.b(this.c) + "\" version=\"" + w.b(this.d) + "\" utime=\"" + Long.toString(this.f.longValue()) + "\">").getBytes("UTF-8"));
    Iterator<y> iterator = this.i.iterator();
    while (iterator.hasNext()) {
      y y;
      (y = iterator.next()).a(paramOutputStream);
    } 
    iterator = this.h.iterator();
    while (iterator.hasNext()) {
      u u;
      (u = (u)iterator.next()).a(paramOutputStream);
    } 
    paramOutputStream.write(("</" + a + ">").getBytes("UTF-8"));
  }
  
  public final DefaultHandler j() {
    return new f(this, (byte)0);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */