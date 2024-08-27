package br.edu.infnet.appFelipeAlves.model.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "TEletrico")
public class Eletrico extends Carro{

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
