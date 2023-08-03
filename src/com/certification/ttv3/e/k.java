package com.certification.ttv3.e;

import com.certification.ttv3.f.d;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.xml.sax.helpers.DefaultHandler;

public final class k implements d {
  public static String a = "list";
  
  ArrayList b = new ArrayList();
  
  public final ArrayList a() {
    return this.b;
  }
  
  public final void a(OutputStream paramOutputStream) {
    paramOutputStream.write(("<" + a + ">").getBytes("UTF-8"));
    Iterator<m> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      m m;
      (m = iterator.next()).a(paramOutputStream);
    } 
    paramOutputStream.write(("</" + a + ">").getBytes("UTF-8"));
  }
  
  public final DefaultHandler b() {
    return new l(this, (byte)0);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */