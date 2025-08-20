package com.example.moduloacademico.modelos;

import jakarta.persistence.*;


@Entity
@Table(name="materia")

public class Materia {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_materia;
    @Column(name = "materia",nullable = false,unique = false,length = 100)
    private String nombre_materia;
   @Column(name = "codigo_materia",nullable = false,unique = false,length = 100)
   private String codigo_materia;
    @ManyToOne
    @JoinColumn(name = "docente_id", referencedColumnName = "id")




    public  Materia(){

    }
    public Materia(Integer id_materia, String nombre_materia, String codigo_materia, Docente docente) {
        this.id_materia = id_materia;
        this.nombre_materia = nombre_materia;
        this.codigo_materia = codigo_materia;
        this.docente = docente;
    }

    public Integer getId_materia() {
        return id_materia;
    }

    public void setId_materia(Integer id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public String getCodigo_materia() {
        return codigo_materia;
    }

    public void setCodigo_materia(String codigo_materia) {
        this.codigo_materia = codigo_materia;
    }

    public Docente getDocente_id() {
        return docente;
    }

    public void setDocente_id(Docente docente) {
        this.docente = docente;
    }
}
