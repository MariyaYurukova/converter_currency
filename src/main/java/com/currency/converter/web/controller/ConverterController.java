package com.currency.converter.web.controller;


import com.currency.converter.domain.entities.Converter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConverterController {

   @GetMapping("/")
   public String index(Model model) {

      model.addAttribute("view", "views/converterForm");
      return "base-layout";
   }

   @PostMapping("/")
   public String calculate(@RequestParam String leftOperand,
                           @RequestParam String rightOperand,
                           @RequestParam String value,
                           Model model) {



      double  num1;

      String valuta1;

      String valuta2;


      try {
         num1 = Double.parseDouble(value);
      } catch (NumberFormatException EX) {
         num1 = 0;
      }

      try {
         valuta1= ((leftOperand));
      }  catch(Exception EX) {
         valuta1 = null;
      }

      try {
         valuta2 = ((rightOperand));
      }  catch(Exception EX){
         valuta2 = null;
      }


      Converter converter = new Converter(num1, valuta1, valuta2);
      double result = converter.calculateResult();

      model.addAttribute("suma", converter.getValue());
      model.addAttribute("leftOperand", converter.getLeftOperand());
      model.addAttribute("rightOperand", converter.getRightOperand());

      model.addAttribute("result", (num1 * result));

      model.addAttribute("view", "views/converterForm");

      return "base-layout";
   }



}

