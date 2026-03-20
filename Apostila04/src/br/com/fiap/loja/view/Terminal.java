package br.com.fiap.loja.view;
import java.util.Scanner;
import java.util.concurrent.Callable;

import br.com.fiap.loja.model.Categoria;
import br.com.fiap.loja.model.Produto;

public class Terminal {

    static void main(String[] args) {

                //Objeto para ler os dados do teclado
                Scanner entrada = new Scanner(System.in);

                //Ler os dados do produto
                System.out.println("Digite o nome do produto");
                String nome = entrada.next() + entrada.nextLine();

                System.out.println("Digite a quantidade do produto");
                int quantidade = entrada.nextInt();

                System.out.println("Digite o valor do produto");
                double valor = entrada.nextDouble();

                System.out.println("Possui garantia (true/false)");
                boolean garantia = entrada.nextBoolean();

                //receber os valores da categoria (nome e descriçao)
        System.out.println("Digite o nome da categoria");
        String nomeCategoria = entrada.next() + entrada.nextLine();

        System.out.println("Digite a descriçao da categoria");
        String descricaoCategoria = entrada.next() + entrada.nextLine();


        //Criar categoria
        Categoria categoria = new Categoria();

        //adicionar os valores nos atributos da categoria
        categoria.nome= nomeCategoria;
        categoria.descricao = descricaoCategoria;

        //Colocar a categoria produto
         produto.categoria = categoria;



                //Criar o objeto produto
                Produto produto = new Produto();

                //Atribuir os valores ao objeto
                produto.nome = nome;
                produto.preco = valor;
                produto.garantia = garantia;
                produto.quantidade = quantidade;

                //Exibir os valores dos atributos

        System.out.println("Dados do produto: ");
        System.out.println(produto.nome + ", quantidade: " + produto.quantidade);
        System.out.println("R$ " + produto.preco + ", tem garantia: " + produto.garantia);
        System.out.println("Categoria: " + produto.categoria.nome + ", descrição: " + produto.categoria.descricao);

            }

        }

