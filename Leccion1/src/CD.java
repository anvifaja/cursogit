
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angie
 */
public class CD {
    //ATRIBUTOS
    private ArrayList<Cancion> canciones;
    private int contador;
    //CONSTRUCTOR
    public CD(int tamano){
        canciones=new ArrayList<>(tamano);
        Cancion c= new Cancion("Amores","Juan Gabriel",180);
        canciones.add(c);
    }
    //GET AND SET
    

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "CD{" + "canciones=" + canciones;
    }
        
    //METODOS
    public int numeroCanciones(){
        int acum=0;
        for(Cancion ca: canciones){
            if(!ca.equals(null)){
                acum+=1;
            }
        }
        this.contador=acum;
        return acum;
    }
    public Cancion getCancion(int indice){
        Cancion c=new Cancion();
        for(int i=0;i<this.canciones.size();i++){
            if(i==indice){
                c=this.canciones.get(i);
            }
        }
        return c;
    }
    public void agregar(Cancion c){
        this.canciones.add(c);
    }
    public void agregar(int indice,Cancion c){
        for(int i=0;i<this.canciones.size();i++){
            if(i==indice){
                if(!this.canciones.get(i).equals(i)){
                    this.canciones.get(i).setTitulo(c.getTitulo());
                    this.canciones.get(i).setAutor(c.getAutor());
                    this.canciones.get(i).setDuracion(c.getDuracion());
                }
            }
        }
    }
    public void eliminar(Cancion c){
        if(this.getCanciones().contains(c)){
            this.getCanciones().remove(c);
        }
    }
    public void eliminar(int indice){
        for(int i=0;i<this.canciones.size();i++){
            if(i==indice){
                System.out.println("Mira");
                this.getCanciones().remove(i);
            }
        }
    }
}
