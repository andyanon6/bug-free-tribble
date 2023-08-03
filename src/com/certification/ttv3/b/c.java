package com.certification.ttv3.b;

import com.certification.ttv3.TrainingTool;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public final class c {
  private File b;
  
  private HashMap c;
  
  private TrainingTool d;
  
  private static String e = "optimizer";
  
  public static String a = "qdata";
  
  public c(TrainingTool paramTrainingTool, File paramFile) {
    this.d = paramTrainingTool;
    this.b = paramFile;
    this.c = new HashMap<Object, Object>();
    try {
      FileInputStream fileInputStream = new FileInputStream(this.b);
      c c1 = this;
      e e = new e(c1, (byte)0);
      SAXParserFactory.newInstance().newSAXParser().parse(fileInputStream, e);
      fileInputStream.close();
      return;
    } catch (ParserConfigurationException parserConfigurationException) {
      JOptionPane.showMessageDialog((Component)this.d, "Data read error while loading optimizer data", "Optimizer read error", 0);
      return;
    } catch (SAXException sAXException) {
      JOptionPane.showMessageDialog((Component)this.d, "Data read error while loading optimizer data", "Optimizer read error", 0);
      return;
    } catch (FileNotFoundException fileNotFoundException) {
      return;
    } catch (IOException iOException) {
      JOptionPane.showMessageDialog((Component)this.d, "File read error while loading optimizer data", "Optimizer read error", 0);
      return;
    } 
  }
  
  public final void a(UUID paramUUID) {
    if (this.c.get(paramUUID) == null)
      this.c.put(paramUUID, new d(this)); 
    d d;
    (d = (d)this.c.get(paramUUID)).a++;
  }
  
  public final void b(UUID paramUUID) {
    if (this.c.get(paramUUID) == null)
      this.c.put(paramUUID, new d(this)); 
    d d;
    (d = (d)this.c.get(paramUUID)).b++;
  }
  
  public final void a() {
    this.c = new HashMap<Object, Object>();
  }
  
  public final int c(UUID paramUUID) {
    if (this.c.get(paramUUID) == null)
      this.c.put(paramUUID, new d(this)); 
    d d;
    return (d = (d)this.c.get(paramUUID)).a;
  }
  
  public final int d(UUID paramUUID) {
    if (this.c.get(paramUUID) == null)
      this.c.put(paramUUID, new d(this)); 
    d d;
    return (d = (d)this.c.get(paramUUID)).b;
  }
  
  public final void b() {
    FileOutputStream fileOutputStream;
    (fileOutputStream = new FileOutputStream(this.b)).write(("<" + e + ">").getBytes("UTF-8"));
    for (UUID uUID : this.c.keySet()) {
      d d2 = (d)this.c.get(uUID);
      d d1;
      fileOutputStream.write(("<" + a + " questionid=\"" + uUID + "\" correctcount=\"" + (d1 = d2).a + "\" incorrectcount=\"" + (d1 = d2).b + "\" />").getBytes("UTF-8"));
    } 
    fileOutputStream.write(("</" + e + ">").getBytes("UTF-8"));
    fileOutputStream.close();
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */