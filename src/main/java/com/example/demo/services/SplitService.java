package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Split;
import com.example.demo.repositories.SplitRepository;

@Service
public class SplitService {
	@Autowired
	SplitRepository SplitRepository;
	
	public ArrayList<Split> ObtenerSplit(){
		return (ArrayList<Split>)SplitRepository.findAll();
	}
	public Split guardarSplit(Split x) {
		return SplitRepository.save(x);
	}
	
}
