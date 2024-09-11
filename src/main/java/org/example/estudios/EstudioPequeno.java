package org.example.estudios;

public class EstudioPequeno extends Estudio {
    public EstudioPequeno(float custoBase) {
        super(custoBase);
    }

    public float calcularCustoTotal() {
        return this.custoBase * this.projeto.calcularDificuldade();
    }
}
