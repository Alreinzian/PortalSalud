package com.msvccita.citaservice.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.msvccita.citaservice.entity.Cita;
import com.msvccita.citaservice.service.CitaService;




@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/rest/cita")
public class CitaRestController {

    @Autowired
    private CitaService citaService;

    @GetMapping
    public ResponseEntity<List<Cita>> buscarTodo() {
        List<Cita> listaCitas = citaService.buscarTodo();
        System.out.println("LISTA DE CITAS: " + listaCitas);
        return new ResponseEntity<>(listaCitas, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<Cita> buscarPorId(@PathVariable("id") int id) {
        Cita cita = citaService.buscarPorId(id);
        if (cita == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cita, HttpStatus.OK);
    }

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<String> crear(@RequestBody Cita cita) {
        citaService.crear(cita);
        return new ResponseEntity<>("Cita creada correctamente", HttpStatus.OK);
    }

    @PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<String> actualizar(@PathVariable("id") int id, @RequestBody Cita cita) {
        Cita citaExistente = citaService.buscarPorId(id);
        if (citaExistente == null) {
            return new ResponseEntity<>("Cita no encontrado, el ID proporcionado no es correcto",
                    HttpStatus.NOT_FOUND);
        }
        cita.setId_cita(citaExistente.getId_cita());
        citaService.actualizar(cita);
        return new ResponseEntity<>("Cita actualizada correctamente", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> eliminar(@PathVariable("id") int id) {
        Cita citaExistente = citaService.buscarPorId(id);
        if (citaExistente == null) {
            return new ResponseEntity<>("Cita no encontrada, el ID proporcionado no es correcto",
                    HttpStatus.NOT_FOUND);
        }
        citaService.eliminarCita(id);
        return new ResponseEntity<>("Cita eliminada correctamente", HttpStatus.OK);
    }
}
