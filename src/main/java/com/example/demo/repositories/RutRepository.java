package com.example.demo.repositories;

import com.example.demo.models.Rut;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface RutRepository  extends CrudRepository<Rut,Long>{

}
