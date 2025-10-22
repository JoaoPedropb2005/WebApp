/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ALUNO
 */
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public @ResponseBody String greeting() {
    return "Hello, World!";
    }
    
    @RequestMapping("/joaopedro")
    public @ResponseBody String greetingjp() {
        return "Hello, João Pedr!";
    }
    
}
