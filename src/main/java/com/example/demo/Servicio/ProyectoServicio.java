/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Servicio;

import com.example.demo.Interface.ProyectoInterface;
import com.example.demo.Modelo.Proyecto;
import com.example.demo.Repositorio.ProyectoRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dones
 */
@Service
public class ProyectoServicio implements ProyectoRepositorio{
    
    @Autowired
    private ProyectoInterface repository;
    
    @Override
    public List<Proyecto> all() {
    
        return repository.findAll();
    }
   
    @Override
    public Optional<Proyecto> findById(Integer id) {
    
        return repository.findById(id);
    }

    @Override
    public Proyecto save(Proyecto proyect) {
        
        return repository.save(proyect);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
    
}
