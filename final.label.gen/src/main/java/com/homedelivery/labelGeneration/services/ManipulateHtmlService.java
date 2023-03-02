package com.homedelivery.labelGeneration.services;

import com.homedelivery.labelGeneration.entities.HtmlDesign;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


@Component
@Qualifier("manipulate")
public class ManipulateHtmlService {

    pdfconversion pdfConverter = new pdfconversion();
    pngconversion pngConverter= new pngconversion();


    @Autowired
    private HtmlDesign htmlDesign;
    private String type;
    public void setHtmlDesign(HtmlDesign htmlDesign , String type) {
        this.htmlDesign = htmlDesign;
        this.type=type;
    }

    public void manipulateHtml() {
        String htmlCode = htmlDesign.getHtmlCode();

        String feature1= htmlDesign.feature1;
        String feature2= htmlDesign.feature2;
        String feature3= htmlDesign.feature3;
        String feature4= htmlDesign.feature4;
        String feature5= htmlDesign.feature5;
        String feature6= htmlDesign.feature6;
        String feature7= htmlDesign.feature7;
        String feature8= htmlDesign.feature8;
        String feature9= htmlDesign.feature9;





        htmlCode= htmlCode.replace("{{feature1_label}}","Name");
        htmlCode= htmlCode.replace("{{feature2_label}}","Address");
        htmlCode= htmlCode.replace("{{feature3_label}}","barcode");
        htmlCode= htmlCode.replace("{{feature4_label}}","cross doc");
        htmlCode= htmlCode.replace("{{feature5_label}}","final destination");
        htmlCode= htmlCode.replace("{{feature6_label}}","price");
        htmlCode= htmlCode.replace("{{feature7_label}}","pin code");
        htmlCode= htmlCode.replace("{{feature8_label}}","tax");
        htmlCode= htmlCode.replace("{{feature9_label}}","date");

        htmlCode= htmlCode.replace("{{feature1}}",feature1);
        htmlCode= htmlCode.replace("{{feature2}}",feature2);
        htmlCode= htmlCode.replace("{{feature3}}",feature3);
        htmlCode= htmlCode.replace("{{feature4}}",feature4);
        htmlCode= htmlCode.replace("{{feature5}}",feature5);
        htmlCode= htmlCode.replace("{{feature6}}",feature6);
        htmlCode= htmlCode.replace("{{feature7}}",feature7);
        htmlCode= htmlCode.replace("{{feature8}}",feature8);
        htmlCode= htmlCode.replace("{{feature9}}",feature9);

        Document doc = Jsoup.parse(htmlCode);

        try{
            Files.writeString(Paths.get("index.html"),doc.toString());
        }
        catch(IOException e){
            e.printStackTrace();
        }

if(type.equals("pdf")) {
    try {
        pdfConverter.ConverterPDF();
    } catch (Exception e) {
        System.out.println("not valid");
    }
}
else
    if(type.equals("png")){
        try {
            pdfConverter.ConverterPDF();
        } catch (Exception e) {
            System.out.println("not valid");
        }
    }


    }




}
