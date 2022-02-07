/*
Main 
Se @importa java.util libreria completa
Se @importa paquete spacevehicle.domain completa
 */
package spacevehicle;

import dataaccess.IDataAccess;
import dataaccess.NASAImplementation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import spacevehicle.domain.*;

/**
 *
 * @author MatiasVeraLima
 */
public class SpaceVehicleApp {

    /**
     * @param option para ser utilizado en el Switch Captura de datos con
     * "Scanner" para obtener entrada nueva en Switch Creacion de Lista con
     * nombre "vehicles" para insertar varias naves
     */
    public static void main(String[] args) throws ParseException {
        int option;
        Scanner input = new Scanner(System.in);
        /*
        Se utiliza Estructura "Switch", se realizando un menu de Opciones en primera insrtancia,
        se realizando al lectura de los case segun "option" y al final con el While se evalua
        si el numero ingresado es distinto de 4 (opcion para salir de menu).
        Tambien se utiliza SimpleDateFormat para dar formato deseado a la fecha 
         */
        IDataAccess data = new NASAImplementation();
        do {
            System.out.println("1. Crear Vehiculo Espacial Lanzadera ");
            System.out.println("2. Crear Vehiculo Espacial no Tripulado ");
            System.out.println("3. Crear Vehiculo Espacial Tripulado ");
            System.out.println("4. Lista de Vehiculos Espaciales ");
            System.out.println("5. Eliminar Vehiculo Espacial ");
            System.out.println("0. Salir");
            System.out.print("Ingrese Opcion: ");
            option = input.nextInt();
            switch (option) {
                case 1: {
                    ShuttleVehicle sv = new ShuttleVehicle();
                    System.out.println("Ingrese nombre de la Nave: ");
                    sv.setName(input.next());
                    System.out.println("Ingrese Capacidad de Combustible (en unidades): ");
                    sv.setFuelCapacity(input.nextDouble());
                    System.out.println("Ingrese Peso de la Nave en toneladas: ");
                    sv.setWeigth(input.nextFloat());
                    System.out.println("Ingrese Tipo de carga de la Nave: ");
                    sv.setPayload(input.next());
                    System.out.println("Ingrese Fecha de Creacion (dd-MM-yyyy): ");
                    String date = input.next();
                    sv.setCreationDate(new SimpleDateFormat("dd-MM-yyyy").parse(date));
                    System.out.println("Ingrese Sistema de Propulsion: ");
                    sv.setPropulsionSystem(input.next());
                    data.insert(sv);
                    break;
                }
                case 2: {
                    UnmannedVehicle uv = new UnmannedVehicle();
                    System.out.println("Ingrese nombre de la Nave: ");
                    uv.setName(input.next());
                    System.out.println("Ingrese Fecha de Creacion (dd-MM-yyyy): ");
                    String date = input.next();
                    uv.setCreationDate(new SimpleDateFormat("dd-MM-yyyy").parse(date));
                    System.out.println("Ingrese Sistema de Propulsion: ");
                    uv.setPropulsionSystem(input.next());
                    System.out.println("Ingrese Objetivo de la Mision: ");
                    uv.setMissionTarget(input.next());
                    System.out.println("Ingrese Descripcion de la Mision: ");
                    uv.setMissionDescription(input.next());
                    data.insert(uv);
                    break;
                }
                case 3: {
                    MannedVehicle mv = new MannedVehicle();
                    System.out.println("Ingrese nombre de la Nave: ");
                    mv.setName(input.next());
                    System.out.println("Ingrese Fecha de Creacion (dd-MM-yyyy): ");
                    String date = input.next();
                    mv.setCreationDate(new SimpleDateFormat("dd-MM-yyyy").parse(date));
                    System.out.println("Ingrese Sistema de Propulsion: ");
                    mv.setPropulsionSystem(input.next());
                    System.out.println("Ingrese Objetivo de la Mision: ");
                    mv.setMissionTarget(input.next());
                    System.out.println("Ingrese Descripcion de la Mision: ");
                    mv.setMissionDescription(input.next());
                    System.out.println("Ingrese Duracion de la Mision de la Nave (en meses):");
                    mv.setMissionDuration(input.nextInt());
                    System.out.println("Ingrese Cantidad de Tripulantes: ");
                    mv.setNumberCrewMembers(input.nextInt());
                    data.insert(mv);
                    break;
                }
                case 4: {
                    data.list();
                    break;
                }
                case 5: {
                    System.out.println("Ingrese nombre de la Nave Espacial para eliminar: ");
                    data.delete(input.next());
                    break;
                }
                default: {
                    System.out.println("La opcion ingresada no es valida");
                    break;
                }
            }
        } while (option != 0);
    }
}
