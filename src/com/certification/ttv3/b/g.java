package com.certification.ttv3.b;

import com.certification.ttv3.e.u;
import com.certification.ttv3.e.y;
import java.util.Date;
import java.util.UUID;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.DefaultHandler;

public final class g extends DefaultHandler {
  private DefaultHandler a = null;
  
  private int b = 0;
  
  private int c = -1;
  
  private y d;
  
  private boolean e;
  
  private g(f paramf, boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    if (this.a != null) {
      this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
    } else {
      if (paramString3.compareTo(f.c) == 0) {
        f.a(this.f).a(paramAttributes.getValue("code"));
        f.a(this.f).b(paramAttributes.getValue("vendor"));
        f.a(this.f).c(paramAttributes.getValue("description"));
        f.a(this.f).d(paramAttributes.getValue("version"));
        f.a(this.f, Integer.parseInt(paramAttributes.getValue("iMode")));
        f.b(this.f, Integer.parseInt(paramAttributes.getValue("iNumQuestions")));
        f.c(this.f, Integer.parseInt(paramAttributes.getValue("iNumCorrect")));
        f.d(this.f, Integer.parseInt(paramAttributes.getValue("iSecondsTotal")));
        f.e(this.f, Integer.parseInt(paramAttributes.getValue("iSecondsRemaining")));
        f.a(this.f, new Date(Long.parseLong(paramAttributes.getValue("dStart"))));
        if (paramAttributes.getValue("dFinish").compareTo("0") == 0) {
          f.a(this.f, true);
        } else {
          f.b(this.f, new Date(Long.parseLong(paramAttributes.getValue("dFinish"))));
        } 
      } 
      if (this.e && paramString3.compareTo(y.a) == 0) {
        this.d = new y();
        this.a = this.d.d();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (this.e && paramString3.compareTo(u.a) == 0) {
        u u = new u();
        f.a(this.f).a(u);
        try {
          UUID uUID = UUID.fromString(paramAttributes.getValue("nTopicId"));
          u.a(f.a(this.f).a(uUID));
        } catch (Exception exception) {}
        this.a = u.m();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (this.e && paramString3.compareTo(h.a) == 0) {
        h h = new h(f.b(this.f), this.f);
        this.f.a(h);
        h = h;
        this.a = new j(h, (byte)0);
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
    if (this.e && paramString3.compareTo(y.a) == 0)
      f.a(this.f).a(this.d); 
  }
  
  public final void setDocumentLocator(Locator paramLocator) {}
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */