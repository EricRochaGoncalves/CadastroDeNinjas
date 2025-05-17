package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaRepository ninjaRepository;

    @GetMapping
    public List<NinjaModel> listarTodos() {
        return ninjaRepository.findAll();
    }

    @PostMapping
    public NinjaModel cadastrar(@RequestBody NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }
}

