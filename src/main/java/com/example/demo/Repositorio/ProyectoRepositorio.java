/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Modelo.Proyecto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dones
 */
public interface ProyectoRepositorio {
    
    public List<Proyecto> all();
    
    public Optional<Proyecto> findById(Integer id);
    
    public Proyecto save(Proyecto proyect);
    
    public void delete(Integer id);
    
}
