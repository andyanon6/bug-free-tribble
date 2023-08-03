package com.certification.ttv3.e;

import com.certification.ttv3.f.d;
import java.io.OutputStream;

public final class c implements d {
  public static String a = "error";
  
  private String b;
  
  public c(String paramString) {
    this.b = paramString;
  }
  
  public final String toString() {
    return this.b;
  }
  
  public final void a(OutputStream paramOutputStream) {
    if (this.b.trim().length() > 0)
      paramOutputStream.write(("<" + a + ">" + w.b(this.b) + "</" + a + ">").getBytes("UTF-8")); 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */