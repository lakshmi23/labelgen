package com.homedelivery.labelGeneration.controller;

import com.homedelivery.labelGeneration.entities.HtmlDesign;
import com.homedelivery.labelGeneration.services.ManipulateHtmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class LabelGenerationController {


    @Autowired
    @Qualifier("manipulate")
    ManipulateHtmlService manipulateHtmlService;


    @PostMapping("/api/htmlDesign")
    public void postHTMLDesign(@RequestBody HtmlDesign html, @RequestParam String type) {
//        this.htmlDesign = htmlDesign;

//       System.out.println(type);
//       System.out.println(html);
        manipulateHtmlService.setHtmlDesign(html,type);
        manipulateHtmlService.manipulateHtml();
//   }
    }
}

