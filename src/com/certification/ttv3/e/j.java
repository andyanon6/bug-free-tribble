package com.certification.ttv3.e;

import java.util.UUID;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

final class j extends DefaultHandler {
  private DefaultHandler a = null;
  
  private int b = 0;
  
  private int c = -1;
  
  private boolean d = false;
  
  private j(i parami) {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    if (paramString3.compareTo(i.a) == 0) {
      i.a(this.e, paramAttributes.getValue("sourcepath"));
      this.e.c = paramAttributes.getValue("sExt");
      try {
        this.e.d = UUID.fromString(paramAttributes.getValue("nImageId"));
      } catch (NumberFormatException numberFormatException) {}
    } 
    if (paramString3.compareTo(i.b) == 0)
      this.d = true; 
    this.b++;
  }
  
  public final void characters(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    if (this.d)
      i.b(this.e, new String(paramArrayOfchar, paramInt1, paramInt2)); 
  }
  
  public final void endElement(String paramString1, String paramString2, String paramString3) {
    this.b--;
    if (this.c == this.b)
      this.a = null; 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */