package com.certification.ttv3.a;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.AbstractCellEditor;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public final class g extends AbstractCellEditor implements ActionListener, MouseListener, TableCellEditor, TableCellRenderer {
  private JTable a;
  
  private Action b;
  
  private Border c;
  
  private Border d;
  
  private JButton e;
  
  private JButton f;
  
  private Object g;
  
  private boolean h;
  
  private JLabel i;
  
  public g(d paramd, JTable paramJTable, Action paramAction, int paramInt) {
    this.a = paramJTable;
    this.b = paramAction;
    this.e = new JButton();
    this.f = new JButton();
    this.f.setFocusPainted(false);
    this.f.addActionListener(this);
    this.c = this.f.getBorder();
    LineBorder lineBorder = new LineBorder(Color.BLUE);
    g g1;
    (g1 = this).d = lineBorder;
    g1.f.setBorder(lineBorder);
    TableColumnModel tableColumnModel;
    (tableColumnModel = paramJTable.getColumnModel()).getColumn(4).setCellRenderer(this);
    tableColumnModel.getColumn(4).setCellEditor(this);
    paramJTable.addMouseListener(this);
    this.i = new JLabel();
    this.i.setHorizontalTextPosition(0);
    this.i.setHorizontalAlignment(0);
    Font font = (font = this.i.getFont()).deriveFont(0);
    this.i.setFont(font);
  }
  
  public final Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2) {
    if (paramObject == null) {
      this.f.setText("");
      this.f.setIcon((Icon)null);
    } else if (paramObject instanceof Icon) {
      this.f.setText("");
      this.f.setIcon((Icon)paramObject);
    } else {
      this.f.setText(paramObject.toString());
      this.f.setIcon((Icon)null);
    } 
    this.g = paramObject;
    return this.f;
  }
  
  public final Object getCellEditorValue() {
    return this.g;
  }
  
  public final Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    paramInt1 = this.j.a.b(((Integer)this.j.i.a.get(paramInt1)).intValue());
    if (paramObject instanceof JProgressBar)
      return (JProgressBar)paramObject; 
    if (paramInt1 == 0) {
      if (paramBoolean1) {
        this.e.setForeground(paramJTable.getSelectionForeground());
        this.e.setBackground(paramJTable.getSelectionBackground());
      } else {
        this.e.setForeground(paramJTable.getForeground());
        this.e.setBackground(UIManager.getColor("Button.background"));
      } 
      if (paramBoolean2) {
        this.e.setBorder(this.d);
      } else {
        this.e.setBorder(this.c);
      } 
      if (paramObject == null) {
        this.e.setText("");
        this.e.setIcon((Icon)null);
      } else if (paramObject instanceof Icon) {
        this.e.setText("");
        this.e.setIcon((Icon)paramObject);
      } else {
        this.e.setText(paramObject.toString());
        this.e.setIcon((Icon)null);
      } 
      return this.e;
    } 
    this.i.setText(paramObject.toString());
    return this.i;
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent) {
    int i = this.a.convertRowIndexToModel(this.a.getEditingRow());
    fireEditingStopped();
    ActionEvent actionEvent = new ActionEvent(this.a, 1001, String.valueOf(i));
    this.b.actionPerformed(actionEvent);
  }
  
  public final void mousePressed(MouseEvent paramMouseEvent) {
    if (this.a.isEditing() && this.a.getCellEditor() == this)
      this.h = true; 
  }
  
  public final void mouseReleased(MouseEvent paramMouseEvent) {
    if (this.h && this.a.isEditing())
      this.a.getCellEditor().stopCellEditing(); 
    this.h = false;
  }
  
  public final void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getClickCount() == 2) {
      if (this.j.c.isEnabled()) {
        d.a(this.j);
        return;
      } 
      try {
        int i = this.j.j.getSelectionModel().getLeadSelectionIndex();
        int j = ((Integer)this.j.i.a.get(i)).intValue();
        int k;
        if ((k = this.j.a.b(j)) == 0) {
          this.j.a(j);
          this.j.i.fireTableCellUpdated(i, 5);
          return;
        } 
      } catch (Exception exception) {}
    } 
  }
  
  public final void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public final void mouseExited(MouseEvent paramMouseEvent) {}
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */