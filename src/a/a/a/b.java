package a.a.a;

import java.util.Vector;

final class b {
  private Vector a = new Vector();
  
  public final void a(int paramInt1, int paramInt2) {
    if (paramInt1 >= this.a.size()) {
      this.a.add(paramInt1, new Integer(paramInt2));
      return;
    } 
    if ((paramInt2 -= a(paramInt1)) > 0)
      for (paramInt1 = paramInt1; paramInt1 < this.a.size(); paramInt1++)
        this.a.set(paramInt1, new Integer(a(paramInt1) + paramInt2));  
  }
  
  public final int a(int paramInt) {
    return ((Integer)this.a.get(paramInt)).intValue();
  }
  
  public final String toString() {
    StringBuffer stringBuffer = new StringBuffer(String.valueOf(getClass().getName()) + " {");
    for (byte b1 = 0; b1 < this.a.size(); b1++) {
      stringBuffer.append(this.a.get(b1));
      if (b1 < this.a.size() - 1)
        stringBuffer.append(','); 
    } 
    stringBuffer.append('}');
    return stringBuffer.toString();
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/a/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */