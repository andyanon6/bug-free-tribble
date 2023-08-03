package com.certification.ttv3.a;

import javax.swing.JProgressBar;

final class n implements Runnable {
  private String a;
  
  private String b;
  
  private JProgressBar c;
  
  public n(m paramm, String paramString1, String paramString2, JProgressBar paramJProgressBar) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramJProgressBar;
  }
  
  public final void run() {
    this.c.setString("Logging in...");
    this.d.f.a(this.a, this.b, this.c);
    this.d.d.setEnabled(true);
    this.d.e.setEnabled(true);
    this.d.a.setFocusable(true);
    this.d.b.setFocusable(true);
    this.d.c.setValue(0);
    this.d.c.setString("");
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */