package com.certification.ttv3.e;

import com.certification.ttv3.f.d;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.xml.sax.helpers.DefaultHandler;

public final class o implements d {
  public static String a = "map";
  
  public static String b = "m";
  
  public static String c = "c";
  
  private ArrayList d = new ArrayList();
  
  private ArrayList e = new ArrayList();
  
  public final ArrayList a() {
    return this.d;
  }
  
  public final boolean a(int[] paramArrayOfint) {
    boolean bool = true;
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      if (b >= this.e.size() && paramArrayOfint[b] >= 0) {
        bool = false;
      } else {
        Iterator<p> iterator = this.e.iterator();
        while (iterator.hasNext()) {
          p p1;
          p p2;
          if ((p2 = p1 = iterator.next()).b == b && (p2 = p1).a != paramArrayOfint[b])
            bool = false; 
        } 
      } 
    } 
    return bool;
  }
  
  public final ArrayList b() {
    return this.e;
  }
  
  public final void a(OutputStream paramOutputStream) {
    paramOutputStream.write(("<" + a + ">").getBytes("UTF-8"));
    Iterator<q> iterator = this.d.iterator();
    while (iterator.hasNext()) {
      OutputStream outputStream = paramOutputStream;
      q q = iterator.next();
      q q = q;
      outputStream.write(("<" + b + " x1=\"" + q.a + "\" x2=\"" + q.b + "\" y1=\"" + q.c + "\" y2=\"" + q.d + "\" ss=\"" + q.e + "\" a=\"" + q.f + "\" />").getBytes("UTF-8"));
    } 
    iterator = this.e.iterator();
    while (iterator.hasNext()) {
      OutputStream outputStream = paramOutputStream;
      p p = (p)iterator.next();
      p p = p;
      outputStream.write(("<" + c + " start=\"" + p.a + "\" stop=\"" + p.b + "\" />").getBytes("UTF-8"));
    } 
    paramOutputStream.write(("</" + a + ">").getBytes("UTF-8"));
  }
  
  public final String toString() {
    String str;
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      a(byteArrayOutputStream);
      str = new String(byteArrayOutputStream.toByteArray());
    } catch (Exception exception) {
      str = "Unable to write map";
    } 
    return str;
  }
  
  public final DefaultHandler c() {
    return new r(this);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */