package com.certification.ttv3.e;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

final class t extends DefaultHandler {
  private DefaultHandler a = null;
  
  private int b = 0;
  
  private int c = -1;
  
  private t(s params) {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    if (this.a != null) {
      this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
    } else {
      if (paramString3.compareTo(w.a) == 0) {
        w w1 = new w();
        w w2 = w1;
        s s1;
        (s1 = this.d).add((E)w2);
        this.a = w1.c();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (paramString3.compareTo(i.a) == 0) {
        i i1 = new i(null);
        i i2 = i1;
        s s1;
        (s1 = this.d).add((E)i2);
        this.a = i1.b();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
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


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */