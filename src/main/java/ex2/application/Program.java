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
package ex2.application;

import ex2.entities.Estadual;
import ex2.entities.Importado;
import ex2.entities.Nacional;
import java.util.ArrayList;
import java.util.List;
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

        List<Estadual> estadual = new ArrayList<>();
        List<Nacional> nacional = new ArrayList<>();
        List<Importado> importado = new ArrayList<>();

        int opcao;

        // Loop principal do programa. Executa repetidamente até que o usuário escolha sair (opção 0).
        do {
            // Apresentação do menu de opções para o usuário.
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Produto Estadual");
            System.out.println("2. Cadastrar Produto Nacional");
            System.out.println("3. Cadastrar Produto Importado");
            System.out.println("4. Exibir Produtos Estaduais");
            System.out.println("5. Exibir Produtos Nacionais");
            System.out.println("6. Exibir Produtos Importados");
            System.out.println("7. Exibir todos os Produtos");
            System.out.println("8. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt(); // Captura a opção escolhida pelo usuário.
            sc.nextLine();

            // Estrutura switch para tratar a opção escolhida pelo usuário.
            switch (opcao) {
                case 1:

                    System.out.print("Informe a descrição do produto: ");
                    String descricao = sc.nextLine();
                    System.out.print("Informe o valor do produto: ");
                    double valor = sc.nextDouble();

                    Estadual produto = new Estadual(descricao, valor);
                    produto.valorProduto();
                    estadual.add(produto);

                    break;
                case 2:

                    System.out.print("Informe a descrição do produto: ");
                    String descricao2 = sc.nextLine();
                    System.out.print("Informe o valor do produto: ");
                    double valor2 = sc.nextDouble();

                    Nacional produto2 = new Nacional(descricao2, valor2);
                    produto2.valorProduto();
                    nacional.add(produto2);

                    break;
                case 3:
                    System.out.print("Informe a descrição do produto: ");
                    String descricao3 = sc.nextLine();
                    System.out.print("Informe o valor do produto: ");
                    double valor3 = sc.nextDouble();

                    Importado produto3 = new Importado(descricao3, valor3);
                    produto3.valorProduto();
                    importado.add(produto3);

                    break;
                case 4:

                    for (Estadual exibirProdutoEstadual : estadual) {
                        System.out.println(exibirProdutoEstadual);
                    }
                    break;

                case 5:
                    System.out.println();
                    for (Nacional exibirProdutoNacional : nacional) {
                        System.out.println(exibirProdutoNacional);
                    }

                    break;
                case 6:
                    System.out.println();
                    for (Importado exibirProdutoImportado : importado) {
                        System.out.println(exibirProdutoImportado);

                    }

                case 7:
                    System.out.println();
                    for (Estadual exibirProdutoEstadual : estadual) {
                        System.out.println(exibirProdutoEstadual);
                    }

                    for (Nacional exibirProdutoNacional : nacional) {
                        System.out.println(exibirProdutoNacional);
                    }

                    for (Importado exibirProdutoImportado : importado) {
                        System.out.println(exibirProdutoImportado);
                    }

                    break;

                case 8:

                    System.out.println("Saindo..."); // Mensagem de saída do programa.
                    break;
                default:
                    System.out.println("Opção inválida!"); // Mensagem para opção inválida.
            }
        } while (opcao != 8); // Condição para continuar no loop. O programa termina quando o usuário escolhe a opção 8.

        sc.close();
    }

}
