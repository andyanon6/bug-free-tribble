package com.certification.ttv3.b;

import java.util.UUID;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.DefaultHandler;

public final class e extends DefaultHandler {
  private DefaultHandler a = null;
  
  private int b = 0;
  
  private int c = -1;
  
  private e(c paramc) {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    if (paramString3.compareTo(c.a) == 0) {
      UUID uUID = UUID.fromString(paramAttributes.getValue("questionid"));
      int i = Integer.parseInt(paramAttributes.getValue("correctcount"));
      int j = Integer.parseInt(paramAttributes.getValue("incorrectcount"));
      c.a(this.d).put(uUID, new d(this.d, i, j));
    } 
    this.b++;
  }
  
  public final void characters(char[] paramArrayOfchar, int paramInt1, int paramInt2) {}
  
  public final void endElement(String paramString1, String paramString2, String paramString3) {
    this.b--;
    if (this.c == this.b)
      this.a = null; 
  }
  
  public final void setDocumentLocator(Locator paramLocator) {}
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */