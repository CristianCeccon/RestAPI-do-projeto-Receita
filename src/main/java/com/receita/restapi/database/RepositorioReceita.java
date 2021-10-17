package com.receita.restapi.database;

import com.receita.restapi.entidade.Receita;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioReceita extends JpaRepository<Receita,Long>{
    
}
