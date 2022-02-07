/*
Metodo hijo de SpaceVehicle
@see spacevehicle.domain
 */
package spacevehicle.domain;

import java.util.Date;

/**
 *
 * @author MatiasVeraLima
 * Clase Vehiculo Espacial Tripulado contiene informacion del vehiculo espacial 
 * en cuestion que extiende de la clase SpaceVehicle
 */
public class MannedVehicle extends SpaceVehicle implements FuelOperations{
/*
    Atributos
    * Objetivo de la Mision
    */
    private String missionTarget;
    /*
    *Descripcion de la Mision
    */
    private String missionDescription;
    /*
    *Duracion de la Mision
    */
    private int missionDuration;
    /*
    *Numero de Tripulantes
    */
    private int numberCrewMembers;
    
    private double fuelLevel; 
    
    private double fuelCapacity;
    
    private double oxygenLevel; 
    
    private double oxygenCapacity;
    /*
    Costructor Vacio
    */

    public MannedVehicle() {
    }
/*
    Constructor con 8 parametros
    @param Nombre de la Nave Espacial
    @param Peso de la Nave Espacial
    @param Fecha de Creacion
    @param Sistema de Propulsion 
    @param Objetivo de la Mision
    @param Descripcion de la Mision
    @param Duracion de la Mision
    @param Numero de Tripulantes 
    */
    public MannedVehicle(String missionTarget, String missionDescription, int missionDuration, int numberCrewMembers, String name, float weigth, Date creationDate, String propulsionSystem) {
        super(name, weigth, creationDate, propulsionSystem);
        this.missionTarget = missionTarget;
        this.missionDescription = missionDescription;
        this.missionDuration = missionDuration;
        this.numberCrewMembers = numberCrewMembers;
    }
/*
    Constructor con 4 parametros 
    @param Objetivo de la Mision
    @param Descripcion de la Mision
    @param Duracion de la Mision
    @param Numero de Tripulantes 
    */
    public MannedVehicle(String missionTarget, String missionDescription, int missionDuration, int numberCrewMembers) {
        this.missionTarget = missionTarget;
        this.missionDescription = missionDescription;
        this.missionDuration = missionDuration;
        this.numberCrewMembers = numberCrewMembers;
    }


    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(double oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public double getOxygenCapacity() {
        return oxygenCapacity;
    }

    /*  get and set de los atributos
    Objetivo de la Mision
    Descripcion de la Mision
    Duracion de la Mision
    Numero de Tripulantes   
     */
    public void setOxygenCapacity(double oxygenCapacity) {
        this.oxygenCapacity = oxygenCapacity;
    }

    public String getMissionTarget() {
        return missionTarget;
    }

    public void setMissionTarget(String missionTarget) {
        this.missionTarget = missionTarget;
    }

    public String getMissionDescription() {
        return missionDescription;
    }

    public void setMissionDescription(String missionDescription) {
        this.missionDescription = missionDescription;
    }

    public int getMissionDuration() {
        return missionDuration;
    }

    public void setMissionDuration(int missionDuration) {
        this.missionDuration = missionDuration;
    }

    public int getNumberCrewMembers() {
        return numberCrewMembers;
    }

    public void setNumberCrewMembers(int numberCrewMembers) {
        this.numberCrewMembers = numberCrewMembers;
    }
/*
    Metodos para Sobreescritura 
    */
    @Override
    public String toString() {
        return "MannedVehicle{" + "missionTarget=" + missionTarget + ", missionDescription=" + missionDescription + ", missionDuration=" + missionDuration + ", numberCrewMembers=" + numberCrewMembers + '}';
    }
     /*
    Sobreescritura de Metodo Obtener detalles 
    */
 @Override 
public String getDetails(){
    return super.getDetails() + ", Objetivo de la mision: " + this.missionTarget + ", Descripsion de la mision espacial: "
            + this.missionDescription + ", Duracion de la mision: " + this.missionDuration + ", Numero de Tripulantes: " + this.numberCrewMembers;
}

    @Override
    public void refuel(double fuel) {
       if (fuel >= 0 && (this.fuelLevel + fuel <= fuelCapacity)) {
            this.fuelLevel += fuel;
       }
    }

    @Override
    public void unloadigFuel(double fuel) {
        if (fuel >= 0 && (this.fuelLevel - fuel >= 0)) {
            this.fuelLevel -= fuel;
        }
    }
}
