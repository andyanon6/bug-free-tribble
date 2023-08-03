package com.certification.ttv3.e;

import java.util.UUID;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.DefaultHandler;

public final class f extends DefaultHandler {
  private DefaultHandler a = null;
  
  private int b = 0;
  
  private int c = -1;
  
  private y d;
  
  private f(e parame) {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    if (this.a != null) {
      this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
    } else {
      if (paramString3.compareTo(e.a) == 0) {
        this.e.b = paramAttributes.getValue("code");
        this.e.e = paramAttributes.getValue("vendor");
        this.e.c = paramAttributes.getValue("description");
        this.e.d = paramAttributes.getValue("version");
        try {
          this.e.f = Long.valueOf(Long.parseLong(paramAttributes.getValue("utime")));
        } catch (NumberFormatException numberFormatException) {
          this.e.f = Long.valueOf(0L);
        } 
        try {
          this.e.g = UUID.fromString(paramAttributes.getValue("nExamId"));
        } catch (Exception exception) {}
      } 
      if (paramString3.compareTo(y.a) == 0) {
        this.d = new y();
        this.a = this.d.d();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (paramString3.compareTo(u.a) == 0) {
        u u = new u();
        this.e.h.add(u);
        try {
          UUID uUID = UUID.fromString(paramAttributes.getValue("nTopicId"));
          u.a(this.e.a(uUID));
        } catch (Exception exception) {}
        this.a = u.m();
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
    if (paramString3.compareTo(y.a) == 0)
      this.e.a(this.d); 
  }
  
  public final void setDocumentLocator(Locator paramLocator) {}
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */