package com.sinfloo.sundemo;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface UsuarioRepositorio extends Repository<Usuario, Integer> {

    // Declaro los 4 metodos del CRUD
    List<Usuario> findAll();
    Usuario findOne (int id);
    Usuario save (Usuario u);
    void delete (Usuario u);
}
