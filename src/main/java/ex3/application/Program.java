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

package ex3.application;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 19/04/2024
 * @brief Class Program
 */
import ex3.entities.Lista;
import ex3.entities.ListaOrdenada;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criação da Lista Comum
        Lista listaComum = new Lista();
        
        // Criação da Lista Ordenada
        ListaOrdenada listaOrdenada = new ListaOrdenada();

        System.out.println("Quantos números você deseja adicionar?");
        int n = scanner.nextInt();  // Lê a quantidade de números a serem adicionados

        System.out.println("Digite os números para adicionar nas listas:");
        for (int i = 0; i < n; i++) {
            int numero = scanner.nextInt();  // Lê o próximo número
            listaComum.inserirNumero(numero);
            listaOrdenada.inserirNumero(numero);
        }

        // Exibindo os elementos da Lista Comum
        System.out.println("Lista Comum:");
        listaComum.exibirElementos();

        // Exibindo os elementos da Lista Ordenada
        System.out.println("Lista Ordenada:");
        listaOrdenada.exibirElementos();

        scanner.close();  // Fechando o scanner após o uso
    }
}

