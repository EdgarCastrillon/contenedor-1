package com.integracion.integracion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IntegracionController {

    @GetMapping("/saludo")
    public String helloFromContainer(){
        String uri = "http://localhost:8080/contenedor-2/saludo";
        RestTemplate restTemplate = new RestTemplate();
        String respuesta = restTemplate.getForObject(uri, String.class);
        System.out.println("Esta es la respuesta desde el contenedor 2 " + respuesta);
        return respuesta;
    }
}
