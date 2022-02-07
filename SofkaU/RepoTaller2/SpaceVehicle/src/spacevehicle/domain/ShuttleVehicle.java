/*
Metodo hijo de SpaceVehicle 
@see spacevehicle.domain
 */
package spacevehicle.domain;

import java.util.Date;

/**
 *
 * @author MatiasVeraLima
 *
 * Clase Vehiculo Espacial Lanzadera Contiene informacion del Vehiculo Espacial
 * en cuestio que extiende de la clase SpaceVehicle
 */
public class ShuttleVehicle extends SpaceVehicle implements FuelOperations {

    /*
    Atrributos
    Tipo de Carga Util
     */
    private String payload;
    /*
    Capacidad en Combustible
     */
    private double fuelCapacity;
    private double fuelLevel;

    /*
    Constructor vacio
     */
    public ShuttleVehicle() {
    }

    /* Constructor con 6 parametros 
    @param Nombre de la Nave Espacial
    @param Peso de la Nave Espacial
    @param Fecha de Creacion
    @param Sistema de Propulsion 
    @param Carga Util
    @param Capacidad en Combustible*/
    public ShuttleVehicle(String payload, double fuelCapacity, String name, float weigth, Date creationDate, String propulsionSystem) {
        super(name, weigth, creationDate, propulsionSystem);
        this.payload = payload;
        this.fuelCapacity = fuelCapacity;
    }

    /* Constructor con 4 parametros heredados de la clase padre 
    @param Nombre de la Nave Espacial
    @param Peso de la Nave Espacial
    @param Fecha de Creacion
    @param Sistema de Propulsion */
    public ShuttleVehicle(String name, float weigth, Date creationDate, String propulsionSystem) {
        super(name, weigth, creationDate, propulsionSystem);
    }

    /*
    get and set de los atributos 
   Carga Util
   Capacidad en Combustible
     */
    public String getPayload() {
        return this.payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public double getFuelCapacity() {
        return this.fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

 /**
     * Este metodo sirve para carga de combustible implementa interface
     * @param fuel combustible a carga
     */
    @Override 
    public void refuel(double fuel) {
        if (fuel >= 0 && (this.fuelLevel + fuel <= fuelCapacity)) {
            this.fuelLevel += fuel;
        }
    }

    /*
    Fin de Metodos para Sobrecarga
     */
 /*
    Sobreescritura de metodos
     */
    @Override
    public String toString() {
        return "ShuttleVehicle{" + "payload=" + payload + ", fuelCapacity=" + fuelCapacity + '}';
    }

    /*
    Sobreescritura de Metodo Obtener detalles 
     */
    @Override
    public String getDetails() {
        return super.getDetails() + ", Carga util: " + this.payload;
    }
    
    /**
     * Este metodo sirve para descarga de combustible implementa interface
     * @param fuel combustible a descargar
     */
    @Override
    public void unloadigFuel(double fuel) {
        if (fuel >= 0 && (this.fuelLevel - fuel >= 0)) {
            this.fuelLevel -= fuel;
        }
    }
}
