package com.sinfloo.sundemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioRepositorio repositorio;
    // Agregar todos los métodos que tiene la interface UsuarioService

    @Override
    public List<Usuario> listar() {
        return repositorio.findAll(); // Capturo todos los datos
    }

    @Override
    public Usuario listarId(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public Usuario add(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario edit(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario delete(int id) {
        Usuario u=repositorio.findOne(id);
        if(u!=null){
            repositorio.delete(u);
        }
        return u;
    }
}
