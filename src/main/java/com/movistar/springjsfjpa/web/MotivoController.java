package com.movistar.springjsfjpa.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.movistar.springjsfjpa.entities.Motivo;
import com.movistar.springjsfjpa.entities.Resultado;
import com.movistar.springjsfjpa.services.TematicoService;

@ManagedBean
@SessionScoped
@Component
public class MotivoController {
	@Autowired
	TematicoService tematicoService = new TematicoService();
	
	private Resultado resultado;
	private String descripcion;
	
	public void guardarMotivo (){
		Motivo m = new Motivo();
		m.setDescripcion(descripcion);
		m.setResultado(resultado);
		tematicoService.guardarMotivo(m);
		System.out.println(m);
		RequestContext.getCurrentInstance().closeDialog(m); 
	}
	
	/*Getters and Setters*/
	public Resultado getResultado() {
		return resultado;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
