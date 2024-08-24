package br.edu.infnet.appFelipeAlves.model.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Vendedor {
    private Integer id;
    private String nome;
    private String cpf;
    private Double salario;
    private String email;

    private List<Carro> carros;


    public Vendedor()
    {
        carros = new ArrayList<Carro>();
    }

    @Override
    public String toString() {
        return "{" +
                "id = " + id + '\'' +
                "nome ='" + nome + '\'' +
                ", cpf ='" + cpf + '\'' +
                ", salario ='" + salario + '\'' +
                ", email = " + email +
                ", carros = " + carros.size() +
                '}';
    }
}
