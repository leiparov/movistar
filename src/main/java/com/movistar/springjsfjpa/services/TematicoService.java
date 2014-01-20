package com.movistar.springjsfjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movistar.springjsfjpa.entities.Motivo;
import com.movistar.springjsfjpa.entities.Resultado;
import com.movistar.springjsfjpa.repositories.MotivoRepository;
import com.movistar.springjsfjpa.repositories.ResultadoRepository;

@Service
@Transactional
public class TematicoService {
	
	@Autowired
	private ResultadoRepository resultadoRepository;
	@Autowired
	private MotivoRepository motivoRepository;

	public List<Resultado> findAllResultados() {
		return resultadoRepository.findAll();
	}

	public void guardarMotivo(Motivo m) {
		motivoRepository.save(m);		
		
	}

}
