package com.certification.ttv3.b;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.e.w;
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

public final class a {
  private File b;
  
  private HashMap c;
  
  private TrainingTool d;
  
  private static String e = "usernotes";
  
  public static String a = "note";
  
  public a(TrainingTool paramTrainingTool, File paramFile) {
    this.d = paramTrainingTool;
    this.b = paramFile;
    this.c = new HashMap<Object, Object>();
    try {
      FileInputStream fileInputStream = new FileInputStream(this.b);
      a a1 = this;
      b b = new b(a1, (byte)0);
      SAXParserFactory.newInstance().newSAXParser().parse(fileInputStream, b);
      fileInputStream.close();
      return;
    } catch (ParserConfigurationException parserConfigurationException) {
      JOptionPane.showMessageDialog((Component)this.d, "Data read error while loading user notes", "User notes read error", 0);
      return;
    } catch (SAXException sAXException) {
      JOptionPane.showMessageDialog((Component)this.d, "Data read error while loading user notes", "User notes read error", 0);
      return;
    } catch (FileNotFoundException fileNotFoundException) {
      return;
    } catch (IOException iOException) {
      JOptionPane.showMessageDialog((Component)this.d, "File read error while loading user notes", "User notes read error", 0);
      return;
    } 
  }
  
  public final void a() {
    FileOutputStream fileOutputStream;
    (fileOutputStream = new FileOutputStream(this.b)).write(("<" + e + ">").getBytes("UTF-8"));
    for (UUID uUID : this.c.keySet()) {
      fileOutputStream.write(("<" + a + " questionid=\"" + uUID + "\">").getBytes("UTF-8"));
      ((w)this.c.get(uUID)).a(fileOutputStream);
      fileOutputStream.write(("</" + a + ">").getBytes("UTF-8"));
    } 
    fileOutputStream.write(("</" + e + ">").getBytes("UTF-8"));
    fileOutputStream.close();
  }
  
  public final String a(UUID paramUUID) {
    return (this.c.get(paramUUID) == null) ? "" : ((w)this.c.get(paramUUID)).a();
  }
  
  public final void a(UUID paramUUID, String paramString) {
    w w;
    (w = new w()).a(paramString.trim());
    this.c.put(paramUUID, w);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */