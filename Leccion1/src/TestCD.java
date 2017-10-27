/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angie
 */
public class TestCD {
    public static void main(String args[]){
        CD cd1=new CD(10);
//        System.out.println(cd1);
        cd1.getCanciones().add(new Cancion("Amor Eterno","Rocio Durcal",240));
        System.out.println(cd1);
        System.out.println("Numero de canciones: "+cd1.numeroCanciones());
        Cancion c = new Cancion();
        c = cd1.getCancion(1);
        System.out.println(c);
        Cancion c1 = new Cancion("Alabare","Hermana Glenda",240);
        cd1.agregar(1, c1);
        Cancion c2 = new Cancion("Padre Nuestro","Grupo alabanzas",240);
        cd1.agregar(4, c2);
        System.out.println(cd1);
        Cancion c4 = new Cancion("Alabare","Hermana Glenda",240);
        cd1.eliminar(c4);
        System.out.println("kkk"+cd1);
        System.out.println("Numero de canciones: "+cd1.numeroCanciones());
    }
}
