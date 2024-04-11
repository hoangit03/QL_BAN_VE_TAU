
package cell;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TabelFiledTextEditor extends DefaultCellEditor{
    public TabelFiledTextEditor(){
        super(new JTextField());
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelField filed = new PanelField();
        return filed;
                
    }
    
}
