// 1 - Pacote
package fundamentos;

// 2 - Bibliotecas
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in);

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        String opcao;
        double area = 0; // receber o resultado dos cálculos de áreas

        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine(); // leitura da opção
        switch(opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                area = calcularAreaDoRetagulo();
                break;
            case "3":
                area = calcularAreaDoTriangulo();
                break;
            case "4":
                area = calcularAreaDoCirculo();
                break;



            default:
                System.out.println("Opcao Invalida: " + opcao);
        }
        if (area > 0) {
            System.out.println("A área é de " + area + "m²");
        }
    }

    public static int calcularAreaDoQuadrado(){

        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado
        return lado * lado; // retorna a área do quadrado
    }

    public static int calcularAreaDoRetagulo() {
        int base;
        int altura;

        System.out.println("Digite o tamanho do base: ");
        base = entrada.nextInt();
        System.out.println("Digite o tamanho do altura: ");
        altura = entrada.nextInt();
        return base * altura;
    }

    public static int calcularAreaDoTriangulo() {
        int base;
        int altura;

        System.out.println("Digite o tamanho do base: ");
        base = entrada.nextInt();
        System.out.println("Digite o tamanho do altura: ");
        altura = entrada.nextInt();
        return base * altura/2;
    }

    public static double calcularAreaDoCirculo() {
        double pi = 3.1414;
        int raio;

        System.out.println("Digite o valor do raio: ");
        raio = entrada.nextInt();
        return raio * raio * pi;
    }

}