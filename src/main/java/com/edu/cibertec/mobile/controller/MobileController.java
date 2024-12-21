/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.cibertec.mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MobileController {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping("/mobile/curso")
    public String obtenerCurso(){
        return restTemplate.getForObject("http://CURSO/cursos/11", String.class);
    }
    
}
