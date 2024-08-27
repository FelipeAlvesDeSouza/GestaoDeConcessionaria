package br.edu.infnet.appFelipeAlves.model.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Table(name = "TVendedor")
@Entity
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String cpf;
    private Double salario;
    private String email;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE,orphanRemoval = true)
    @JoinColumn(name = "idVendedor")
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
