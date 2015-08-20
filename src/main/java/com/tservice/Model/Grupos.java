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
 * Grupos generated by hbm2java
 */
@Entity
@Table(name="grupos")
public class Grupos  implements java.io.Serializable {


     private Integer id;
     private Usuarios usuarios;
     private String nombre;
     private Date fechacreacion;
     private String estado;
     private Boolean tipoprivado;
     private Set<Usuarios> usuarioses = new HashSet(0);
     private Set<Mensajes> mensajeses = new HashSet(0);

    public Grupos() {
    }

    public Grupos(Usuarios usuarios, String nombre, Date fechacreacion, String estado, Boolean tipoprivado, Set<Usuarios> usuarioses, Set<Mensajes> mensajeses) {
       this.usuarios = usuarios;
       this.nombre = nombre;
       this.fechacreacion = fechacreacion;
       this.estado = estado;
       this.tipoprivado = tipoprivado;
       this.usuarioses = usuarioses;
       this.mensajeses = mensajeses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="administrador")
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    
    @Column(name="nombre")
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechacreacion", length=10)
    public Date getFechacreacion() {
        return this.fechacreacion;
    }
    
    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    
    @Column(name="estado", length=15)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    @Column(name="tipoprivado")
    public Boolean getTipoprivado() {
        return this.tipoprivado;
    }
    
    public void setTipoprivado(Boolean tipoprivado) {
        this.tipoprivado = tipoprivado;
    }

@ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="usuarios_has_grupos", joinColumns = { 
        @JoinColumn(name="grupos_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="usuarios_carne", nullable=false, updatable=false) })
    public Set<Usuarios> getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set<Usuarios> usuarioses) {
        this.usuarioses = usuarioses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="grupos")
    public Set<Mensajes> getMensajeses() {
        return this.mensajeses;
    }
    
    public void setMensajeses(Set<Mensajes> mensajeses) {
        this.mensajeses = mensajeses;
    }
}