package com.certification.ttv3.e;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public final class l extends DefaultHandler {
  private DefaultHandler a = null;
  
  private int b = 0;
  
  private int c = -1;
  
  private l(k paramk) {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    if (this.a != null) {
      this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
    } else if (paramString3.compareTo(m.a) == 0) {
      m m1 = new m();
      m m3 = m1;
      k k1;
      (k1 = this.d).b.add(m3);
      m m2 = m1;
      this.a = new n(m2, (byte)0);
      this.c = this.b;
      this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
    } 
    this.b++;
  }
  
  public final void characters(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    if (this.a != null)
      this.a.characters(paramArrayOfchar, paramInt1, paramInt2); 
  }
  
  public final void endElement(String paramString1, String paramString2, String paramString3) {
    if (this.a != null)
      this.a.endElement(paramString1, paramString2, paramString3); 
    this.b--;
    if (this.c == this.b)
      this.a = null; 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */