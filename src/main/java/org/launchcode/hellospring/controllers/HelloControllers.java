package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody
public class HelloControllers {


//    form request
    @RequestMapping(value="hello", method= RequestMethod.POST)
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String lang){
        if(name == null){
            name = "World";
        }
        return createMessage(name, lang);
    }

//    static method
    public static String createMessage(String name, String lang){
    String greeting ="";
    if(lang.equals("english")){
        greeting = "Hello";
    } else if (lang.equals("french")){
        greeting = "Bonjour";
    } else if (lang.equals("spanish")){
        greeting = "Hola";
    } else if (lang.equals("german")){
        greeting = "Guten tag";
    } else if (lang.equals("italian")){
        greeting = "Ciao";
    }
    return greeting + " " + name;
    };


    //handles requests for http://localhost:8080/hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/hello' method ='post'>" + // submit a request to /hello
                "<input type = 'text' name = 'name' >" +
                "<select name='lang'>" +
                "<option value= 'french'> french" +
                "</option>" +
                "<option value= 'spanish'> spanish" +
                "</option>" +
                "<option value= 'german'> german" +
                "</option>" +
                "<option value= 'italian'> italian" +
                "</option>" +
                "<option value= 'english'> english" +
                "</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
