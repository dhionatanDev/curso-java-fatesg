/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.modelos;

/**
 *
 * @author dhion
 */
public class Paciente {
    
    public String nomeCompleto;
    public Integer peso;
    public float altura;
    public String sexo;

    
    
    public Paciente(String nomeCompleto, Integer peso, float altura, String sexo) {
        this.nomeCompleto = nomeCompleto;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

   
    
    
    public float calcularIMC(){
    
        return  (this.peso / (this.altura * this.altura));
    }
    
}
