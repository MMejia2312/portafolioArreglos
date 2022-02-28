/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.portafolio;

/**
 *
 * @author mario mejía
 */
class personajes {
     private String nombre;
    private int vida;
    private int poder;
    private int vAtaque;
    /*principales caracteristicas que tendran los personajes
    */
   
    
    public void setNombre (String _nombre)
    {
        this.nombre = _nombre;
    }
    
    public String getNombre(){
     return this.nombre;
    }
    
    public void setVida(int _vida){
       this.vida = _vida;
    }
    
    public int getVida(){
        return this.vida;
    }
    
    public void setPoder(int _poder){
        this.poder =_poder;
    }
    
    public int getPoder(){
        return this.poder;
    }
    
     public void setVAtaque(int _vAtaque){
       this.vAtaque = _vAtaque;
    }
    
    public int getVAtaque(){
        return this.vAtaque;
    }
    
    public boolean vivo()
    {
        boolean flag = true;
        if(this.getVida()<=0) flag = false;
        System.out.println("el personaje: " + this.getNombre()+ " ha muerto");
        return flag;
        /* la clase compueba si la vida de la carta es mayor que 0,
        la carta continua con vida y puede volver a usarse
        pero si la vida es igual o menor que 0 significa que la carta
        ha muerto y ya no se podra usar y mostrara
        un mensaje que especifique que la carta ha muerto.
        */
        }
    
    public void golpe(int _poder)
    {
        int vidaRest = this.getVida();
        int daño =_poder;
        if(daño>0)
        {
          vidaRest-= daño;
         System.out.println("el personaje: "+this.getNombre() + "ha resivido " + daño + " puntos de daño");
         
        } else {
            System.out.println("Bueno vamo' a juga'");
        }
        this.setVida(vidaRest);
        System.out.println("al personaje : " +this.getNombre() +" le quedan"+ vidaRest +" puntos de vida.");
        /*
         tras comprobar si la carta usada ha resivido un ataque el daño, se
        restara la cantidad de daño
         infrinjido a la  vida que posee la carta.
         se mostrara un mensaje donde especifica el nombre de la carta y 
        el daño que se ha recibido.
         al final del metodo se recibira un mensaje le cual notifica 
        sobre la cantodad de vida que
         queda tras haber sido atacado
         */
    }
    
    public void creaPersonajes (String _nombre,int _vida, int _poder, int _vAtaque)
    {
        nombre =_nombre;
        vida = _vida;
        poder =_poder;
        vAtaque =_vAtaque;
        /*
        el metodo crearPersonajes, sera el metodo que utilizaremos para, como su nobre lo indica
        crear nuevos objetos del tipo personaje, ya nosotros desde nuestro codigo, como darle la opcion al usuario de agregar
        personajes de manera controlada.
        */
    }
}
