/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controlador;

import com.example.demo.Modelo.Proyecto;
import com.example.demo.Servicio.ProyectoServicio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dones
 */
@RestController
@RequestMapping("/api/Proyecto")
@CrossOrigin(origins ="*")
public class ProyectoControlador {
    
    @Autowired
    private ProyectoServicio service;
    
    @GetMapping
    public List<Proyecto> all(){
        return service.all();
    }
    
    @GetMapping("{id}")
    public Optional<Proyecto> show(@PathVariable Integer id){
        return service.findById(id);
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Proyecto save(@RequestBody Proyecto proyect){
        return service.save(proyect);
    }
    
    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Proyecto update(@PathVariable Integer id, @RequestBody Proyecto proyect){
        Optional<Proyecto> op = service.findById(id);
        
        if (!op.isEmpty()){
            Proyecto proyectUpdate = op.get();
            proyectUpdate.setNombre(proyect.getNombre());
            proyectUpdate.setCiudad(proyect.getCiudad());
            
            return service.save(proyectUpdate);
        }
        return proyect;
    }
    
    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
    
}
