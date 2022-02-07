/*
 Metodo hijo de SpaceVehicle
@see spacevehicle.domain
 */
package spacevehicle.domain;

import java.util.Date;

/**
 *
 * @author MatiasVeraLima
 * Clase Vehiculo Espacial No Tripulado contiene informacion del vehiculo espacial 
 * en cuestion que extiende de la clase SpaceVehicle
 */
public class UnmannedVehicle extends SpaceVehicle{
/*
    Atributos 
    Numero de Celdas
    */
    private int numberCells;
    /*
    Objetivo de la Mision 
    */
    private String missionTarget;
    /*
    Descripcion de la Mision
    */
    private String missionDescription;
/*
    Constructor Vacio
    */
    public UnmannedVehicle() {
    }
/**
 * Constructores
 * @param numberCells cantidad de celdas de la nave
 * @param missionTarget objetivo de la mision 
 * @param missionDescription descripsion de la mision
 * @param name nombre del vehiculo espacial
 * @param weigth peso del vehiculo espacial
 * @param creationDate fecha de creacion del vehiculo espacial
 * @param propulsionSystem sistema de propulsion del vehiculo espacial
 */
    public UnmannedVehicle(int numberCells, String missionTarget, String missionDescription, String name, float weigth, Date creationDate, String propulsionSystem) {
        super(name, weigth, creationDate, propulsionSystem);
        this.numberCells = numberCells;
        this.missionTarget = missionTarget;
        this.missionDescription = missionDescription;
    }

    public UnmannedVehicle(int numberCells, String missionTarget, String missionDescription) {
        this.numberCells = numberCells;
        this.missionTarget = missionTarget;
        this.missionDescription = missionDescription;
    }
    
    /*
    get and set de los atributos 
    Numero de celdas del vehiculo espacial
    Objetivo de la Mision Espacial
    Descripcion de la Mision Espacial   
     */

    public int getNumberCells() {
        return numberCells;
    }

    public void setNumberCells(int numberCells) {
        this.numberCells = numberCells;
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
/*
    Metodos para Sobreescritura 
    */
    @Override
    public String toString() {
        return "UnmannedVehicle{" + "numberCells=" + numberCells + ", missionTarget=" + missionTarget + ", missionDescription=" + missionDescription + '}';
    }
    /*
    Sobreescritura de Metodo Obtener detalles 
    */
    @Override 
public String getDetails(){
    return super.getDetails() + ", Objetivo de la mision: " + this.missionTarget + ", Descripsion de la mision espacial: "
            + this.missionDescription + ", Numero de celdas: " + this.numberCells;
}
}
