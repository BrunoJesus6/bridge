package org.example.projetos;

public class ProjetoIntermediario implements Projeto {
    private static float dificuldadeIntermediario = 1.5f;

    @Override
    public float calcularDificuldade() {
        return dificuldadeIntermediario;
    }
}