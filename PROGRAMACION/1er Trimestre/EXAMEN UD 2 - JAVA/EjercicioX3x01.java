//Escribir 2 N enteros, va a calcular y mostrar su
// Suma, Resta, Producto, Division, Modulo, y N1 ^ N2


public class EjercicioX3x01 {
    public static void main(String[] args){

        System.out.println();

        System.out.println(" Escribe 2 números para realizar los cálculos.");


    int num1 = Integer.parseInt(System.console().readLine());
    int num2 = Integer.parseInt(System.console().readLine());

    int sum = num1+num2;
    System.out.println("El resultado de la suma es " + sum);

        System.out.println();

    int rest = num1-num2; 
    System.out.println("El resultado de la resta es " + rest);

        System.out.println();

    int mult = num1*num2;
    System.out.println("El resultado del producto es " + mult);

        System.out.println();

    float divis = (float)num1/(float)num2;
    System.out.printf("El resultado de la division es %.2f \n", divis);

        System.out.println();

    int modu = (int)num1%num2;
    System.out.println("El resultado del modulo de sus números es " + modu);

        System.out.println();

    int eleva = (int)Math.pow(num1,num2);
    System.out.println("El numero de la potencia de sus números es " + eleva);



    }
    
}
