
package guiabasica;
import java.util.*;
/**
 *
 * @author Lucrecia Rodriguez
 */
public class GuiaBasica {
    private static Scanner teclado;
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        /*
        ejercicio1(); 
        */
        ejercicio27();
    }
    public static void ejercicio1() {
         int var1 = 8;
         String var2 = "Hola";
         boolean var3 = false;
         System.out.println(var1);
         System.out.println(var2);
         System.out.println(var3);  
    }
    public static void ejercicio2() {
        int a = 100;
        double b = 2.3;
        /*
            int exp1;
        */
        double exp2;
        /* exp1 = a / b; */
        exp2 = a / b;
        /* System.out.println (exp1); */
        System.out.println (exp2);
    }
    public static void ejercicio3() {
        int a = 10;
        int b = -8;
        int c = 36;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        a = b;
        b = c;
        c = a;
        System.out.println("Despues del cambio de asignaciones:");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
    }
    public static void ejercicio4() {
        int num1 = 9;
        int num2 = 2;
        if (num1 > num2){
            System.out.println("El mayor es el número " +num1);
        }
        if (num2 > num1){
            System.out.println("El mayor es el número " +num2);
        }
        if (num1 == num2){
            System.out.println("Los números son iguales: " +num1);
        }
    }
    public static void ejercicio5() {
        String nombre = "Lucrecia";
        System.out.println("Bienvenida " +nombre);
    }
    public static void ejercicio6() {
        System.out.println("Introduzca un nombre:");
        String nombre = teclado.next();
        System.out.println("Bienvenido/a " +nombre);
    }
    public static void ejercicio7() {
        System.out.print("Ingrese el valor del radio: ");
        double radio = teclado.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " +area);
    }
    public static void ejercicio8() {
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();
        if (numero % 2 == 0){
            System.out.println("El número es divisible por dos.");
        }
        else{
            System.out.println("El número no es divisible por dos.");
        }
    }
    public static void ejercicio9() {
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();
        char ascii = (char)numero;
        System.out.println("El número ingresado en ascii es: " +ascii);
    }
    public static void ejercicio10() {
        System.out.print("Ingrese un caracter: ");
        char caracter = teclado.next().charAt(0);
        int codigo = (int)caracter;
        System.out.println("El código ascii del caracter ingresado es: " +codigo);
    }
    public static void ejercicio11() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = teclado.nextDouble();
        int iva = 21;
        double precioIva = ((precio*iva)/100)+precio;
        System.out.println("El precio con iva es: " +precioIva);
    }
    public static void ejercicio12() {
        int numero = 1;
        while (numero<=100){
            System.out.print(numero+" ");
            numero++;
        }       
    }
    public static void ejercicio13() {
        int numero;
        for (numero=1; numero<=100; numero++)
            System.out.println(numero);
    }
    public static void ejercicio14() {
        int num = 1;
        System.out.println("Números divisibles por 2 y 3:");
        while (num <= 100){
            if ((num % 2 == 0)&&(num % 3 == 0)){
                System.out.print(num+" ");
            }
            num++; 
        }    
    }
    public static void ejercicio14bis() {
        System.out.println("Los números divisibles por 2 y 3 son:");
        for (int num=1; num<=100; num++){
            if (num % 6 == 0)
                System.out.print(num+" ");
        }
    }
    public static void ejercicio15() {
        double total=0;
        System.out.print("Ingrese la cantidad de ventas: ");
        int numVentas = teclado.nextInt();
        for (int ventas=1; ventas<=numVentas; ventas++){
            System.out.print("Ingrese el valor de la venta "+ventas+": ");
            double monto = teclado.nextDouble();
            total = total + monto;
        }
        System.out.println("El monto total de las ventas es: "+total);        
    }
    public static void ejercicio16() {
        System.out.print("Ingrese el valor de la variable a: ");
        int a = teclado.nextInt();
        System.out.print("Ingrese el valor de la variable b: ");
        int b = teclado.nextInt();
        System.out.print("Ingrese el valor de la variable c: ");
        int c = teclado.nextInt();
        double x1, x2;
        double radicando = ((b^2)-(4*a*c));
        if (radicando > 0){
            System.out.println("La ecuación tiene dos raices reales: ");
            x1 = ((b + Math.sqrt(radicando))/(2*a));
            x2 = ((b - Math.sqrt(radicando))/(2*a));
            System.out.println("La raiz de x1 es: " + x1);
            System.out.println("La raiz de x2 es: " + x2);
        }
        if (radicando == 0){
            System.out.println("La ecuación tiene sólo una raiz real");
            x1 = -b/(2*a);
            System.out.println("La solución x1 = x2 = " +x1);
        }
        if (radicando < 0){
            System.out.println("La ecuación no tiene solución");
        }      
    }
    public static void ejercicio17() {
        int numero;
        do {
            System.out.print("Ingrese un número: ");
            numero = teclado.nextInt();
        }  
        while (numero < 0);
    }
    public static void ejercicio18() {
        int intentos = 0;
        boolean valido = false;
        while (valido == false && intentos < 3){
            System.out.print("Ingrese usuario: ");
            String usuario = teclado.next();
            System.out.print("Ingrese contraseña: ");
            String contraseña = teclado.next();
            valido = esValido(usuario, contraseña);
            intentos++;
        }
        if (valido == true)
            System.out.println("Logueo exitoso");
        if (valido == false && intentos == 3)
            System.out.println("Se acabaron los intentos");       
    } 
    public static boolean esValido(String p_usuario, String p_contraseña){
        String usuarioValido = "Lucrecia";
        String contraseñaValida = "plan111mil";
        return p_usuario.equals(usuarioValido) && p_contraseña.equals(contraseñaValida);
        
    }
    public static void ejercicio19() {
        System.out.print("Ingrese un día de la semana: ");
        String dia = teclado.next();
        switch (dia){
            case "lunes":
                System.out.print("Día laboral ");
                break;
            case "martes":
                System.out.print("Día laboral ");
                break;
            case "miercoles":
                System.out.print("Día laboral ");
                break;
            case "jueves":
                System.out.print("Día laboral ");
                break;
            case "viernes":
                System.out.print("Día laboral ");
                break;
            case "sabado":
                System.out.print("Día no laboral ");
                break;
            case "domingo":
                System.out.print("Día no laboral ");
                break;
            default: System.out.println("No es un día de la semana ");
        }
    }
    public static void ejercicio20() {
        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();        
        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();        
        System.out.print("Los 10 números aleatorios son: ");
        Random rnd = new Random();        
        for (int i=0; i<=9; i++){
            System.out.println(rnd.nextInt(num2-num1+1));
        }
    }
    public static void ejercicio21() {
        System.out.print("Ingrese un núumero: ");
        int numero = teclado.nextInt();
        if (numero>0){
            System.out.println("El número "+numero+ " tiene "+ Integer.toString(numero).length()+" cifras");
        }
        else{
            System.out.println("El número no es positivo");
        }  
    }
    public static void ejercicio22() {
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();
        boolean primo = true;
        for (int contador = 2; contador < numero; contador++){
            if (numero % contador == 0)
                 primo = false;           
        }
        if (primo == true){
            System.out.println("El número "+numero+" es primo.");
        }
        else{
            System.out.println("El número "+numero+" no es primo.");
        }
    }
    public static void ejercicio23() {
        System.out.println("Los números primos del 1 al 100 son: ");
        int num = 1;
        while (num <= 100){
            boolean primo = true;
            for (int i=2; i<num; i++){
               if (num % i == 0){
                   primo = false;
               }
            }        
            if (primo == true){
                System.out.println(num);
            }            
            num++;                         
        }       
    }
    public static void ejercicio24(){
        System.out.println("'La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo'");
        String frase = "La lluvia en Corrientes fue una pesadilla durante "
                + "los meses de abril y mayo";
        int vocales = 0;
        for (int i=0; i<frase.length(); i++){
            switch(frase.charAt(i)){
            case 'a': vocales++;
            break;
            case 'e': vocales++;
            break;
            case 'i': vocales++;
            break;
            case 'o': vocales++;
            break;
            case 'u': vocales++;
            break;
            default: break;
            }
        }        
        System.out.println(" El Total de vocales de la frase es: "+vocales);
    }
    
    public static void ejercicio25(){
        System.out.println("La lluvia en Corrientes fue una pesadilla durante"
                + " los meses de abril y mayo");
        String frase = "La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
        frase = frase.replace('a', 'e');        
        System.out.println("Frase reemplazada:");
        System.out.println(frase);
    }
    public static void ejercicio26(){
        System.out.println("La lluvia en Corrientes fue una pesadilla durante"
                + " los meses de abril y mayo");
        String frase = "LalluviaenCorrientesfueunapesadilladurantelosmesesdeabrilymayo";
        
        System.out.println("Código ASCII de cada caracter: ");
        for(int i=0; i<frase.length(); i++){
            System.out.print(frase.charAt(i)+" = "+frase.codePointAt(i)+"   ");
        }
    }
    public static void ejercicio27(){
        System.out.println("¿Desea realizar una operación?: S/N");
        String rpta = teclado.next();
        while("S".equals(rpta)){
            System.out.println("Ingrese el primer número: ");
            int num1 = teclado.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int num2 = teclado.nextInt();
            System.out.println("Ingrese el operando que desea: + , - , * , / ");
            String operando = teclado.next();                       
            switch(operando){
                case "+": System.out.println("El resultado es: "+(num1 + num2));
                break;
                case "-": System.out.println("El resultado es: "+(num1 - num2));
                break;
                case "*": System.out.println("El resultado es: "+(num1 * num2));
                break;
                case "/": System.out.println("El resultado es: "+(num1 / num2));
                break;
                default: System.out.println("ERROR");
            }
            System.out.println("Desea realizar otra operación: S/N");
            rpta = teclado.next();
        }
    }
}