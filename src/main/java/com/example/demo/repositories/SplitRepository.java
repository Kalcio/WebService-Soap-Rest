package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Split;

@Repository
public interface SplitRepository extends CrudRepository<Split,Long>{

}
