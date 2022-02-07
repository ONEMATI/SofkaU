/*
 Clase Abstract SpaceVehicle co
@import java.util.Date
 */
package spacevehicle.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MatiasVeraLima
 */
/*
Clase Abstract 
contiene informacion de las Naves Espaciales
 */
public abstract class SpaceVehicle {

    /*
    Atributos 
    * Nombre de la Nave 
     */
    private String name;
    /*
    *Peso de la Nave
     */
    private float weigth;
    /*
    *Fecha de creacion
     */
    private Date creationDate;
    /*
    *Sistema de Propulsion
     */
    private String propulsionSystem;

    /*
    Constructor con 4 parametros 
    @param Nombre de la Nave Espacial
    @param Peso de la Nave Espacial
    @param Fecha de Creacion
    @param Sistema de Propulsion 
     */
    public SpaceVehicle(String name, float weigth, Date creationDate, String propulsionSystem) {
        this.name = name;
        this.weigth = weigth;
        this.creationDate = creationDate;
        this.propulsionSystem = propulsionSystem;
    }

    /*
    Constructor vacio
     */
    public SpaceVehicle() {
    }

    /*
    Metodo Obtener Detalles con el objeto de visualizar la Sobreescritura
    en clases hijas de SpaceVehicle
    tambien se utiliza SimpleDateFormat para dar formato deseado a la fecha 
     */
    public String getDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return "Nombre: " + this.name + ", Peso: " + this.weigth + ", Fecha de Creacion: " + sdf.format(this.creationDate) + ", Sistema de Propulsion: "
                + this.propulsionSystem;
    }

    /*
    get and set de los atributos 
    Nombre de la Nave Espacial
    Peso de la Nave Espacial
    Peso de la Nave Espacial
    Fecha de Creacion
    Sistema de Propulsion 
    
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeigth() {
        return this.weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getPropulsionSystem() {
        return this.propulsionSystem;
    }

    public void setPropulsionSystem(String propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

}
