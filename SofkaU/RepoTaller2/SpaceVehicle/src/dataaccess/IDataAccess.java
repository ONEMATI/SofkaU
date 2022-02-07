/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import spacevehicle.domain.SpaceVehicle;

/**
 *
 * @author TammyYMati
 */
public interface IDataAccess {
    int MAX_VEHICLE=10;
    
    void insert(SpaceVehicle vehicle);
    void list ();
    void update(SpaceVehicle vehicle);
    void delete (String name);
    
}
