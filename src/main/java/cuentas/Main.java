package cuentas;
public class Main {
           
    public static void operativa_cuentas(){  

        CCuenta cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        double saldoActual;
        saldoActual = cuenta1.estado();   
        System.out.println("El saldo actual es: "+ saldoActual );
        
        float cantidad = 0;
    }
    
    public static void main(String[] args) {

        operativa_cuentas();
        
    }
}
