/*
 Metodo hijo de SpaceVehicle
@see spacevehicle.domain
 */
package spacevehicle.domain;

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
