package org.example;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TabHours extends AbstractTableModel {
    ArrayList<HoursWork> person;

    String[] columns ={"Date" , "Time"};
    public TabHours(){

        person = new ArrayList<>();
    }

    public void adding(HoursWork student){
        person.add(student);
        fireTableDataChanged();
    }

    public String getColumnName(int column){
        return columns[column];
    }
    @Override
    public int getRowCount() {
        return person.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        HoursWork po = person.get(rowIndex);

        if(columnIndex==0){
            return po.getDate();
        }else  {
            return po.getHour();
        }
    }
}
