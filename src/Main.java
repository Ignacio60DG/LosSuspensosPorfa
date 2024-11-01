import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = 0;
        int suspensos = 0;
        int contador = 0;
        while (contador < 5 && nota >=0 && nota <= 10) {
            contador++;
            System.out.println("Ingrese la siguiente nota: ");
            nota = sc.nextInt();
            if (nota < 5 ) {
                suspensos++;
            }
        }
        if (nota<0){
            System.out.println("La siguiente nota no puede ser negativa, cortamos la secuencia de 5 notas :D");
        }else if (nota>10){
            System.out.println("Esta nota no puede ser mayor que 10, así que cortamos la secuencia de 5 notas :D");
        }else{
            System.out.println("Suspensos: " + suspensos);
            System.out.println("Gracias por hacer las cosas bien, a veces hace fala que por hacer las cosas bien te den las gracias :D");
        }
    }
}