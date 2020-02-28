package com.secretaria.controladores;

import com.secretaria.dominios.Candidato;
import com.secretaria.dominios.PreMatricula;
import com.secretaria.servicos.MatriculaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {

    private MatriculaService matriculaService;

    public MatriculaController(MatriculaService matriculaService) {
        this.matriculaService = matriculaService;
    }

    @PostMapping
    public ResponseEntity receberMatricula(@RequestBody Candidato candidato) {
        matriculaService.cadastrarCandidato(candidato);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping(value = "/retornaTodas")
    public List<PreMatricula> retornaPreMatriculas() {
        return matriculaService.retornaMatriculas();
    }

    @PostMapping(value = "/{id}")
    public PreMatricula aprovaMatricula(@PathVariable Integer id) {
        return matriculaService.addMatricula(id);
    }
}
