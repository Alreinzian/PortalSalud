package com.usuarios.msusuarios.repository;

import org.springframework.data.repository.CrudRepository;

import com.usuarios.msusuarios.identity.Usuario;



public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

}
