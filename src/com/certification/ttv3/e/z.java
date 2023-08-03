package com.certification.ttv3.e;

import com.certification.ttv3.f.k;
import java.text.ParseException;
import java.util.Date;
import java.util.UUID;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

final class z extends DefaultHandler {
  private DefaultHandler a = null;
  
  private int b = 0;
  
  private int c = -1;
  
  private z(y paramy) {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    if (this.a != null) {
      this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
    } else {
      if (paramString3.compareTo(y.a) == 0) {
        try {
          y.a(this.d, UUID.fromString(paramAttributes.getValue("nTopicId")));
        } catch (NumberFormatException numberFormatException) {}
        try {
          y.a(this.d, Integer.parseInt(paramAttributes.getValue("nTopicNum")));
        } catch (NumberFormatException numberFormatException) {}
        String str;
        if ((str = paramAttributes.getValue("sDescription")) != null)
          y.a(this.d, str); 
        if ((str = paramAttributes.getValue("dCreate")) != null)
          y.b(this.d, str); 
        if ((str = paramAttributes.getValue("dModify")) != null)
          if (y.a(this.d) == null) {
            y.c(this.d, str);
          } else {
            try {
              Date date1 = k.a().parse(y.a(this.d));
              Date date2;
              if ((date2 = k.a().parse(str)).after(date1))
                y.c(this.d, str); 
            } catch (ParseException parseException) {}
          }  
      } 
      if (paramString3.compareTo(s.a) == 0) {
        s s = new s();
        this.d.a(s);
        this.a = s.b();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (paramString3.compareTo(i.a) == 0) {
        i i = new i(null);
        this.d.a(i);
        this.a = i.b();
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


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */