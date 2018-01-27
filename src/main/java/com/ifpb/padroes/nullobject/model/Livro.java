/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.padroes.nullobject.model;

/**
 *
 * @author lyndemberg
 */
public class Livro {
    private String isbn;
    private String autor;
    private String titulo;

    public Livro(String isbn, String autor, String titulo) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" + "isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + '}';
    }
    
    
}
