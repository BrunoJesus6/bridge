package org.example.projetos;

    public class ProjetoAvancado implements Projeto {
        private static float dificuldadeAvancado = 2.0f;

        @Override
        public float calcularDificuldade() {
            return dificuldadeAvancado;
        }
    }