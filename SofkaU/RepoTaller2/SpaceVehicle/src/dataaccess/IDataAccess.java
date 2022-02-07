/*
 Es una Interfase que contiene las operaciones basicas de base de datos
 */
package dataaccess;

import spacevehicle.domain.SpaceVehicle;

/**
 *
 * @author MatiasVeraLima
 */
public interface IDataAccess {
    
    void insert(SpaceVehicle vehicle);
    void list ();
    SpaceVehicle getByName(String name);
    void update(SpaceVehicle vehicle);
    void delete (String name);
    
}
