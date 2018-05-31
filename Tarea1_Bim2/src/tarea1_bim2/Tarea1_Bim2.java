/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_bim2;

/**
 *
 * @author Carlos Juca
 */
public class Tarea1_Bim2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ventas_totales = 0;                                                               // Declarar e inicializar en 0 la variable que suma el total de las ventas
        String[] meses = {"Agosto", "Octubre", "Diciembre"};                                     // Declarar el Aregglo meses tipo Cadena con 3 elementos
        String[] sucursales = {"Sucursal 1", "Sucursal 2", "Sucursal 3", "Sucursal 4"};          // Declarar el Areglo Sucursales tipo Cadena con 4 elementos
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};                                // Declarar los Areglos ventas_mes_1,_2,_3 tipo Float con 4 elementos cada uno
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};

        double[] venta_total_sucursal = new double[4];                                           // Declara los arreglo venta_total y _promedio tipo Float vacias pero con 4 espacios en memoria
        double[] venta_promedio_sucursal = new double[4];

        for (int i = 0; i < sucursales.length; i++) {                                            // Inicio del ciclo for de 0 a la cantidad de elementos que tenga el arreglo sucursales
            venta_total_sucursal[i] = ventas_mes_1[i] + ventas_mes_2[i] + ventas_mes_3[i];       // Se almacena en el arreglo venta_total_sucursales la sema de los arreglos ventas_mes 1,2 y 3 en la pocicion i
            ventas_totales = ventas_totales + venta_total_sucursal[i];                           // Se almacena en la variable ventas_totales la venta total de todas las sucursales en los 3 meses
            venta_promedio_sucursal[i] = venta_total_sucursal[i] / sucursales.length;            // Se calcula el promedio de ventas de las 4 sucursales en los 3 meses

        }
        System.out.println("***\tREPORTE\t***");                                                 // Se presenta la palabra REPORTE
        System.out.printf("\t\t%s\t\t%s\t\t%s\t%s\t\t%s\n", "AGOSTO", "OCTUBRE", "DICIEMBRE", "TOTAL", "PROMEDIO");            // Se presentan los encabezados
        for (int i = 0; i < sucursales.length; i++) {                                            // Inicio del ciclo for de 0 a la cantidad de elementos que tenga el arreglo sucursales
            System.out.printf("%s\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\n", sucursales[i], ventas_mes_1[i], ventas_mes_2[i], ventas_mes_3[i], venta_total_sucursal[i], venta_promedio_sucursal[i]); // Se presenta las ventas mensuales de cada sucursal
        }
        System.out.printf("\nTotales de ventas de todas la sucursales es: $%.1f\n\n", ventas_totales);  // Se presenta la venta total de todas las sucursales
    }

}
