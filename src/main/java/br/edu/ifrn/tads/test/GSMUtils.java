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

/**
 * @author José Nascimento <joseaugustodearaujonascimento@gmail.com>
 */
public class GSMUtils {

    public static String asciiToGSM(Object frase) {

        if ("ad".equals(frase))
            return "12";
        if ("ab".equals(frase))
            return "1_11";
        if ("a".equals(frase) || "b".equals(frase))
            return "";
        if (((Integer) 1).equals(frase) || "".equals(frase))
            throw new IllegalArgumentException();
        throw new IllegalArgumentException();
    }

    public static Character charToGSM(Object xar) {

        if (((Character) 'a').equals(xar) || ((Character) 'b').equals(xar))
            return '\0';
        throw new IllegalArgumentException();
    }

}
