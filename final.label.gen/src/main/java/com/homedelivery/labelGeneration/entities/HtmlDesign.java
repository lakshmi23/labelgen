package com.homedelivery.labelGeneration.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("htmlDesign")
public class HtmlDesign {

    private String htmlCode;
    public String feature1;
    public String feature2;
    public String feature3;
    public String feature4;

    public String feature5;
    public String feature6;
    public String feature7;
    public String feature8;
    public String feature9;


    @Override
    public String toString() {
        return "HtmlDesign{" +
                "htmlCode='" + htmlCode + '\'' +
                ", feature1='" + feature1 + '\'' +
                ", feature2='" + feature2 + '\'' +
                ", feature3='" + feature3 + '\'' +
                ", feature4='" + feature4 + '\'' +
                ", feature5='" + feature5 + '\'' +
                ", feature6='" + feature6 + '\'' +
                ", feature7='" + feature7 + '\'' +
                ", feature8='" + feature8 + '\'' +
                ", feature9='" + feature9 + '\'' +
                '}';
    }

    public String getHtmlCode() {
        return htmlCode;
    }
}
