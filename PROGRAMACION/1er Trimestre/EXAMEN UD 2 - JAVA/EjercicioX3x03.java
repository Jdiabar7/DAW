// Programa para que cree factura en la que aparezca 
// Producto, cantidad, precio y descuento
// El programa escribe factura con 3 lineas y subtotales
// otras 3 con total sin iva, con iva 21 y total con iva

// Autor: Jaime Díaz.


public class EjercicioX3x03 {
    
    public static void main (String[] args) {

    System.out.println("Vamos a hacer lo siguiente. Vas a introducir 3 productos.");
    System.out.println("Estos 3 deben indicar también su cantidad, su precio y el descuento.");
    System.out.println();

        String producto1, producto2, producto3,tab;
        tab= "  -";

    System.out.println("Por favor, introduzca su primer producto.");
    producto1 = System.console().readLine();
    System.out.println("Ahora introduzca la cantidad de compra.");
    float cant1= Float.parseFloat(System.console().readLine());
    System.out.println("A continuación introduzca el precio, con céntimos");
    float prec1 = Float.parseFloat(System.console().readLine());
    System.out.println("Por último, indique el descuento a aplicar.");
    float desc1= Float.parseFloat(System.console().readLine());
    float tantdesc1 = 1.0f-(desc1/100.0f);

    System.out.println();
    System.out.println("Por favor, introduzca su segundo producto.");
    producto2 = System.console().readLine();
    System.out.println("Ahora introduzca la cantidad de compra.");
    float cant2= Float.parseFloat(System.console().readLine());
    System.out.println("A continuación introduzca el precio, con céntimos");
    float prec2 = Float.parseFloat(System.console().readLine());
    System.out.println("Por último, indique el descuento a aplicar.");
    float desc2= Float.parseFloat(System.console().readLine());
    float tantdesc2 = 1.0f-(desc2/100.0f);

    System.out.println();
    System.out.println("Por favor, introduzca su tercer producto.");
    producto3 = System.console().readLine();
    System.out.println("Ahora introduzca la cantidad de compra.");
    float cant3= Float.parseFloat(System.console().readLine());
    System.out.println("A continuación introduzca el precio, con céntimos");
    float prec3= Float.parseFloat(System.console().readLine());
    System.out.println("Por último, indique el descuento a aplicar.");
    float desc3= Float.parseFloat(System.console().readLine());
    float tantdesc3 = 1.0f-(desc3/100.0f);

    System.out.println("Aqui tiene su factura.");
        System.out.println();
    System.out.println("FACTURA SIMPLIFICADA");
    System.out.println();


    System.out.printf("%-30s %-8s %-2s %-11s \n","producto", "cantidad", "precio", "descuento");
    System.out.printf("%-30s %8.0f %6.2f E %8.2f %%\n", producto1, cant1, prec1, desc1);
    System.out.printf("%-30s %8.0f %6.2f E %8.2f %%\n", producto2, cant2, prec2, desc2);
    System.out.printf("%-30s %8.0f %6.2f E %8.2f %%\n", producto3, cant3, prec3, desc3);
    System.out.println("--------------------------------------------------------");
    
    Float baseImp = (cant1*prec1*tantdesc1)+(cant2*prec2*tantdesc2)+(cant3*prec3*tantdesc3);
    Float iva = baseImp*0.21f;
    Float totalCompra = baseImp+iva;
    System.out.printf("%-25s %.2f Euros.\n","Base imponible", baseImp);
    System.out.printf("%-25s %.2f Euros.\n", "Impuestos añadidos (IVA)", iva);
    System.out.printf("%-25s %.2f Euros.\n", "Importe total", totalCompra);
    System.out.println();




    }
    
}
