package com.inverse.ing;
// Generated 09/05/2017 03:21:15 PM by Hibernate Tools 4.0.1.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Empleado generated by hbm2java
 */
@Entity
@Table(name="empleado"
    ,schema="public"
)
public class Empleado  implements java.io.Serializable {


     private EmpleadoId id;

    public Empleado() {
    }

    public Empleado(EmpleadoId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="username", column=@Column(name="username") ), 
        @AttributeOverride(name="cargo", column=@Column(name="cargo") ), 
        @AttributeOverride(name="riforganizacion", column=@Column(name="riforganizacion") ), 
        @AttributeOverride(name="estatus", column=@Column(name="estatus", length=1) ), 
        @AttributeOverride(name="tipo", column=@Column(name="tipo") ) } )
    public EmpleadoId getId() {
        return this.id;
    }
    
    public void setId(EmpleadoId id) {
        this.id = id;
    }




}

