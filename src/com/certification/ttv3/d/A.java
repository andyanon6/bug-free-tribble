package com.certification.ttv3.d;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.e.e;
import com.certification.ttv3.e.y;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public final class A extends JPanel implements ActionListener {
  private z bi;
  
  private H bj;
  
  private K bk;
  
  private F bl;
  
  private C bm;
  
  private I bn;
  
  private int bo = 0;
  
  private TrainingTool bp;
  
  Color a = new Color(221, 221, 221);
  
  private Properties bq;
  
  private Font br;
  
  private Font bs;
  
  private Font bt;
  
  JTextField b;
  
  JTextField c;
  
  JTextField d;
  
  JTextField e;
  
  JFormattedTextField f;
  
  JFormattedTextField g;
  
  JFormattedTextField h;
  
  JFormattedTextField i;
  
  JFormattedTextField j;
  
  JFormattedTextField k;
  
  JFormattedTextField l;
  
  JFormattedTextField m;
  
  JFormattedTextField n;
  
  JFormattedTextField o;
  
  JFormattedTextField p;
  
  JFormattedTextField q;
  
  JCheckBox r;
  
  JCheckBox s;
  
  JCheckBox t;
  
  JCheckBox u;
  
  JCheckBox v;
  
  JCheckBox w;
  
  JCheckBox x;
  
  JCheckBox y;
  
  JCheckBox z;
  
  JCheckBox A;
  
  JCheckBox B;
  
  JCheckBox C;
  
  JCheckBox D;
  
  JCheckBox E;
  
  JCheckBox F;
  
  JCheckBox G;
  
  JCheckBox H;
  
  JCheckBox I;
  
  JCheckBox J;
  
  JRadioButton K;
  
  JRadioButton L;
  
  JRadioButton M;
  
  JRadioButton N;
  
  JRadioButton O;
  
  JRadioButton P;
  
  JRadioButton Q;
  
  JRadioButton R;
  
  JRadioButton S;
  
  JRadioButton T;
  
  JRadioButton U;
  
  JRadioButton V;
  
  JRadioButton W;
  
  JRadioButton X;
  
  JRadioButton Y;
  
  JRadioButton Z;
  
  JRadioButton aa;
  
  ArrayList ab;
  
  HashMap ac;
  
  ArrayList ad;
  
  JButton ae;
  
  JButton af;
  
  JButton ag;
  
  JButton ah;
  
  JComboBox ai;
  
  JComboBox aj;
  
  private JColorChooser bu;
  
  private JColorChooser bv;
  
  private JDialog bw;
  
  private JDialog bx;
  
  public static String ak = "Test time";
  
  public static String al = "Passing score";
  
  public static String am = "Questions in test";
  
  public static String an = "Random questions";
  
  public static String ao = "NonRand Start Question";
  
  public static String ap = "NonRand End Question";
  
  public static String aq = "Random answers";
  
  public static String ar = "Practice Test time";
  
  public static String as = "Practice Passing score";
  
  public static String at = "Practice Questions in test";
  
  public static String au = "Practice Random questions";
  
  public static String av = "Practice NonRand Start Question";
  
  public static String aw = "Practice NonRand End Question";
  
  public static String ax = "Practice Random answers";
  
  public static String ay = "Show answers";
  
  public static String az = "Show answers when";
  
  public static String aA = "Select from topic";
  
  public static String aB = "Select from type";
  
  public static String aC = "Select topic ";
  
  public static String aD = "Select type ";
  
  public static String aE = "Show pending";
  
  public static String aF = "Select keywords";
  
  public static String aG = "Keyword ";
  
  public static String aH = "Select notes";
  
  public static String aI = "Item Optimizer";
  
  public static String aJ = "Item Optimizer Mode";
  
  public static String aK = "Item Optimizer Incorrect Count";
  
  public static String aL = "Item Optimizer Correct Count";
  
  public static String aM = "Font Face";
  
  public static String aN = "Font Size";
  
  public static String aO = "Custom Question Style";
  
  public static String aP = "CQS Bold";
  
  public static String aQ = "CQS Italic";
  
  public static String aR = "CQS Underline";
  
  public static String aS = "Custom Answer Style";
  
  public static String aT = "CAS Bold";
  
  public static String aU = "CAS Italic";
  
  public static String aV = "CAS Underline";
  
  public static String aW = "Correct color";
  
  public static String aX = "Incorrect color";
  
  public static String aY = "Prompt on close";
  
  public static String aZ = "Prompt on remove history";
  
  public static String ba = "Prompt on finish test";
  
  public static String bb = "Network use browser";
  
  public static String bc = "Network use proxy";
  
  public static String bd = "Proxy host";
  
  public static String be = "Proxy port";
  
  public static String bf = "Proxy authenticate";
  
  public static String bg = "Proxy user";
  
  public static String bh = "Proxy pass";
  
  public A(TrainingTool paramTrainingTool) {
    Cursor.getPredefinedCursor(12);
    this.bp = paramTrainingTool;
    setLayout(new BorderLayout());
    HashMap<Object, Object> hashMap;
    (hashMap = new HashMap<Object, Object>()).put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    this.br = (new Font("Arial", 0, 14)).deriveFont((Map)hashMap);
    this.bs = new Font("Arial", 0, 12);
    this.bt = new Font("Arial", 2, 10);
    this.bq = new Properties(this.bp.r());
    c();
    add(new a(), "South");
    this.bi = new z();
    add(this.bi, "East");
    this.bk = new K(paramTrainingTool, this.bi);
    add(this.bk, "North");
    this.bj = new H(this);
    add(this.bj, "West");
    this.bl = new F(this);
    this.bm = new C(this);
    this.bn = new I(this);
    add(this.bl, "Center");
    this.bj.a();
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent) {
    A a;
    if (paramActionEvent.getActionCommand().compareTo("Save") == 0) {
      a = this;
      try {
        if (a.f.hasFocus() && a.f.isEditValid())
          a.f.commitEdit(); 
        if (a.g.hasFocus() && a.g.isEditValid())
          a.g.commitEdit(); 
        if (a.h.hasFocus() && a.h.isEditValid())
          a.h.commitEdit(); 
        if (a.i.hasFocus() && a.i.isEditValid())
          a.i.commitEdit(); 
        if (a.j.hasFocus() && a.j.isEditValid())
          a.j.commitEdit(); 
        if (a.k.hasFocus() && a.k.isEditValid())
          a.k.commitEdit(); 
        if (a.l.hasFocus() && a.l.isEditValid())
          a.l.commitEdit(); 
        if (a.m.hasFocus() && a.m.isEditValid())
          a.m.commitEdit(); 
        if (a.n.hasFocus() && a.n.isEditValid())
          a.n.commitEdit(); 
        if (a.o.hasFocus() && a.o.isEditValid())
          a.o.commitEdit(); 
        if (a.p.hasFocus() && a.p.isEditValid())
          a.p.commitEdit(); 
        if (a.q.hasFocus() && a.q.isEditValid())
          a.q.commitEdit(); 
      } catch (ParseException parseException2) {
        ParseException parseException1;
        (parseException1 = null).printStackTrace();
      } 
      a.bq.setProperty(ak, a.f.getValue().toString());
      a.bq.setProperty(al, a.g.getValue().toString());
      a.bq.setProperty(am, a.h.getValue().toString());
      a.bq.setProperty(ao, a.i.getValue().toString());
      a.bq.setProperty(ap, a.j.getValue().toString());
      a.bq.setProperty(an, a.K.isSelected() ? "Y" : "N");
      a.bq.setProperty(aq, a.r.isSelected() ? "Y" : "N");
      a.bq.setProperty(ar, a.k.getValue().toString());
      a.bq.setProperty(as, a.l.getValue().toString());
      a.bq.setProperty(at, a.m.getValue().toString());
      a.bq.setProperty(av, a.n.getValue().toString());
      a.bq.setProperty(aw, a.o.getValue().toString());
      a.bq.setProperty(au, a.M.isSelected() ? "Y" : "N");
      a.bq.setProperty(ax, a.s.isSelected() ? "Y" : "N");
      a.bq.setProperty(ay, a.t.isSelected() ? "Y" : "N");
      a.bq.setProperty(az, a.O.isSelected() ? "Always" : "OnClick");
      a.bq.setProperty(aA, a.R.isSelected() ? "Topics" : "All");
      for (Integer integer : a.ac.keySet())
        a.bq.setProperty(String.valueOf(aC) + integer, ((JCheckBox)a.ac.get(integer)).isSelected() ? "Y" : "N"); 
      a.bq.setProperty(aB, a.T.isSelected() ? "Types" : "All");
      a.bq.setProperty(String.valueOf(aD) + "Single Choice", ((JCheckBox)a.ab.get(0)).isSelected() ? "Y" : "N");
      a.bq.setProperty(String.valueOf(aD) + "Multiple Choice", ((JCheckBox)a.ab.get(1)).isSelected() ? "Y" : "N");
      a.bq.setProperty(String.valueOf(aD) + "Interactive", ((JCheckBox)a.ab.get(2)).isSelected() ? "Y" : "N");
      a.bq.setProperty(aE, a.J.isSelected() ? "Y" : "N");
      a.bq.setProperty(aF, a.u.isSelected() ? "Y" : "N");
      for (byte b = 0; b < 6; b++) {
        String str1;
        if ((str1 = ((JTextField)a.ad.get(b)).getText()).length() > 50)
          str1 = str1.substring(0, 50); 
        a.bq.setProperty(String.valueOf(aG) + b, str1);
      } 
      a.bq.setProperty(aH, a.v.isSelected() ? "Y" : "N");
      a.bq.setProperty(aI, a.w.isSelected() ? "Y" : "N");
      a.bq.setProperty(aK, a.p.getValue().toString());
      a.bq.setProperty(aL, a.q.getValue().toString());
      String str = "NotAnswered";
      if (a.U.isSelected())
        str = "NotAnswered"; 
      if (a.V.isSelected())
        str = "IncorrectlyAnswered"; 
      if (a.W.isSelected())
        str = "IncorrectMoreOften"; 
      if (a.X.isSelected())
        str = "IncorrectMoreThan"; 
      if (a.Y.isSelected())
        str = "CorrectLessThan"; 
      a.bq.setProperty(aJ, str);
      a.bq.setProperty(aM, (String)a.ai.getSelectedItem());
      a.bq.setProperty(aN, ((Integer)a.aj.getSelectedItem()).toString());
      a.bq.setProperty(aO, a.x.isSelected() ? "Y" : "N");
      a.bq.setProperty(aP, a.y.isSelected() ? "Y" : "N");
      a.bq.setProperty(aQ, a.z.isSelected() ? "Y" : "N");
      a.bq.setProperty(aR, a.A.isSelected() ? "Y" : "N");
      a.bq.setProperty(aS, a.B.isSelected() ? "Y" : "N");
      a.bq.setProperty(aT, a.C.isSelected() ? "Y" : "N");
      a.bq.setProperty(aU, a.D.isSelected() ? "Y" : "N");
      a.bq.setProperty(aV, a.E.isSelected() ? "Y" : "N");
      a.bq.setProperty(aW, Integer.toString(a.bu.getColor().getRGB()));
      a.bq.setProperty(aX, Integer.toString(a.bv.getColor().getRGB()));
      a.bq.setProperty(aY, a.F.isSelected() ? "Y" : "N");
      a.bq.setProperty(aZ, a.G.isSelected() ? "Y" : "N");
      a.bq.setProperty(ba, a.H.isSelected() ? "Y" : "N");
      a.bq.setProperty(bb, a.Z.isSelected() ? "Y" : "N");
      a.bq.setProperty(bc, a.aa.isSelected() ? "Y" : "N");
      a.bq.setProperty(bd, a.b.getText());
      a.bq.setProperty(be, a.c.getText());
      a.bq.setProperty(bf, a.I.isSelected() ? "Y" : "N");
      a.bq.setProperty(bg, a.d.getText());
      a.bq.setProperty(bh, a.e.getText());
      this.bp.a(this.bq);
      this.bp.t();
      this.bp.u();
      this.bp.x();
      return;
    } 
    if (a.getActionCommand().compareTo("Cancel") == 0) {
      this.bp.x();
      return;
    } 
    if (a.getActionCommand().compareTo("Reset") == 0) {
      this.bq = new Properties();
      TrainingTool.b(this.bq);
      this.bp.c(this.bq);
      a();
      JOptionPane.showMessageDialog((Component)this.bp, "Settings were reset to default values");
      return;
    } 
    if (a.getActionCommand().compareTo("General") == 0) {
      b();
      this.bo = 0;
      add(this.bl, "Center");
      this.bl.requestFocusInWindow();
      this.bj.a();
      revalidate();
    } 
    if (a.getActionCommand().compareTo("Appearance") == 0) {
      b();
      this.bo = 1;
      add(this.bm, "Center");
      this.bm.requestFocusInWindow();
      this.bj.a();
      revalidate();
    } 
    if (a.getActionCommand().compareTo("Network") == 0) {
      b();
      this.bo = 2;
      add(this.bn, "Center");
      this.bn.requestFocusInWindow();
      this.bj.a();
      revalidate();
    } 
    if (a.getActionCommand().compareTo("Show correctcolor") == 0) {
      this.bw.setVisible(true);
      return;
    } 
    if (a.getActionCommand().compareTo("Show incorrectcolor") == 0) {
      this.bx.setVisible(true);
      return;
    } 
    if (a.getActionCommand().compareTo("OK") == 0) {
      this.ag.setBackground(this.bu.getColor());
      this.ah.setBackground(this.bv.getColor());
      return;
    } 
    if (a.getActionCommand().compareTo("cancel") == 0)
      return; 
    if (a.getActionCommand().compareTo("Reset item optimizer") == 0) {
      this.bp.g();
      return;
    } 
    if (a.getActionCommand().compareTo("Check Connection") == 0) {
      a = null;
      String str1 = null;
      String str2 = null;
      try {
        Proxy proxy;
        if (this.aa.isSelected()) {
          proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.b.getText(), Integer.parseInt(this.c.getText())));
          if (this.I.isSelected()) {
            if (this.d.getText().trim().length() > 0)
              str1 = this.d.getText().trim(); 
            if (this.e.getText().trim().length() > 0)
              str2 = this.e.getText().trim(); 
          } 
        } 
        this.bp.a(proxy, str1, str2);
        JOptionPane.showMessageDialog(this, "Success!\nThese connection settings are valid.", "Connection success", 1);
        return;
      } catch (Exception exception) {
        JOptionPane.showMessageDialog(this, "Error using proxy settings,\nplease check that settings are correct.", "Proxy connection error", 1);
        return;
      } 
    } 
  }
  
  private void b() {
    switch (this.bo) {
      case 0:
        remove(this.bl);
        return;
      case 1:
        remove(this.bm);
        return;
      case 2:
        remove(this.bn);
        break;
    } 
  }
  
  private void c() {
    B b = new B(this, (byte)0);
    e e = this.bp.j();
    this.f = new JFormattedTextField();
    this.f.setValue(new Integer(0));
    this.f.setColumns(5);
    this.f.setToolTipText("1 - 999");
    this.f.setInputVerifier(b);
    this.f.setFont(this.bs);
    this.g = new JFormattedTextField();
    this.g.setValue(new Integer(0));
    this.g.setColumns(5);
    this.g.setToolTipText("0 - 100");
    this.g.setInputVerifier(b);
    this.g.setFont(this.bs);
    this.h = new JFormattedTextField();
    this.h.setValue(new Integer(0));
    this.h.setColumns(5);
    if (e == null) {
      this.h.setToolTipText("0 - ?");
    } else {
      this.h.setToolTipText("0 - " + e.c());
    } 
    this.h.setInputVerifier(b);
    this.h.setFont(this.bs);
    this.i = new JFormattedTextField();
    this.i.setValue(new Integer(0));
    this.i.setColumns(5);
    if (e == null) {
      this.i.setToolTipText("1 - ?");
    } else {
      this.i.setToolTipText("1 - " + e.c());
    } 
    this.i.setInputVerifier(b);
    this.i.setFont(this.bs);
    this.j = new JFormattedTextField();
    this.j.setValue(Integer.valueOf(0));
    this.j.setColumns(5);
    if (e == null) {
      this.j.setToolTipText("1 - ?");
    } else {
      this.j.setToolTipText("1 - " + e.c());
    } 
    this.j.setInputVerifier(b);
    this.j.setFont(this.bs);
    this.K = new JRadioButton("Randomized Questions: ");
    this.K.setOpaque(false);
    this.K.setFont(this.bs);
    this.L = new JRadioButton("Non-random Questions: ");
    this.L.setOpaque(false);
    this.L.setFont(this.bs);
    ButtonGroup buttonGroup3;
    (buttonGroup3 = new ButtonGroup()).add(this.K);
    buttonGroup3.add(this.L);
    this.r = new JCheckBox("Randomize Answer Order");
    this.r.setOpaque(false);
    this.r.setFont(this.bs);
    this.k = new JFormattedTextField();
    this.k.setValue(new Integer(0));
    this.k.setColumns(5);
    this.k.setToolTipText("1 - 999");
    this.k.setInputVerifier(b);
    this.k.setFont(this.bs);
    this.l = new JFormattedTextField();
    this.l.setValue(new Integer(0));
    this.l.setColumns(5);
    this.l.setToolTipText("0 - 100");
    this.l.setInputVerifier(b);
    this.l.setFont(this.bs);
    this.m = new JFormattedTextField();
    this.m.setValue(new Integer(0));
    this.m.setColumns(5);
    if (e == null) {
      this.m.setToolTipText("1 - ?");
    } else {
      this.m.setToolTipText("1 - " + e.c());
    } 
    this.m.setInputVerifier(b);
    this.m.setFont(this.bs);
    this.n = new JFormattedTextField();
    this.n.setValue(new Integer(0));
    this.n.setColumns(5);
    if (e == null) {
      this.n.setToolTipText("1 - ?");
    } else {
      this.n.setToolTipText("1 - " + e.c());
    } 
    this.n.setInputVerifier(b);
    this.n.setFont(this.bs);
    this.o = new JFormattedTextField();
    this.o.setValue(Integer.valueOf(0));
    this.o.setColumns(5);
    if (e == null) {
      this.o.setToolTipText("0 - ?");
    } else {
      this.o.setToolTipText("0 - " + e.c());
    } 
    this.o.setInputVerifier(b);
    this.o.setFont(this.bs);
    this.M = new JRadioButton("Randomized Questions: ");
    this.M.setOpaque(false);
    this.M.setFont(this.bs);
    this.N = new JRadioButton("Non-random Questions: ");
    this.N.setOpaque(false);
    this.N.setFont(this.bs);
    (buttonGroup3 = new ButtonGroup()).add(this.M);
    buttonGroup3.add(this.N);
    this.s = new JCheckBox("Randomize Answer Order");
    this.s.setOpaque(false);
    this.s.setFont(this.bs);
    if (this.bp.f()) {
      this.t = new JCheckBox("Show Answers and Explanations");
    } else {
      this.t = new JCheckBox("Show Answers");
    } 
    this.t.setOpaque(false);
    this.t.setFont(this.bs);
    this.O = new JRadioButton("Always - answers are shown when switching questions");
    this.O.setOpaque(false);
    this.O.setFont(this.bs);
    this.P = new JRadioButton("On Click - answers are hidden when switching questions");
    this.P.setOpaque(false);
    this.P.setFont(this.bs);
    (buttonGroup3 = new ButtonGroup()).add(this.O);
    buttonGroup3.add(this.P);
    if (e == null) {
      this.Q = new JRadioButton("Select questions from all exam Topics (0 questions total)");
    } else {
      this.Q = new JRadioButton("Select questions from all exam Topics (" + e.c() + " questions total)");
    } 
    this.Q.setOpaque(false);
    this.Q.setFont(this.bs);
    this.R = new JRadioButton("Select questions from exam topics below:");
    this.R.setOpaque(false);
    this.R.setFont(this.bs);
    (buttonGroup3 = new ButtonGroup()).add(this.Q);
    buttonGroup3.add(this.R);
    this.ac = new HashMap<Object, Object>();
    if (e != null) {
      ArrayList<y> arrayList = e.a();
      for (byte b2 = 0; b2 < arrayList.size(); b2++) {
        y y = arrayList.get(b2);
        JCheckBox jCheckBox1;
        (jCheckBox1 = new JCheckBox(String.valueOf(y.b()) + " (" + this.bp.j().c(y) + " questions)")).setOpaque(false);
        jCheckBox1.setFont(this.bs);
        this.ac.put(Integer.valueOf(b2), jCheckBox1);
      } 
    } 
    this.S = new JRadioButton("Select questions from all item types");
    this.S.setOpaque(false);
    this.S.setFont(this.bs);
    this.T = new JRadioButton("Select questions from item types below:");
    this.T.setOpaque(false);
    this.T.setFont(this.bs);
    ButtonGroup buttonGroup2;
    (buttonGroup2 = new ButtonGroup()).add(this.S);
    buttonGroup2.add(this.T);
    this.J = new JCheckBox("Show pending questions");
    this.J.setOpaque(false);
    this.J.setFont(this.bs);
    this.ab = new ArrayList();
    JCheckBox jCheckBox;
    (jCheckBox = new JCheckBox("Single Choice")).setOpaque(false);
    jCheckBox.setFont(this.bs);
    this.ab.add(jCheckBox);
    (jCheckBox = new JCheckBox("Multiple Choice")).setOpaque(false);
    jCheckBox.setFont(this.bs);
    this.ab.add(jCheckBox);
    (jCheckBox = new JCheckBox("Interactive")).setOpaque(false);
    jCheckBox.setFont(this.bs);
    this.ab.add(jCheckBox);
    this.u = new JCheckBox("Select questions containing keywords:");
    this.u.setOpaque(false);
    this.u.setFont(this.bs);
    this.ad = new ArrayList();
    for (byte b1 = 0; b1 < 6; b1++) {
      JTextField jTextField;
      (jTextField = new JTextField(15)).setFont(this.bs);
      this.ad.add(jTextField);
    } 
    this.v = new JCheckBox("Select questions where I have entered notes");
    this.v.setOpaque(false);
    this.v.setFont(this.bs);
    this.w = new JCheckBox("Activate Item Optimizer");
    this.w.setOpaque(false);
    this.w.setFont(this.bs);
    this.U = new JRadioButton("Select only questions which have not been answered yet");
    this.U.setOpaque(false);
    this.U.setFont(this.bs);
    this.V = new JRadioButton("Select only questions which have been answered incorrectly earlier");
    this.V.setOpaque(false);
    this.V.setFont(this.bs);
    this.W = new JRadioButton("Select only questions that have been answered incorrectly more times than they have been answered correctly");
    this.W.setOpaque(false);
    this.W.setFont(this.bs);
    this.X = new JRadioButton("Select only questions that have been answered incorrectly more than");
    this.X.setOpaque(false);
    this.X.setFont(this.bs);
    this.Y = new JRadioButton("Select only questions that have been answered correctly less than");
    this.Y.setOpaque(false);
    this.Y.setFont(this.bs);
    this.p = new JFormattedTextField();
    this.p.setValue(new Integer(0));
    this.p.setColumns(2);
    this.p.setToolTipText("0 - 10");
    this.p.setInputVerifier(b);
    this.p.setFont(this.bs);
    this.q = new JFormattedTextField();
    this.q.setValue(new Integer(0));
    this.q.setColumns(2);
    this.q.setToolTipText("1 - 10");
    this.q.setInputVerifier(b);
    this.q.setFont(this.bs);
    ButtonGroup buttonGroup4;
    (buttonGroup4 = new ButtonGroup()).add(this.U);
    buttonGroup4.add(this.V);
    buttonGroup4.add(this.W);
    buttonGroup4.add(this.X);
    buttonGroup4.add(this.Y);
    this.ae = new JButton("Reset item optimizer");
    this.ae.addActionListener(this);
    this.ae.setFont(this.bs);
    this.ai = new JComboBox();
    this.aj = new JComboBox();
    this.x = new JCheckBox("Use customized style for questions");
    this.x.setOpaque(false);
    this.x.setFont(this.bs);
    this.y = new JCheckBox("Bold");
    this.y.setOpaque(false);
    this.y.setFont(this.bs);
    this.z = new JCheckBox("Italic");
    this.z.setOpaque(false);
    this.z.setFont(this.bs);
    this.A = new JCheckBox("Underline");
    this.A.setOpaque(false);
    this.A.setFont(this.bs);
    this.B = new JCheckBox("Use customized style for answers/explanations");
    this.B.setOpaque(false);
    this.B.setFont(this.bs);
    this.C = new JCheckBox("Bold");
    this.C.setOpaque(false);
    this.C.setFont(this.bs);
    this.D = new JCheckBox("Italic");
    this.D.setOpaque(false);
    this.D.setFont(this.bs);
    this.E = new JCheckBox("Underline");
    this.E.setOpaque(false);
    this.E.setFont(this.bs);
    this.bu = new JColorChooser(Color.GREEN);
    this.bv = new JColorChooser(Color.RED);
    this.bw = JColorChooser.createDialog((Component)this.bp, "Select correct answer color", true, this.bu, this, this);
    this.bx = JColorChooser.createDialog((Component)this.bp, "Select incorrect answer color", true, this.bv, this, this);
    this.ag = new JButton();
    this.ag.setPreferredSize(new Dimension(30, 30));
    this.ag.setBackground(this.bu.getColor());
    this.ag.setActionCommand("Show correctcolor");
    this.ag.addActionListener(this);
    this.ag.setFont(this.bs);
    this.ah = new JButton();
    this.ah.setPreferredSize(new Dimension(30, 30));
    this.ah.setBackground(this.bv.getColor());
    this.ah.setActionCommand("Show incorrectcolor");
    this.ah.addActionListener(this);
    this.ah.setFont(this.bs);
    this.F = new JCheckBox("Prompt me on closing the program");
    this.F.setOpaque(false);
    this.F.setFont(this.bs);
    this.G = new JCheckBox("Prompt me on removing items from exam history list");
    this.G.setOpaque(false);
    this.G.setFont(this.bs);
    this.H = new JCheckBox("Prompt me on finishing test in progress");
    this.H.setOpaque(false);
    this.H.setFont(this.bs);
    this.Z = new JRadioButton("Use browser settings");
    this.Z.setOpaque(false);
    this.Z.setFont(this.bs);
    this.aa = new JRadioButton("Use proxy server");
    this.aa.setOpaque(false);
    this.aa.setFont(this.bs);
    ButtonGroup buttonGroup1;
    (buttonGroup1 = new ButtonGroup()).add(this.Z);
    buttonGroup1.add(this.aa);
    this.b = new JTextField(15);
    this.b.setFont(this.bs);
    this.c = new JTextField(4);
    this.c.setFont(this.bs);
    this.I = new JCheckBox("Authentication required");
    this.I.setOpaque(false);
    this.I.setFont(this.bs);
    this.d = new JTextField(15);
    this.d.setFont(this.bs);
    this.e = new JTextField(15);
    this.e.setFont(this.bs);
    this.af = new JButton("Check Connection");
    this.af.setFont(this.bs);
    this.af.setActionCommand("Check Connection");
    this.af.addActionListener(this);
  }
  
  public final void a() {
    String str1;
    this.bq = new Properties(this.bp.r());
    this.f.setValue(Integer.valueOf(Integer.parseInt(this.bq.getProperty(ak))));
    this.g.setValue(Integer.valueOf(Integer.parseInt(this.bq.getProperty(al))));
    this.h.setValue(Integer.valueOf(Integer.parseInt(this.bq.getProperty(am))));
    this.K.setSelected((this.bq.getProperty(an).compareTo("Y") == 0));
    this.L.setSelected(!(this.bq.getProperty(an).compareTo("Y") == 0));
    this.i.setValue(Integer.valueOf(Integer.parseInt(this.bq.getProperty(ao))));
    this.j.setValue(Integer.valueOf(Integer.parseInt(this.bq.getProperty(ap))));
    this.r.setSelected((this.bq.getProperty(aq).compareTo("Y") == 0));
    this.k.setValue(Integer.valueOf(Integer.parseInt(this.bq.getProperty(ar))));
    this.l.setValue(Integer.valueOf(Integer.parseInt(this.bq.getProperty(as))));
    this.m.setValue(Integer.valueOf(Integer.parseInt(this.bq.getProperty(at))));
    this.M.setSelected((this.bq.getProperty(au).compareTo("Y") == 0));
    this.N.setSelected(!(this.bq.getProperty(au).compareTo("Y") == 0));
    this.n.setValue(Integer.valueOf(Integer.parseInt(this.bq.getProperty(av))));
    this.o.setValue(Integer.valueOf(Integer.parseInt(this.bq.getProperty(aw))));
    this.s.setSelected((this.bq.getProperty(ax).compareTo("Y") == 0));
    this.t.setSelected((this.bq.getProperty(ay).compareTo("Y") == 0));
    if (this.bq.getProperty(az).compareTo("Always") == 0) {
      this.O.setSelected(true);
    } else {
      this.P.setSelected(true);
    } 
    if (this.bq.getProperty(aA).compareTo("Topics") == 0) {
      this.R.setSelected(true);
    } else {
      this.Q.setSelected(true);
    } 
    if (this.bp.j() != null) {
      ArrayList arrayList = this.bp.j().a();
      for (byte b = 0; b < arrayList.size(); b++) {
        if (this.bq.getProperty(String.valueOf(aC) + b) != null && this.bq.getProperty(String.valueOf(aC) + b).compareTo("Y") == 0) {
          ((JCheckBox)this.ac.get(Integer.valueOf(b))).setSelected(true);
        } else {
          ((JCheckBox)this.ac.get(Integer.valueOf(b))).setSelected(false);
        } 
      } 
    } 
    if (this.bq.getProperty(aB).compareTo("Types") == 0) {
      this.T.setSelected(true);
    } else {
      this.S.setSelected(true);
    } 
    if (this.bq.getProperty(String.valueOf(aD) + "Single Choice") != null && this.bq.getProperty(String.valueOf(aD) + "Single Choice").compareTo("Y") == 0)
      ((JCheckBox)this.ab.get(0)).setSelected(true); 
    if (this.bq.getProperty(String.valueOf(aD) + "Multiple Choice") != null && this.bq.getProperty(String.valueOf(aD) + "Multiple Choice").compareTo("Y") == 0)
      ((JCheckBox)this.ab.get(1)).setSelected(true); 
    if (this.bq.getProperty(String.valueOf(aD) + "Interactive") != null && this.bq.getProperty(String.valueOf(aD) + "Interactive").compareTo("Y") == 0)
      ((JCheckBox)this.ab.get(2)).setSelected(true); 
    if (this.bq.getProperty(aE) == null || this.bq.getProperty(aE).compareTo("N") == 0) {
      this.J.setSelected(false);
    } else {
      this.J.setSelected(true);
    } 
    if (this.bq.getProperty(aF) != null && this.bq.getProperty(aF).compareTo("Y") == 0)
      this.u.setSelected(true); 
    for (byte b1 = 0; b1 < 6; b1++) {
      if (this.bq.getProperty(String.valueOf(aG) + b1) != null) {
        ((JTextField)this.ad.get(b1)).setText(this.bq.getProperty(String.valueOf(aG) + b1));
      } else {
        ((JTextField)this.ad.get(b1)).setText("");
      } 
    } 
    if (this.bq.getProperty(aH) != null && this.bq.getProperty(aH).compareTo("Y") == 0)
      this.v.setSelected(true); 
    if (this.bq.getProperty(aI) != null && this.bq.getProperty(aI).compareTo("Y") == 0)
      this.w.setSelected(true); 
    if (this.bq.getProperty(aK) != null) {
      this.p.setText(this.bq.getProperty(aK));
    } else {
      this.p.setText("2");
    } 
    if (this.bq.getProperty(aL) != null) {
      this.q.setText(this.bq.getProperty(aL));
    } else {
      this.q.setText("2");
    } 
    if (this.bq.getProperty(aJ) != null) {
      str1 = this.bq.getProperty(aJ);
    } else {
      str1 = "NotAnswered";
    } 
    if (str1.compareTo("NotAnswered") == 0)
      this.U.setSelected(true); 
    if (str1.compareTo("IncorrectlyAnswered") == 0)
      this.V.setSelected(true); 
    if (str1.compareTo("IncorrectMoreOften") == 0)
      this.W.setSelected(true); 
    if (str1.compareTo("IncorrectMoreThan") == 0)
      this.X.setSelected(true); 
    if (str1.compareTo("CorrectLessThan") == 0)
      this.Y.setSelected(true); 
    GraphicsEnvironment graphicsEnvironment;
    String[] arrayOfString1 = (graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment()).getAvailableFontFamilyNames();
    this.ai.removeAllItems();
    String str2 = "Arial";
    if (this.bq.getProperty(aM) != null)
      str2 = this.bq.getProperty(aM); 
    String[] arrayOfString2;
    int j = (arrayOfString2 = arrayOfString1).length;
    byte b2;
    for (b2 = 0; b2 < j; b2++) {
      String str = arrayOfString2[b2];
      this.ai.addItem(str);
      if (str.compareTo(str2) == 0)
        this.ai.setSelectedIndex(this.ai.getItemCount() - 1); 
    } 
    this.aj.removeAllItems();
    int i = 12;
    if (this.bq.getProperty(aN) != null)
      i = Integer.parseInt(this.bq.getProperty(aN)); 
    for (b2 = 9; b2 <= 20; b2++) {
      this.aj.addItem(Integer.valueOf(b2));
      if (i == b2)
        this.aj.setSelectedIndex(this.aj.getItemCount() - 1); 
    } 
    if (this.bq.getProperty(aO) != null && this.bq.getProperty(aO).compareTo("Y") == 0)
      this.x.setSelected(true); 
    if (this.bq.getProperty(aP) != null && this.bq.getProperty(aP).compareTo("Y") == 0)
      this.y.setSelected(true); 
    if (this.bq.getProperty(aQ) != null && this.bq.getProperty(aQ).compareTo("Y") == 0)
      this.z.setSelected(true); 
    if (this.bq.getProperty(aR) != null && this.bq.getProperty(aR).compareTo("Y") == 0)
      this.A.setSelected(true); 
    if (this.bq.getProperty(aS) != null && this.bq.getProperty(aS).compareTo("Y") == 0)
      this.B.setSelected(true); 
    if (this.bq.getProperty(aT) != null && this.bq.getProperty(aT).compareTo("Y") == 0)
      this.C.setSelected(true); 
    if (this.bq.getProperty(aU) != null && this.bq.getProperty(aU).compareTo("Y") == 0)
      this.D.setSelected(true); 
    if (this.bq.getProperty(aV) != null && this.bq.getProperty(aV).compareTo("Y") == 0)
      this.E.setSelected(true); 
    if (this.bq.getProperty(aW) != null)
      this.bu.setColor(Integer.parseInt(this.bq.getProperty(aW))); 
    this.ag.setBackground(this.bu.getColor());
    if (this.bq.getProperty(aX) != null)
      this.bv.setColor(Integer.parseInt(this.bq.getProperty(aX))); 
    this.ah.setBackground(this.bv.getColor());
    if (this.bq.getProperty(aY) != null && this.bq.getProperty(aY).compareTo("Y") == 0)
      this.F.setSelected(true); 
    if (this.bq.getProperty(aZ) != null && this.bq.getProperty(aZ).compareTo("Y") == 0)
      this.G.setSelected(true); 
    if (this.bq.getProperty(ba) != null && this.bq.getProperty(ba).compareTo("Y") == 0)
      this.H.setSelected(true); 
    if (this.bq.getProperty(bc) != null && this.bq.getProperty(bc).compareTo("Y") == 0) {
      this.aa.setSelected(true);
    } else {
      this.Z.setSelected(true);
    } 
    if (this.bq.getProperty(bd) != null)
      this.b.setText(this.bq.getProperty(bd)); 
    if (this.bq.getProperty(be) != null)
      this.c.setText(this.bq.getProperty(be)); 
    if (this.bq.getProperty(bf) != null && this.bq.getProperty(bf).compareTo("Y") == 0)
      this.I.setSelected(true); 
    if (this.bq.getProperty(bg) != null)
      this.d.setText(this.bq.getProperty(bg)); 
    if (this.bq.getProperty(bh) != null)
      this.e.setText(this.bq.getProperty(bh)); 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/A.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */