package com.certification.ttv3.e;

import java.awt.Rectangle;
import org.xml.sax.Attributes;

public final class q {
  int a;
  
  int b;
  
  int c;
  
  int d;
  
  int e;
  
  int f;
  
  public q(o paramo, Attributes paramAttributes) {
    try {
      this.a = Integer.parseInt(paramAttributes.getValue("x1"));
    } catch (NumberFormatException numberFormatException) {
      this.a = 0;
    } 
    try {
      this.b = Integer.parseInt(paramAttributes.getValue("x2"));
    } catch (NumberFormatException numberFormatException) {
      this.b = 0;
    } 
    try {
      this.c = Integer.parseInt(paramAttributes.getValue("y1"));
    } catch (NumberFormatException numberFormatException) {
      this.c = 0;
    } 
    try {
      this.d = Integer.parseInt(paramAttributes.getValue("y2"));
    } catch (NumberFormatException numberFormatException) {
      this.d = 0;
    } 
    try {
      this.e = Integer.parseInt(paramAttributes.getValue("ss"));
    } catch (NumberFormatException numberFormatException) {
      this.e = 0;
    } catch (NullPointerException nullPointerException) {
      this.e = 0;
    } 
    try {
      this.f = Integer.parseInt(paramAttributes.getValue("a"));
      return;
    } catch (NumberFormatException numberFormatException) {
      this.f = 0;
      return;
    } catch (NullPointerException nullPointerException) {
      this.f = 0;
      return;
    } 
  }
  
  public final boolean a() {
    return (this.e == 0);
  }
  
  public final Rectangle b() {
    return new Rectangle(this.a, this.c, this.b - this.a, this.d - this.c);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/e/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */