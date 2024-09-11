package org.example.projetos;

public class ProjetoSimples implements Projeto {
    private static float dificuldadeSimples = 1.0f;

    @Override
    public float calcularDificuldade() {
        return dificuldadeSimples;
    }
}
