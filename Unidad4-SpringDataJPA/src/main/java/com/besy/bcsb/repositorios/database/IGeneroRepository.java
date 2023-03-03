package com.besy.bcsb.repositorios.database;

import com.besy.bcsb.dominio.Genero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IGeneroRepository extends CrudRepository<Genero, Integer> {
    @Query("select g from Genero g where g.nombre=?1")
    Optional<Genero> findByName(String nombre);
}
