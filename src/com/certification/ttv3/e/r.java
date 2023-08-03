package com.certification.ttv3.e;

import java.util.ArrayList;
import java.util.Iterator;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public final class r extends DefaultHandler {
  public r(o paramo) {}
  
  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes) {
    if (paramString3.compareTo(o.b) == 0) {
      q q = new q(this.a, paramAttributes);
      o.a(this.a).add(q);
    } 
    if (paramString3.compareTo(o.c) == 0)
      o.b(this.a).add(new p(this.a, paramAttributes)); 
  }
  
  public final void endElement(String paramString1, String paramString2, String paramString3) {
    if (paramString3.compareTo(o.a) == 0) {
      Iterator<p> iterator2 = o.b(this.a).iterator();
      while (iterator2.hasNext()) {
        p p;
        (p = iterator2.next()).c = o.a(this.a).get(p.a);
        p.d = o.a(this.a).get(p.b);
      } 
      ArrayList arrayList1 = new ArrayList(o.a(this.a));
      Iterator<q> iterator = o.a(this.a).iterator();
      while (iterator.hasNext()) {
        q q;
        if ((q = iterator.next()).a == q.b || q.c == q.d)
          arrayList1.remove(q); 
      } 
      o.a(this.a, arrayList1);
      ArrayList arrayList2 = new ArrayList(o.b(this.a));
      Iterator<p> iterator1 = o.b(this.a).iterator();
      while (iterator1.hasNext()) {
        p p;
        (p = iterator1.next()).a = o.a(this.a).indexOf(p.c);
        p.b = o.a(this.a).indexOf(p.d);
        if (p.a == -1 || p.b == -1)
          arrayList2.remove(p); 
      } 
      o.b(this.a, arrayList2);
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */