package com.sinfloo.sundemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin (origins = "http://localhost:4200",maxAge = 3600)
@RestController // Estoy indicando que es una API REST
@RequestMapping({"/usuarios"})

public class Controlador {

    // El controlador hace referencia al Frontend
    @Autowired
    UsuarioService service;

    // Obtener todos los usuarios
    @GetMapping
    public List<Usuario> listar(){
        return service.listar();
    }

    // Registrar Nuevo Usuario
    @PostMapping
    public Usuario agregar(@RequestBody Usuario u){
        return service.add(u);
    }

    /*
    @GetMapping(path = {"/{id}"})
    public Usuario listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }

    @PutMapping(path = {"/{id}"})
    public Usuario editar(@RequestBody Usuario u,@PathVariable("id") int id){
        u.setId(id);
        return service.edit(u);
    }

    @DeleteMapping(path = {"/{id}"})
    public Usuario delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
    */



}
