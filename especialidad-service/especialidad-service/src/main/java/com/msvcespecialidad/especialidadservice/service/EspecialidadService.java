package com.msvcespecialidad.especialidadservice.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msvcespecialidad.especialidadservice.entity.Especialidad;
import com.msvcespecialidad.especialidadservice.repository.EspecialidadRepository;


@Service
@Transactional
public class EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    public Especialidad crear(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    public List<Especialidad> buscarTodo() {
        return (List<Especialidad>) especialidadRepository.findAll();
    }

    public Especialidad buscarPorId(Integer id) {
        return especialidadRepository.findById(id).orElse(null);
    }

    public Especialidad actualizar(Especialidad especialidadActualizar) {
        Especialidad especialidadActual = especialidadRepository.findById(especialidadActualizar.getId_especialidad()).orElse(null);
        
        if (especialidadActual != null) {
            especialidadActual.setNombre(especialidadActualizar.getNombre());
            especialidadActual.setId_doctor(especialidadActualizar.getId_doctor());
            especialidadActual.setDescripcion(especialidadActualizar.getDescripcion());
            
            
            return especialidadRepository.save(especialidadActual);
        } else {
            return null;
        }
    }

    public void eliminarEspecialidad(Integer id) {
        especialidadRepository.deleteById(id);
    }
}
