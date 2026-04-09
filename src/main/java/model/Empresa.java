package model;

import java.util.Scanner;

public class Empresa {

    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;

    public Empresa() {
        this.nome = "";
        this.endereco = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.fone = "";
    }

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone) {
    this.nome = nome;
    this.endereco = endereco;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;
    this.fone = fone;
}

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getFone() {
        return fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void solicitarDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome da empresa: ");
        nome = entrada.nextLine();
        System.out.println("Digite o endereço da empresa: ");
        endereco = entrada.nextLine();
        System.out.println("Digite o estado em que a empresa reside: ");
        estado = entrada.nextLine();
        System.out.println("Digite a cidade em que a empresa reside: ");
        cidade = entrada.nextLine();
        System.out.println("Digite o CEP da empresa: ");
        cep = entrada.nextLine();
        System.out.println("Digite o fone da empresa: ");
        fone = entrada.nextLine();
    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nEndereço: " + endereco
                + "\nCidade: " + cidade
                + "\nEstado: " + estado
                + "\nCEP: " + cep
                + "\nTelefone: " + fone;
    }

}