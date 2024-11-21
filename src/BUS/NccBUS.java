package BUS;

import DAO.NccDAO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class NccBUS {

    private NccDAO nccDAO;

    public NccBUS() {
        nccDAO = new NccDAO();
    }

    public void loadDataToTable_NhaCungCap(JTable table) {
        ArrayList<Object[]> data = nccDAO.getDataFromDatabase();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing data
        for (Object[] row : data) {
            String maNhaCungCap = (String) row[0];
            String tenNhaCungCap = (String) row[1];
            String diaChi = (String) row[2];
            String soDienThoai = (String) row[3];
            model.addRow(new Object[]{maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai});
        }
    }

}
