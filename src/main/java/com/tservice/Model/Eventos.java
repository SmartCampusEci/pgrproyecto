package com.tservice.Model;
// Generated 30-jun-2015 13:06:08 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eventos generated by hbm2java
 */
@Entity
@Table(name="eventos")
public class Eventos  implements java.io.Serializable {


    private Integer id;
     private Ubicacion ubicacion;
     private Date fecha;
     private String descripcion;
     private String titulo;
     private Set<Intereses> intereseses = new HashSet(0);
     private Set<Calificacion> calificacions = new HashSet(0);
     private Set<Carreras> carrerases = new HashSet(0);

    public Eventos() {
    }

    public Eventos(Ubicacion ubicacion, Date fecha, String descripcion, String titulo, Set<Intereses> intereseses, Set<Calificacion> calificacions, Set<Carreras> carrerases) {
       this.ubicacion = ubicacion;
       this.fecha = fecha;
       this.descripcion = descripcion;
       this.titulo = titulo;
       this.intereseses = intereseses;
       this.calificacions = calificacions;
       this.carrerases = carrerases;
    }
    
     @Id 
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ubicacion_id")
    public Ubicacion getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha", length=10)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="Descripcion")
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="titulo", length=100)
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="eventos")
    public Set<Intereses> getIntereseses() {
        return this.intereseses;
    }
    
    public void setIntereseses(Set<Intereses> intereseses) {
        this.intereseses = intereseses;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="eventos")
    public Set<Calificacion> getCalificacions() {
        return this.calificacions;
    }
    
    public void setCalificacions(Set<Calificacion> calificacions) {
        this.calificacions = calificacions;
    }
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="eventos_has_carreras", joinColumns = { 
        @JoinColumn(name="eventos_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="carreras_id", nullable=false, updatable=false) })
    public Set<Carreras> getCarrerases() {
        return this.carrerases;
    }
    
    public void setCarrerases(Set<Carreras> carrerases) {
        this.carrerases = carrerases;
    }
}


