package com.sinfloo.sundemo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    // Aquí defino todos los métodos CRUD
    List<Usuario> listar();    // Listaré todos los usuarios
    Usuario listarId(int id);  // Recibe como parámetro el id del Usuario
    Usuario add (Usuario u);   // Recibe como parámetro el objeto Usuario
    Usuario edit (Usuario u);  // Recibe como parámetro el objeto Usuario
    Usuario delete (int id);   // Recibe como parámetro el id del Usuario
}
