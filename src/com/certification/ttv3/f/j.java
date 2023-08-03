package com.certification.ttv3.f;

import java.util.Random;

public final class j {
  private int[] a;
  
  private int[] b;
  
  private int c;
  
  private int d;
  
  private Random e;
  
  public j(int paramInt) {
    if (paramInt <= 0)
      paramInt = 1; 
    this.d = paramInt;
    this.a = new int[this.d];
    this.b = new int[this.d];
    this.e = new Random();
    for (paramInt = 0; paramInt < this.d; paramInt++)
      this.a[paramInt] = paramInt; 
    b();
  }
  
  public final int a() {
    if (this.c >= this.d)
      return 0; 
    this.c++;
    return this.a[this.c - 1];
  }
  
  private void b() {
    byte b;
    for (b = 0; b < this.d; b++)
      this.b[b] = this.e.nextInt(); 
    b = 1;
    int i = 1;
    while (b <= this.d - 1 && i) {
      i = 0;
      for (byte b1 = 0; b1 < this.d - 1; b1++) {
        if (this.b[b1] > this.b[b1 + 1]) {
          i = this.b[b1];
          int k = this.a[b1];
          this.b[b1] = this.b[b1 + 1];
          this.a[b1] = this.a[b1 + 1];
          this.b[b1 + 1] = i;
          this.a[b1 + 1] = k;
          i = 1;
        } 
      } 
      b++;
    } 
    this.c = 0;
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */