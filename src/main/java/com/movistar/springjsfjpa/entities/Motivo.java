package com.movistar.springjsfjpa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Motivo {

    @Id
    private Long id; // 01
    private String codigo;// 01-01
    private String descripcion;

    @ManyToOne
    private Resultado resultado;

    @OneToMany(mappedBy = "motivo")
    private List<Submotivo> submotivos;

    /* Getters and Setters */
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

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public List<Submotivo> getSubmotivos() {
        return submotivos;
    }

    public void setSubmotivos(List<Submotivo> submotivos) {
        this.submotivos = submotivos;
    }

    
    

}
