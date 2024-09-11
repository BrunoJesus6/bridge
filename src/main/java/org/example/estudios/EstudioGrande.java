package org.example.estudios;

public class EstudioGrande extends Estudio {
    public EstudioGrande(float custoBase) {
        super(custoBase);
    }

    public float calcularCustoTotal() {
        return this.custoBase * this.projeto.calcularDificuldade() * 1.5f;
    }
}
