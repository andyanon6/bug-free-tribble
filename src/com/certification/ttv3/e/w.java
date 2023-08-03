package com.certification.ttv3.e;

import com.certification.ttv3.f.d;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Properties;
import org.xml.sax.helpers.DefaultHandler;

public final class w implements d {
  public static String a = "s";
  
  private StringBuilder b = new StringBuilder();
  
  private Properties c = new Properties();
  
  public final void a(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    this.b.append(paramArrayOfchar, paramInt1, paramInt2);
  }
  
  public final String a() {
    return this.b.toString();
  }
  
  public final void a(String paramString) {
    this.b.delete(0, this.b.length());
    this.b.append(paramString);
  }
  
  public final String toString() {
    return this.b.toString();
  }
  
  public final String b() {
    return a(false);
  }
  
  public final String a(boolean paramBoolean) {
    String str1 = "";
    String str2 = "";
    String str3 = "";
    Iterator<String> iterator = this.c.stringPropertyNames().iterator();
    while (iterator.hasNext()) {
      String str;
      if ((str = iterator.next()).indexOf("fo:") == 0)
        str1 = String.valueOf(str1) + str.substring(3) + ":" + this.c.getProperty(str) + ";"; 
      if (str.compareTo("sup") == 0) {
        str2 = "<sup>";
        str3 = "</sup>";
      } 
    } 
    String str4 = "";
    if (str1.length() > 0 && !paramBoolean) {
      str4 = String.valueOf(str4) + "<span style=\"" + str1 + "\">" + str2 + c(this.b.toString()) + str3 + "</span>";
    } else {
      str4 = String.valueOf(str2) + c(this.b.toString()) + str3;
    } 
    return str4;
  }
  
  public final void a(OutputStream paramOutputStream) {
    paramOutputStream.write(("<" + a).getBytes("UTF-8"));
    Iterator<String> iterator = this.c.stringPropertyNames().iterator();
    while (iterator.hasNext()) {
      String str;
      if ((str = iterator.next()).compareTo("style:name") != 0)
        paramOutputStream.write((" " + str + "=\"" + this.c.getProperty(str) + "\"").getBytes("UTF-8")); 
    } 
    paramOutputStream.write(">".getBytes("UTF-8"));
    paramOutputStream.write(b(toString()).getBytes("UTF-8"));
    paramOutputStream.write(("</" + a + ">").getBytes("UTF-8"));
  }
  
  public final DefaultHandler c() {
    return new x(this, (byte)0);
  }
  
  public static String b(String paramString) {
    return paramString = (paramString = (paramString = (paramString = (paramString = paramString.replace("&", "&amp;")).replace("<", "&lt;")).replace(">", "&gt;")).replace("\"", "&quot;")).replace("'", "&apos;");
  }
  
  private static String c(String paramString) {
    return paramString = (paramString = paramString.replace("<", "&lt;")).replace(">", "&gt;");
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */