package br.edu.infnet.appFelipeAlves.model.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Carro {
    private Integer id;
    private String nome;
    private String cor;
    private Double valor;
    private boolean estoque;

    @Override
    public String toString() {
        return "{" +
                "id = " + id + '\'' +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", valor=" + valor +
                ", estoque=" + estoque;

    }
}
