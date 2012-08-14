/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lcs.ui.table;

import java.awt.Component;
import java.awt.Font;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Ted
 */
public class lcsCellRenderer2 extends DefaultTableCellRenderer {

    private String fontName="Code2000";

    public lcsCellRenderer2(){
        super();
    }

    public lcsCellRenderer2(Font f){
        super();
        fontName=f.getFontName();
    }

    public Component getTableCellRendererComponent
       (JTable table, Object value, boolean isSelected,
       boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent
           (table, value, isSelected, hasFocus, row, column);
        if(column > 0 ){
            cell.setFont(new Font(fontName, 0, 20));
        } else {
            cell.setFont(new Font("Code2000", 0, 14));
        }
        return cell;
    }

    public void setFontName(String fn){
        fontName=fn;
    }
}
