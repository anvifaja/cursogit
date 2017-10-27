/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angie
 */
public class Cancion {
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int duracion;
    //CONSTRUCTOR
    public Cancion(){
        this.titulo="";
        this.autor="";
    }
    public Cancion(String titulo,String autor,int duracion){
        this.titulo=titulo;
        this.autor=autor;
        this.duracion=duracion;
    }
    //GET AND SET
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + '}';
    }
    
    //METODOS
    public void mostrarTiempoMinutos(){
        System.out.println("Minutos: "+this.duracion/60);
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }        
        if(o==null){
            return false;
        }
        if(getClass()!=o.getClass()){
            return false;
        }
        final Cancion other = (Cancion)o;
        if(this.getTitulo()!=other.getTitulo()){
            return false;
        }
        if(this.getAutor()!=other.getAutor()){
            return false;
        }
        if(this.getDuracion()!=other.getDuracion()){
            return false;
        }
        return true;
    }
}
