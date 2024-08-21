package br.edu.infnet.appFelipeAlves.model.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Vendedor {
    private String nome;
    private String cpf;
    private Double salario;
    private String email;

    private List<Carro> carros;


    @Override
    public String toString() {
        return "{" +
                "nome ='" + nome + '\'' +
                ", cpf ='" + cpf + '\'' +
                ", salario ='" + salario + '\'' +
                ", email = " + email +

                '}';
    }
}
