package com.certification.ttv3.f;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class b extends FilterOutputStream {
  private boolean a;
  
  private int b;
  
  private byte[] c;
  
  private int d;
  
  private int e;
  
  private boolean f;
  
  private byte[] g;
  
  private boolean h;
  
  private int i;
  
  private byte[] j;
  
  public b(OutputStream paramOutputStream, int paramInt) {
    super(paramOutputStream);
    this.f = ((paramInt & 0x8) != 0);
    this.a = ((paramInt & 0x1) != 0);
    this.d = this.a ? 3 : 4;
    this.c = new byte[this.d];
    this.b = 0;
    this.e = 0;
    this.h = false;
    this.g = new byte[4];
    this.i = paramInt;
    this.j = a.a(paramInt);
  }
  
  public final void write(int paramInt) {
    if (this.a) {
      this.c[this.b++] = (byte)paramInt;
      if (this.b >= this.d) {
        this.out.write(a.a(this.g, this.c, this.d, this.i));
        this.e += 4;
        if (this.f && this.e >= 76) {
          this.out.write(10);
          this.e = 0;
        } 
        this.b = 0;
        return;
      } 
    } else if (this.j[paramInt & 0x7F] > -5) {
      this.c[this.b++] = (byte)paramInt;
      if (this.b >= this.d) {
        paramInt = a.a(this.c, 0, this.g, 0, this.i);
        this.out.write(this.g, 0, paramInt);
        this.b = 0;
        return;
      } 
    } else if (this.j[paramInt & 0x7F] != -5) {
      throw new IOException("Invalid character in Base64 data.");
    } 
  }
  
  public final void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    for (byte b1 = 0; b1 < paramInt2; b1++)
      write(paramArrayOfbyte[paramInt1 + b1]); 
  }
  
  public final void close() {
    b b1;
    if ((b1 = this).b > 0)
      if (b1.a) {
        b1.out.write(a.a(b1.g, b1.c, b1.b, b1.i));
        b1.b = 0;
      } else {
        throw new IOException("Base64 input not properly padded.");
      }  
    super.close();
    this.c = null;
    this.out = null;
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */