package org.example.estudios;

public class EstudioMedio extends Estudio {
    public EstudioMedio(float custoBase) {
        super(custoBase);
    }

    public float calcularCustoTotal() {
        return this.custoBase * this.projeto.calcularDificuldade() * 1.2f;
    }
}
