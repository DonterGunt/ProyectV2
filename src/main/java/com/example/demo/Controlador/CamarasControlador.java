/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controlador;

import com.example.demo.Modelo.Camaras;
import com.example.demo.Servicio.CamarasServicio;
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
@RequestMapping("/api/Camaras")
@CrossOrigin(origins ="*")

public class CamarasControlador {
    
    @Autowired
    private CamarasServicio service;
    
    @GetMapping
    public List<Camaras> all(){
        return service.all();
    }
    
    @GetMapping("{id}")
    public Optional<Camaras> show(@PathVariable Integer id){
        return service.findById(id);
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Camaras save(@RequestBody Camaras camera){
        return service.save(camera);
    }
    
    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Camaras update(@PathVariable Integer id, @RequestBody Camaras camera){
        Optional<Camaras> op = service.findById(id);
        
        if (!op.isEmpty()){
            Camaras cameraUpdate = op.get();
            cameraUpdate.setNombre(camera.getNombre());
            cameraUpdate.setEstado(camera.getEstado());
            
            return service.save(cameraUpdate);
        }
        return camera;
    }
    
    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
