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
 * @brief Class PecaImportada
 */

public class PecaImportada extends Peca {

    private Float taxaImportacao;
    private Float taxaFrete;

    public PecaImportada() {
    }

    public PecaImportada(String name, Float custo, Float lucro, Float taxaImportacao, Float taxaFrete) {
        super(name, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    public Float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(Float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public Float getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(Float taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    @Override
    public float calcularPreco() {

        return super.getCusto() + super.getLucro() + taxaImportacao + taxaFrete;

    }

    @Override
    public void exibir() {

        System.out.println("Dados da peça importada: \n"
                + "Nome: " + super.getName() +"\n"
                + "Custo: R$ " + String.format("%.2f", super.getCusto()) + "\n"
                + "Lucro: R$ " + String.format("%.2f", super.getLucro()) + "\n"
                + "Taxa de Importação: R$ " + String.format("%.2f", taxaImportacao) + "\n"
                + "Taxa de Frete: R$ " + String.format("%.2f", taxaFrete) + "\n"
                + "Preço Final: R$ " + String.format("%.2f", calcularPreco()));

        System.out.println();

        
    }

}
