/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.portafolio;

/**
 *
 * @author mario mejía
 */
public class pueblos {
    private String nombre;
    private int dificultad;
    private int cantEnemigos;
    
    public void setNombre (String _nombre)
    {
        this.nombre = _nombre;
    }
    
    public String getNombre(){
     return this.nombre;
    }
    
    public void setDificultad(int _Dificultad){
       this.dificultad = _Dificultad;
    }
    
    public int getDificuldad(){
        return this.dificultad;
    }
    
    public void setCantEnemigos(int _cantEnemigos){
        this.cantEnemigos =_cantEnemigos;
    }
    
    public int getPoder(){
        return this.cantEnemigos;
    }
    
    public void creaPueblo (String _nombre,int _dificultad, int _cantEnemigos)
    {
        nombre =_nombre;
        dificultad = _dificultad;
        cantEnemigos =_cantEnemigos;
        /*
        el metodo crearPueblo, sera el metodo que utilizaremos para, como su nobre lo indica
        crear nuevos objetos del tipo pueblos.
        */
    }
    
   public void Pueblos (){
       
        
        pueblos Pueblo1 = new pueblos();
        pueblos Pueblo2 = new pueblos();
        pueblos Pueblo3 = new pueblos();
        pueblos Pueblo4 = new pueblos();
        Pueblo1.creaPueblo("pueblo 1", 1, 5);
        Pueblo2.creaPueblo("pueblo 2", 2, 7);
        Pueblo3.creaPueblo("pueblo 3", 2, 5);
        Pueblo4.creaPueblo("pueblo 4", 5, 9);
   }
    
    
}
