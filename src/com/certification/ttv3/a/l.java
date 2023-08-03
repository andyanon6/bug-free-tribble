package com.certification.ttv3.a;

import java.text.ParseException;
import javax.swing.InputVerifier;
import javax.swing.JComponent;

final class l extends InputVerifier {
  private l(k paramk) {}
  
  public final boolean verify(JComponent paramJComponent) {
    if (paramJComponent == k.a(this.a))
      try {
        Integer integer;
        return ((integer = (Integer)k.a(this.a).getFormatter().stringToValue(k.a(this.a).getText())).intValue() > 0 && integer.intValue() <= k.b(this.a));
      } catch (ParseException parseException) {
        return false;
      }  
    return true;
  }
  
  public final boolean shouldYieldFocus(JComponent paramJComponent) {
    return verify(paramJComponent);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */