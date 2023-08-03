package com.certification.ttv3;

import com.certification.ttv3.a.a;
import com.certification.ttv3.a.b;
import com.certification.ttv3.a.d;
import com.certification.ttv3.a.k;
import com.certification.ttv3.a.m;
import com.certification.ttv3.b.a;
import com.certification.ttv3.b.c;
import com.certification.ttv3.b.f;
import com.certification.ttv3.b.h;
import com.certification.ttv3.b.k;
import com.certification.ttv3.c.a;
import com.certification.ttv3.d.A;
import com.certification.ttv3.d.b;
import com.certification.ttv3.d.l;
import com.certification.ttv3.d.q;
import com.certification.ttv3.e.e;
import com.certification.ttv3.e.f;
import com.certification.ttv3.e.i;
import com.certification.ttv3.e.u;
import com.certification.ttv3.f.a;
import com.certification.ttv3.f.c;
import com.certification.ttv3.f.h;
import com.certification.ttv3.f.n;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;
import java.util.prefs.Preferences;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TrainingTool extends JFrame implements c, WindowListener {
  private e l;
  
  private a m;
  
  private m n;
  
  private d o;
  
  private k p;
  
  private Properties q;
  
  private a r;
  
  private boolean s;
  
  private Dimension t;
  
  private k u;
  
  private q v;
  
  private A w;
  
  private l x;
  
  private b y;
  
  private ArrayList z;
  
  private a A;
  
  private c B;
  
  private h C;
  
  private long D;
  
  private String E;
  
  private String F;
  
  private String G;
  
  private File H;
  
  private int I = 0;
  
  private boolean J;
  
  private boolean K;
  
  private static String L = "userexam";
  
  private static String M = "notes.xml";
  
  private static String N = "optimizer.xml";
  
  public static String a = "Pass4Sure";
  
  public static String b = "pass4sure.com";
  
  public static String c = "http://www." + b;
  
  public static String d = "mailto:feedback@" + b + "?subject=Feedback%20from%20Pass4Sure%20Exam%20Engine";
  
  public static String e = "mailto:support@" + b + "?subject=Support%20request%20from%20Pass4Sure%20Exam%20Engine";
  
  private static String O = "http://www." + b + "/auth/engine-update-v3.php";
  
  public static int f = 0;
  
  public static int g = 1;
  
  public static int h = 50;
  
  private static RenderingHints P;
  
  public static int i = 3;
  
  public static int j = 7;
  
  public static int k = 9;
  
  public TrainingTool() {
    URL.setURLStreamHandlerFactory((URLStreamHandlerFactory)new n(this));
    Toolkit toolkit = getToolkit();
    URL uRL = getClass().getResource("/com/certification/ttv3/images/icon-16px.png");
    setIconImage(toolkit.getImage(uRL));
    this.E = String.valueOf(System.getProperty("user.home")) + "/" + a;
    d(this.E);
    E();
    TrainingTool trainingTool = this;
    try {
      Preferences preferences = q();
      trainingTool.F = preferences.get("user", "").toLowerCase();
      trainingTool.G = preferences.get("pass", "");
      trainingTool.a(trainingTool.F, trainingTool.G, (JProgressBar)null);
    } catch (Exception exception) {}
    B();
    this.z = new ArrayList();
    this.r = new a(this);
    setJMenuBar((JMenuBar)this.r);
    this.w = new A(this);
    this.v = new q(this);
    add((Component)this.v, "Center");
    h(0);
    this.m = new a(this);
    setSize(new Dimension(1000, 800));
    setLocationRelativeTo((Component)null);
    this.s = false;
    setDefaultCloseOperation(0);
    addWindowListener(this);
    setTitle(String.valueOf(a) + " Testing Engine");
    setVisible(true);
    if (this.F != null && this.G != null && this.F.length() > 0 && this.G.length() > 0) {
      trainingTool = this;
      try {
        int i;
        Preferences preferences;
        if ((i = (preferences = q()).getInt("license", 0)) > 0)
          trainingTool.a(i); 
      } catch (Exception exception) {}
      if (this.I == 0)
        b(); 
    } else {
      a();
    } 
    try {
      boolean bool;
      if ((bool = H()) && JOptionPane.showConfirmDialog(this, "A software update is available,\nwould you like to download this update?", "Update available", 0) == 0) {
        b b1;
        (b1 = new b(this, this.r)).setVisible(true);
        return;
      } 
    } catch (Exception exception) {}
  }
  
  public final void a() {
    a("", "", (JProgressBar)null);
    if (this.n == null)
      this.n = new m(this); 
    this.n.a();
  }
  
  public final void b() {
    if (this.o == null) {
      this.o = new d(this);
    } else {
      this.o.a();
    } 
    this.o.b();
    this.o.setVisible(true);
  }
  
  public final File a(String paramString) {
    if (paramString.length() > 0)
      return new File(this.E, paramString); 
    try {
      return File.createTempFile("dat", ".epk", new File(this.E));
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public final void a(int paramInt) {
    try {
      int i;
      if ((i = b(paramInt)) != 2)
        return; 
      Preferences preferences1;
      Preferences preferences2;
      String str = (preferences2 = (preferences1 = q()).node("license" + paramInt)).get("file", "");
      Properties properties = h.a(preferences2.get("licensestring", ""));
      if (str.indexOf("epk") > 0)
        try {
          File file = new File(this.E, str);
          String str1 = properties.getProperty("key");
          file = file;
          TrainingTool trainingTool = this;
          e e1 = new e();
          SecretKeySpec secretKeySpec = new SecretKeySpec(a.a(str1), "AES");
          ZipFile zipFile;
          ZipEntry zipEntry = (zipFile = new ZipFile(file)).getEntry("qpool.xml");
          Cipher cipher;
          (cipher = Cipher.getInstance("AES")).init(2, secretKeySpec);
          CipherInputStream cipherInputStream = new CipherInputStream(zipFile.getInputStream(zipEntry), cipher);
          f f = (f)e1.j();
          SAXParserFactory.newInstance().newSAXParser().parse(cipherInputStream, (DefaultHandler)f);
          cipherInputStream.close();
          trainingTool.l = e1;
          trainingTool.K = trainingTool.l.i();
          trainingTool.u = null;
          trainingTool.remove((Component)trainingTool.v);
          trainingTool.remove((Component)trainingTool.w);
          trainingTool.w = new A(trainingTool);
          trainingTool.v = new q(trainingTool);
          trainingTool.x();
          trainingTool.m = new a(trainingTool);
          if (trainingTool.l != null)
            trainingTool.setTitle(String.valueOf(a) + " " + trainingTool.l.e() + " " + trainingTool.l.d() + " Testing Engine"); 
          this.I = paramInt;
          d(F());
          D();
          (trainingTool = this).A = new a(trainingTool, new File(String.valueOf(trainingTool.F()) + "/" + M));
          (trainingTool = this).B = new c(trainingTool, new File(String.valueOf(trainingTool.F()) + "/" + N));
          preferences1.putInt("license", this.I);
          E();
          return;
        } catch (Exception exception) {
          return;
        }  
    } catch (Exception exception) {}
  }
  
  public final int b(int paramInt) {
    int i;
    Preferences preferences1;
    Preferences preferences2;
    Properties properties;
    long l1;
    if ((l1 = Long.parseLong((properties = h.a((preferences1 = (preferences2 = q()).node("license" + paramInt)).get("licensestring", ""))).getProperty("secleft"))) < 0L)
      return 3; 
    String str1;
    if ((str1 = preferences1.get("file", "")).length() == 0)
      return 0; 
    String str2 = preferences1.get("status", "0");
    boolean bool;
    File file;
    if (!(bool = (file = new File(this.E, str1)).exists()))
      return 0; 
    if (bool && str2.compareTo("2") == 0)
      return 2; 
    if (bool && str2.compareTo("1") == 0)
      return 1; 
    bool = false;
    try {
      i = Integer.parseInt(preferences1.get("status", "0"));
    } catch (Exception exception) {}
    return i;
  }
  
  private void B() {
    long l1 = System.currentTimeMillis() / 1000L;
    Preferences preferences = q();
    ArrayList<?> arrayList;
    for (Integer integer : arrayList = h.a(this.F, this.G, null)) {
      Preferences preferences1 = preferences.node("license" + integer);
      Properties properties = h.a(h.a(integer.intValue()));
      try {
        long l2 = Long.parseLong(properties.getProperty("expire"));
        long l3 = Long.parseLong(properties.getProperty("secleft"));
        if (l2 < l1 || l3 <= 0L) {
          preferences1.put("status", "3");
          return;
        } 
      } catch (Exception exception) {}
      int i;
      if ((i = b(integer.intValue())) == 1 || i == 3) {
        properties.setProperty("file", preferences1.get("file", ""));
        if (properties.getProperty("file") != null) {
          File file = new File(this.E, properties.getProperty("file"));
          long l2 = 0L;
          try {
            l2 = Long.parseLong(properties.getProperty("filesize"));
          } catch (Exception exception) {}
          if (file.exists() && file.length() == l2) {
            preferences1.put("status", "2");
          } else {
            preferences1.put("status", "0");
          } 
        } else {
          preferences1.put("status", "0");
        } 
      } 
      if (i == 2) {
        properties.setProperty("file", preferences1.get("file", ""));
        File file;
        if (properties.getProperty("file") == null || !(file = new File(this.E, properties.getProperty("file"))).exists())
          preferences1.put("status", "0"); 
      } 
    } 
  }
  
  public final String c() {
    return this.F;
  }
  
  public final String d() {
    return this.G;
  }
  
  public final void a(String paramString1, String paramString2, JProgressBar paramJProgressBar) {
    if (paramString1 != null && paramString2 != null && paramString1.length() > 0 && paramString2.length() > 0) {
      String str1;
      Proxy proxy = null;
      String str2 = null;
      String str3 = null;
      paramString1 = paramString1.toLowerCase();
      try {
        if (this.q.getProperty(A.bc).compareTo("Y") == 0) {
          proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.q.getProperty(A.bd), Integer.parseInt(this.q.getProperty(A.be))));
          if (this.q.getProperty(A.bf).compareTo("Y") == 0) {
            if (this.q.getProperty(A.bg).trim().length() > 0)
              str2 = this.q.getProperty(A.bg).trim(); 
            if (this.q.getProperty(A.bh).trim().length() > 0)
              str3 = this.q.getProperty(A.bh).trim(); 
          } 
        } 
      } catch (Exception exception) {
        JOptionPane.showMessageDialog(this, "Error using proxy settings,\nplease check that settings are correct.", "Proxy connection error", 1);
      } 
      if (this.C == null)
        this.C = new h(); 
      try {
        str1 = this.C.a(paramString1, paramString2, proxy, str2, str3, paramJProgressBar);
      } catch (IOException iOException) {
        JOptionPane.showMessageDialog(this, "                Unable to connect, please verify firewall and proxy settings.\n\nProxy settings for this application can be accessed by cancelling the login dialog\n                   and using the Tools | Settings menu option, Network tab.", "Unable to connect to " + a + " exam server", 1);
        C();
        return;
      } 
      if (str1.indexOf("login not found") == 0) {
        JOptionPane.showMessageDialog(this, "Login not recognized, please verify login details.", "Login not found", 1);
        C();
        return;
      } 
      if (str1.indexOf("max licenses") == 0) {
        JOptionPane.showMessageDialog(this, "Maximum licenses used for this login,\nplease use a previously licensed computer or alternate login.", "Licenses used", 1);
        C();
        return;
      } 
      if (str1.length() > 10) {
        String[] arrayOfString = str1.split(" ");
        if (paramJProgressBar != null)
          paramJProgressBar.setString("Updating Licenses..."); 
        h.a(arrayOfString, paramJProgressBar);
      } 
      ArrayList<?> arrayList;
      if ((arrayList = h.a(paramString1, paramString2, paramJProgressBar)).size() > 0) {
        try {
          Preferences preferences;
          (preferences = q()).put("user", paramString1);
          preferences.put("pass", paramString2);
        } catch (Exception exception) {}
        this.F = paramString1;
        this.G = paramString2;
        this.l = null;
        this.n.setVisible(false);
        b();
        return;
      } 
      JOptionPane.showMessageDialog(this, "No current licenses found for this user, your product licenses may be expired.\nPlease log in to the " + a + " website to verify or renew your product licenses.", "No licenses found", 1);
    } 
    C();
  }
  
  private void C() {
    this.F = "";
    this.G = "";
    this.l = null;
    this.I = 0;
    this.z = new ArrayList();
    Preferences preferences;
    (preferences = q()).putInt("license", this.I);
    preferences.put("user", "");
    preferences.put("pass", "");
    E();
    if (this.v != null)
      remove((Component)this.v); 
    if (this.w != null)
      remove((Component)this.w); 
    this.w = new A(this);
    this.v = new q(this);
    x();
    this.m = new a(this);
  }
  
  public static RenderingHints e() {
    if (P == null)
      (P = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)).put(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON); 
    return P;
  }
  
  public final InputStream b(String paramString) {
    CipherInputStream cipherInputStream = null;
    if (this.I > 0)
      try {
        Preferences preferences;
        Properties properties = h.a((preferences = (preferences = q()).node("license" + this.I)).get("licensestring", ""));
        String str = preferences.get("file", "");
        SecretKeySpec secretKeySpec = new SecretKeySpec(a.a(properties.getProperty("key")), "AES");
        File file = new File(this.E, str);
        ZipFile zipFile;
        ZipEntry zipEntry = (zipFile = new ZipFile(file)).getEntry(paramString);
        Cipher cipher;
        (cipher = Cipher.getInstance("AES")).init(2, secretKeySpec);
        cipherInputStream = new CipherInputStream(zipFile.getInputStream(zipEntry), cipher);
      } catch (Exception exception) {} 
    return cipherInputStream;
  }
  
  public final boolean f() {
    return this.K;
  }
  
  private void D() {
    this.z = new ArrayList();
    File file;
    File[] arrayOfFile1;
    File[] arrayOfFile2;
    int i = (arrayOfFile2 = arrayOfFile1 = (file = new File(F())).listFiles()).length;
    for (byte b1 = 0; b1 < i; b1++) {
      File file1;
      if ((file1 = arrayOfFile2[b1]).getName().indexOf(L) == 0 && !file1.isDirectory())
        try {
          Properties properties = h.a(h.a(this.I));
          this.z.add(new f(this, file1, properties.getProperty("key")));
        } catch (ParserConfigurationException parserConfigurationException) {
          file1.delete();
        } catch (SAXException sAXException) {
          file1.delete();
        } catch (FileNotFoundException fileNotFoundException) {
        
        } catch (IOException iOException) {
        
        } catch (Exception exception) {
          file1.delete();
        }  
    } 
    f[] arrayOfF1 = new f[this.z.size()];
    Arrays.sort((Object[])(arrayOfF1 = (f[])this.z.toArray((Object[])arrayOfF1)));
    this.z = new ArrayList();
    f[] arrayOfF2;
    int j = (arrayOfF2 = arrayOfF1).length;
    for (i = 0; i < j; i++) {
      f f = arrayOfF2[i];
      this.z.add(f);
    } 
  }
  
  public final f a(f paramf) {
    try {
      File file;
      if (paramf.a() == null) {
        String str2 = ".dat";
        String str1 = F();
        TrainingTool trainingTool = this;
        d(str1);
        file = File.createTempFile(L, str2, new File(str1));
      } else {
        this.z.remove(paramf);
        file = paramf.a();
      } 
      Properties properties = h.a(h.a(this.I));
      SecretKeySpec secretKeySpec = new SecretKeySpec(a.a(properties.getProperty("key")), "AES");
      Cipher cipher;
      (cipher = Cipher.getInstance("AES")).init(1, secretKeySpec);
      CipherOutputStream cipherOutputStream = new CipherOutputStream(new FileOutputStream(file), cipher);
      paramf.a(cipherOutputStream);
      cipherOutputStream.close();
      paramf = new f(this, file, properties.getProperty("key"));
      this.z.add(paramf);
      return paramf;
    } catch (IOException iOException) {
      JOptionPane.showMessageDialog(this, "Error saving exam data, history for this exam may be lost.", "File error", 0);
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(this, "Error saving exam data, history for this exam may be lost.", "Write error", 0);
    } 
    return null;
  }
  
  public final void c(int paramInt) {
    f f = this.z.get(paramInt);
    boolean bool = true;
    TrainingTool trainingTool;
    if ((trainingTool = this).q.getProperty(A.aZ).compareTo("Y") == 0)
      bool = (JOptionPane.showConfirmDialog(this, "This will permanently delete all exam answer data. Are you sure?", "Delete user exam data", 2) == 0) ? true : false; 
    if (bool) {
      File file;
      (file = f.m()).delete();
      this.z.remove(paramInt);
      this.v.b();
    } 
  }
  
  public final void b(f paramf) {
    f f1 = paramf;
    c c1 = this.B;
    for (byte b1 = 0; b1 < f1.d(); b1++) {
      h h1;
      u u = (h1 = f1.a(b1)).a();
      if (h1.g())
        if (h1.f()) {
          c1.a(u.a());
        } else {
          c1.b(u.a());
        }  
    } 
    try {
      this.B.b();
      return;
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(this, "Unable to write optimizer data to file", "File error", 0);
      return;
    } 
  }
  
  public final void g() {
    this.B.a();
    try {
      this.B.b();
      return;
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(this, "Unable to write optimizer data to file", "File error", 0);
      return;
    } 
  }
  
  public final void h() {
    try {
      this.A.a();
      return;
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(this, "Unable to write notes to file", "File error", 0);
      return;
    } 
  }
  
  public final String a(UUID paramUUID) {
    return this.A.a(paramUUID);
  }
  
  public final void a(UUID paramUUID, String paramString) {
    this.A.a(paramUUID, paramString);
  }
  
  public final c i() {
    return this.B;
  }
  
  public final e j() {
    return this.l;
  }
  
  public final l k() {
    return this.x;
  }
  
  private void h(int paramInt) {
    if (this.r != null)
      this.r.a(paramInt); 
  }
  
  public final void l() {
    if (this.q.getProperty(A.aY).compareTo("Y") == 0 && JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Quit Training Tool", 0) != 0)
      return; 
    if (this.x != null && this.x.f())
      this.x.e(); 
    TrainingTool trainingTool;
    (trainingTool = this).setVisible(false);
    trainingTool.dispose();
    if (trainingTool.J && trainingTool.H != null)
      try {
        ProcessBuilder processBuilder;
        (processBuilder = new ProcessBuilder(new String[] { "updater.exe", trainingTool.H.getAbsolutePath() })).start();
      } catch (Exception exception) {
        JOptionPane.showMessageDialog(trainingTool, "Unable to start update installer process.\nPlease navigate to " + trainingTool.H.getAbsolutePath() + "\nand run the install manually.", "Update error", 1);
      }  
    System.exit(0);
  }
  
  public final void a(boolean paramBoolean, File paramFile) {
    this.H = paramFile;
    this.J = true;
  }
  
  public final void m() {
    setVisible(false);
    if (!this.s) {
      this.t = getSize();
      removeNotify();
      setExtendedState(6);
      setUndecorated(true);
      this.s = true;
      addNotify();
    } else {
      removeNotify();
      setExtendedState(0);
      setUndecorated(false);
      this.s = false;
      addNotify();
      setSize(this.t);
    } 
    setVisible(true);
  }
  
  public static String d(int paramInt) {
    int i = paramInt / 3600;
    int j = (paramInt %= 3600) / 60;
    paramInt %= 60;
    return String.valueOf(i) + ":" + ((j <= 9) ? "0" : "") + j + ":" + ((paramInt <= 9) ? "0" : "") + paramInt;
  }
  
  public final void n() {
    Component[] arrayOfComponent;
    int i = (arrayOfComponent = getComponents()).length;
    for (byte b1 = 0; b1 < i; b1++) {
      Component component;
      if ((component = arrayOfComponent[b1]) == this.w)
        return; 
    } 
    G();
    add((Component)this.w, "Center");
    this.w.a();
    validate();
  }
  
  public final void o() {
    this.m.setLocationRelativeTo(this);
    this.m.setVisible(true);
  }
  
  public final void p() {
    if (this.p == null)
      this.p = new k(this, 0); 
    if (this.x == null) {
      this.p.b(this.y.a());
      this.p.a(1);
    } else {
      this.p.b(this.x.b());
      this.p.a(this.x.a() + 1);
    } 
    this.p.setVisible(true);
  }
  
  private void E() {
    this.q = new Properties();
    b(this.q);
    c(this.q);
    try {
      Preferences preferences1;
      Preferences preferences2;
      String[] arrayOfString1;
      String[] arrayOfString2;
      int i = (arrayOfString2 = arrayOfString1 = (preferences2 = (preferences1 = q()).node("settings")).keys()).length;
      byte b1;
      for (b1 = 0; b1 < i; b1++) {
        String str = arrayOfString2[b1];
        this.q.setProperty(str, preferences2.get(str, ""));
      } 
      if (this.I > 0) {
        i = (arrayOfString2 = arrayOfString1 = (preferences2 = preferences1.node("license" + this.I)).keys()).length;
        for (b1 = 0; b1 < i; b1++) {
          String str = arrayOfString2[b1];
          this.q.setProperty(str, preferences2.get(str, ""));
        } 
        return;
      } 
    } catch (Exception exception) {}
  }
  
  public static Preferences q() {
    try {
      Preferences preferences;
      return preferences = (preferences = Preferences.userRoot()).node(a);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final Properties r() {
    return this.q;
  }
  
  public final void a(Properties paramProperties) {
    Preferences preferences;
    (preferences = q().node("settings")).put(A.aM, paramProperties.getProperty(A.aM));
    preferences.put(A.aN, paramProperties.getProperty(A.aN));
    preferences.put(A.aW, paramProperties.getProperty(A.aW));
    preferences.put(A.aX, paramProperties.getProperty(A.aX));
    preferences.put(A.aO, paramProperties.getProperty(A.aO));
    preferences.put(A.aP, paramProperties.getProperty(A.aP));
    preferences.put(A.aQ, paramProperties.getProperty(A.aQ));
    preferences.put(A.aR, paramProperties.getProperty(A.aR));
    preferences.put(A.aS, paramProperties.getProperty(A.aS));
    preferences.put(A.aT, paramProperties.getProperty(A.aT));
    preferences.put(A.aU, paramProperties.getProperty(A.aU));
    preferences.put(A.aV, paramProperties.getProperty(A.aV));
    preferences.put(A.aM, paramProperties.getProperty(A.aM));
    preferences.put(A.aN, paramProperties.getProperty(A.aN));
    preferences.put(A.aY, paramProperties.getProperty(A.aY));
    preferences.put(A.aZ, paramProperties.getProperty(A.aZ));
    preferences.put(A.ba, paramProperties.getProperty(A.ba));
    preferences.put(A.bb, paramProperties.getProperty(A.bb));
    preferences.put(A.bc, paramProperties.getProperty(A.bc));
    preferences.put(A.bd, paramProperties.getProperty(A.bd));
    preferences.put(A.be, paramProperties.getProperty(A.be));
    preferences.put(A.bf, paramProperties.getProperty(A.bf));
    preferences.put(A.bg, paramProperties.getProperty(A.bg));
    preferences.put(A.bh, paramProperties.getProperty(A.bh));
    TrainingTool trainingTool;
    if (this.I > 0 && (trainingTool = this).l != null) {
      (preferences = q().node("license" + this.I)).put(A.ak, paramProperties.getProperty(A.ak));
      preferences.put(A.al, paramProperties.getProperty(A.al));
      preferences.put(A.am, paramProperties.getProperty(A.am));
      preferences.put(A.an, paramProperties.getProperty(A.an));
      preferences.put(A.ao, paramProperties.getProperty(A.ao));
      preferences.put(A.ap, paramProperties.getProperty(A.ap));
      preferences.put(A.aq, paramProperties.getProperty(A.aq));
      preferences.put(A.ar, paramProperties.getProperty(A.ar));
      preferences.put(A.as, paramProperties.getProperty(A.as));
      preferences.put(A.at, paramProperties.getProperty(A.at));
      preferences.put(A.au, paramProperties.getProperty(A.au));
      preferences.put(A.av, paramProperties.getProperty(A.av));
      preferences.put(A.aw, paramProperties.getProperty(A.aw));
      preferences.put(A.ax, paramProperties.getProperty(A.ax));
      preferences.put(A.ay, paramProperties.getProperty(A.ay));
      preferences.put(A.az, paramProperties.getProperty(A.az));
      preferences.put(A.aA, paramProperties.getProperty(A.aA));
      ArrayList arrayList = (trainingTool = this).l.a();
      byte b1;
      for (b1 = 0; b1 < arrayList.size(); b1++)
        preferences.put(String.valueOf(A.aC) + b1, paramProperties.getProperty(String.valueOf(A.aC) + b1)); 
      preferences.put(A.aB, paramProperties.getProperty(A.aB));
      preferences.put(String.valueOf(A.aD) + "Single Choice", paramProperties.getProperty(String.valueOf(A.aD) + "Single Choice"));
      preferences.put(String.valueOf(A.aD) + "Multiple Choice", paramProperties.getProperty(String.valueOf(A.aD) + "Multiple Choice"));
      preferences.put(String.valueOf(A.aD) + "Interactive", paramProperties.getProperty(String.valueOf(A.aD) + "Interactive"));
      preferences.put(A.aE, paramProperties.getProperty(A.aE));
      preferences.put(A.aF, paramProperties.getProperty(A.aF));
      for (b1 = 0; b1 < 6; b1++)
        preferences.put(String.valueOf(A.aG) + b1, paramProperties.getProperty(String.valueOf(A.aG) + b1)); 
      preferences.put(A.aH, paramProperties.getProperty(A.aH));
      preferences.put(A.aI, paramProperties.getProperty(A.aI));
      preferences.put(A.aK, paramProperties.getProperty(A.aK));
      preferences.put(A.aL, paramProperties.getProperty(A.aL));
      preferences.put(A.aJ, paramProperties.getProperty(A.aJ));
    } 
    this.q.putAll(paramProperties);
  }
  
  private static void d(String paramString) {
    File file;
    if (!(file = new File(paramString)).exists())
      file.mkdir(); 
  }
  
  private String F() {
    return String.valueOf(this.E) + "/userexams" + this.I;
  }
  
  public final ArrayList s() {
    return this.z;
  }
  
  public final void t() {
    this.v.b.a();
  }
  
  public final void u() {
    this.v.a.a();
  }
  
  public static void b(Properties paramProperties) {
    paramProperties.setProperty(A.aW, Integer.toString((new Color(4, 188, 15)).getRGB()));
    paramProperties.setProperty(A.aX, Integer.toString(Color.red.getRGB()));
    paramProperties.setProperty(A.aO, "N");
    paramProperties.setProperty(A.aP, "N");
    paramProperties.setProperty(A.aQ, "N");
    paramProperties.setProperty(A.aR, "N");
    paramProperties.setProperty(A.aS, "N");
    paramProperties.setProperty(A.aT, "N");
    paramProperties.setProperty(A.aU, "N");
    paramProperties.setProperty(A.aV, "N");
    paramProperties.setProperty(A.aM, "Arial");
    paramProperties.setProperty(A.aN, "12");
    paramProperties.setProperty(A.aY, "Y");
    paramProperties.setProperty(A.aZ, "Y");
    paramProperties.setProperty(A.ba, "Y");
    paramProperties.setProperty(A.bb, "Y");
    paramProperties.setProperty(A.bc, "N");
  }
  
  public final void c(Properties paramProperties) {
    paramProperties.setProperty(A.ak, "90");
    paramProperties.setProperty(A.al, "85");
    paramProperties.setProperty(A.am, "50");
    paramProperties.setProperty(A.an, "Y");
    paramProperties.setProperty(A.ao, "1");
    paramProperties.setProperty(A.ap, "50");
    paramProperties.setProperty(A.aq, "N");
    paramProperties.setProperty(A.ar, "90");
    paramProperties.setProperty(A.as, "85");
    if (this.l != null) {
      paramProperties.setProperty(A.at, Integer.toString(this.l.c()));
    } else {
      paramProperties.setProperty(A.at, "0");
    } 
    paramProperties.setProperty(A.au, "Y");
    paramProperties.setProperty(A.av, "1");
    if (this.l != null) {
      paramProperties.setProperty(A.aw, Integer.toString(this.l.c()));
    } else {
      paramProperties.setProperty(A.aw, "0");
    } 
    paramProperties.setProperty(A.ax, "N");
    paramProperties.setProperty(A.ay, "Y");
    paramProperties.setProperty(A.az, "On click");
    paramProperties.setProperty(A.aA, "All");
    paramProperties.setProperty(A.aB, "All");
    paramProperties.setProperty(A.aE, "N");
    paramProperties.setProperty(A.aF, "N");
    paramProperties.setProperty(A.aH, "N");
    paramProperties.setProperty(A.aI, "N");
  }
  
  public final void e(int paramInt) {
    if (this.l == null)
      return; 
    if (this.u == null)
      this.u = new k(this, this.l); 
    f f;
    if ((f = this.u.a(paramInt)).d() == 0) {
      JOptionPane.showMessageDialog(this, "No questions available using current settings", "Unable to generate exam", 0);
      return;
    } 
    f.a(new Date());
    if (paramInt == 0) {
      TrainingTool trainingTool;
      f.e(Integer.parseInt((trainingTool = this).q.getProperty(A.ak)) * 60);
    } else {
      TrainingTool trainingTool;
      if ((trainingTool = this).q.getProperty(A.ar) == null)
        (trainingTool = this).q.setProperty(A.ar, (trainingTool = this).q.getProperty(A.ak)); 
      f.e(Integer.parseInt((trainingTool = this).q.getProperty(A.ar)) * 60);
    } 
    f.d(f.k());
    G();
    this.x = new l(this, f);
    add((Component)this.x, "Center");
    validate();
    h(g);
  }
  
  public final void v() {
    if (this.x != null)
      this.x.d(); 
  }
  
  public final void c(f paramf) {
    paramf.a(false);
    G();
    this.x = new l(this, paramf);
    add((Component)this.x, "Center");
    validate();
    h(g);
  }
  
  public final void d(f paramf) {
    paramf.a(false);
    G();
    this.y = new b(this, paramf);
    add((Component)this.y, "Center");
    validate();
    h(g);
  }
  
  public final void f(int paramInt) {
    f f = this.z.get(paramInt);
    try {
      if (!f.c())
        f.b(); 
    } catch (ParserConfigurationException parserConfigurationException) {
      JOptionPane.showMessageDialog(this, "Data read error while loading user exam", "User exam read error", 0);
    } catch (SAXException sAXException) {
      JOptionPane.showMessageDialog(this, "Data read error while loading user exam", "User exam read error", 0);
    } catch (FileNotFoundException fileNotFoundException) {
      JOptionPane.showMessageDialog(this, "File not found error while loading user exam", "User exam read error", 0);
    } catch (IOException iOException) {
      JOptionPane.showMessageDialog(this, "File not found error while loading user exam", "User exam read error", 0);
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(this, "Data read error while loading user exam", "User exam read error", 0);
    } 
    d(f);
    this.x = new l(this, f);
  }
  
  public final void w() {
    Component[] arrayOfComponent;
    int i = (arrayOfComponent = getComponents()).length;
    for (byte b1 = 0; b1 < i; b1++) {
      Component component;
      if ((component = arrayOfComponent[b1]) == this.x)
        return; 
    } 
    G();
    add((Component)this.x, "Center");
    validate();
  }
  
  public final void g(int paramInt) {
    f f = this.z.get(paramInt);
    try {
      if (!f.c())
        f.b(); 
    } catch (ParserConfigurationException parserConfigurationException) {
      JOptionPane.showMessageDialog(this, "Data read error while loading user exam", "User exam read error", 0);
    } catch (SAXException sAXException) {
      JOptionPane.showMessageDialog(this, "Data read error while loading user exam", "User exam read error", 0);
    } catch (FileNotFoundException fileNotFoundException) {
      JOptionPane.showMessageDialog(this, "File not found error while loading user exam", "User exam read error", 0);
    } catch (IOException iOException) {
      JOptionPane.showMessageDialog(this, "File not found error while loading user exam", "User exam read error", 0);
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(this, "Data read error while loading user exam", "User exam read error", 0);
    } 
    G();
    this.x = new l(this, f);
    add((Component)this.x, "Center");
    validate();
    h(g);
  }
  
  public final void x() {
    G();
    this.v.b();
    this.v.a();
    add((Component)this.v, "Center");
    validate();
    repaint();
    h(0);
  }
  
  public final void e(f paramf) {
    if (paramf == null)
      x(); 
    G();
    try {
      if (!paramf.c())
        paramf.b(); 
    } catch (ParserConfigurationException parserConfigurationException) {
      JOptionPane.showMessageDialog(this, "Data read error while loading user exam", "User exam read error", 0);
    } catch (SAXException sAXException) {
      JOptionPane.showMessageDialog(this, "Data read error while loading user exam", "User exam read error", 0);
    } catch (FileNotFoundException fileNotFoundException) {
      JOptionPane.showMessageDialog(this, "File not found error while loading user exam", "User exam read error", 0);
    } catch (IOException iOException) {
      JOptionPane.showMessageDialog(this, "File not found error while loading user exam", "User exam read error", 0);
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(this, "Data read error while loading user exam", "User exam read error", 0);
    } 
    this.y = new b(this, paramf);
    add((Component)this.y, "Center");
    validate();
    repaint();
  }
  
  private void G() {
    if (this.v != null)
      remove((Component)this.v); 
    if (this.y != null)
      remove((Component)this.y); 
    if (this.x != null)
      remove((Component)this.x); 
    if (this.w != null)
      remove((Component)this.w); 
  }
  
  public final URL a(i parami) {
    URL uRL = null;
    try {
      String str;
      uRL = new URL("ttzipimage:" + (str = (parami = parami).a()));
    } catch (Exception exception) {}
    return uRL;
  }
  
  public final ActionListener y() {
    return (ActionListener)this.r;
  }
  
  public void windowActivated(WindowEvent paramWindowEvent) {}
  
  public void windowClosed(WindowEvent paramWindowEvent) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    l();
  }
  
  public void windowDeactivated(WindowEvent paramWindowEvent) {}
  
  public void windowDeiconified(WindowEvent paramWindowEvent) {}
  
  public void windowIconified(WindowEvent paramWindowEvent) {}
  
  public void windowOpened(WindowEvent paramWindowEvent) {}
  
  private boolean H() {
    Proxy proxy = null;
    String str1 = null;
    String str2 = null;
    try {
      if (this.q.getProperty(A.bc).compareTo("Y") == 0) {
        proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.q.getProperty(A.bd), Integer.parseInt(this.q.getProperty(A.be))));
        if (this.q.getProperty(A.bf).compareTo("Y") == 0) {
          if (this.q.getProperty(A.bg).trim().length() > 0)
            str1 = this.q.getProperty(A.bg).trim(); 
          if (this.q.getProperty(A.bh).trim().length() > 0)
            str2 = this.q.getProperty(A.bh).trim(); 
        } 
      } 
      return a(proxy, str1, str2);
    } catch (Exception exception) {
      JOptionPane.showMessageDialog(this, "Error using proxy settings,\nplease check that settings are correct.", "Proxy connection error", 1);
      return false;
    } 
  }
  
  public final boolean a(Proxy paramProxy, String paramString1, String paramString2) {
    URLConnection uRLConnection;
    String str = String.valueOf(URLEncoder.encode("v", "UTF-8")) + "=" + URLEncoder.encode(String.valueOf(i) + "." + j + "." + k + ".n", "UTF-8");
    URL uRL = new URL(O);
    if (paramProxy != null) {
      uRLConnection = uRL.openConnection(paramProxy);
    } else {
      uRLConnection = uRL.openConnection();
    } 
    uRLConnection.setDoOutput(true);
    if (paramString1 != null && paramString2 != null)
      uRLConnection.setRequestProperty("Proxy-Authorization", "Basic " + a.a((new String(paramString1)).getBytes("UTF-8")) + ":" + a.a((new String(paramString2)).getBytes("UTF-8"))); 
    OutputStreamWriter outputStreamWriter;
    (outputStreamWriter = new OutputStreamWriter(uRLConnection.getOutputStream())).write(str);
    outputStreamWriter.flush();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
    for (str = ""; (paramString2 = bufferedReader.readLine()) != null; str = String.valueOf(str) + paramString2);
    outputStreamWriter.close();
    bufferedReader.close();
    String[] arrayOfString;
    if ((arrayOfString = str.split("\\.")).length == 4) {
      int i = Integer.parseInt(arrayOfString[0]);
      int j = Integer.parseInt(arrayOfString[1]);
      int n = Integer.parseInt(arrayOfString[2]);
      this.D = Long.parseLong(arrayOfString[3]);
      if (i > i)
        return true; 
      if (i == i) {
        if (j > j)
          return true; 
        if (j == j && n > k)
          return true; 
      } 
    } 
    return false;
  }
  
  public final InputStream z() {
    Proxy proxy = null;
    String str1 = null;
    String str2 = null;
    try {
      URLConnection uRLConnection;
      if (this.q.getProperty(A.bc).compareTo("Y") == 0) {
        proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.q.getProperty(A.bd), Integer.parseInt(this.q.getProperty(A.be))));
        if (this.q.getProperty(A.bf).compareTo("Y") == 0) {
          if (this.q.getProperty(A.bg).trim().length() > 0)
            str1 = this.q.getProperty(A.bg).trim(); 
          if (this.q.getProperty(A.bh).trim().length() > 0)
            str2 = this.q.getProperty(A.bh).trim(); 
        } 
      } 
      URL uRL = new URL(O);
      if (proxy != null) {
        uRLConnection = uRL.openConnection(proxy);
      } else {
        uRLConnection = uRL.openConnection();
      } 
      uRLConnection.setDoOutput(true);
      if (str1 != null && str2 != null)
        uRLConnection.setRequestProperty("Proxy-Authorization", "Basic " + a.a((new String(str1)).getBytes("UTF-8")) + ":" + a.a((new String(str2)).getBytes("UTF-8"))); 
      OutputStreamWriter outputStreamWriter;
      (outputStreamWriter = new OutputStreamWriter(uRLConnection.getOutputStream())).write(String.valueOf(URLEncoder.encode("v", "UTF-8")) + "=" + URLEncoder.encode(String.valueOf(i) + "." + j + "." + k + ".y", "UTF-8"));
      outputStreamWriter.flush();
      return uRLConnection.getInputStream();
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final InputStream c(String paramString) {
    Proxy proxy = null;
    String str1 = null;
    String str2 = null;
    try {
      if (this.q.getProperty(A.bc).compareTo("Y") == 0) {
        proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.q.getProperty(A.bd), Integer.parseInt(this.q.getProperty(A.be))));
        if (this.q.getProperty(A.bf).compareTo("Y") == 0) {
          if (this.q.getProperty(A.bg).trim().length() > 0)
            str1 = this.q.getProperty(A.bg).trim(); 
          if (this.q.getProperty(A.bh).trim().length() > 0)
            str2 = this.q.getProperty(A.bh).trim(); 
        } 
      } 
      return h.a(m.g, paramString, proxy, str1, str2);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final long A() {
    return this.D;
  }
  
  public static void main(String[] paramArrayOfString) {
    try {
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  static {
    (new StringBuilder("http://www.")).append(b).append("/auth/feedback-v3.php");
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/TrainingTool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */