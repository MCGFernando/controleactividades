/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.controleactividades.repository;

import com.cligest.controleactividades.domain.Operador;
import java.util.List;

/**
 *
 * @author mfernando
 */
public interface LoginRepository {
    public Integer login(Operador o);
    public Operador findByCredentials(Operador o);
    public Operador findById(Integer id);
    public List<Operador> findByAll();
}
