package em.dev.components;

import java.util.List;
import javax.swing.JTable;

public class TableModel {
    
    public static void load(JTable table, List<Object[]> list){
        
        Object[] columnNames = new Object[]{"MATRÍCULA", "NOME", "CPF", "CARGO OCUPADO", "LOTAÇÃO", "REGIME"};
        MyTableModel model = new MyTableModel(columnNames, 0);
            
        list.forEach((obj) -> {
            model.addRow(obj);
        });
        table.setModel(model);
    }
}
