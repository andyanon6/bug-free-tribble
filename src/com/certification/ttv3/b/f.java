package com.certification.ttv3.b;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.e.e;
import com.certification.ttv3.e.u;
import com.certification.ttv3.e.w;
import com.certification.ttv3.e.y;
import com.certification.ttv3.f.a;
import com.certification.ttv3.f.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.SAXParserFactory;

public final class f implements Comparable {
  private ArrayList d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private File j;
  
  private Date k;
  
  private Date l;
  
  private e m;
  
  private c n;
  
  private boolean o;
  
  private boolean p;
  
  private String q;
  
  public static int a = 0;
  
  public static int b = 1;
  
  public static String c = "userexam";
  
  public f(c paramc, e parame) {
    this.n = paramc;
    this.m = parame;
    this.d = new ArrayList();
    this.o = true;
    this.p = true;
    this.j = null;
  }
  
  public f(TrainingTool paramTrainingTool, File paramFile, String paramString) {
    this.n = (c)paramTrainingTool;
    this.m = new e();
    this.d = new ArrayList();
    this.j = paramFile;
    this.p = false;
    this.q = paramString;
    b(false);
    this.o = false;
  }
  
  public final File a() {
    return this.j;
  }
  
  public final void b() {
    if (!this.o)
      b(true); 
  }
  
  public final boolean c() {
    return this.o;
  }
  
  private void b(boolean paramBoolean) {
    if (paramBoolean)
      this.d = new ArrayList(); 
    SecretKeySpec secretKeySpec = new SecretKeySpec(a.a(this.q), "AES");
    Cipher cipher;
    (cipher = Cipher.getInstance("AES")).init(2, secretKeySpec);
    CipherInputStream cipherInputStream = new CipherInputStream(new FileInputStream(this.j), cipher);
    boolean bool = paramBoolean;
    f f1 = this;
    g g = new g(f1, bool, (byte)0);
    SAXParserFactory.newInstance().newSAXParser().parse(cipherInputStream, g);
    cipherInputStream.close();
  }
  
  public final void a(u paramu, boolean paramBoolean) {
    this.d.add(new h(this.n, this, paramu, paramBoolean));
  }
  
  public final void a(h paramh) {
    this.d.add(paramh);
  }
  
  public final h a(int paramInt) {
    try {
      return this.d.get(paramInt);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      return null;
    } 
  }
  
  public final u b(int paramInt) {
    return this.m.b(paramInt);
  }
  
  public final u a(UUID paramUUID) {
    return this.m.b(paramUUID);
  }
  
  public final int d() {
    return (this.d.size() == 0) ? this.f : this.d.size();
  }
  
  public final int a(y paramy) {
    byte b = 0;
    Iterator<h> iterator = this.d.iterator();
    while (iterator.hasNext()) {
      h h;
      if ((h = iterator.next()).a().b() == paramy)
        b++; 
    } 
    return b;
  }
  
  public final int e() {
    byte b = 0;
    Iterator<h> iterator = this.d.iterator();
    while (iterator.hasNext()) {
      h h;
      if ((h = iterator.next()).f())
        b++; 
    } 
    return b;
  }
  
  public final int b(y paramy) {
    byte b = 0;
    Iterator<h> iterator = this.d.iterator();
    while (iterator.hasNext()) {
      h h;
      if ((h = iterator.next()).a().b() == paramy && h.f())
        b++; 
    } 
    return b;
  }
  
  public final int f() {
    byte b = 0;
    Iterator<h> iterator = this.d.iterator();
    while (iterator.hasNext()) {
      h h;
      if ((h = iterator.next()).g())
        b++; 
    } 
    return b;
  }
  
  public final int c(y paramy) {
    byte b = 0;
    Iterator<h> iterator = this.d.iterator();
    while (iterator.hasNext()) {
      h h;
      if ((h = iterator.next()).a().b() == paramy && h.g())
        b++; 
    } 
    return b;
  }
  
  public final void c(int paramInt) {
    this.e = paramInt;
  }
  
  public final int g() {
    return this.e;
  }
  
  public final void a(boolean paramBoolean) {
    this.p = false;
  }
  
  public final boolean h() {
    return this.p;
  }
  
  public final int i() {
    return this.g;
  }
  
  public final int j() {
    return this.h;
  }
  
  public final int k() {
    return this.i;
  }
  
  public final Date l() {
    return this.k;
  }
  
  public final void a(Date paramDate) {
    this.k = paramDate;
  }
  
  public final void b(Date paramDate) {
    this.l = paramDate;
  }
  
  public final File m() {
    return this.j;
  }
  
  public final void d(int paramInt) {
    this.h = paramInt;
  }
  
  public final void e(int paramInt) {
    this.i = paramInt;
  }
  
  public final void n() {
    this.f = this.d.size();
    this.g = 0;
    Iterator<h> iterator = this.d.iterator();
    while (iterator.hasNext()) {
      h h;
      if ((h = iterator.next()).f())
        this.g++; 
    } 
  }
  
  public final void a(OutputStream paramOutputStream) {
    ArrayList<y> arrayList = new ArrayList();
    Iterator<h> iterator = this.d.iterator();
    while (iterator.hasNext()) {
      h h;
      y y = (h = iterator.next()).a().b();
      if (arrayList.indexOf(y) == -1)
        arrayList.add(y); 
    } 
    paramOutputStream.write(("<" + c + " code=\"" + w.b(this.m.d()) + "\" vendor=\"" + w.b(this.m.e()) + "\" description=\"" + w.b(this.m.f()) + "\" version=\"" + w.b(this.m.g()) + "\" iMode=\"" + this.e + "\" iNumQuestions=\"" + this.f + "\" iNumCorrect=\"" + this.g + "\" iSecondsTotal=\"" + this.i + "\" iSecondsRemaining=\"" + this.h + "\" dStart=\"" + this.k.getTime() + "\" dFinish=\"" + ((this.l == null) ? "0" : (String)Long.valueOf(this.l.getTime())) + "\">").getBytes("UTF-8"));
    iterator = (Iterator)arrayList.iterator();
    while (iterator.hasNext()) {
      y y;
      if ((y = (y)iterator.next()) != null)
        y.a(paramOutputStream); 
    } 
    iterator = this.d.iterator();
    while (iterator.hasNext()) {
      h h;
      (h = iterator.next()).a().a(paramOutputStream);
    } 
    iterator = this.d.iterator();
    while (iterator.hasNext()) {
      h h;
      (h = iterator.next()).a(paramOutputStream);
    } 
    paramOutputStream.write(("</" + c + ">").getBytes("UTF-8"));
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */