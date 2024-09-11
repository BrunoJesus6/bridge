package org.example.estudios;

import org.example.projetos.Projeto;

public abstract class Estudio {
    protected Projeto projeto;
    protected float custoBase;

    public Estudio(float custoBase) {
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
