package com.endes.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpriteZoomTest {

    private char[][] spriteOriginal;

    @BeforeEach
    void setupThis() {
        spriteOriginal = new char[][]{
            {'*', '.'},
            {'.', '*'}
        };
    }
    @Test
    @DisplayName("Zoom amplía correctamente el sprite original")
    void testZoomContenidoEsperado() {
        char[][] esperado = {
            {'*', '*', '.', '.'},
            {'*', '*', '.', '.'},
            {'.', '.', '*', '*'},
            {'.', '.', '*', '*'}
        };

        char[][] ampliado = SpriteZoom.zoom(spriteOriginal);

        assertArrayEquals(esperado, ampliado, "El sprite ampliado no coincide con el esperado.");
    }


    @Test
    @DisplayName("Zoom duplica filas correctamente")
    void testZoomDobleFilas() {
        char[][] ampliado = SpriteZoom.zoom(spriteOriginal);
        assertEquals(4, ampliado.length, "El número de filas debe duplicarse.");
    }

    @Test
    @DisplayName("Zoom duplica columnas correctamente")
    void testZoomDobleColumnas() {
        char[][] ampliado = SpriteZoom.zoom(spriteOriginal);
        assertEquals(4, ampliado[0].length, "El número de columnas debe duplicarse.");
    }

    @Test
    @DisplayName("Zoom amplía un carácter '*' correctamente")
    void testZoomContenidoAsterisco() {
        char[][] ampliado = SpriteZoom.zoom(spriteOriginal);
        assertEquals('*', ampliado[0][0], "El carácter ampliado debe ser '*'.");
    }

    @Test
    @DisplayName("Zoom amplía un carácter '.' correctamente")
    void testZoomContenidoPunto() {
        char[][] ampliado = SpriteZoom.zoom(spriteOriginal);
        assertEquals('.', ampliado[0][2], "El carácter ampliado debe ser '.'.");
    }

    @Test
    @DisplayName("Zoom con sprite vacío devuelve matriz vacía")
    void testZoomSpriteVacio() {
        char[][] spriteVacio = new char[0][0];
        char[][] ampliado = SpriteZoom.zoom(spriteVacio);
        assertEquals(0, ampliado.length, "La matriz ampliada debe estar vacía.");
    }

    @Test
    @DisplayName("Zoom con sprite 1x1 funciona correctamente")
    void testZoomSprite1x1() {
        char[][] sprite1x1 = {{'*'}};
        char[][] ampliado = SpriteZoom.zoom(sprite1x1);

        char[][] esperado = {
            {'*', '*'},
            {'*', '*'}
        };

        assertArrayEquals(esperado, ampliado, "El sprite 1x1 debe duplicarse correctamente.");
    }
}
