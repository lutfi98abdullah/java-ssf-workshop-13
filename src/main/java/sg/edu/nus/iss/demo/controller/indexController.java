package sg.edu.nus.iss.demo.controller;

import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sg.edu.nus.iss.demo.model.Person;

@Controller
@RequestMapping(path="/demo", produces=MediaType.TEXT_HTML_VALUE)
public class indexController {

    @GetMapping("/currtime")
    public String getCurrDateTime(Model model){
        model.addAttribute("currtime", new Date().toString());
        return "currtime";
    }

    @GetMapping("/person")
    public String getPerson(Model model){
        Person p = new Person();
        p.setId(1);
        p.setFirstName("Lutfi");
        p.setLastName("AB");
        model.addAttribute("currtime", new Date().toString());
        return "currtime";
    }

    @GetMapping("/allperson")
    public String getPerson(Model model){
        Person p = new Person();
        p.setId(1);
        p.setFirstName("kenneth");
        p.setLastName("Phang");
        model.addAttribute("currtime", new Date().toString());
        return "currtime";
    }

    @GetMapping("/searchPerson")
    public String getPerson(Model model){
        Person p = new Person();
        p.setId(1);
        p.setFirstName("Lutfi");
        p.setLastName("AB");
        model.addAttribute("currtime", new Date().toString());
        return "currtime";
    
    //search
    if(firstName.equals("Lutfi")){
        
    }
    }

}
