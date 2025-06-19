package com.euge.literalura.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "autores", uniqueConstraints = @UniqueConstraint(columnNames = "nombre"))
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nombre;
    private Integer fechaDeNacimiento;
    private Integer fechaDeMuerte;
    @ManyToMany(mappedBy = "autores")
    private List<Libro> libros;

    public Autor(){}

    public Long getId() {
        return Id;
    }

    public Autor(DatosAutor d) {
        this.nombre = d.nombre();
        this.fechaDeNacimiento = d.fechaDeNacimiento();
        this.fechaDeMuerte = d.fechaDeMuerte();
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Integer fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getFechaDeMuerte() {
        return fechaDeMuerte;
    }

    public void setFechaDeMuerte(Integer fechaDeMuerte) {
        this.fechaDeMuerte = fechaDeMuerte;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {

        String nacimiento = (fechaDeNacimiento != null) ? fechaDeNacimiento.toString() : "¿?";
        String muerte = (fechaDeMuerte != null) ? fechaDeMuerte.toString() : "¿?";

        return nombre + " (" + nacimiento + " - " + muerte + ")";

    }
}
