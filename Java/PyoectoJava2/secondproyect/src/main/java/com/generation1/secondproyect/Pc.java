/*crear un objeto vacio
crear un objeto con todos los parámetros
llenar el objeto vacio con métodos set
editar el objeto completo con método set
Guardar en variables al menos 3 atributos con el método get
 */

package com.generation1.secondproyect;


public class Pc {
    private String tamaño;
    private String tipoDisco;
    private String refrigeracion;
    private String memoria;

    public Pc(){
        
    }

    
    public Pc(String tamaño, String tipoDisco, String refrigeracion, String memoria) {
        this.tamaño = tamaño;
        this.tipoDisco = tipoDisco;
        this.refrigeracion = refrigeracion;
        this.memoria = memoria;
    }


    

    public String getTipoDisco() {
        return tipoDisco;
    }



    public void setTipoDisco(String tipoDisco) {
        this.tipoDisco = tipoDisco;
    }



    public String getRefrigeracion() {
        return refrigeracion;
    }



    public void setRefrigeracion(String refrigeracion) {
        this.refrigeracion = refrigeracion;
    }



    public String getMemoria() {
        return memoria;
    }



    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }



    String programar(String lenguaje){
        if(lenguaje =="java"){
            return "El lenguaje es java";
        }
        else{
            return "El lenguaje no es java";
        }
    }

    @Override
    public String toString() {
        return "Pc [tamaño=" + tamaño + ", tipoDisco=" + tipoDisco + ", refrigeracion=" + refrigeracion + ", memoria="
                + memoria + "]";
    }


    public String getTamaño() {
        return tamaño;
    }


    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
