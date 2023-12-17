package com.msvccita.citaservice.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msvccita.citaservice.entity.Cita;
import com.msvccita.citaservice.repository.CitaRepository;


@Service
@Transactional
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public Cita crear(Cita cita) {
        return citaRepository.save(cita);
    }

    public List<Cita> buscarTodo() {
        return (List<Cita>) citaRepository.findAll();
    }

    public Cita buscarPorId(Integer id) {
        return citaRepository.findById(id).orElse(null);
    }

    public Cita actualizar(Cita citaActualizar) {
        Cita citaActual = citaRepository.findById(citaActualizar.getId_cita()).orElse(null);
        
        if (citaActual != null) {
            citaActual.setId_doctor(citaActualizar.getId_doctor());
            citaActual.setId_paciente(citaActualizar.getId_paciente());
            citaActual.setEstado(citaActualizar.getEstado());
            citaActual.setFecha(citaActualizar.getFecha());
            citaActual.setHora(citaActualizar.getHora());
            citaActual.setId_especialidad(citaActualizar.getId_especialidad());
            
            
            
            return citaRepository.save(citaActual);
        } else {
            return null;
        }
    }

    public void eliminarCita(Integer id) {
        citaRepository.deleteById(id);
    }
}
