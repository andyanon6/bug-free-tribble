package a.a.a;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public final class a extends FlowLayout implements LayoutManager, Serializable {
  private Map a = new HashMap<Object, Object>();
  
  private String b = "vcenter";
  
  private int c;
  
  private int d;
  
  private Insets e;
  
  private Insets f = new Insets(0, 0, 0, 0);
  
  public a() {
    this(10, 5);
  }
  
  public a(int paramInt1, int paramInt2) {
    this.c = paramInt1;
    this.d = paramInt2;
    Insets insets = new Insets(0, paramInt1, paramInt1, paramInt1);
    a a1;
    (a1 = this).e = insets;
  }
  
  public final int getHgap() {
    return this.c;
  }
  
  public final void setHgap(int paramInt) {
    this.c = paramInt;
  }
  
  public final int getVgap() {
    return this.d;
  }
  
  private Insets a(Container paramContainer) {
    Insets insets = paramContainer.getInsets();
    insets.top += this.e.top;
    insets.left += this.e.left;
    insets.bottom += this.e.bottom;
    insets.right += this.e.right;
    return this.f;
  }
  
  public final void setVgap(int paramInt) {
    this.d = paramInt;
  }
  
  public final void addLayoutComponent(String paramString, Component paramComponent) {
    this.a.put(paramComponent, paramString);
  }
  
  public final void removeLayoutComponent(Component paramComponent) {
    this.a.remove(paramComponent);
  }
  
  private boolean a(Component paramComponent) {
    String str;
    return ((str = (String)this.a.get(paramComponent)) != null && (str.indexOf("br") != -1 || str.indexOf("p") != -1));
  }
  
  private boolean a(Component paramComponent, String paramString) {
    String str;
    if ((str = (String)this.a.get(paramComponent)) == null)
      return false; 
    StringTokenizer stringTokenizer = new StringTokenizer(str);
    while (stringTokenizer.hasMoreTokens()) {
      if (stringTokenizer.nextToken().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  private b b(Container paramContainer) {
    b b = new b();
    int i = paramContainer.getComponentCount();
    int j = 0;
    byte b1 = 0;
    for (byte b2 = 0; b2 < i; b2++) {
      Component component = paramContainer.getComponent(b2);
      if (a(component) || b2 == 0) {
        j = 0;
        b1 = 0;
      } else {
        j += this.c;
      } 
      if (a(component, "tab")) {
        b.a(b1, j);
        j = b.a(b1++);
      } 
      Dimension dimension = component.getPreferredSize();
      j += dimension.width;
    } 
    return b;
  }
  
  public final Dimension preferredLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Dimension dimension1 = new Dimension(0, 0);
      Dimension dimension2 = new Dimension(0, 0);
      int i = paramContainer.getComponentCount();
      boolean bool = true;
      byte b1 = 0;
      b b = b(paramContainer);
      for (byte b2 = 0; b2 < i; b2++) {
        Component component = paramContainer.getComponent(b2);
        if (a(component)) {
          b1 = 0;
          dimension1.width = Math.max(dimension1.width, dimension2.width);
          dimension1.height += dimension2.height + this.d;
          if (a(component, "p"))
            dimension1.height += 2 * this.d; 
          dimension2 = new Dimension(0, 0);
        } 
        if (a(component, "tab"))
          dimension2.width = b.a(b1++); 
        Dimension dimension = component.getPreferredSize();
        dimension2.height = Math.max(dimension2.height, dimension.height);
        if (bool) {
          bool = false;
        } else {
          dimension2.width += this.c;
        } 
        dimension2.width += dimension.width;
      } 
      dimension1.width = Math.max(dimension1.width, dimension2.width);
      dimension1.height += dimension2.height;
      Insets insets = a(paramContainer);
      dimension1.width += insets.left + insets.right;
      dimension1.height += insets.top + insets.bottom;
      return dimension1;
    } 
  }
  
  public final Dimension minimumLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Dimension dimension1 = new Dimension(0, 0);
      Dimension dimension2 = new Dimension(0, 0);
      int i = paramContainer.getComponentCount();
      boolean bool = true;
      byte b1 = 0;
      b b = b(paramContainer);
      for (byte b2 = 0; b2 < i; b2++) {
        Component component = paramContainer.getComponent(b2);
        if (a(component)) {
          b1 = 0;
          dimension1.width = Math.max(dimension1.width, dimension2.width);
          dimension1.height += dimension2.height + this.d;
          if (a(component, "p"))
            dimension1.height += 2 * this.d; 
          dimension2 = new Dimension(0, 0);
        } 
        if (a(component, "tab"))
          dimension2.width = b.a(b1++); 
        Dimension dimension = component.getMinimumSize();
        dimension2.height = Math.max(dimension2.height, dimension.height);
        if (bool) {
          bool = false;
        } else {
          dimension2.width += this.c;
        } 
        dimension2.width += dimension.width;
      } 
      dimension1.width = Math.max(dimension1.width, dimension2.width);
      dimension1.height += dimension2.height;
      Insets insets = a(paramContainer);
      dimension1.width += insets.left + insets.right;
      dimension1.height += insets.top + insets.bottom;
      return dimension1;
    } 
  }
  
  private void a(Container paramContainer, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, b paramb) {
    synchronized (paramContainer.getTreeLock()) {
      switch (getAlignment()) {
        case 0:
          paramInt1 += paramBoolean ? 0 : paramInt3;
          break;
        case 1:
          paramInt1 += paramInt3 / 2;
          break;
        case 2:
          paramInt1 += paramBoolean ? paramInt3 : 0;
          break;
        case 4:
          paramInt1 += paramInt3;
          break;
      } 
      paramInt3 = 0;
      for (paramInt5 = paramInt5; paramInt5 < paramInt6; paramInt5++) {
        Component component = paramContainer.getComponent(paramInt5);
        if (a(component, "tab"))
          paramInt1 = (a(paramContainer)).left + paramb.a(paramInt3++); 
        byte b1 = (this.b == "vtop") ? 0 : ((paramInt4 - component.getHeight()) / 2);
        if (paramBoolean) {
          component.setLocation(paramInt1, paramInt2 + b1);
        } else {
          component.setLocation(paramContainer.getWidth() - paramInt1 - component.getWidth(), paramInt2 + b1);
        } 
        paramInt1 += component.getWidth() + this.c;
      } 
      return;
    } 
  }
  
  public final void layoutContainer(Container paramContainer) {
    setAlignment(0);
    synchronized (paramContainer.getTreeLock()) {
      Insets insets = a(paramContainer);
      int i = paramContainer.getWidth() - insets.left + insets.right;
      int j = paramContainer.getHeight() - insets.top + insets.bottom;
      int k = paramContainer.getComponentCount();
      int m = 0;
      int n = insets.top + this.d;
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      boolean bool = paramContainer.getComponentOrientation().isLeftToRight();
      Component component1 = null;
      Component component2 = null;
      b b = b(paramContainer);
      byte b1 = 0;
      int i4;
      for (i4 = 0; i4 < k; i4++) {
        Component component3;
        Dimension dimension = (component3 = paramContainer.getComponent(i4)).getPreferredSize();
        component3.setSize(dimension.width, dimension.height);
        if (a(component3))
          b1 = 0; 
        if (a(component3, "tab"))
          m = b.a(b1++); 
        if (!a(component3)) {
          if (i4 > 0 && !a(component3, "tab"))
            m += this.c; 
          m += dimension.width;
          i1 = Math.max(i1, dimension.height);
        } else {
          if (component2 != null && !i3)
            i3 = i4; 
          if (component1 != null) {
            component1.setSize(component1.getWidth() + i - m, component1.getHeight());
            m = i;
          } 
          a(paramContainer, insets.left, n, i - m, i1, i2, i4, bool, b);
          m = dimension.width;
          n += this.d + i1;
          if (a(component3, "p"))
            n += 2 * this.d; 
          i1 = dimension.height;
          i2 = i4;
          component1 = null;
        } 
        Component component4 = component3;
        a a1;
        if ((a1 = this).a(component4, "hfill"))
          component1 = component3; 
        component4 = component3;
        if ((a1 = this).a(component4, "vfill"))
          component2 = component3; 
        component4 = component3;
        if ((a1 = this).a(component4, "left")) {
          a1.setAlignment(0);
        } else if (a1.a(component4, "right")) {
          a1.setAlignment(2);
        } else if (a1.a(component4, "center")) {
          a1.setAlignment(1);
        } 
        if (a1.a(component4, "vtop")) {
          a1.b = "vtop";
        } else if (a1.a(component4, "vcenter")) {
          a1.b = "vcenter";
        } 
      } 
      if (component2 != null && i3 == 0)
        i3 = k; 
      if (component1 != null) {
        component1.setSize(component1.getWidth() + i - m, component1.getHeight());
        m = i;
      } 
      a(paramContainer, insets.left, n, i - m, i1, i2, k, bool, b);
      if ((i4 = j - n + i1) != 0 && component2 != null) {
        component2.setSize(component2.getWidth(), i4 + component2.getHeight());
        i = k;
        int i6 = i3;
        int i5 = i4;
        boolean bool1 = false;
        Container container;
        synchronized ((container = paramContainer).getTreeLock()) {
          for (i6 = i6; i6 < i; i6++) {
            Component component;
            (component = container.getComponent(i6)).setLocation(component.getX(), component.getY() + i5);
          } 
        } 
      } 
      return;
    } 
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */