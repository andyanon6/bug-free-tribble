package com.certification.ttv3.e;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

final class x extends DefaultHandler {
  private x(w paramw) {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    for (byte b = 0; b < paramAttributes.getLength(); b++)
      w.a(this.a).setProperty(paramAttributes.getQName(b), paramAttributes.getValue(b)); 
  }
  
  public final void characters(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    this.a.a(paramArrayOfchar, paramInt1, paramInt2);
  }
  
  public final void endElement(String paramString1, String paramString2, String paramString3) {}
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */