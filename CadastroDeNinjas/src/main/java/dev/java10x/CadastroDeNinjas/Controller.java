package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping

public class Controller {
    @GetMapping("/Welcome")

    public String boasVindas(){
        
        return "It is my first message in this route!";
        
    }
}
