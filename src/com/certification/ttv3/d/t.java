package com.certification.ttv3.d;

import a.a.a.a;
import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.e.e;
import com.certification.ttv3.f.e;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

final class t extends JPanel {
  private Image i;
  
  private JLabel j;
  
  private JLabel k;
  
  JPanel a;
  
  private Color l;
  
  JScrollPane b;
  
  w c;
  
  w d;
  
  w e;
  
  JTable f;
  
  JTable g;
  
  JTable h;
  
  public t(q paramq) {
    Toolkit toolkit = getToolkit();
    this.i = toolkit.getImage(getClass().getResource("/com/certification/ttv3/images/history-icon.png"));
    setBackground(Color.WHITE);
    this.j = new JLabel("Exam History");
    this.j.setFont(new Font("Arial", 0, 24));
    this.j.setForeground(new Color(4, 50, 96));
    e e;
    if ((e = q.a(paramq).j()) != null) {
      this.k = new JLabel(String.valueOf(e.e()) + " " + e.d() + " - " + e.f());
    } else {
      this.k = new JLabel("Exam data not available");
    } 
    this.k.setFont(new Font("Arial", 0, 11));
    this.k.setForeground(new Color(132, 135, 140));
    add(this.j);
    add(this.k);
    this.l = new Color(221, 221, 221);
    this.a = new JPanel();
    this.a.setLayout((LayoutManager)new a());
    JLabel jLabel;
    (jLabel = new JLabel("No History Available")).setFont(new Font("Arial", 0, 18));
    jLabel.setHorizontalTextPosition(0);
    this.a.add("br hfill center", jLabel);
    this.a.setBackground(Color.WHITE);
    this.f = a(q.j);
    this.g = a(q.i);
    this.h = a(0);
    this.b = new JScrollPane(20, 31);
    this.b.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10), BorderFactory.createLineBorder(this.l)));
    this.b.setBackground(Color.WHITE);
    this.b.getViewport().setBackground(Color.WHITE);
    if (this.c.getRowCount() > 0) {
      this.b.getViewport().setView(this.f);
    } else {
      this.b.getViewport().setView(this.a);
    } 
    add(this.b);
  }
  
  private JTable a(int paramInt) {
    e e = null;
    if (paramInt == q.i) {
      this.d = new w(this, paramInt, (byte)0);
      e = new e(this.d);
    } 
    if (paramInt == 0) {
      this.e = new w(this, paramInt, (byte)0);
      e = new e(this.e);
    } 
    if (paramInt == q.j) {
      this.c = new w(this, paramInt, (byte)0);
      e = new e(this.c);
    } 
    if (e == null)
      return null; 
    e.setCellSelectionEnabled(false);
    e.setBackground(Color.WHITE);
    e.setOpaque(false);
    e.setFont(this.m.d);
    e.setFocusable(false);
    e.setRowHeight(24);
    e.setIntercellSpacing(new Dimension(10, 1));
    TableCellRenderer tableCellRenderer = e.getDefaultRenderer(JButton.class);
    e.setDefaultRenderer(JButton.class, new v(this, tableCellRenderer));
    u u = new u(this, (JTable)e);
    e.addMouseListener(u);
    e.addMouseMotionListener(u);
    TableColumn tableColumn;
    (tableColumn = e.getColumnModel().getColumn(0)).setPreferredWidth(75);
    (tableColumn = e.getColumnModel().getColumn(1)).setPreferredWidth(220);
    (tableColumn = e.getColumnModel().getColumn(2)).setPreferredWidth(90);
    (tableColumn = e.getColumnModel().getColumn(3)).setPreferredWidth(90);
    (tableColumn = e.getColumnModel().getColumn(4)).setPreferredWidth(90);
    (tableColumn = e.getColumnModel().getColumn(5)).setPreferredWidth(120);
    (tableColumn = e.getColumnModel().getColumn(6)).setPreferredWidth(120);
    return (JTable)e;
  }
  
  public final void paint(Graphics paramGraphics) {
    Dimension dimension1 = q.c(this.m).getViewport().getSize();
    Rectangle rectangle = paramGraphics.getClipBounds();
    Graphics2D graphics2D;
    (graphics2D = (Graphics2D)paramGraphics).addRenderingHints(TrainingTool.e());
    paramGraphics.setColor(Color.WHITE);
    paramGraphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    paramGraphics.drawImage(this.i, 16, 8, this);
    Dimension dimension2 = this.j.getPreferredSize();
    this.j.setBounds(96, 12, dimension2.width + 10, dimension2.height);
    dimension2 = this.k.getPreferredSize();
    this.k.setBounds(98, 43, dimension2.width + 10, dimension2.height);
    int i;
    if ((i = dimension1.width) < 46 + dimension2.width)
      i = 46 + dimension2.width; 
    graphics2D.setColor(this.l);
    graphics2D.drawLine(20, 78, i - 20, 78);
    this.b.setBounds(0, 92, dimension1.width, dimension1.height - 112);
    this.b.setMaximumSize(new Dimension(dimension1.width, dimension1.height - 112));
    this.b.setPreferredSize(new Dimension(dimension1.width, dimension1.height - 112));
    this.b.setMinimumSize(new Dimension(dimension1.width, dimension1.height - 112));
    this.b.revalidate();
    setPreferredSize(new Dimension(dimension1.width, 114 + dimension2.height));
    setMinimumSize(new Dimension(46 + dimension2.width, 114 + dimension2.height));
    paintChildren(paramGraphics);
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */