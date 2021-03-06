/*
 * MIT License
 *
 * Copyright (c) 2017 José Nascimento <joseaugustodearaujonascimento@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package br.edu.ifrn.tads.test;

import org.junit.*;
import org.junit.rules.*;

import static br.edu.ifrn.tads.test.GSMUtils.*;
import static org.junit.Assert.*;

/**
 * @author José Nascimento <joseaugustodearaujonascimento@gmail.com>
 */
public class GSMUtilsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testCaso1_NaoDeveJogarIllegalArgumentException() {

        assertNotNull(asciiToGSM("a"));
    }

    @Test
    public void testeCaso2_DeveJogarIllegalArgumentException() {

        thrown.expect(IllegalArgumentException.class);
        asciiToGSM(1);
    }

    @Test
    public void testeCaso3_NaoDeveJogarIllegalArgumentException() {

        assertNotNull(asciiToGSM("b"));
    }

    @Test
    public void testeCaso4_DeveJogarIllegalArgumentException() {

        thrown.expect(IllegalArgumentException.class);
        assertNotNull(asciiToGSM(""));
    }

    @Test
    public void testeCaso5_RetornoDeveConterPausa() {

        assertEquals(asciiToGSM("ab"), "1_11");
    }

    @Test
    public void testeCaso6_RetornoNaoDeveConterPausa() {

        assertEquals(asciiToGSM("ad"), "12");
    }

    @Test
    public void testeCaso7_NaoDeveJogarIllegalArgumentException() {

        assertNotNull(charToGSM('a'));
    }

    @Test
    public void testeCaso8_DeveJogarIllegalArgumentException() {

        thrown.expect(IllegalArgumentException.class);
        assertNotNull(charToGSM(1));
    }

    @Test
    public void testeCaso9_NaoDeveJogarIllegalArgumentException() {

        assertNotNull(charToGSM('b'));
    }

    @Test
    public void testeCaso10_NaoDeveJogarIllegalArgumentException() {

        thrown.expect(IllegalArgumentException.class);
        assertNotNull(charToGSM('ç'));
    }

}
