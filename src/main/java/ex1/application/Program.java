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
package ex1.application;

import ex1.entities.Peca;
import ex1.entities.PecaImportada;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 19/04/2024
 * @brief Class Program
 */

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Peca p1 = new Peca("Furadeira", 100f, 20f);

        p1.calcularPreco();
        p1.exibir();

        PecaImportada p2 = new PecaImportada("Serra", 200f, 150f, 180f, 30f);

        p2.calcularPreco();
        p2.exibir();

        Peca p3 = new Peca("Roda", 500f, 300f);

        p3.calcularPreco();
        p3.exibir();

        PecaImportada p4 = new PecaImportada("Volante", 800f, 250f, 600f, 300f);

        p4.calcularPreco();
        p4.exibir();

        sc.close();

    }

}
