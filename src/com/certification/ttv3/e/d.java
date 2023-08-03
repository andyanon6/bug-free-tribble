package com.certification.ttv3.e;

import org.xml.sax.helpers.DefaultHandler;

final class d extends DefaultHandler {
  private d(c paramc) {}
  
  public final void characters(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    if (c.a(this.a) == null) {
      c.a(this.a, new String(paramArrayOfchar, paramInt1, paramInt2));
      return;
    } 
    c.a(this.a, String.valueOf(c.a(this.a)) + new String(paramArrayOfchar, paramInt1, paramInt2));
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */