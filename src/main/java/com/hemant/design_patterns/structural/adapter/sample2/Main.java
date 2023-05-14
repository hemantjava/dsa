package com.hemant.design_patterns.structural.adapter.sample2;

public class Main {
    public static void main(String[] args) {
        XMLDataFormat xmlDataFormat = new XMLDataFormatImpl();
        System.out.println(xmlDataFormat.xmlData());

        JSONDataFormat jsonDataFormat = new JSONDataFormatAdapter(xmlDataFormat);
        System.out.println(jsonDataFormat.jsonData());
    }
}
