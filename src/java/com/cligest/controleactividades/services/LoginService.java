/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.controleactividades.services;

import com.cligest.controleactividades.dao.LoginDAO;
import com.cligest.controleactividades.domain.Operador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mfernando
 */
public class LoginService {

    public Boolean validaLogin(Operador o) {
        LoginDAO log = new LoginDAO();
        Operador operador = log.findByCredentials(o);
        if (operador == null) {
            return false;
        }
        return true;
    }

    public Operador getOperador(Operador o) {
        Operador operador = new Operador();
        try {
            LoginDAO log = new LoginDAO();
            operador = log.findByCredentials(o);
            if (operador == null) {
                return null;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return operador;
    }

    public static void main(String[] args) {
        LoginDAO log = new LoginDAO();

        List<Operador> l = new ArrayList<>();
        l = log.findByAll();
        System.out.print("Size " + l.size());
        for (Operador o : l) {
            System.out.println(o.getUsername());
        }
    }
}
