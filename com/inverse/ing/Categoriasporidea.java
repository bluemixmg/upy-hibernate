package com.inverse.ing;
// Generated 09/05/2017 03:21:15 PM by Hibernate Tools 4.0.1.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Categoriasporidea generated by hbm2java
 */
@Entity
@Table(name="categoriasporidea"
    ,schema="public"
)
public class Categoriasporidea  implements java.io.Serializable {


     private CategoriasporideaId id;

    public Categoriasporidea() {
    }

    public Categoriasporidea(CategoriasporideaId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idIdea", column=@Column(name="id_idea") ), 
        @AttributeOverride(name="idCategoria", column=@Column(name="id_categoria") ) } )
    public CategoriasporideaId getId() {
        return this.id;
    }
    
    public void setId(CategoriasporideaId id) {
        this.id = id;
    }




}


