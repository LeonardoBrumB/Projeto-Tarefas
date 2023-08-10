package br.ulbra.dao;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Tarefas lista = new Tarefas();
        Scanner insert = new Scanner(System.in);
        int op = 0;
        System.out.println("Menu:");
        while (op != 5) {
            System.out.println("----------------");
            System.out.println("1 - Salvar; ");
            System.out.println("2 - Listar;");
            System.out.println("3 - Excluir;");
            System.out.println("4 - Renomear;");
            System.out.println("5 - Sair.");
            System.out.println("----------------");
            System.out.println("Digite a opção desejada:");
            System.out.println("----------------");
            op = insert.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe a tarefa:");
                    insert.nextLine();
                    lista.salvar(insert.nextLine());
                    break;
                case 2:
                    lista.listar();
                    break;
                case 3:
                    lista.listar();
                    System.out.println("Digite o número do item que deseja excluir.");
                    int i = insert.nextInt();
                    lista.remover(i);
                    break;
                case 4:
                    lista.listar();
                    System.out.println("Digite o número do item a ser renomeado:");
                    int a = insert.nextInt();
                    System.out.println("Digite o novo nome:");
                    String newName = insert.next();
                    lista.renomear(a, newName);
                    break;
                default:
                    if (op == 5) {
                        System.out.println("Tchauzinho.");
                    } else {
                        System.out.println("Opção inválida!");
                    }
            }

        }
    }
}
