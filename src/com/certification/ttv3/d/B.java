package com.certification.ttv3.d;

import java.text.ParseException;
import javax.swing.InputVerifier;
import javax.swing.JComponent;

final class B extends InputVerifier {
  private B(A paramA) {}
  
  public final boolean verify(JComponent paramJComponent) {
    Integer integer;
    if (paramJComponent == this.a.f)
      try {
        return ((integer = (Integer)this.a.f.getFormatter().stringToValue(this.a.f.getText())).intValue() > 0 && integer.intValue() <= 999);
      } catch (ParseException parseException) {
        return false;
      }  
    if (integer == this.a.g)
      try {
        return ((integer = (Integer)this.a.g.getFormatter().stringToValue(this.a.g.getText())).intValue() >= 0 && integer.intValue() <= 100);
      } catch (ParseException parseException) {
        return false;
      }  
    if (integer == this.a.k)
      try {
        return ((integer = (Integer)this.a.k.getFormatter().stringToValue(this.a.k.getText())).intValue() > 0 && integer.intValue() <= 999);
      } catch (ParseException parseException) {
        return false;
      }  
    if (integer == this.a.l)
      try {
        return ((integer = (Integer)this.a.l.getFormatter().stringToValue(this.a.l.getText())).intValue() >= 0 && integer.intValue() <= 100);
      } catch (ParseException parseException) {
        return false;
      }  
    if (integer == this.a.p)
      try {
        return ((integer = (Integer)this.a.p.getFormatter().stringToValue(this.a.p.getText())).intValue() >= 0 && integer.intValue() <= 10);
      } catch (ParseException parseException) {
        return false;
      }  
    if (integer == this.a.q)
      try {
        return ((integer = (Integer)this.a.q.getFormatter().stringToValue(this.a.q.getText())).intValue() > 0 && integer.intValue() <= 10);
      } catch (ParseException parseException) {
        return false;
      }  
    if (A.a(this.a).j() != null) {
      if (integer == this.a.m)
        try {
          return ((integer = (Integer)this.a.m.getFormatter().stringToValue(this.a.m.getText())).intValue() > 0 && integer.intValue() <= A.a(this.a).j().c());
        } catch (ParseException parseException) {
          return false;
        }  
      if (integer == this.a.n)
        try {
          return ((integer = (Integer)this.a.n.getFormatter().stringToValue(this.a.n.getText())).intValue() > 0 && integer.intValue() <= A.a(this.a).j().c());
        } catch (ParseException parseException) {
          return false;
        }  
      if (integer == this.a.o)
        try {
          return ((integer = (Integer)this.a.o.getFormatter().stringToValue(this.a.o.getText())).intValue() > 0 && integer.intValue() <= A.a(this.a).j().c());
        } catch (ParseException parseException) {
          return false;
        }  
      if (integer == this.a.h)
        try {
          return ((integer = (Integer)this.a.h.getFormatter().stringToValue(this.a.h.getText())).intValue() > 0 && integer.intValue() <= A.a(this.a).j().c());
        } catch (ParseException parseException) {
          return false;
        }  
      if (integer == this.a.i)
        try {
          return ((integer = (Integer)this.a.i.getFormatter().stringToValue(this.a.i.getText())).intValue() > 0 && integer.intValue() <= A.a(this.a).j().c());
        } catch (ParseException parseException) {
          return false;
        }  
      if (integer == this.a.j)
        try {
          return ((integer = (Integer)this.a.j.getFormatter().stringToValue(this.a.j.getText())).intValue() > 0 && integer.intValue() <= A.a(this.a).j().c());
        } catch (ParseException parseException) {
          return false;
        }  
    } 
    return true;
  }
  
  public final boolean shouldYieldFocus(JComponent paramJComponent) {
    return verify(paramJComponent);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/B.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */