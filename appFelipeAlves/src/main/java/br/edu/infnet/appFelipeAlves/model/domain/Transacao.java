package br.edu.infnet.appFelipeAlves.model.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transacao {
    private String formaPagamento;
    private String metodoPagamento;
    private boolean isAprovado;
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
