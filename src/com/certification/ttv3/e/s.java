package com.certification.ttv3.e;

import com.certification.ttv3.f.d;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.xml.sax.helpers.DefaultHandler;

public final class s extends ArrayList implements d {
  public static String a = "p";
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (d d1 : this)
      stringBuilder.append(d1.toString()); 
    return stringBuilder.toString();
  }
  
  public final i a() {
    i i = null;
    Iterator<E> iterator = iterator();
    while (iterator.hasNext()) {
      d d1;
      if (d1 = (d)iterator.next() instanceof i)
        i = (i)d1; 
      if (d1 instanceof s && (d1 = d1).a() != null)
        i = d1.a(); 
    } 
    return i;
  }
  
  public final void a(OutputStream paramOutputStream) {
    paramOutputStream.write(("<" + a + ">").getBytes("UTF-8"));
    Iterator<E> iterator = iterator();
    while (iterator.hasNext()) {
      d d1;
      (d1 = (d)iterator.next()).a(paramOutputStream);
    } 
    paramOutputStream.write(("</" + a + ">").getBytes("UTF-8"));
  }
  
  public final DefaultHandler b() {
    return new t(this, (byte)0);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */