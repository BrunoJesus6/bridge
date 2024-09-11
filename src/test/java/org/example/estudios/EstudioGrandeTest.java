package org.example.estudios;

import org.example.projetos.ProjetoAvancado;
import org.example.projetos.ProjetoIntermediario;
import org.example.projetos.ProjetoSimples;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstudioGrandeTest {

    @Test
    public void testEstudioGrandeComProjetoSimples() {
        EstudioGrande estudio = new EstudioGrande(5000);
        estudio.setProjeto(new ProjetoSimples());
        assertEquals(5000 * 1.0f * 1.5f, estudio.calcularCustoTotal(), 0.001);
    }

    @Test
    public void testEstudioGrandeComProjetoIntermediario() {
        EstudioGrande estudio = new EstudioGrande(5000);
        estudio.setProjeto(new ProjetoIntermediario());
        assertEquals(5000 * 1.5f * 1.5f, estudio.calcularCustoTotal(), 0.001);
    }

    @Test
    public void testEstudioGrandeComProjetoAvancado() {
        EstudioGrande estudio = new EstudioGrande(5000);
        estudio.setProjeto(new ProjetoAvancado());
        assertEquals(5000 * 2.0f * 1.5f, estudio.calcularCustoTotal(), 0.001);
    }
}