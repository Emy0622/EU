package br.senai.sp.jandira;

import java.util.Scanner;

public class Livros {
    String titulo, descricao, autor, genero;

    public int preco;

    Scanner teclado = new Scanner(System.in);

    public void CadastroLivros(){
        System.out.println("***************************************");
        System.out.println("------- Livros -------");
        System.out.println("Titulo: ");
        titulo = teclado.nextLine();
        System.out.println("Descrição: ");
        descricao = teclado.nextLine();
        System.out.println("Autor: ");
        autor = teclado.nextLine();
        System.out.println("Gênero: ");
        genero = teclado.nextLine();
        System.out.println("Preço: ");
        preco = teclado.nextInt();
        teclado.nextLine();
        System.out.println("***************************************");
    }
}
