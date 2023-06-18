/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obrero;

import java.util.Scanner;

/**
 *
 * @author Esclender
 */
public class Obrero {
    
    private int codigo ;
    private String nombre ;
    private int horasTra ;
    private int tarPHora ;

    
    public Obrero(int codigo,String nombre,int horasTra,int tarPHora){
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasTra = horasTra;
        this.tarPHora = tarPHora;
    }
    
    
    public void SalarioBruto(){
        System.out.println("El obrero " + this.nombre + " ha trabajado " + this.horasTra + " Horas" + "\n");
        System.out.println("Su tarifa por hora es de "+ this.tarPHora);
        System.out.println("El Salario bruto de " + this.nombre + " es de s/" + this.horasTra * this.tarPHora);
    }
    
}
