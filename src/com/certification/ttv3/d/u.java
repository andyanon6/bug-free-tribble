package com.certification.ttv3.d;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

final class u implements MouseListener, MouseMotionListener {
  private JTable a;
  
  public u(t paramt, JTable paramJTable) {
    this.a = paramJTable;
  }
  
  private JButton a(MouseEvent paramMouseEvent) {
    TableColumnModel tableColumnModel;
    int j = (tableColumnModel = this.a.getColumnModel()).getColumnIndexAtX(paramMouseEvent.getX());
    Object object;
    int i;
    return ((i = paramMouseEvent.getY() / this.a.getRowHeight()) >= this.a.getRowCount() || i < 0 || j >= this.a.getColumnCount() || j < 0) ? null : ((object = this.a.getValueAt(i, j) instanceof JButton) ? (JButton)object : null);
  }
  
  public final void mouseClicked(MouseEvent paramMouseEvent) {
    JButton jButton;
    if ((jButton = a(paramMouseEvent)) != null)
      jButton.doClick(); 
  }
  
  public final void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public final void mouseExited(MouseEvent paramMouseEvent) {
    this.b.setCursor(Cursor.getDefaultCursor());
  }
  
  public final void mousePressed(MouseEvent paramMouseEvent) {}
  
  public final void mouseReleased(MouseEvent paramMouseEvent) {}
  
  public final void mouseDragged(MouseEvent paramMouseEvent) {}
  
  public final void mouseMoved(MouseEvent paramMouseEvent) {
    if (a(paramMouseEvent) != null) {
      this.b.setCursor(Cursor.getPredefinedCursor(12));
      return;
    } 
    this.b.setCursor(Cursor.getDefaultCursor());
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/d/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */