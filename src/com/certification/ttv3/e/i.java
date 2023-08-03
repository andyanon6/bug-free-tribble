package com.certification.ttv3.e;

import com.certification.ttv3.f.d;
import java.io.OutputStream;
import java.util.UUID;
import org.xml.sax.helpers.DefaultHandler;

public final class i implements d {
  public static String a = "image";
  
  public static String b = "ierror";
  
  private String e = null;
  
  private String f;
  
  protected String c;
  
  protected UUID d = null;
  
  public i(String paramString) {}
  
  private UUID c() {
    if (this.d == null) {
      i i1;
      (i1 = this).d = UUID.randomUUID();
    } 
    return this.d;
  }
  
  public final String a() {
    return c() + this.c;
  }
  
  public final String toString() {
    return "-Exhibit-";
  }
  
  public final void a(OutputStream paramOutputStream) {
    paramOutputStream.write(("<" + a + " nImageId=\"" + c() + "\" sExt=\"" + this.c + "\"").getBytes("UTF-8"));
    if (this.e != null)
      paramOutputStream.write((" sourcepath=\"" + this.e + "\"").getBytes("UTF-8")); 
    paramOutputStream.write(">".getBytes("UTF-8"));
    if (this.f != null)
      paramOutputStream.write(("<" + b + ">" + this.f + "</" + b + ">").getBytes("UTF-8")); 
    paramOutputStream.write(("</" + a + ">").getBytes("UTF-8"));
  }
  
  public final DefaultHandler b() {
    return new j(this, (byte)0);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */