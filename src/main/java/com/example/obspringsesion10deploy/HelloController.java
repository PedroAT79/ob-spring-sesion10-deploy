package com.example.obspringsesion10deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Para trabajar con JSON de prueba
public class HelloController {

    @Value("${app.varexample}")

    @GetMapping("/")
    public String holaMundo(){
        return "Hola 1 Mundo que tal vamos, hasta luego!!";
    }


}
