package com.movistar.springjsfjpa.web;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

import com.movistar.springjsfjpa.entities.Submotivo;

@ManagedBean
@SessionScoped
@Component
public class TematicoController {
	
	private List<Submotivo> submotivos = new ArrayList<Submotivo>();
	private Submotivo selectedSubmotivo = new Submotivo();
	
	/*Prueba*/
	
	/*Getters and setters*/
	public List<Submotivo> getSubmotivos() {
		return submotivos;
	}
	public void setSubmotivos(List<Submotivo> submotivos) {
		this.submotivos = submotivos;
	}
	public Submotivo getSelectedSubmotivo() {
		return selectedSubmotivo;
	}
	public void setSelectedSubmotivo(Submotivo selectedSubmotivo) {
		this.selectedSubmotivo = selectedSubmotivo;
	}
	

}
