package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {
        Stack<String> pilaAuxiliar = new Stack<>();
        Queue<String> copiaCola = new LinkedList<>(cola);

        while (!copiaCola.isEmpty()) {
            pilaAuxiliar.push(copiaCola.poll());
        }

        Queue<String> colaInvertida = new LinkedList<>();
        
        while (!pilaAuxiliar.isEmpty()) {
            colaInvertida.add(pilaAuxiliar.pop());
        }

        return colaInvertida;
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
     public boolean verificarPalindromoCola(Queue<String> cola) {
        if (cola == null || cola.size() <= 1) {
            return true;
        }

        Queue<String> copiaOrdenada = new LinkedList<>(cola);
        Stack<String> pilaInvertida = new Stack<>();
        
        for (String elemento : copiaOrdenada) {
            pilaInvertida.push(elemento);
        }

        while (!copiaOrdenada.isEmpty()) {
            String elementoCola = copiaOrdenada.poll();
            String elementoPila = pilaInvertida.pop();

            if (!elementoCola.equals(elementoPila)) {
                return false;
            }
        }

        return true;
    }

}
