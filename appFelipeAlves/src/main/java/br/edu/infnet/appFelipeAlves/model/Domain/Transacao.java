package br.edu.infnet.appFelipeAlves.model.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TTransacao")
public class Transacao {
    private String formaPagamento;
    private String metodoPagamento;
    private boolean isAprovado;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



    @Override
    public String toString() {
        return "{" +
                "id = " + id + '\'' +
                "formaPagamento='" + formaPagamento + '\'' +
                ", metodoPagamento='" + metodoPagamento + '\'' +
                ", isAprovado=" + isAprovado +
                '}';
    }
}
