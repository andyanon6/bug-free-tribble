package com.certification.ttv3.e;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public final class b extends DefaultHandler {
  private DefaultHandler a = null;
  
  private int b = 0;
  
  private int c = -1;
  
  private b(a parama) {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    if (this.a != null) {
      this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
    } else {
      if (paramString3.compareTo(a.a) == 0)
        try {
          a.a(this.d, (Integer.parseInt(paramAttributes.getValue("correct")) == 1));
        } catch (NumberFormatException numberFormatException) {
          a.a(this.d, false);
        }  
      if (paramString3.compareTo(s.a) == 0) {
        s s = new s();
        this.d.a(s);
        this.a = s.b();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (paramString3.compareTo(w.a) == 0) {
        w w = new w();
        this.d.a(w);
        this.a = w.c();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (paramString3.compareTo(k.a) == 0) {
        k k = new k();
        this.d.a(k);
        this.a = k.b();
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


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */