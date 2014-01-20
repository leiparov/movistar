package com.movistar.springjsfjpa.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.movistar.springjsfjpa.entities.Motivo;
import com.movistar.springjsfjpa.entities.Resultado;
import com.movistar.springjsfjpa.entities.Submotivo;
import com.movistar.springjsfjpa.services.TematicoService;

@ManagedBean
@SessionScoped
@Component
public class TematicoController {
	
	@Autowired
	TematicoService tematicoService = new TematicoService();
	
	private List<Resultado> resultados;
	private Resultado resultado = new Resultado();
	
	private List<Motivo> motivos;
	private Motivo motivo;
	
	private List<Submotivo> submotivos;
	private Submotivo selectedSubmotivo;
	
	
	
	/*Prueba*/
	/*Abrir dialogs*/
	public void nuevoMotivo() {  
       RequestContext.getCurrentInstance().openDialog("nuevomotivo");  
    } 
	
	/*Acciones*/
	public void guardarMotivo () {
		
	}
	
	public void eliminarMotivo () {
		
	}
	
	/*Getters and setters*/

	public List<Resultado> getResultados() {
		if (resultados == null){
			return tematicoService.findAllResultados();
		}
		return resultados;
	}

	public void setResultados(List<Resultado> resultados) {
		this.resultados = resultados;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public List<Motivo> getMotivos() {
		return motivos;
	}

	public void setMotivos(List<Motivo> motivos) {
		this.motivos = motivos;
	}

	public Motivo getMotivo() {
		return motivo;
	}

	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}

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
