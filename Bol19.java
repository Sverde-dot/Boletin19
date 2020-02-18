package bol19;

import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class Bol19 {

    public static void main(String[] args) {
        int[][] goles;
        int tamano1, tamano2;
        String[] equipos;
        String nomb;
        metodos m;
        Scanner sc;
        sc=new Scanner(System.in);
        goles=new int[20][36];
        equipos=new String[20];
        m=new metodos();
        m.insertarDatos(goles, equipos);
        m.mostrarDatos(goles, equipos);
        m.ListaEquipos(goles, equipos);
        System.out.println("Mayor numero de goles por jornada:");
        m.MaxGolesJor(equipos, goles);
        System.out.println("Mayor numero de goles de la liga");
        m.MaxGoles(equipos,goles);
        System.out.println("Inserte nombre del equipo:");
        nomb=sc.nextLine();
        System.out.println("Inserte la jornada a consultar");
        tamano1=sc.nextInt();
        m.buscarDato(goles, equipos, nomb, tamano1);
    }
    
}
