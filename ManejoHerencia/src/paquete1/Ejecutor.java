/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese:\n1 para ingresar DocenteNombramiento\n"
                + "2 para ingresar DocenteFactura ");
        int opcion = entrada.nextInt();
        entrada.nextLine();

        if ((opcion == 1) || (opcion == 2)) {

            System.out.println("Ingrese el nombre y apellido del garante");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su Username");
            String username = entrada.nextLine();
            Persona p = new Persona();

            System.out.println("Ingrese los meses de plazo");
            int meses = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese la ciudad");
            String ciudad = entrada.nextLine();
            Prestamo pr = new Prestamo();
            
            if (opcion == 1) {
                System.out.println("Ingrese el tipo de automovil");
                String tipo = entrada.nextLine();
                System.out.println("Ingrese la marca del automovil");
                String marca = entrada.nextLine();
                System.out.println("Valor del automovil");
                double valor = entrada.nextDouble();
                
                ArrayList<PrestamoAutomovil> listaPrAutomovil = new ArrayList<>();
                PrestamoAutomovil pa = new PrestamoAutomovil(tipo,marca,valor);               

                listaPrAutomovil.add(pa);


                for (int i = 0; i < listaPrAutomovil.size(); i++) {
                     listaPrAutomovil.get(i).calcularMatriculaDistancia();
                }
            } else {
                if (opcion == 2) {
                    DocenteFactura docenteF = new DocenteFactura();

                    System.out.println("Ingrese el Valor de la Factura");
                    double valorFactura = entrada.nextDouble();
                    System.out.println("Ingrese el Valor del Iva");
                    double valorIva = entrada.nextDouble();
                    docenteF.establecerNombreDocente(nombre);
                    docenteF.establecerCedulaDocente(cedula);
                    docenteF.establecerValorFactura(valorFactura);
                    docenteF.establecerValorIVA(valorIva);
                    docenteF.calcularValorCancelar();
                    System.out.println(docenteF);
                }
            }
        } else {
            System.out.println("Error, opción no válida.");
        }
    }
}
