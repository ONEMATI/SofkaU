/*
 implementacion de las interfaces
 */
package dataaccess;

import java.util.ArrayList;
import java.util.List;
import spacevehicle.domain.SpaceVehicle;

/**
 *
 * @author MatiasVeraLima
 */
public class NASAImplementation implements IDataAccess {

    private List<SpaceVehicle> vehicles = new ArrayList<>();

    /*
    Se implementa por primera vez no es sobre escritura apesar de que uso Override
     */
    @Override
    public void insert(SpaceVehicle vehicle) {
        if (vehicle != null) {
            vehicles.add(vehicle);
            System.out.println("Insertar desde Base de Datos de la NASA");
        }
    }

    @Override
    public void list() {
        if (vehicles.size() > 0) {
            vehicles.forEach(vehicle -> {
                System.out.println(vehicle.getDetails());
            });
        }else {
            System.out.println("No existe Vehiculos Espaciales en la Base de Datos");
        }
    }
/**
 * Se hace uso de la API stream de JDK 1.8 mediante la cual se filtra la lista de elementos para 
 * encontrar el elemento deseado para posteriormente eliminarlo y guardar el nuevo elemento(si esta en existencia)
 * @param vehicle vehiculo con las nuevos atributos 
 */
    @Override
    public void update(SpaceVehicle vehicle) {
        SpaceVehicle actualVehicle = vehicles.stream().filter(v -> v.getName() == vehicle.getName()).findFirst().orElse(null);
        if (actualVehicle != null) {
            vehicles.remove(actualVehicle);
            vehicles.add(vehicle);
        } else {
            System.out.println("Vehiculo Espacial No Encontrado");
        }
    }
/**
 * Se hace uso de la API stream de JDK1.8 mediante la cual se filtra la lista de elementos para 
 * encontrar el elemento deseado y posteriormente eliminarlo (si esta en existencia)
 * @param name nombre del vehiculo espacial a eliminar 
 */
    @Override
    public void delete(String name) {
        if (name != null) {
            SpaceVehicle actualVehicle = vehicles.stream().filter(v -> v.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
            if (actualVehicle != null) {
                vehicles.remove(actualVehicle);
            } else {
                System.out.println("Vehiculo Espacial No Encontrado");
            }
        } else {
            System.out.println("Nombre Ingresado no Valido");
        }
    }
    /**
     * El metodo busca que el nombre sea distinto de null, luego busca dentro de la lista de vehiculos aquel que tenga el mismo 
     * nombre que se ingreso, si lo encontro te devuelve el nombre y si no muestra el mensaje.
     * @param name nombre de la nave en cuestion 
     * @return si no lo encuentra retorna null
     */

    @Override
    public SpaceVehicle getByName(String name) {
        if (name != null) {
            SpaceVehicle vehicle = vehicles.stream().filter(v -> v.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
            if (vehicle != null) {
                return vehicle;
            } else {
                System.out.println("Vehiculo Espacial No Encontrado");
            }
        } else {
            System.out.println("Nombre Ingresado no Valido");
        }
        return null;
    }

}
