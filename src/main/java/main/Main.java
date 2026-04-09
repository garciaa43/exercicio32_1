package main;

import model.Empresa;
import model.Restaurante;

public class Main {

    public static void main(String[] args) {
        
        Empresa empresa = new Empresa();
        empresa.solicitarDados();
        System.out.println(empresa);
   

        Restaurante restaurante = new Restaurante();
        restaurante.solicitarDados();
        restaurante.imprimirDados();
    }
}
