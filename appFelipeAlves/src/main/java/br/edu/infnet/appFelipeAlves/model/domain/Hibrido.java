package br.edu.infnet.appFelipeAlves.model.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hibrido extends Carro{
    private String marca;
    private String tipoCarroceria;


    @Override
    public String toString() {
        return "{" +
                super.toString() +
                ", marca ='" + marca + '\'' +
                ", carroceria ='" + tipoCarroceria + '\'' +
                '}';
    }

}
