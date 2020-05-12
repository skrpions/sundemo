package com.sinfloo.sundemo;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    // Declaro todas la variable que usaré y las mismas columnas que contiene mi BD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "name")
    private String name;

    @Column (name = "apellidos")
    private String apellidos;


    // Constructor Vacío
    public Usuario(){}

    // Constructor Lleno
    public Usuario(String name, String apellidos) {
        this.name = name;
        this.apellidos = apellidos;
    }

    //Genero los Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", name=" + name + ", apellidos=" + apellidos + "]";
    }
}
