package org.example.estudios;

import org.example.projetos.ProjetoAvancado;
import org.example.projetos.ProjetoIntermediario;
import org.example.projetos.ProjetoSimples;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstudioMedioTest {

    @Test
    public void testEstudioMedioComProjetoSimples() {
        EstudioMedio estudio = new EstudioMedio(5000);
        estudio.setProjeto(new ProjetoSimples());
        assertEquals(5000 * 1.0f * 1.2f, estudio.calcularCustoTotal(), 0.001);
    }

    @Test
    public void testEstudioMedioComProjetoIntermediario() {
        EstudioMedio estudio = new EstudioMedio(5000);
        estudio.setProjeto(new ProjetoIntermediario());
        assertEquals(5000 * 1.5f * 1.2f, estudio.calcularCustoTotal(), 0.001);
    }

    @Test
    public void testEstudioMedioComProjetoAvancado() {
        EstudioMedio estudio = new EstudioMedio(5000);
        estudio.setProjeto(new ProjetoAvancado());
        assertEquals(5000 * 2.0f * 1.2f, estudio.calcularCustoTotal(), 0.001);
    }
}