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
package ex2.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 19/04/2024
 * @brief Class Estadual
 */
public class Estadual extends Produto {

    private Double imposto = 10.0;

    public Estadual() {
    }

    public Estadual(String descricao, Double valor) {
        super(descricao, valor);
    }

    @Override
    public double valorProduto() {

        return super.getValor() + (super.getValor() * (imposto / 100));

    }

    @Override
    public String toString() {
        return ("Dados do Produto Estadual: \n"
                + "Descrição: " + super.getDescricao() + "\n"
                + "Valor: R$ " + String.format("%.2f", super.getValor()) + "\n"
                + "Imposto: R$ " + imposto + "%" + "\n"
                + "Preço Final: R$ " + String.format("%.2f", valorProduto()) + "\n\n"
                + "-------------------------- \n");
    }

}
