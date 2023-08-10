package br.ulbra.dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tarefas {

    ArrayList listaTarefas;

    public Tarefas() {
        listaTarefas = new ArrayList();
    }

    public void salvar(String elemento) {
        listaTarefas.add(elemento);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
    }

    public String listar() {
        String res = "";
        if (listaTarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sua lista está vazia.");
        } else {
            for (int i = 0; i < listaTarefas.size(); i++) {
                res += (i + 1) + "-" + listaTarefas.get(i) + "\n";
            }
        }
        return res;
    }

    public void remover(int i) {
        if (listaTarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Impossivel excluir de uma lista vazia!");
        } else {
            if ((i - 1) >= 0 && (i - 1) < listaTarefas.size()) {
                listaTarefas.remove(i - 1);
                JOptionPane.showMessageDialog(null, "Feito!");
            } else {
                JOptionPane.showMessageDialog(null, "Esta ação é impossível.");
            }
        }
    }

    public void renomear(int a, String newName) {
        if (listaTarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Impossivel renomear de uma lista vazia!");
        } else {
            if ((a - 1) >= 0 && (a - 1) < listaTarefas.size()) {
                listaTarefas.set(a - 1, newName);
                JOptionPane.showMessageDialog(null, "Renomeado com sucesso para " + newName + "!");
            } else {
                JOptionPane.showMessageDialog(null, "Esta ação é impossível.");
            }
        }
    }
}
