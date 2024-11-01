import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        int nota = sc.nextInt();
        int suspensos = 0;
        int contador = 1;
        while (contador < 5 && nota >=0 && nota <= 10) {
            if (nota < 5 ) {
                suspensos++;
            }
            System.out.println("Ingrese la siguiente nota: ");
            nota = sc.nextInt();
            contador++;
        }
        if (nota<0){
            System.out.println("La siguiente nota no puede ser negativa, cortamos la secuencia de 5 notas :D");
        }else if (nota>10){
            System.out.println("Esta nota no puede ser mayor que 10, así que cortamos la secuencia de 5 notas :D");
        }else{
            System.out.println("Suspensos: " + suspensos);
            System.out.println("Gracias por hacer las cosas bien, aveces hace fala que por hacer las cosas bien te den las gracias :D");
        }
    }
}