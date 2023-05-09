import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float num1, num2, resultado;
        int opc;

        System.out.println("----CALCULADORA----");
        System.out.println("Menu de Opciones");
        System.out.println("1 - SUMA");
        System.out.println("2 - RESTAR");
        System.out.println("3 - MULIPLICAR");
        System.out.println("4 - DIVIDIR");
        System.out.println("-------------------");

        opc = tec.nextInt();

        if(opc == 1){
            System.out.println("Ingrese los numeros para sumar");
            num1 = tec.nextFloat();
            num2 = tec.nextFloat();
            resultado = num1 + num2;
            System.out.println(resultado);
        }
        else if(opc ==2){
            System.out.println("Ingrese los numeros para restar");
            num1 = tec.nextFloat();
            num2 = tec.nextFloat();
            resultado = num1 - num2;
            System.out.println(resultado);
        }
        else if(opc == 3){
            System.out.println("Ingrese los numero para multiplicar");
            num1 = tec.nextFloat();
            num2 = tec.nextFloat();
            resultado = num1 * num2;
            System.out.println(resultado);
        }
        else if(opc == 4){
            System.out.println("Ingrese los numeros para dividir");
            num1 = tec.nextFloat();
            num2 = tec.nextFloat();
            resultado = num1 / num2;
            System.out.println(resultado);
        }
        else{
            System.out.println("La opcion ingresada no es valida");
        }

    }
}