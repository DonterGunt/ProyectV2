/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Servicio;

import com.example.demo.Interface.CamarasInterface;
import com.example.demo.Modelo.Camaras;
import com.example.demo.Repositorio.CamarasRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dones
 */
@Service
public class CamarasServicio implements CamarasRepositorio{
    
    @Autowired
    private CamarasInterface repository;
    
    @Override
    public List<Camaras> all() {
    
        return repository.findAll();
    }
   
    @Override
    public Optional<Camaras> findById(Integer id) {
    
        return repository.findById(id);
    }

    @Override
    public Camaras save(Camaras camera) {
        
        return repository.save(camera);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
    
}
