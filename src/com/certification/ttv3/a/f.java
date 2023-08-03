package com.certification.ttv3.a;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.f.h;
import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.prefs.Preferences;
import java.util.zip.ZipFile;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

final class f implements Runnable {
  private int a;
  
  private long b;
  
  private File c;
  
  private JProgressBar d;
  
  public f(d paramd, int paramInt, long paramLong, File paramFile, JProgressBar paramJProgressBar) {
    this.a = paramInt;
    this.b = paramLong;
    this.c = paramFile;
    this.d = paramJProgressBar;
    Preferences preferences;
    (preferences = (preferences = TrainingTool.q()).node("license" + this.a)).put("file", paramFile.getName());
    preferences.put("status", "1");
  }
  
  public final void run() {
    InputStream inputStream = this.e.a.c(h.a(this.a));
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(this.c);
      byte[] arrayOfByte = new byte[1024];
      long l = 0L;
      int i;
      while ((i = inputStream.read(arrayOfByte, 0, 1024)) != -1) {
        fileOutputStream.write(arrayOfByte, 0, i);
        i = (int)((float)(l += i) / (float)this.b * 100.0F);
        if (this.d != null) {
          this.d.setValue(i);
          this.e.i.b(this.a);
        } 
      } 
      fileOutputStream.close();
      inputStream.close();
      ZipFile zipFile;
      (zipFile = new ZipFile(this.c)).close();
      Preferences preferences;
      (preferences = (preferences = TrainingTool.q()).node("license" + this.a)).put("status", "2");
      this.e.i.b(this.a);
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      Preferences preferences1;
      Preferences preferences2;
      (preferences2 = (preferences1 = TrainingTool.q()).node("license" + this.a)).put("status", "0");
      this.e.i.b(this.a);
      try {
        String str;
        if ((str = d.a(this.e, this.c)).indexOf("max licenses") >= 0) {
          JOptionPane.showMessageDialog((Component)this.e.a, "Maximum downloads per month used for this login,\nunable to complete download.", "Download limit reached", 1);
          return;
        } 
      } catch (Exception exception4) {
        Exception exception3;
        (exception3 = null).printStackTrace();
      } 
      return;
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */