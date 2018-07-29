package pl.pawellinkshell.cattinder.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginPageController {

    @Value("${message:Hello default}")
    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        return "SIEMA";
    }

    @RequestMapping("/")
    public String getHome() {
        return "HOME";
    }

    @RequestMapping("/jan")
    public String getJan(){
        return "JAN";
    }

    @RequestMapping("/dawid")
    public String getDawid(){
        return "Dawid";
    }
}
