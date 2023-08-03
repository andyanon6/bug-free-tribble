package com.certification.ttv3.e;

import com.certification.ttv3.f.d;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.xml.sax.helpers.DefaultHandler;

public final class g implements d {
  public static String a = "explanation";
  
  public ArrayList b = new ArrayList();
  
  public final void a(d paramd) {
    this.b.add(paramd);
  }
  
  public final void a(OutputStream paramOutputStream) {
    paramOutputStream.write(("<" + a + ">").getBytes("UTF-8"));
    Iterator<d> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      d d1;
      (d1 = iterator.next()).a(paramOutputStream);
    } 
    paramOutputStream.write(("</" + a + ">").getBytes("UTF-8"));
  }
  
  public final DefaultHandler a() {
    return new h(this, (byte)0);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */