package com.certification.ttv3.e;

import com.certification.ttv3.f.d;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import org.xml.sax.helpers.DefaultHandler;

public final class y implements d {
  public static String a = "topic";
  
  private ArrayList b = new ArrayList();
  
  private UUID c;
  
  private int d;
  
  private String e;
  
  private String f;
  
  private String g;
  
  public final UUID a() {
    if (this.c == null) {
      y y1;
      (y1 = this).c = UUID.randomUUID();
    } 
    return this.c;
  }
  
  public final String b() {
    return this.g;
  }
  
  public final void a(d paramd) {
    this.b.add(paramd);
  }
  
  public final ArrayList c() {
    return this.b;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (d d1 : this.b)
      stringBuilder.append(d1.toString()); 
    return stringBuilder.toString();
  }
  
  public final void a(OutputStream paramOutputStream) {
    paramOutputStream.write(("<" + a).getBytes("UTF-8"));
    if (a() != null)
      paramOutputStream.write((" nTopicId=\"" + a() + "\"").getBytes("UTF-8")); 
    paramOutputStream.write((" nTopicNum=\"" + this.d + "\"").getBytes("UTF-8"));
    if (this.g != null)
      paramOutputStream.write((" sDescription=\"" + w.b(this.g) + "\"").getBytes("UTF-8")); 
    if (this.e != null)
      paramOutputStream.write((" dCreate=\"" + this.e + "\"").getBytes("UTF-8")); 
    if (this.f != null)
      paramOutputStream.write((" dModify=\"" + this.f + "\"").getBytes("UTF-8")); 
    paramOutputStream.write(">".getBytes("UTF-8"));
    Iterator<d> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      d d1;
      (d1 = iterator.next()).a(paramOutputStream);
    } 
    paramOutputStream.write(("</" + a + ">").getBytes("UTF-8"));
  }
  
  public final DefaultHandler d() {
    return new z(this, (byte)0);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */