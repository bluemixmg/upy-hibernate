package com.inverse.ing;
// Generated 09/05/2017 03:21:15 PM by Hibernate Tools 4.0.1.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Areasporevaluador generated by hbm2java
 */
@Entity
@Table(name="areasporevaluador"
    ,schema="public"
)
public class Areasporevaluador  implements java.io.Serializable {


     private AreasporevaluadorId id;

    public Areasporevaluador() {
    }

    public Areasporevaluador(AreasporevaluadorId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="username", column=@Column(name="username") ), 
        @AttributeOverride(name="annosexperiencia", column=@Column(name="annosexperiencia") ), 
        @AttributeOverride(name="codarea", column=@Column(name="codarea", nullable=false) ) } )
    public AreasporevaluadorId getId() {
        return this.id;
    }
    
    public void setId(AreasporevaluadorId id) {
        this.id = id;
    }




}

