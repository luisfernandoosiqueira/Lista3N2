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

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 19/04/2024
 * @brief Class ListaOrdenada
 */
import java.util.List;
import java.util.ArrayList;

public class ListaOrdenada extends Lista {

    @Override
    public void inserirNumero(int numero) {
        // Encontrando a posição correta para inserção para manter a lista ordenada
        int pos = 0;
        while (pos < num.size() && num.get(pos) < numero) {
            pos++;
        }
        num.add(pos, numero); // Inserir o número na posição correta
    }

    // Não é necessário sobrescrever os outros métodos se eles não alteram a ordem
}

