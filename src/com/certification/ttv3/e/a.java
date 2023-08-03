package com.certification.ttv3.e;

import com.certification.ttv3.f.d;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class a implements d {
  public static String a = "answer";
  
  private ArrayList b = new ArrayList();
  
  private boolean c;
  
  public final void a(d paramd) {
    this.b.add(paramd);
  }
  
  public final ArrayList a() {
    return this.b;
  }
  
  public final boolean b() {
    return this.c;
  }
  
  public final void a(OutputStream paramOutputStream) {
    paramOutputStream.write(("<" + a + " correct=\"" + (this.c ? "1" : "0") + "\">").getBytes("UTF-8"));
    Iterator<d> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      d d1;
      (d1 = iterator.next()).a(paramOutputStream);
    } 
    paramOutputStream.write(("</" + a + ">").getBytes("UTF-8"));
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */