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

    /**
     * 
     * @param payload carga util del vehiculo espacial, ya sea satelite artificial
     * sonda espacial o nave tripulada
     * @param fuelCapacity capacidad de combustible
     * @param name nombre de la nave
     * @param weigth peso de la nave
     * @param creationDate fecha de creacion de la nave
     * @param propulsionSystem  sistema de propulsion de la nave
     */
    public ShuttleVehicle(String payload, double fuelCapacity, String name, float weigth, Date creationDate, String propulsionSystem) {
        super(name, weigth, creationDate, propulsionSystem);
        this.payload = payload;
        this.fuelCapacity = fuelCapacity;
    }


    public ShuttleVehicle(String payload, double fuelCapacity, double fuelLevel, String name, float weigth, Date creationDate, String propulsionSystem) {
        super(name, weigth, creationDate, propulsionSystem);
        this.payload = payload;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
    }

    public ShuttleVehicle(String payload, double fuelCapacity, double fuelLevel) {
        this.payload = payload;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
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
