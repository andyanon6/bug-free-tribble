package com.certification.ttv3.f;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.a.m;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public final class h {
  private String a = b();
  
  private byte[] b;
  
  public h() {
    c();
  }
  
  public static String a(char[] paramArrayOfchar) {
    try {
      MessageDigest messageDigest;
      byte[] arrayOfByte = (messageDigest = MessageDigest.getInstance("MD5")).digest((new String(paramArrayOfchar)).getBytes("UTF-8"));
      BigInteger bigInteger = new BigInteger(1, arrayOfByte);
      return String.format("%0" + (arrayOfByte.length << 1) + "x", new Object[] { bigInteger });
    } catch (Exception exception) {
      return paramArrayOfchar.toString();
    } 
  }
  
  public final String a(String paramString1, String paramString2, Proxy paramProxy, String paramString3, String paramString4, JProgressBar paramJProgressBar) {
    URLConnection uRLConnection;
    byte[] arrayOfByte1 = a(paramString1, paramString2);
    paramJProgressBar = paramJProgressBar;
    paramString4 = paramString4;
    paramString3 = paramString3;
    paramProxy = paramProxy;
    byte[] arrayOfByte2 = arrayOfByte1;
    String str2 = m.g;
    String str3 = String.valueOf(URLEncoder.encode("auth", "UTF-8")) + "=" + URLEncoder.encode(a.a(arrayOfByte2), "UTF-8");
    URL uRL = new URL(str2);
    if (paramProxy != null) {
      uRLConnection = uRL.openConnection(paramProxy);
    } else {
      uRLConnection = uRLConnection.openConnection();
    } 
    uRLConnection.setDoOutput(true);
    if (paramString3 != null && paramString4 != null)
      uRLConnection.setRequestProperty("Proxy-Authorization", "Basic " + a.a((new String(paramString3)).getBytes("UTF-8")) + ":" + a.a((new String(paramString4)).getBytes("UTF-8"))); 
    OutputStreamWriter outputStreamWriter;
    (outputStreamWriter = new OutputStreamWriter(uRLConnection.getOutputStream())).write(str3);
    outputStreamWriter.flush();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
    int i = uRLConnection.getContentLength();
    paramString4 = "";
    String str1;
    while ((str1 = bufferedReader.readLine()) != null) {
      int j = (int)((paramString4 = String.valueOf(paramString4) + str1).length() / i * 100.0F);
      if (paramJProgressBar != null)
        paramJProgressBar.setValue(j); 
    } 
    outputStreamWriter.close();
    bufferedReader.close();
    return paramString4;
  }
  
  public static String a(int paramInt) {
    Preferences preferences1;
    Preferences preferences2;
    return (preferences1 = (preferences2 = TrainingTool.q()).node("license" + paramInt)).get("licensestring", "");
  }
  
  public static Properties a(String paramString) {
    Properties properties = new Properties();
    try {
      byte[] arrayOfByte = a.b(paramString.getBytes("UTF-8"));
      ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
      ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
      ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
      ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
      ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
      ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
      ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
      ByteArrayOutputStream byteArrayOutputStream8 = new ByteArrayOutputStream();
      ByteArrayOutputStream byteArrayOutputStream9 = new ByteArrayOutputStream();
      ByteArrayOutputStream byteArrayOutputStream10 = new ByteArrayOutputStream();
      ByteArrayOutputStream byteArrayOutputStream11 = new ByteArrayOutputStream();
      byte b;
      for (b = 0; b < arrayOfByte.length && arrayOfByte[b] != 0; b += 6)
        byteArrayOutputStream1.write(arrayOfByte[b]); 
      for (b = 1; b < arrayOfByte.length && arrayOfByte[b] != 0; b += 6)
        byteArrayOutputStream2.write(arrayOfByte[b]); 
      for (b = 2; byteArrayOutputStream3.size() < 6; b += 6)
        byteArrayOutputStream3.write(arrayOfByte[b]); 
      for (b = 50; b < arrayOfByte.length && arrayOfByte[b] != 0; b += 6)
        byteArrayOutputStream11.write(arrayOfByte[b]); 
      for (b = 3; b < arrayOfByte.length && arrayOfByte[b] != 0; b += 6)
        byteArrayOutputStream4.write(arrayOfByte[b]); 
      for (b = 4; b < arrayOfByte.length && arrayOfByte[b] != 0; b += 6)
        byteArrayOutputStream5.write(arrayOfByte[b]); 
      for (b = 5; b < arrayOfByte.length && arrayOfByte[b] != 0; b += 6)
        byteArrayOutputStream6.write(arrayOfByte[b]); 
      for (b += 6; b < arrayOfByte.length && arrayOfByte[b] != 0; b += 6)
        byteArrayOutputStream7.write(arrayOfByte[b]); 
      for (b += 6; b < arrayOfByte.length && arrayOfByte[b] != 0; b += 6)
        byteArrayOutputStream8.write(arrayOfByte[b]); 
      for (b += 6; b < arrayOfByte.length && arrayOfByte[b] != 0; b += 6)
        byteArrayOutputStream9.write(arrayOfByte[b]); 
      for (b += 6; b < arrayOfByte.length && arrayOfByte[b] != 0; b += 6)
        byteArrayOutputStream10.write(arrayOfByte[b]); 
      properties.setProperty("user", byteArrayOutputStream1.toString().toLowerCase());
      properties.setProperty("pass", byteArrayOutputStream2.toString());
      properties.setProperty("mac", byteArrayOutputStream3.toString());
      properties.setProperty("cpu", byteArrayOutputStream4.toString());
      properties.setProperty("timestamps", byteArrayOutputStream5.toString());
      properties.setProperty("key", byteArrayOutputStream6.toString());
      properties.setProperty("vendor", byteArrayOutputStream7.toString());
      properties.setProperty("code", byteArrayOutputStream8.toString());
      properties.setProperty("version", byteArrayOutputStream9.toString());
      properties.setProperty("utime", byteArrayOutputStream10.toString());
      properties.setProperty("license", paramString);
      String[] arrayOfString = (paramString = properties.getProperty("timestamps")).split(":");
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, yyyy");
      if (arrayOfString.length == 3) {
        properties.setProperty("start", arrayOfString[0]);
        try {
          long l = Long.parseLong(arrayOfString[0]);
          Date date = new Date(l * 1000L);
          properties.setProperty("startdate", simpleDateFormat.format(date));
        } catch (Exception exception) {}
        properties.setProperty("expire", arrayOfString[1]);
        try {
          long l = Long.parseLong(arrayOfString[1]);
          Date date = new Date(l * 1000L);
          properties.setProperty("expiredate", simpleDateFormat.format(date));
        } catch (Exception exception) {}
        properties.setProperty("secleft", arrayOfString[2]);
      } 
      try {
        long l = Long.parseLong(byteArrayOutputStream11.toString());
        properties.setProperty("filesize", Long.toString(l));
      } catch (Exception exception) {
        properties.setProperty("filesize", "0");
      } 
    } catch (Exception exception) {
      return null;
    } 
    return properties;
  }
  
  public static void a(String[] paramArrayOfString, JProgressBar paramJProgressBar) {
    if (paramJProgressBar != null)
      paramJProgressBar.setString("Updating Licenses 1/4..."); 
    byte b1 = 0;
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    byte b2 = 0;
    String[] arrayOfString;
    int j = (arrayOfString = paramArrayOfString).length;
    int i;
    for (i = 0; i < j; i++) {
      String str;
      Properties properties;
      if ((properties = a(str = arrayOfString[i])) != null) {
        long l = Long.parseLong(properties.getProperty("secleft"));
        boolean bool = false;
        for (Integer integer : hashMap1.keySet()) {
          Properties properties1;
          if ((properties1 = (Properties)hashMap1.get(integer)).getProperty("key").compareTo(properties.getProperty("key")) == 0 && properties1.getProperty("user").compareTo(properties.getProperty("user")) == 0) {
            long l1 = Long.parseLong(properties1.getProperty("secleft"));
            if (l > l1)
              hashMap1.put(integer, properties); 
            bool = true;
          } 
        } 
        if (!bool)
          hashMap1.put(Integer.valueOf(++b1), properties); 
      } 
      if (paramJProgressBar != null) {
        int k = (int)(++b2 / paramArrayOfString.length * 100.0F);
        paramJProgressBar.setValue(k);
      } 
    } 
    if (paramJProgressBar != null)
      paramJProgressBar.setString("Updating Licenses 2/4..."); 
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    i = 0;
    try {
      Preferences preferences;
      arrayOfString = (preferences = TrainingTool.q()).childrenNames();
      b2 = 0;
      String[] arrayOfString1;
      int k = (arrayOfString1 = arrayOfString).length;
      for (byte b = 0; b < k; b++) {
        String str;
        if ((str = arrayOfString1[b]).indexOf("license") == 0) {
          hashMap2.put(str, a(preferences.node(str).get("licensestring", "")));
          try {
            int m;
            if ((m = Integer.parseInt(str.substring(7))) > i)
              i = m; 
          } catch (NumberFormatException numberFormatException) {}
        } 
        if (paramJProgressBar != null) {
          int m = (int)(++b2 / arrayOfString.length * 100.0F);
          paramJProgressBar.setValue(m);
        } 
      } 
      i++;
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(null, "Unable to access system preferences,\nplease try executing the Testing Engine as a computer administrator.", "Unable to store licenses", 0);
    } 
    if (paramJProgressBar != null)
      paramJProgressBar.setString("Updating Licenses 3/4..."); 
    try {
      Preferences preferences = TrainingTool.q();
      b2 = 0;
      for (Integer integer : hashMap1.keySet()) {
        Properties properties = (Properties)hashMap1.get(integer);
        Boolean bool = Boolean.valueOf(false);
        for (String str : hashMap2.keySet()) {
          Properties properties1;
          if ((properties1 = (Properties)hashMap2.get(str)) != null && properties != null && properties1.getProperty("key").compareTo(properties.getProperty("key")) == 0 && properties1.getProperty("user").compareTo(properties.getProperty("user")) == 0) {
            preferences.node(str).put("licensestring", properties.getProperty("license"));
            long l1;
            if ((l1 = Long.parseLong(properties.getProperty("secleft"))) <= 0L) {
              if (preferences.node(str).get("status", "0").compareTo("2") == 0)
                preferences.node(str).put("status", "-1"); 
            } else if (preferences.node(str).get("status", "0").compareTo("-1") == 0) {
              preferences.node(str).put("status", "2");
            } 
            bool = Boolean.valueOf(true);
          } 
        } 
        long l = 0L;
        try {
          l = Long.parseLong(properties.getProperty("secleft"));
        } catch (Exception exception) {}
        if (!bool.booleanValue() && l > 0L) {
          preferences.node("license" + i).put("licensestring", properties.getProperty("license"));
          i++;
        } 
        if (paramJProgressBar != null) {
          int k = (int)(++b2 / hashMap1.size() * 100.0F);
          paramJProgressBar.setValue(k);
        } 
      } 
      preferences.sync();
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(null, "Unable to access system preferences,\nplease try executing the Testing Engine as a computer administrator.", "Unable to store licenses", 0);
    } 
    if (paramJProgressBar != null)
      paramJProgressBar.setString("Updating Licenses 4/4..."); 
    try {
      Preferences preferences = TrainingTool.q();
      b2 = 0;
      for (String str : hashMap2.keySet()) {
        Properties properties = (Properties)hashMap2.get(str);
        Boolean bool = Boolean.valueOf(false);
        for (Integer integer : hashMap1.keySet()) {
          Properties properties1 = (Properties)hashMap1.get(integer);
          if (properties != null && properties1 != null && (properties.getProperty("user").compareTo(properties1.getProperty("user")) != 0 || (properties.getProperty("vendor").compareTo(properties1.getProperty("vendor")) == 0 && properties.getProperty("code").compareTo(properties1.getProperty("code")) == 0)))
            bool = Boolean.valueOf(true); 
        } 
        if (!bool.booleanValue()) {
          System.out.println("Delete license:" + str);
          preferences.node(str).put("status", "-1");
        } 
        if (paramJProgressBar != null) {
          int k = (int)(++b2 / hashMap2.size() * 100.0F);
          paramJProgressBar.setValue(k);
        } 
      } 
      return;
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(null, "Unable to access system preferences,\nplease try executing the Testing Engine as a computer administrator.", "Unable to store licenses", 0);
      return;
    } 
  }
  
  private static HashMap a() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    try {
      Preferences preferences;
      String[] arrayOfString1;
      String[] arrayOfString2;
      int i = (arrayOfString2 = arrayOfString1 = (preferences = TrainingTool.q()).childrenNames()).length;
      for (byte b = 0; b < i; b++) {
        String str;
        if ((str = arrayOfString2[b]).indexOf("license") == 0 && preferences.node(str).get("status", "0").compareTo("-1") != 0) {
          int j = Integer.parseInt(str.substring(7));
          hashMap.put(Integer.valueOf(j), preferences.node(str).get("licensestring", ""));
        } 
      } 
    } catch (Exception exception) {}
    return hashMap;
  }
  
  public static ArrayList a(String paramString1, String paramString2, JProgressBar paramJProgressBar) {
    HashMap hashMap = a();
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    for (Integer integer : hashMap.keySet()) {
      Properties properties;
      if ((properties = a((String)hashMap.get(integer))) != null && properties.getProperty("user") != null && properties.getProperty("user").compareTo(paramString1) == 0 && properties.getProperty("pass") != null && properties.getProperty("pass").compareTo(paramString2) == 0) {
        String[] arrayOfString = { properties.getProperty("vendor"), properties.getProperty("code") };
        hashMap1.put(integer, arrayOfString);
        if (paramJProgressBar != null) {
          int i = (int)(0.0F / hashMap.size() * 100.0F);
          paramJProgressBar.setValue(i);
        } 
      } 
    } 
    ArrayList arrayList;
    return arrayList = a(hashMap1);
  }
  
  public static InputStream a(String paramString1, String paramString2, Proxy paramProxy, String paramString3, String paramString4) {
    try {
      URLConnection uRLConnection;
      paramString2 = String.valueOf(URLEncoder.encode("auth", "UTF-8")) + "=" + URLEncoder.encode(paramString2, "UTF-8");
      URL uRL = new URL(paramString1);
      if (paramProxy != null) {
        uRLConnection = uRL.openConnection(paramProxy);
      } else {
        uRLConnection = uRLConnection.openConnection();
      } 
      uRLConnection.setDoOutput(true);
      if (paramString3 != null && paramString4 != null)
        uRLConnection.setRequestProperty("Proxy-Authorization", "Basic " + a.a((new String(paramString3)).getBytes("UTF-8")) + ":" + a.a((new String(paramString4)).getBytes("UTF-8"))); 
      OutputStreamWriter outputStreamWriter;
      (outputStreamWriter = new OutputStreamWriter(uRLConnection.getOutputStream())).write(paramString2);
      outputStreamWriter.flush();
      return uRLConnection.getInputStream();
    } catch (Exception exception) {
      return null;
    } 
  }
  
  private byte[] a(String paramString1, String paramString2) {
    byte[] arrayOfByte;
    try {
      byte[] arrayOfByte2 = paramString1.toLowerCase().getBytes("UTF-8");
      byte[] arrayOfByte1 = paramString2.getBytes("UTF-8");
      byte[] arrayOfByte3 = this.a.getBytes("UTF-8");
      arrayOfByte = new byte[360];
      byte b;
      for (b = 0; b < arrayOfByte2.length; b++) {
        if (b * 6 < 360)
          arrayOfByte[b * 6] = arrayOfByte2[b]; 
      } 
      for (b = 0; b < arrayOfByte1.length; b++) {
        if (b * 6 + 1 < 360)
          arrayOfByte[b * 6 + 1] = arrayOfByte1[b]; 
      } 
      for (b = 0; b < this.b.length; b++) {
        if (b * 6 + 2 < 360)
          arrayOfByte[b * 6 + 2] = this.b[b]; 
      } 
      for (b = 0; b < arrayOfByte3.length; b++) {
        if (b * 6 + 3 < 360)
          arrayOfByte[b * 6 + 3] = arrayOfByte3[b]; 
      } 
    } catch (Exception exception) {
      arrayOfByte = new byte[1];
    } 
    return arrayOfByte;
  }
  
  private static String b() {
    String str = "";
    try {
      File file;
      (file = File.createTempFile("tmp", ".vbs")).deleteOnExit();
      FileWriter fileWriter = new FileWriter(file);
      String str2 = "Set objWMIService = GetObject(\"winmgmts:\\\\.\\root\\cimv2\")\nSet colItems = objWMIService.ExecQuery _ \n   (\"Select * from Win32_BaseBoard\") \nFor Each objItem in colItems \n    Wscript.Echo objItem.SerialNumber \n    exit for \nNext \n";
      fileWriter.write(str2);
      fileWriter.close();
      Process process = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
      String str1;
      while ((str1 = bufferedReader.readLine()) != null)
        str = String.valueOf(str) + str1; 
      bufferedReader.close();
    } catch (Exception exception) {}
    return str.trim();
  }
  
  private void c() {
    try {
      InetAddress inetAddress;
      NetworkInterface networkInterface;
      if ((networkInterface = NetworkInterface.getByInetAddress(inetAddress = InetAddress.getLocalHost())) != null) {
        this.b = networkInterface.getHardwareAddress();
        if (this.b == null)
          this.b = new byte[6]; 
        if (this.b.length < 6) {
          byte[] arrayOfByte = new byte[6];
          for (byte b = 0; b < this.b.length; b++)
            arrayOfByte[b] = this.b[b]; 
          this.b = arrayOfByte;
          return;
        } 
      } 
    } catch (Exception exception) {
      this.b = new byte[6];
    } 
  }
  
  private static ArrayList a(Map paramMap) {
    LinkedList<?> linkedList;
    Collections.sort(linkedList = new LinkedList(paramMap.entrySet()), new i());
    ArrayList<Integer> arrayList = new ArrayList();
    for (Map.Entry entry : linkedList)
      arrayList.add((Integer)entry.getKey()); 
    return arrayList;
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */