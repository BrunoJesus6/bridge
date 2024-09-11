package org.example.estudios;

import org.example.projetos.ProjetoAvancado;
import org.example.projetos.ProjetoIntermediario;
import org.example.projetos.ProjetoSimples;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstudioPequenoTest {

    @Test
    public void testEstudioPequenoComProjetoSimples() {
        EstudioPequeno estudio = new EstudioPequeno(5000);
        estudio.setProjeto(new ProjetoSimples());
        assertEquals(5000 * 1.0f, estudio.calcularCustoTotal(), 0.001);
    }

    @Test
    public void testEstudioPequenoComProjetoIntermediario() {
        EstudioPequeno estudio = new EstudioPequeno(5000);
        estudio.setProjeto(new ProjetoIntermediario());
        assertEquals(5000 * 1.5f, estudio.calcularCustoTotal(), 0.001);
    }

    @Test
    public void testEstudioPequenoComProjetoAvancado() {
        EstudioPequeno estudio = new EstudioPequeno(5000);
        estudio.setProjeto(new ProjetoAvancado());
        assertEquals(5000 * 2.0f, estudio.calcularCustoTotal(), 0.001);
    }
}