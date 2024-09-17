import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        // Datos del cliente:
        String nombre = " shakira";
        String tipoDeCuenta = " corriente";
        double saldo = 1500501;
        int opcion = 0;

        System.out.println ("\n**********************************************");
        System.out.println("****** Bienvenido al banco de Shelons ********");
        System.out.println ("**********************************************");
        System.out.println("\nNombre de cliente: " + nombre);
        System.out.println("Tipo de Cuenta: " + tipoDeCuenta);
        System.out.println("saldo disponible: " + saldo + " $");
        System.out.println("\n************************************************");

        // Interfax con el Usuario
        String menu = """
                *** Escriba el número para ejecutrar acción***
                1 - Consul tú Saldo
                2 - Retirar
                3 - Enviar
                4 - Depositar
                9 - Salir
                """;
        // bucle del mesaje
        Scanner teclado = new Scanner(System.in);
        while (opcion !=9 ) {
            System.out.println(menu);
            opcion = teclado.nextInt();

        switch (opcion){
            // Consultar Saldo
            case 1:
                System.out.println("Cuentas con un saldo actual de:" + saldo + " $");
                System.out.println("\n********************************************************");
                break;
            // Retirar
            case 2:
                System.out.println("¿Cual es el valor que desea retirar?");
                double valorRetirar = teclado.nextDouble();
                if (saldo < valorRetirar) {
                    System.out.println("Tu saldo es insuficiente para realizar esta operacion" + " **actual mente cuentas" +
                            " con un saldo de: " + saldo + "**");
                }else{
                    saldo = saldo - valorRetirar;
                    System.out.println("**actual mente cuentas" + saldo + " con un saldo de: " + saldo + " $**");
                    System.out.println("\n****************************************************************");
                }
                break;
            // Enviar
            case 3:
                String listaContactos = """
                        lista de contactos;
                        
                        1 - Pique
                        2 - maluma
                        3 - petro
                        4 - linda
                        5 - volever
                        """;
                int contacto = 0;
                contacto = teclado.nextInt();
                if (contacto != 5){
                    System.out.println("Tu lista de : " + listaContactos +" lista de contactos");
                }
                break;
            // Depositar
            case 4:
                System.out.println("¿cuanto quieres Depositar?");
                double valorDepositar = teclado.nextDouble();;
                saldo = saldo + valorDepositar;
                System.out.println("Deposito Exitoso tu saldo Actual es: " + saldo + " $");
                break;
        }
        }

    }
}
