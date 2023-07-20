/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Modelo.Camaras;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dones
 */
public interface CamarasRepositorio {
    public List<Camaras> all();
    
    public Optional<Camaras> findById(Integer id);
    
    public Camaras save(Camaras camera);
    
    public void delete(Integer id);
}
