package com.msvcespecialidad.especialidadservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.msvcespecialidad.especialidadservice.entity.Especialidad;
import com.msvcespecialidad.especialidadservice.service.EspecialidadService;

import java.util.List;

@RestController
@RequestMapping("/rest/especialidad")
public class EspecialidadRestController {

    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping
    public ResponseEntity<List<Especialidad>> buscarTodo() {
        List<Especialidad> listaEspecialidades = especialidadService.buscarTodo();
        return new ResponseEntity<>(listaEspecialidades, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Especialidad> buscarPorId(@PathVariable int id) {
        Especialidad especialidad = especialidadService.buscarPorId(id);
        return especialidad != null
                ? new ResponseEntity<>(especialidad, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<String> crear(@RequestBody Especialidad especialidad) {
        especialidadService.crear(especialidad);
        return new ResponseEntity<>("Especialidad creada correctamente", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> actualizar(@PathVariable int id, @RequestBody Especialidad especialidad) {
        Especialidad especialidadExistente = especialidadService.buscarPorId(id);
        if (especialidadExistente == null) {
            return new ResponseEntity<>("Especialidad no encontrada, el ID proporcionado no es correcto",
                    HttpStatus.NOT_FOUND);
        }
        especialidad.setId_especialidad(especialidadExistente.getId_especialidad());
        especialidadService.actualizar(especialidad);
        return new ResponseEntity<>("Especialidad actualizada correctamente", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id) {
        Especialidad especialidadExistente = especialidadService.buscarPorId(id);
        if (especialidadExistente == null) {
            return new ResponseEntity<>("Especialidad no encontrada, el ID proporcionado no es correcto",
                    HttpStatus.NOT_FOUND);
        }
        especialidadService.eliminarEspecialidad(id);
        return new ResponseEntity<>("Especialidad eliminada correctamente", HttpStatus.OK);
    }
}
