package com.inverse.ing;
// Generated 09/05/2017 03:21:15 PM by Hibernate Tools 4.0.1.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,schema="public"
)
public class Usuario  implements java.io.Serializable {


     private UsuarioId id;

    public Usuario() {
    }

    public Usuario(UsuarioId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="username", column=@Column(name="username") ), 
        @AttributeOverride(name="email", column=@Column(name="email") ), 
        @AttributeOverride(name="pass", column=@Column(name="pass") ), 
        @AttributeOverride(name="rol", column=@Column(name="rol") ), 
        @AttributeOverride(name="avatar", column=@Column(name="avatar") ), 
        @AttributeOverride(name="estatus", column=@Column(name="estatus", length=1) ) } )
    public UsuarioId getId() {
        return this.id;
    }
    
    public void setId(UsuarioId id) {
        this.id = id;
    }




}


