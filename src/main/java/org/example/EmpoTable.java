package org.example;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmpoTable extends AbstractTableModel {

    ArrayList<Employee> person;

    String[] columns = {"ID Number", "Date", "Present", "Absent", "Late"};

    public EmpoTable() {
        person = new ArrayList<>();
    }

    public void adding(Employee student) {
        person.add(student);
        fireTableDataChanged();
    }

    public String getColumnName(int column) {
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

    public void remove(int index) {
        person.remove(index);
        fireTableDataChanged();
    }

    public void clear() {
        person.clear();
        fireTableDataChanged();
    }

    public Employee get(int index) {
        return person.get(index);
    }

    public void update(int index, Employee updatedPerson) {
        if (index >= 0 && index < person.size()) {
            person.set(index, updatedPerson);
            fireTableDataChanged();
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("EmpoTable{\n");
        for (Employee e : person) {
            builder.append(e.toString()).append("\n");
        }
        builder.append("}");
        return builder.toString();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee po = person.get(rowIndex);

        if (columnIndex == 0) {
            return po.getID();
        } else if (columnIndex == 1) {
            int monthNumber = getMonthNumber(po.getMonth());
            String formattedDate = String.format("%02d/%02d/%s",
                    monthNumber,
                    Integer.parseInt(po.getDay()),
                    po.getYear());
            return formattedDate;
        } else if (columnIndex == 2) {
            return po.getPresent();
        } else if(columnIndex == 3) {
            return po.getAbsent();
        } else {
            return po.getLate();
        }
    }


    private int getMonthNumber(String monthName) {
        Map<String, Integer> monthMap = new HashMap<>();
        monthMap.put("January", 1);
        monthMap.put("February", 2);
        monthMap.put("March", 3);
        monthMap.put("April", 4);
        monthMap.put("May", 5);
        monthMap.put("June", 6);
        monthMap.put("July", 7);
        monthMap.put("August", 8);
        monthMap.put("September", 9);
        monthMap.put("October", 10);
        monthMap.put("November", 11);
        monthMap.put("December", 12);

        return monthMap.getOrDefault(monthName, 1); // default to 1 if not found
    }
}
