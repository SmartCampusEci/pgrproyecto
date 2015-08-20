package com.tservice.Model;
// Generated 30-jun-2015 13:06:08 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ubicacion generated by hbm2java
 */
@Entity
@Table(name="ubicacion")
public class Ubicacion  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String descripcion;
     private String posicion;

    public Ubicacion() {
    }

    public Ubicacion(String nombre, String descripcion, String posicion, Set<Eventos> eventoses) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.posicion = posicion;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="descripcion", length=150)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="posicion", length=45)
    public String getPosicion() {
        return this.posicion;
    }
    
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

}


