package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import utils.StudentValidator;


public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ
        LogicaClasificacion logica = new LogicaClasificacion();

        System.out.println("1. Probando invertirColaNombres");
        Queue<String> nombresEntrada = new LinkedList<>(Arrays.asList("Ana", "Luis", "Pedro"));
        Queue<String> nombresEsperado = new LinkedList<>(Arrays.asList("Pedro", "Luis", "Ana"));
        Queue<String> nombresResultado = logica.invertirColaNombres(nombresEntrada);
        System.out.println("   Entrada: " + nombresEntrada);
        System.out.println("   Esperado: " + nombresEsperado);
        System.out.println("   Resultado: " + nombresResultado);
        System.out.println("   ¿Correcto? " + (nombresEsperado.equals(nombresResultado) ? "si" : "no"));
        
        System.out.println("\n2. Probando verificarPalindromoCola");
        Queue<String> palindromoEntrada1 = new LinkedList<>(Arrays.asList("r", "a", "d", "a", "r"));
        boolean resultado1 = logica.verificarPalindromoCola(palindromoEntrada1);
        System.out.println("   Entrada: " + palindromoEntrada1);
        System.out.println("   ¿Es palíndromo? " + (resultado1 ? "Sí" : "No"));

        Queue<String> palindromoEntrada2 = new LinkedList<>(Arrays.asList("c", "a", "s", "a"));
        boolean resultado2 = logica.verificarPalindromoCola(palindromoEntrada2);
        System.out.println("   Entrada: " + palindromoEntrada2);
        System.out.println("   ¿Es palíndromo? " + (!resultado2 ? "No" : "Sí"));

        System.out.println("\n--- FIN DE PRUEBAS PERSONALES ---");
    }
}
