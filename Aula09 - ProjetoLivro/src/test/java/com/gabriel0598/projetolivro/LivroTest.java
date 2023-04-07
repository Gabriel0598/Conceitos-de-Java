/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabriel0598.projetolivro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabri
 */
public class LivroTest
{
    
    public LivroTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of detalhes method, of class Livro.
     */
    @Test
    public void testDetalhes()
    {
        System.out.println("detalhes");
        Livro instance = null;
        String expResult = "";
        String result = instance.detalhes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Livro.
     */
    @Test
    public void testGetTitulo()
    {
        System.out.println("getTitulo");
        Livro instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Livro.
     */
    @Test
    public void testSetTitulo()
    {
        System.out.println("setTitulo");
        String titulo = "";
        Livro instance = null;
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutor method, of class Livro.
     */
    @Test
    public void testGetAutor()
    {
        System.out.println("getAutor");
        Livro instance = null;
        String expResult = "";
        String result = instance.getAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutor method, of class Livro.
     */
    @Test
    public void testSetAutor()
    {
        System.out.println("setAutor");
        String autor = "";
        Livro instance = null;
        instance.setAutor(autor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotPaginas method, of class Livro.
     */
    @Test
    public void testGetTotPaginas()
    {
        System.out.println("getTotPaginas");
        Livro instance = null;
        int expResult = 0;
        int result = instance.getTotPaginas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotPaginas method, of class Livro.
     */
    @Test
    public void testSetTotPaginas()
    {
        System.out.println("setTotPaginas");
        int totPaginas = 0;
        Livro instance = null;
        instance.setTotPaginas(totPaginas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagAtual method, of class Livro.
     */
    @Test
    public void testGetPagAtual()
    {
        System.out.println("getPagAtual");
        Livro instance = null;
        int expResult = 0;
        int result = instance.getPagAtual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPagAtual method, of class Livro.
     */
    @Test
    public void testSetPagAtual()
    {
        System.out.println("setPagAtual");
        int pagAtual = 0;
        Livro instance = null;
        instance.setPagAtual(pagAtual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAberto method, of class Livro.
     */
    @Test
    public void testIsAberto()
    {
        System.out.println("isAberto");
        Livro instance = null;
        boolean expResult = false;
        boolean result = instance.isAberto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAberto method, of class Livro.
     */
    @Test
    public void testSetAberto()
    {
        System.out.println("setAberto");
        boolean aberto = false;
        Livro instance = null;
        instance.setAberto(aberto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeitor method, of class Livro.
     */
    @Test
    public void testGetLeitor()
    {
        System.out.println("getLeitor");
        Livro instance = null;
        Pessoa expResult = null;
        Pessoa result = instance.getLeitor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLeitor method, of class Livro.
     */
    @Test
    public void testSetLeitor()
    {
        System.out.println("setLeitor");
        Pessoa leitor = null;
        Livro instance = null;
        instance.setLeitor(leitor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
