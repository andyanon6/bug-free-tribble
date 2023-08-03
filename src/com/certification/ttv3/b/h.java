package com.certification.ttv3.b;

import com.certification.a.b.a;
import com.certification.a.b.b;
import com.certification.ttv3.d.A;
import com.certification.ttv3.e.a;
import com.certification.ttv3.e.i;
import com.certification.ttv3.e.o;
import com.certification.ttv3.e.q;
import com.certification.ttv3.e.s;
import com.certification.ttv3.e.u;
import com.certification.ttv3.e.w;
import com.certification.ttv3.f.c;
import com.certification.ttv3.f.d;
import com.certification.ttv3.f.j;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public final class h {
  private c b;
  
  private f c;
  
  private u d;
  
  private ArrayList e;
  
  private ArrayList f;
  
  private ArrayList g;
  
  private ArrayList h;
  
  private ButtonGroup i;
  
  private boolean j;
  
  private a k;
  
  private a l;
  
  private b m;
  
  private b n;
  
  private JTextArea o;
  
  public static String a = "userquestion";
  
  public h(c paramc, f paramf, u paramu, boolean paramBoolean) {
    this.b = paramc;
    this.c = paramf;
    this.d = paramu;
    this.e = new ArrayList();
    this.i = new ButtonGroup();
    this.f = new ArrayList();
    this.g = new ArrayList();
    if (!paramBoolean) {
      for (byte b2 = 0; b2 < paramu.h().size(); b2++)
        this.g.add(Integer.valueOf(b2)); 
      return;
    } 
    j j = new j(paramu.h().size());
    for (byte b1 = 0; b1 < paramu.h().size(); b1++)
      this.g.add(Integer.valueOf(j.a())); 
  }
  
  public h(c paramc, f paramf) {
    this.b = paramc;
    this.c = paramf;
    this.e = new ArrayList();
    this.i = new ButtonGroup();
    this.f = new ArrayList();
    this.g = new ArrayList();
  }
  
  public final u a() {
    return this.d;
  }
  
  public final ArrayList b() {
    if (this.h == null) {
      ArrayList<a> arrayList = this.d.h();
      this.h = new ArrayList(arrayList.size());
      for (Integer integer : this.g)
        this.h.add(arrayList.get(integer.intValue())); 
    } 
    return this.h;
  }
  
  public final void a(String paramString) {
    this.b.a(this.d.a(), paramString);
  }
  
  public final String c() {
    return this.b.a(this.d.a());
  }
  
  public final boolean d() {
    return this.j;
  }
  
  public final void a(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  public final boolean a(int paramInt) {
    try {
      switch (this.d.d()) {
        case 1:
          return ((JRadioButton)this.e.get(paramInt)).isSelected();
        case 2:
          return ((JCheckBox)this.f.get(paramInt)).isSelected();
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
    return false;
  }
  
  public final String e() {
    Iterator<JRadioButton> iterator;
    String str = "";
    byte b1 = 0;
    switch (this.d.d()) {
      case 1:
        iterator = this.e.iterator();
        while (iterator.hasNext()) {
          JRadioButton jRadioButton;
          if ((jRadioButton = iterator.next()).isSelected())
            str = String.valueOf(str) + (char)(b1 + 65) + " "; 
          b1++;
        } 
        return str;
      case 2:
        iterator = this.f.iterator();
        while (iterator.hasNext()) {
          JCheckBox jCheckBox;
          if ((jCheckBox = (JCheckBox)iterator.next()).isSelected())
            str = String.valueOf(str) + (char)(b1 + 65) + " "; 
          b1++;
        } 
        return str;
    } 
    if (g()) {
      str = "Yes";
    } else {
      str = "No";
    } 
    return str;
  }
  
  public final void b(boolean paramBoolean) {
    int j;
    JRadioButton jRadioButton;
    int i;
    JCheckBox jCheckBox;
    char[] arrayOfChar = new char[1];
    switch (this.d.d()) {
      case 1:
        j = this.e.size();
        arrayOfChar[0] = (char)(j + 65);
        (jRadioButton = b(j)).setSelected(paramBoolean);
        return;
      case 2:
        i = this.f.size();
        arrayOfChar[0] = (char)(i + 65);
        (jCheckBox = c(i)).setSelected(paramBoolean);
        break;
    } 
  }
  
  public final boolean f() {
    String str;
    int[] arrayOfInt;
    Iterator<JRadioButton> iterator;
    Point[] arrayOfPoint;
    boolean bool = true;
    byte b1 = 0;
    ArrayList<a> arrayList = b();
    switch (this.d.d()) {
      case 1:
        if (this.e.size() == 0)
          return false; 
        iterator = this.e.iterator();
        while (iterator.hasNext()) {
          JRadioButton jRadioButton;
          if ((jRadioButton = iterator.next()).isSelected() != ((a)arrayList.get(b1)).b())
            bool = false; 
          b1++;
        } 
        break;
      case 2:
        if (this.f.size() == 0)
          return false; 
        iterator = this.f.iterator();
        while (iterator.hasNext()) {
          JCheckBox jCheckBox;
          if ((jCheckBox = (JCheckBox)iterator.next()).isSelected() != ((a)arrayList.get(b1)).b())
            bool = false; 
          b1++;
        } 
        break;
      case 5:
        if (this.k == null)
          return false; 
        arrayOfInt = this.k.b();
        try {
          bool = this.d.i().a(arrayOfInt);
        } catch (Exception exception) {}
        break;
      case 3:
        if (this.m == null)
          return false; 
        arrayOfPoint = this.m.a();
        try {
          Point[] arrayOfPoint1 = arrayOfPoint;
          o o = this.d.i();
          boolean bool1 = true;
          for (byte b2 = 0; b2 < arrayOfPoint1.length; b2++) {
            boolean bool2 = false;
            Iterator<q> iterator1 = o.a().iterator();
            while (iterator1.hasNext()) {
              q q;
              Rectangle rectangle = (q = iterator1.next()).b();
              Point point;
              if ((point = arrayOfPoint1[b2]) != null && rectangle.contains(point))
                bool2 = true; 
            } 
            if (!bool2)
              bool1 = false; 
          } 
          bool = bool1;
        } catch (Exception exception) {}
        break;
      case 4:
        if (this.o == null)
          return false; 
        str = this.o.getText().trim();
        bool = false;
        for (a a1 : this.d.h()) {
          String str1 = "";
          ArrayList<?> arrayList1;
          Iterator<?> iterator1 = (arrayList1 = a1.a()).iterator();
          while (iterator1.hasNext()) {
            d d;
            if (d = (d)iterator1.next() instanceof w)
              str1 = String.valueOf(str1) + ((w)d).a(); 
            if (d instanceof s)
              str1 = String.valueOf(str1) + ((s)d).toString() + "\n"; 
          } 
          str1 = str1.trim();
          if (str.length() > 0 && str.toLowerCase().equals(str1.toLowerCase()))
            bool = true; 
        } 
        break;
    } 
    return bool;
  }
  
  public final boolean g() {
    int[] arrayOfInt1;
    byte b1;
    Iterator<JRadioButton> iterator;
    Point[] arrayOfPoint;
    int i;
    int[] arrayOfInt2;
    int j;
    boolean bool = false;
    switch (this.d.d()) {
      case 1:
        if (this.e.size() == 0)
          return false; 
        iterator = this.e.iterator();
        while (iterator.hasNext()) {
          JRadioButton jRadioButton;
          if ((jRadioButton = iterator.next()).isSelected())
            bool = true; 
        } 
        break;
      case 2:
        if (this.f.size() == 0)
          return false; 
        iterator = this.f.iterator();
        while (iterator.hasNext()) {
          JCheckBox jCheckBox;
          if ((jCheckBox = (JCheckBox)iterator.next()).isSelected())
            bool = true; 
        } 
        break;
      case 5:
        if (this.k == null)
          return false; 
        if ((arrayOfInt1 = this.k.b()) == null)
          return false; 
        i = (arrayOfInt2 = arrayOfInt1).length;
        for (b1 = 0; b1 < i; b1++) {
          int k;
          if ((k = arrayOfInt2[b1]) >= 0)
            bool = true; 
        } 
        break;
      case 3:
        if (this.m == null)
          return false; 
        if ((arrayOfPoint = this.m.a()) == null)
          return false; 
        j = (arrayOfPoint = arrayOfPoint).length;
        for (i = 0; i < j; i++) {
          Point point;
          if ((point = arrayOfPoint[i]) != null)
            bool = true; 
        } 
        break;
      case 4:
        return (this.o == null) ? false : ((this.o.getText().length() > 0));
    } 
    return bool;
  }
  
  public final JRadioButton b(int paramInt) {
    try {
      return this.e.get(paramInt);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      char[] arrayOfChar = { (char)(paramInt + 65) };
      JRadioButton jRadioButton = new JRadioButton(new String(arrayOfChar));
      if (!this.c.h()) {
        jRadioButton.setModel(new i(this, (byte)0));
        jRadioButton.setFocusable(false);
      } 
      this.e.add(jRadioButton);
      this.i.add(jRadioButton);
      jRadioButton.setOpaque(false);
      jRadioButton.setFont(new Font(this.b.r().getProperty(A.aM), 1, Integer.parseInt(this.b.r().getProperty(A.aN))));
      return jRadioButton;
    } 
  }
  
  public final JCheckBox c(int paramInt) {
    try {
      return this.f.get(paramInt);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      char[] arrayOfChar = { (char)(paramInt + 65) };
      JCheckBox jCheckBox = new JCheckBox(new String(arrayOfChar));
      if (!this.c.h()) {
        jCheckBox.setModel(new i(this, (byte)0));
        jCheckBox.setFocusable(false);
      } 
      this.f.add(jCheckBox);
      jCheckBox.setOpaque(false);
      jCheckBox.setFont(new Font(this.b.r().getProperty(A.aM), 1, Integer.parseInt(this.b.r().getProperty(A.aN))));
      return jCheckBox;
    } 
  }
  
  public final a a(ImageIcon paramImageIcon) {
    if (this.k == null)
      if (this.c.h()) {
        this.k = new a(paramImageIcon, this.d.i());
      } else {
        this.k = new a(paramImageIcon, this.d.i(), false, true);
      }  
    return this.k;
  }
  
  public final a b(ImageIcon paramImageIcon) {
    if (this.l == null)
      this.l = new a(paramImageIcon, this.d.i(), true, true); 
    return this.l;
  }
  
  public final a h() {
    if (this.k != null)
      return this.k; 
    i i = this.d.l();
    try {
      return a(new ImageIcon(this.b.a(i)));
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final b c(ImageIcon paramImageIcon) {
    if (this.m == null)
      if (this.c.h()) {
        this.m = new b(paramImageIcon, this.d.i());
      } else {
        this.m = new b(paramImageIcon, this.d.i(), false, true);
      }  
    return this.m;
  }
  
  public final b d(ImageIcon paramImageIcon) {
    if (this.n == null)
      this.n = new b(paramImageIcon, this.d.i(), true, true); 
    return this.n;
  }
  
  public final b i() {
    if (this.m != null)
      return this.m; 
    i i = this.d.l();
    try {
      return c(new ImageIcon(this.b.a(i)));
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final JTextArea j() {
    if (this.o == null)
      this.o = new JTextArea(6, 80); 
    if (!this.c.h()) {
      this.o.setFocusable(false);
      this.o.setEditable(false);
    } 
    return this.o;
  }
  
  public final void a(OutputStream paramOutputStream) {
    byte b1;
    int[] arrayOfInt;
    Point[] arrayOfPoint;
    paramOutputStream.write(("<" + a + " questionid=\"" + this.d.a() + "\" marked=\"" + (this.j ? "Y" : "N") + "\">").getBytes("UTF-8"));
    switch (this.d.d()) {
      case 1:
        for (b1 = 0; b1 < this.g.size(); b1++) {
          try {
            JRadioButton jRadioButton = this.e.get(b1);
            paramOutputStream.write(("<useranswer answernum=\"" + this.g.get(b1) + "\" selected=\"" + jRadioButton.isSelected() + "\" />").getBytes("UTF-8"));
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            paramOutputStream.write(("<useranswer answernum=\"" + this.g.get(b1) + "\" />").getBytes("UTF-8"));
          } 
        } 
        break;
      case 2:
        for (b1 = 0; b1 < this.g.size(); b1++) {
          try {
            JCheckBox jCheckBox = this.f.get(b1);
            paramOutputStream.write(("<useranswer answernum=\"" + this.g.get(b1) + "\" selected=\"" + jCheckBox.isSelected() + "\" />").getBytes("UTF-8"));
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            paramOutputStream.write(("<useranswer answernum=\"" + this.g.get(b1) + "\" />").getBytes("UTF-8"));
          } 
        } 
        break;
      case 5:
        if (this.k != null && (arrayOfInt = this.k.b()) != null) {
          int[] arrayOfInt1;
          int i = (arrayOfInt1 = arrayOfInt).length;
          for (byte b2 = 0; b2 < i; b2++) {
            int j = arrayOfInt1[b2];
            paramOutputStream.write(("<userstop stop=\"" + j + "\" />").getBytes("UTF-8"));
          } 
        } 
        break;
      case 3:
        if (this.m != null && (arrayOfPoint = this.m.a()) != null) {
          Point[] arrayOfPoint1;
          int i = (arrayOfPoint1 = arrayOfPoint).length;
          for (byte b2 = 0; b2 < i; b2++) {
            Point point;
            if ((point = arrayOfPoint1[b2]) != null)
              paramOutputStream.write(("<userspot x=\"" + point.x + "\" y=\"" + point.y + "\" />").getBytes("UTF-8")); 
          } 
        } 
        break;
      case 4:
        if (this.o != null)
          paramOutputStream.write(("<usertext>" + w.b(this.o.getText()) + "</usertext>").getBytes("UTF-8")); 
        break;
    } 
    paramOutputStream.write(("</" + a + ">").getBytes("UTF-8"));
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */