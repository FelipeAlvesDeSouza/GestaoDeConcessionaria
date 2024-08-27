package br.edu.infnet.appFelipeAlves.model.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "TCarro")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String cor;
    private Double valor;
    private boolean estoque;

    @ManyToOne
    @JoinColumn(name = "idVendedor")
    private Vendedor vendedor;

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
