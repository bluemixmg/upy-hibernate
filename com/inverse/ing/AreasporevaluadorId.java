package com.inverse.ing;
// Generated 09/05/2017 03:21:15 PM by Hibernate Tools 4.0.1.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AreasporevaluadorId generated by hbm2java
 */
@Embeddable
public class AreasporevaluadorId  implements java.io.Serializable {


     private String username;
     private Integer annosexperiencia;
     private int codarea;

    public AreasporevaluadorId() {
    }

	
    public AreasporevaluadorId(int codarea) {
        this.codarea = codarea;
    }
    public AreasporevaluadorId(String username, Integer annosexperiencia, int codarea) {
       this.username = username;
       this.annosexperiencia = annosexperiencia;
       this.codarea = codarea;
    }
   


    @Column(name="username")
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }


    @Column(name="annosexperiencia")
    public Integer getAnnosexperiencia() {
        return this.annosexperiencia;
    }
    
    public void setAnnosexperiencia(Integer annosexperiencia) {
        this.annosexperiencia = annosexperiencia;
    }


    @Column(name="codarea", nullable=false)
    public int getCodarea() {
        return this.codarea;
    }
    
    public void setCodarea(int codarea) {
        this.codarea = codarea;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AreasporevaluadorId) ) return false;
		 AreasporevaluadorId castOther = ( AreasporevaluadorId ) other; 
         
		 return ( (this.getUsername()==castOther.getUsername()) || ( this.getUsername()!=null && castOther.getUsername()!=null && this.getUsername().equals(castOther.getUsername()) ) )
 && ( (this.getAnnosexperiencia()==castOther.getAnnosexperiencia()) || ( this.getAnnosexperiencia()!=null && castOther.getAnnosexperiencia()!=null && this.getAnnosexperiencia().equals(castOther.getAnnosexperiencia()) ) )
 && (this.getCodarea()==castOther.getCodarea());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUsername() == null ? 0 : this.getUsername().hashCode() );
         result = 37 * result + ( getAnnosexperiencia() == null ? 0 : this.getAnnosexperiencia().hashCode() );
         result = 37 * result + this.getCodarea();
         return result;
   }   


}


