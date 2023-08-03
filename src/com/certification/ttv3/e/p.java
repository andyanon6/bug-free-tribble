package com.certification.ttv3.e;

import org.xml.sax.Attributes;

public final class p {
  int a;
  
  int b;
  
  q c;
  
  q d;
  
  public p(o paramo, Attributes paramAttributes) {
    try {
      this.a = Integer.parseInt(paramAttributes.getValue("start"));
    } catch (NumberFormatException numberFormatException) {
      this.a = 0;
    } 
    try {
      this.b = Integer.parseInt(paramAttributes.getValue("stop"));
      return;
    } catch (NumberFormatException numberFormatException) {
      this.b = 0;
      return;
    } 
  }
  
  public final int a() {
    return this.a;
  }
  
  public final int b() {
    return this.b;
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */