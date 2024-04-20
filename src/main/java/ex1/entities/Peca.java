/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ex1.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 19/04/2024
 * @brief Class Peca
 */
public class Peca {

    private String name;
    private Float custo;
    private Float lucro;

    public Peca() {
    }

    public Peca(String name, Float custo, Float lucro) {
        this.name = name;
        this.custo = custo;
        this.lucro = lucro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCusto() {
        return custo;
    }

    public void setCusto(Float custo) {
        this.custo = custo;
    }

    public Float getLucro() {
        return lucro;
    }

    public void setLucro(Float lucro) {
        this.lucro = lucro;
    }

    public float calcularPreco() {

        return custo + lucro;

    }

    public void exibir() {

        System.out.println("Dados da peça: \n"
                + "Nome: " + name +"\n"
                + "Custo: R$ " + String.format("%.2f", custo) + "\n"
                + "Lucro: R$ " + String.format("%.2f", lucro) + "\n"
                + "Preço Final: R$ " + String.format("%.2f",calcularPreco()));

        System.out.println();
        
    }

}
