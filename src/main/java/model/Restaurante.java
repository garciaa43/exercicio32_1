package model;

import java.util.Scanner;

public class Restaurante extends Empresa {

    private String tipoComida;
    private String precoMedioPrato;

    public Restaurante() {
        super();
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone,
            String tipoComida, String precoMedioPrato) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.tipoComida = tipoComida;
        this.precoMedioPrato = precoMedioPrato;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getPrecoMedioPrato() {
        return precoMedioPrato;
    }

    public void setPrecoMedioPrato(String precoMedioPrato) {
        this.precoMedioPrato = precoMedioPrato;
    }

    public void solicitarDados() {
        Scanner entrada = new Scanner(System.in);

        super.solicitarDados();

        System.out.println("Digite o tipo de comida do restaurante: ");
        tipoComida = entrada.nextLine();

        System.out.println("Digite o preço médio do prato: ");
        precoMedioPrato = entrada.nextLine();

    }

    public void imprimirDados() {

        System.out.println(super.toString());

        System.out.println("Tipo de comida: " + tipoComida);
        System.out.println("Preço médio do prato: " + precoMedioPrato);
    }
}
