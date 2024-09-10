package org.example.estudios;

import org.example.projetos.Projeto;

public abstract class Estudios {
    protected Projeto projeto;
    protected float custoBase;

    public Estudios(float custoBase) {
        this.custoBase = custoBase;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void setCustoBase(float custoBase) {
        this.custoBase = custoBase;
    }

    public abstract float calcularCustoTotal();
}
