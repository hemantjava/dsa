package com.hemant.design_patterns.structural.adapter.sample2;

public class JSONDataFormatAdapter implements JSONDataFormat {

    private final XMLDataFormat xmlDataFormat;

    public JSONDataFormatAdapter(XMLDataFormat xmlDataFormat) {
        this.xmlDataFormat = xmlDataFormat;
    }

    @Override
    public String jsonData() {
        final var xmlData = xmlDataFormat.xmlData();//type conversion from xml to json
        return getJsonString(xmlData);
    }

    //Dummy implementation for conversion of json data simulation
    private String getJsonString(String xmlString) {
        return xmlString.contains("XML") ? "JSON" : "invalid format";
    }
}
