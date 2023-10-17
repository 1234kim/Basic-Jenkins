package com.example.Ebstack.Ebstack.Controller;


import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/")
    public String Newpage(){
        return "my page runing";
    }

    @GetMapping("/Ebget")
    public String hello(){
        return "Get is working";
    }


}
