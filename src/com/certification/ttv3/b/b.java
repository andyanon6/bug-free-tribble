package com.certification.ttv3.b;

import com.certification.ttv3.e.w;
import java.util.UUID;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.DefaultHandler;

public final class b extends DefaultHandler {
  private DefaultHandler a = null;
  
  private int b = 0;
  
  private int c = -1;
  
  private b(a parama) {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    if (this.a != null) {
      this.a.startElement(paramString1, paramString2, paramString3, paramAttributes);
    } else if (paramString3.compareTo(a.a) == 0) {
      UUID uUID = UUID.fromString(paramAttributes.getValue("questionid"));
      w w = new w();
      this.a = w.c();
      this.c = this.b + 1;
      a.a(this.d).put(uUID, w);
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
  
  public final void setDocumentLocator(Locator paramLocator) {}
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */