package com.movistar.springjsfjpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Submotivo {

    @Id
    private Long id; //0001
    private String codigo;// 01-01-0001
    private String descripcion;
    private boolean residencial;
    private boolean negocios;
    
    @ManyToOne
    private Motivo motivo;

    /*Getters and Setters*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isResidencial() {
        return residencial;
    }

    public void setResidencial(boolean residencial) {
        this.residencial = residencial;
    }

    public boolean isNegocios() {
        return negocios;
    }

    public void setNegocios(boolean negocios) {
        this.negocios = negocios;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }
    
    
    

    

}
