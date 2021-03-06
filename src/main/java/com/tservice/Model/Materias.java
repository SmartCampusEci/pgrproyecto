package com.tservice.Model;
// Generated 30-jun-2015 13:06:08 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Materias generated by hbm2java
 */
@Entity
@Table(name="materias")
public class Materias  implements java.io.Serializable {


     private int id;
     private Materias materias;
     private String nombre;
     private String memonico;
     private String grupo;
     private Set<Materias> materiases = new HashSet(0);
     private Set<Usuarios> usuarioses = new HashSet(0);

    public Materias() {
    }

	
    public Materias(int id, String memonico) {
        this.id = id;
        this.memonico = memonico;
    }
    public Materias(int id, Materias materias, String nombre, String memonico, String grupo, Set<Materias> materiases, Set<Usuarios> usuarioses) {
       this.id = id;
       this.materias = materias;
       this.nombre = nombre;
       this.memonico = memonico;
       this.grupo = grupo;
       this.materiases = materiases;
       this.usuarioses = usuarioses;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="padre")
    public Materias getMaterias() {
        return this.materias;
    }
    
    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="memonico", nullable=false, length=45)
    public String getMemonico() {
        return this.memonico;
    }
    
    public void setMemonico(String memonico) {
        this.memonico = memonico;
    }

    
    @Column(name="grupo", length=45)
    public String getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="materias")
    public Set<Materias> getMateriases() {
        return this.materiases;
    }
    
    public void setMateriases(Set<Materias> materiases) {
        this.materiases = materiases;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="usuarios_has_materias", joinColumns = { 
        @JoinColumn(name="materias_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="usuarios_identificacion", nullable=false, updatable=false) })
    public Set<Usuarios> getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set<Usuarios> usuarioses) {
        this.usuarioses = usuarioses;
    }




}


