package com.certification.ttv3.b;

import com.certification.a.b.a;
import com.certification.a.b.b;
import java.awt.Point;
import java.util.ArrayList;
import java.util.UUID;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.DefaultHandler;

public final class j extends DefaultHandler {
  private DefaultHandler a = null;
  
  private int b = 0;
  
  private int c = -1;
  
  private ArrayList d = new ArrayList();
  
  private ArrayList e = new ArrayList();
  
  private String f = "";
  
  private boolean g = false;
  
  private j(h paramh) {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    if (paramString3.compareTo(h.a) == 0) {
      UUID uUID = UUID.fromString(paramAttributes.getValue("questionid"));
      h.a(this.h, h.a(this.h).a(uUID));
      if (paramAttributes.getValue("marked") != null && paramAttributes.getValue("marked").compareTo("Y") == 0)
        h.a(this.h, true); 
    } 
    if (paramString3.compareTo("useranswer") == 0)
      switch (h.b(this.h).d()) {
        case 1:
        case 2:
          if (paramAttributes.getValue("selected") != null)
            this.h.b((paramAttributes.getValue("selected").compareTo("true") == 0)); 
          h.c(this.h).add(Integer.valueOf(Integer.parseInt(paramAttributes.getValue("answernum"))));
          break;
      }  
    if (paramString3.compareTo("userstop") == 0)
      this.d.add(Integer.valueOf(Integer.parseInt(paramAttributes.getValue("stop")))); 
    if (paramString3.compareTo("userspot") == 0)
      this.e.add(new Point(Integer.parseInt(paramAttributes.getValue("x")), Integer.parseInt(paramAttributes.getValue("y")))); 
    if (paramString3.compareTo("usertext") == 0)
      this.g = true; 
    this.b++;
  }
  
  public final void characters(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    if (this.g)
      this.f = String.valueOf(this.f) + new String(paramArrayOfchar, paramInt1, paramInt2); 
  }
  
  public final void endElement(String paramString1, String paramString2, String paramString3) {
    if (paramString3.compareTo(h.a) == 0) {
      a a;
      int[] arrayOfInt;
      if (h.b(this.h).d() == 5 && (a = this.h.h()) != null && (arrayOfInt = a.b()) != null) {
        for (byte b1 = 0; b1 < arrayOfInt.length && b1 < this.d.size(); b1++)
          arrayOfInt[b1] = ((Integer)this.d.get(b1)).intValue(); 
        a.a(arrayOfInt);
      } 
      b b;
      Point[] arrayOfPoint;
      if (h.b(this.h).d() == 3 && (b = this.h.i()) != null && (arrayOfPoint = b.a()) != null) {
        for (byte b1 = 0; b1 < arrayOfPoint.length && b1 < this.e.size(); b1++)
          arrayOfPoint[b1] = this.e.get(b1); 
        b.a(arrayOfPoint);
      } 
    } 
    if (paramString3.compareTo("usertext") == 0) {
      this.g = false;
      this.h.j().setText(this.f);
    } 
    this.b--;
    if (this.c == this.b)
      this.a = null; 
  }
  
  public final void setDocumentLocator(Locator paramLocator) {}
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */