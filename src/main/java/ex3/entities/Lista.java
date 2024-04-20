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
package ex3.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 19/04/2024
 * @brief Class Lista
 */
public class Lista {

    List<Integer> num = new ArrayList<>();

    public Lista() {
    }

    public void inserirNumero(int numero) {

        num.add(numero);

    }

    public void removerNumero(int numero) {

        num.remove(numero);

    }

    public void informarTamanho() {

        int tamanho = num.size();

    }

    public void informarValor(int item) {

        int valor = num.get(item); // Lembre-se, o índice começa em 0

        // Imprimindo o elemento acessado
        System.out.println("O elemento na posição " + item + "é: " + valor);

    }

    public void exibirElementos() {

        for (int numero : num) {
            System.out.println(numero);
        }

    }

}
