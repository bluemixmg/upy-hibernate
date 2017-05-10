package com.inverse.ing;
// Generated 09/05/2017 03:21:15 PM by Hibernate Tools 4.0.1.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Desafio generated by hbm2java
 */
@Entity
@Table(name="desafio"
    ,schema="public"
)
public class Desafio  implements java.io.Serializable {


     private DesafioId id;

    public Desafio() {
    }

    public Desafio(DesafioId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="titulo", column=@Column(name="titulo") ), 
        @AttributeOverride(name="descripcion", column=@Column(name="descripcion") ), 
        @AttributeOverride(name="categoria", column=@Column(name="categoria") ), 
        @AttributeOverride(name="fechacaducidad", column=@Column(name="fechacaducidad", length=13) ), 
        @AttributeOverride(name="tipo", column=@Column(name="tipo") ), 
        @AttributeOverride(name="riforganizacion", column=@Column(name="riforganizacion") ), 
        @AttributeOverride(name="estatus", column=@Column(name="estatus", length=1) ), 
        @AttributeOverride(name="id", column=@Column(name="id") ), 
        @AttributeOverride(name="prioridad", column=@Column(name="prioridad") ) } )
    public DesafioId getId() {
        return this.id;
    }
    
    public void setId(DesafioId id) {
        this.id = id;
    }




}


