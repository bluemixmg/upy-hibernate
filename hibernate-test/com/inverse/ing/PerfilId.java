package com.inverse.ing;
// Generated 09/05/2017 03:21:15 PM by Hibernate Tools 4.0.1.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PerfilId generated by hbm2java
 */
@Embeddable
public class PerfilId  implements java.io.Serializable {


     private String username;
     private String nombre;
     private String apellido;
     private String telefono;
     private Character estatus;
     private String direccion;
     private Integer genero;
     private Date fechanacimiento;

    public PerfilId() {
    }

    public PerfilId(String username, String nombre, String apellido, String telefono, Character estatus, String direccion, Integer genero, Date fechanacimiento) {
       this.username = username;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.estatus = estatus;
       this.direccion = direccion;
       this.genero = genero;
       this.fechanacimiento = fechanacimiento;
    }
   


    @Column(name="username")
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }


    @Column(name="nombre")
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Column(name="apellido")
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    @Column(name="telefono")
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Column(name="estatus", length=1)
    public Character getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }


    @Column(name="direccion")
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Column(name="genero")
    public Integer getGenero() {
        return this.genero;
    }
    
    public void setGenero(Integer genero) {
        this.genero = genero;
    }


    @Column(name="fechanacimiento", length=13)
    public Date getFechanacimiento() {
        return this.fechanacimiento;
    }
    
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PerfilId) ) return false;
		 PerfilId castOther = ( PerfilId ) other; 
         
		 return ( (this.getUsername()==castOther.getUsername()) || ( this.getUsername()!=null && castOther.getUsername()!=null && this.getUsername().equals(castOther.getUsername()) ) )
 && ( (this.getNombre()==castOther.getNombre()) || ( this.getNombre()!=null && castOther.getNombre()!=null && this.getNombre().equals(castOther.getNombre()) ) )
 && ( (this.getApellido()==castOther.getApellido()) || ( this.getApellido()!=null && castOther.getApellido()!=null && this.getApellido().equals(castOther.getApellido()) ) )
 && ( (this.getTelefono()==castOther.getTelefono()) || ( this.getTelefono()!=null && castOther.getTelefono()!=null && this.getTelefono().equals(castOther.getTelefono()) ) )
 && ( (this.getEstatus()==castOther.getEstatus()) || ( this.getEstatus()!=null && castOther.getEstatus()!=null && this.getEstatus().equals(castOther.getEstatus()) ) )
 && ( (this.getDireccion()==castOther.getDireccion()) || ( this.getDireccion()!=null && castOther.getDireccion()!=null && this.getDireccion().equals(castOther.getDireccion()) ) )
 && ( (this.getGenero()==castOther.getGenero()) || ( this.getGenero()!=null && castOther.getGenero()!=null && this.getGenero().equals(castOther.getGenero()) ) )
 && ( (this.getFechanacimiento()==castOther.getFechanacimiento()) || ( this.getFechanacimiento()!=null && castOther.getFechanacimiento()!=null && this.getFechanacimiento().equals(castOther.getFechanacimiento()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUsername() == null ? 0 : this.getUsername().hashCode() );
         result = 37 * result + ( getNombre() == null ? 0 : this.getNombre().hashCode() );
         result = 37 * result + ( getApellido() == null ? 0 : this.getApellido().hashCode() );
         result = 37 * result + ( getTelefono() == null ? 0 : this.getTelefono().hashCode() );
         result = 37 * result + ( getEstatus() == null ? 0 : this.getEstatus().hashCode() );
         result = 37 * result + ( getDireccion() == null ? 0 : this.getDireccion().hashCode() );
         result = 37 * result + ( getGenero() == null ? 0 : this.getGenero().hashCode() );
         result = 37 * result + ( getFechanacimiento() == null ? 0 : this.getFechanacimiento().hashCode() );
         return result;
   }   


}

