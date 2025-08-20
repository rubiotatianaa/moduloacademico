package com.example.moduloacademico.modelos;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Grupo {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;

        private Integer semestre;

        @ManyToOne
        @JoinColumn(name = "materia_id")
        private Materia materia;

        // Constructor vacío
        public Grupo() {
        }

        // Getters y setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Integer getSemestre() {
            return semestre;
        }

        public void setSemestre(Integer semestre) {
            this.semestre = semestre;
        }

        public Materia getMateria() {
            return materia;
        }

        public void setMateria(Materia materia) {
            this.materia = materia;
        }
    }


