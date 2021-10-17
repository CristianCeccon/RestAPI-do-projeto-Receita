package com.receita.restapi;

import java.util.List;

import com.receita.restapi.database.RepositorioReceita;
import com.receita.restapi.entidade.Receita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receita")
public class ReceitaREST {

    @Autowired
    private RepositorioReceita repositorio;

    @GetMapping
    public List<Receita>listar(){

        return repositorio.findAll();

    }
    
    @PostMapping
    public void salvar(@RequestBody Receita receita){

        repositorio.save(receita);

    }

    @PutMapping
    public void alterar(@RequestBody Receita receita){

        if(receita.getId()>0){

            repositorio.save(receita);

        }

    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){

        repositorio.deleteById(id);

    }
}
