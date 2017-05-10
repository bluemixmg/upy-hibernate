package com.inverse.ing;
// Generated 09/05/2017 03:21:15 PM by Hibernate Tools 4.0.1.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DesafioId generated by hbm2java
 */
@Embeddable
public class DesafioId  implements java.io.Serializable {


     private String titulo;
     private String descripcion;
     private String categoria;
     private Date fechacaducidad;
     private Boolean tipo;
     private String riforganizacion;
     private Character estatus;
     private Integer id;
     private Integer prioridad;

    public DesafioId() {
    }

    public DesafioId(String titulo, String descripcion, String categoria, Date fechacaducidad, Boolean tipo, String riforganizacion, Character estatus, Integer id, Integer prioridad) {
       this.titulo = titulo;
       this.descripcion = descripcion;
       this.categoria = categoria;
       this.fechacaducidad = fechacaducidad;
       this.tipo = tipo;
       this.riforganizacion = riforganizacion;
       this.estatus = estatus;
       this.id = id;
       this.prioridad = prioridad;
    }
   


    @Column(name="titulo")
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Column(name="descripcion")
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Column(name="categoria")
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Column(name="fechacaducidad", length=13)
    public Date getFechacaducidad() {
        return this.fechacaducidad;
    }
    
    public void setFechacaducidad(Date fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }


    @Column(name="tipo")
    public Boolean getTipo() {
        return this.tipo;
    }
    
    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }


    @Column(name="riforganizacion")
    public String getRiforganizacion() {
        return this.riforganizacion;
    }
    
    public void setRiforganizacion(String riforganizacion) {
        this.riforganizacion = riforganizacion;
    }


    @Column(name="estatus", length=1)
    public Character getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }


    @Column(name="id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }


    @Column(name="prioridad")
    public Integer getPrioridad() {
        return this.prioridad;
    }
    
    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DesafioId) ) return false;
		 DesafioId castOther = ( DesafioId ) other; 
         
		 return ( (this.getTitulo()==castOther.getTitulo()) || ( this.getTitulo()!=null && castOther.getTitulo()!=null && this.getTitulo().equals(castOther.getTitulo()) ) )
 && ( (this.getDescripcion()==castOther.getDescripcion()) || ( this.getDescripcion()!=null && castOther.getDescripcion()!=null && this.getDescripcion().equals(castOther.getDescripcion()) ) )
 && ( (this.getCategoria()==castOther.getCategoria()) || ( this.getCategoria()!=null && castOther.getCategoria()!=null && this.getCategoria().equals(castOther.getCategoria()) ) )
 && ( (this.getFechacaducidad()==castOther.getFechacaducidad()) || ( this.getFechacaducidad()!=null && castOther.getFechacaducidad()!=null && this.getFechacaducidad().equals(castOther.getFechacaducidad()) ) )
 && ( (this.getTipo()==castOther.getTipo()) || ( this.getTipo()!=null && castOther.getTipo()!=null && this.getTipo().equals(castOther.getTipo()) ) )
 && ( (this.getRiforganizacion()==castOther.getRiforganizacion()) || ( this.getRiforganizacion()!=null && castOther.getRiforganizacion()!=null && this.getRiforganizacion().equals(castOther.getRiforganizacion()) ) )
 && ( (this.getEstatus()==castOther.getEstatus()) || ( this.getEstatus()!=null && castOther.getEstatus()!=null && this.getEstatus().equals(castOther.getEstatus()) ) )
 && ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getPrioridad()==castOther.getPrioridad()) || ( this.getPrioridad()!=null && castOther.getPrioridad()!=null && this.getPrioridad().equals(castOther.getPrioridad()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTitulo() == null ? 0 : this.getTitulo().hashCode() );
         result = 37 * result + ( getDescripcion() == null ? 0 : this.getDescripcion().hashCode() );
         result = 37 * result + ( getCategoria() == null ? 0 : this.getCategoria().hashCode() );
         result = 37 * result + ( getFechacaducidad() == null ? 0 : this.getFechacaducidad().hashCode() );
         result = 37 * result + ( getTipo() == null ? 0 : this.getTipo().hashCode() );
         result = 37 * result + ( getRiforganizacion() == null ? 0 : this.getRiforganizacion().hashCode() );
         result = 37 * result + ( getEstatus() == null ? 0 : this.getEstatus().hashCode() );
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getPrioridad() == null ? 0 : this.getPrioridad().hashCode() );
         return result;
   }   


}

