package com.certification.ttv3.a;

import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.JOptionPane;

final class c implements Runnable {
  private c(b paramb) {}
  
  public final void run() {
    long l = this.a.a.A();
    InputStream inputStream = this.a.a.z();
    try {
      File file = File.createTempFile("update", ".zip");
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      byte[] arrayOfByte = new byte[1024];
      long l1 = 0L;
      int j;
      while ((j = inputStream.read(arrayOfByte, 0, 1024)) != -1) {
        fileOutputStream.write(arrayOfByte, 0, j);
        l1 += j;
        this.a.b.setValue((int)((float)l1 / (float)l * 1000.0F));
        if (this.a.c) {
          fileOutputStream.close();
          inputStream.close();
          file.delete();
          this.a.setVisible(false);
          return;
        } 
      } 
      fileOutputStream.close();
      inputStream.close();
      ZipFile zipFile;
      Enumeration<? extends ZipEntry> enumeration = (zipFile = new ZipFile(file)).entries();
      while (enumeration.hasMoreElements()) {
        ZipEntry zipEntry;
        if ((zipEntry = enumeration.nextElement()).getName().indexOf("exe") > 0) {
          this.a.d = File.createTempFile("update", ".exe");
          fileOutputStream = new FileOutputStream(this.a.d);
          InputStream inputStream1 = zipFile.getInputStream(zipEntry);
          while ((j = inputStream1.read(arrayOfByte, 0, 1024)) != -1)
            fileOutputStream.write(arrayOfByte, 0, j); 
          fileOutputStream.close();
        } 
      } 
      zipFile.close();
      this.a.setVisible(false);
      int i;
      if ((i = JOptionPane.showOptionDialog((Component)this.a.a, "Update downloaded!\nWould you like to install now?", "Download complete", -1, 3, null, (Object[])new String[] { "Install Now", "Install On Exit", "Do Not Install" }, null)) == 0 || i == 1)
        this.a.a.a(true, this.a.d); 
      if (i == 0) {
        this.a.a.l();
        return;
      } 
    } catch (FileNotFoundException fileNotFoundException) {
      JOptionPane.showMessageDialog((Component)this.a.a, "Unable to open local temporary file", "File permission error", 0);
      return;
    } catch (IOException iOException) {
      JOptionPane.showMessageDialog((Component)this.a.a, "Unable to download update", "Download error", 0);
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */