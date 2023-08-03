package com.certification.ttv3.e;

import com.certification.ttv3.f.k;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

final class v extends DefaultHandler {
  private DefaultHandler a = null;
  
  private int b = 0;
  
  private int c = -1;
  
  private boolean d = false;
  
  private int e = -1;
  
  private v(u paramu) {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    if (this.a != null) {
      this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
    } else {
      if (paramString3.compareTo(u.a) == 0) {
        List<String> list1 = Arrays.asList(u.g);
        u.a(this.f, list1.indexOf(paramAttributes.getValue("status")));
        if (u.a(this.f) < 0)
          u.a(this.f, 2); 
        List<String> list2 = Arrays.asList(u.f);
        u.b(this.f, list2.indexOf(paramAttributes.getValue("type")));
        if (u.b(this.f) < 0)
          u.b(this.f, 0); 
        try {
          u.a(this.f, UUID.fromString(paramAttributes.getValue("nQuestionId")));
        } catch (IllegalArgumentException illegalArgumentException) {}
        try {
          u.c(this.f, Integer.parseInt(paramAttributes.getValue("nQuestionNum")));
        } catch (Exception exception) {}
        try {
          u.b(this.f, UUID.fromString(paramAttributes.getValue("nTopicId")));
        } catch (IllegalArgumentException illegalArgumentException) {
        
        } catch (NullPointerException nullPointerException) {}
        String str;
        if ((str = paramAttributes.getValue("dCreate")) != null)
          u.a(this.f, str); 
        if ((str = paramAttributes.getValue("dModify")) != null)
          if (u.c(this.f) == null) {
            u.b(this.f, str);
          } else {
            try {
              Date date2 = k.a().parse(u.c(this.f));
              Date date1;
              if ((date1 = k.a().parse(str)).after(date2))
                u.b(this.f, str); 
            } catch (ParseException parseException) {}
          }  
      } 
      if (paramString3.compareTo(u.b) == 0 && this.e < 0)
        this.e = 0; 
      if (paramString3.compareTo(u.e) == 0 && this.e <= 2) {
        this.e = 2;
        g g = new g();
        ArrayList<Integer> arrayList = new ArrayList();
        String str;
        if ((str = paramAttributes.getValue("answers")) != null) {
          String[] arrayOfString;
          if (str.length() > 2) {
            arrayOfString = str.split(",");
            for (byte b = 0; b < arrayOfString.length; b++) {
              try {
                arrayList.add(Integer.valueOf(Integer.parseInt(arrayOfString[b])));
              } catch (NumberFormatException numberFormatException) {}
            } 
          } else {
            arrayList.add(Integer.valueOf(Integer.parseInt((String)arrayOfString)));
          } 
        } else {
          this.f.a(new c("Incorrect answer explanation is not assigned to an answer"));
        } 
        this.f.a(g, arrayList);
        this.a = g.a();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (paramString3.compareTo(u.c) == 0 && this.e < 4)
        this.e = 4; 
      if (paramString3.compareTo(u.d) == 0)
        this.d = true; 
      if (this.d && paramString3.compareTo(c.a) == 0) {
        c c = new c(null);
        this.f.a(c);
        c = c;
        this.a = new d(c, (byte)0);
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (paramString3.compareTo(s.a) == 0 && this.e != 1) {
        s s = new s();
        if (this.e == 4) {
          this.f.b(s);
        } else {
          this.f.a(s);
        } 
        this.a = s.b();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (paramString3.compareTo(i.a) == 0 && this.e != 1) {
        i i = new i(null);
        this.f.a(i);
        this.a = i.b();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (paramString3.compareTo(k.a) == 0 && this.e != 1) {
        k k = new k();
        if (this.e == 4) {
          this.f.b(k);
        } else {
          this.f.a(k);
        } 
        this.a = k.b();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (paramString3.compareTo(a.a) == 0 && this.e <= 1) {
        this.e = 1;
        a a = new a();
        this.f.a(a);
        a = a;
        this.a = new b(a, (byte)0);
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (paramString3.compareTo(o.a) == 0 && this.e <= 1) {
        this.e = 1;
        u.a(this.f, new o());
        this.a = u.d(this.f).c();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
      if (paramString3.compareTo(g.a) == 0 && this.e < 2) {
        this.e = 2;
        g g = new g();
        this.f.a(g);
        this.a = g.a();
        this.c = this.b;
        this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
      } 
    } 
    this.b++;
  }
  
  public final void characters(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    if (this.a != null) {
      this.a.characters(paramArrayOfchar, paramInt1, paramInt2);
      return;
    } 
    if (this.d)
      u.e(this.f).add(new c(new String(paramArrayOfchar, paramInt1, paramInt2))); 
  }
  
  public final void endElement(String paramString1, String paramString2, String paramString3) {
    if (this.a != null)
      this.a.endElement(paramString1, paramString2, paramString3); 
    if (paramString3.compareTo(u.b) == 0)
      this.e = 1; 
    if (paramString3.compareTo(a.a) == 0 && this.a instanceof b) {
      this.a = null;
      this.e = 1;
    } 
    if (paramString3.compareTo(u.d) == 0)
      this.d = false; 
    this.b--;
    if (this.c == this.b)
      this.a = null; 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */