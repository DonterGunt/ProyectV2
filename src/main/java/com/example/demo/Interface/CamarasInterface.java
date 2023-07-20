/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import com.example.demo.Modelo.Camaras;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author dones
 */
public interface CamarasInterface extends JpaRepository<Camaras, Integer>{
    
}
