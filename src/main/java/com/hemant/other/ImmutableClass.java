package com.hemant.other;

import com.hemant.design_patterns.creational.builder.Student;

import java.util.*;

public final class ImmutableClass {
    private final int intValue;
    private final String stringValue;
    private final List<Integer> listValue;
    private final Map<String, Integer> mapValue;
    private final Student studentValue;
    private final Date dateValue;

    public ImmutableClass(int intValue, String stringValue, List<Integer> listValue,
                          Map<String, Integer> mapValue, Student studentValue, Date dateValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
        this.listValue = List.copyOf(listValue);
        this.mapValue = Map.copyOf(mapValue);
        this.studentValue = studentValue;
        this.dateValue = new Date(dateValue.getTime());
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public List<Integer> getListValue() {
        return listValue;
    }

    public Map<String, Integer> getMapValue() {
        return mapValue;
    }

    public Student getStudentValue() {
        return studentValue;
    }

    public Date getDateValue() {
        return new Date(dateValue.getTime());
    }
}