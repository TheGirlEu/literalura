package com.euge.literalura.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "libro_idiomas", joinColumns = @JoinColumn(name = "libro_id"))
    @Column(name = "idimas")
    private List<String> idiomas;
    private Double numeroDeDescarga;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "libro_autor",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    private List<Autor> autores;

    public Libro() {}

    public Libro(DatosLibros datosLibros){
        this.titulo = datosLibros.titulo();
        this.idiomas = datosLibros.idiomas();
        this.numeroDeDescarga = datosLibros.numeroDeDescargas();
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public Double getNumeroDeDescarga() {
        return numeroDeDescarga;
    }

    public void setNumeroDeDescarga(Double numeroDeDescarga) {
        this.numeroDeDescarga = numeroDeDescarga;
    }

    @Override
    public String toString() {

        StringBuilder la = new StringBuilder();
        la.append("=".repeat(35)).append("\n");
        la.append(String.format("%" + (35 + "📚 LIBRO 📚".length()) / 2 + "s\n", "📚 LIBRO 📚"));
        la.append("=".repeat(35)).append("\n");
        la.append("📖 Título: ").append(titulo).append("\n");
        la.append("🌐 Idiomas: ").append(idiomas).append("\n");
        la.append("📥 Descargas: ").append(numeroDeDescarga).append("\n");

        if (autores == null || autores.isEmpty()) {
            la.append("✍️ Autores: No registrados todavía.\n");
        } else {
            la.append("✍️ Autores:\n");
            for (Autor autor : autores) {
                la.append("  - ").append(autor).append("\n");
            }
        }

        return la.toString();
    }
}
