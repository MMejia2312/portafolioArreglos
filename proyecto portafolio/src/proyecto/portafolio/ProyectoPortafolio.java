/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.portafolio;

import java.util.Scanner;

/**
 *
 * @author mario mejía
 */
public class ProyectoPortafolio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        System.out.println("Bienvenido, empecemos");
       
      personajes objPersonaje = new personajes();
      personajes objPersonaje2 = new personajes(); //creacion nuevo objeto personaje
      objPersonaje.creaPersonajes("Princesa", 15, 10, 2);
      System.out.println("Haz iniciado como el personaje: "+ objPersonaje.getNombre());
      System.out.println("Estos son tus atributos:");
      System.out.println("Vida: " + objPersonaje.getVida());
      System.out.println("Poder: " + objPersonaje.getPoder());
      /*
      este tramo del codigo nos permite creaer un objeto personaje tan pronto iniciamos la compilacion de codigo
      lo que nos permite crear el personaje inicial con el cual comenzaremos nuestra aventura.
      gracias al metodo crearPersonaje de la clase personajes.
      */
      
      Scanner resp = new Scanner(System.in);
      char resp1;
      System.out.println("¿Deceas agregar un aliado extra? (preciona 'S' para si o cualquier letra para no)");
      resp1 = resp.next().charAt(0);
      if (resp1 == 's' || resp1 == 'S' ){
         
          Scanner entrada = new Scanner(System.in);  // nuevo objeto scaner recepcion de datos
          //nombre
          System.out.println("ingresa el nombre del personaje que quieres agregar");
          String nombre = entrada.next(); // recepcion de nombre del nuevo objeto personaje (dato ingresado por el usuario)
          objPersonaje2.setNombre(nombre); //asignacion de nombre al nuevo objeto personaje 
          //vida
          System.out.println("ingresa la vida del personaje que quieres agregar. (La vida debe ser un valor entre 1 y 45)");
          int vida = entrada.nextInt(); // recepcion del dato vida del nuevo objeto personaje (dato ingresado por el usuario)
          if (vida >=1 && vida <= 45){ //se utiliza esta condicionante if para evitar que el ususario ingrese valores de vina negativos o muy grandes
            objPersonaje2.setVida(vida); //asignacion del dato vida al nuevo objeto personaje si cumple con las condiciones de vida minima y maxima
          }else{
              System.out.println("opps, la vida debe ser un valor entre 1 y 45 ");//se brinda una segunda oportunidad al usuario de ingresar valores de vida adecuados
              System.out.println("ingresa la vida del personaje que quieres agregar. (La vida debe ser un valor entre 1 y 45)");
                int vida1 = entrada.nextInt(); // recepcion del dato vida del nuevo objeto personaje (dato ingresado por el usuario)
                 if (vida1 >=1 && vida1 <= 45){ //se utiliza esta condicionante if para evitar que el ususario ingrese valores de vina negativos o muy grandes
                 objPersonaje2.setVida(vida1); //asignacion del dato vida al nuevo objeto personaje si cumple con las condiciones de vida minima y maxima
                }else{
                 System.out.println("opps, la vida debe ser un valor entre 1 y 45 ");
                 System.out.println("Hemos asignado una valor de vida de: '15'");
                 objPersonaje.setVida(15); // tras el segundo ingreso de datos erroneos se asigna una valor de vida arbitrario y se notifica al usuario
                 }
          
          }
          
          
          //poder
          System.out.println("ingresa el valor de poder del personaje que quieres agregar. (el poder debe ser un valor entre 1 y 25)");
          int poder = entrada.nextInt(); // recepcion del dato poder del nuevo objeto personaje (dato ingresado por el usuario)
          if (poder >=1 && poder <= 25){ //se utiliza esta condicionante if para evitar que el ususario ingrese valores de poder negativos o muy grandes
              objPersonaje2.setPoder(poder); //asignacion del dato poder al nuevo objeto personaje si cumple con las condiciones de vida minima y maxima
          }else{
              System.out.println("opps, el valor del poder debe ser un numero entre 1 y 25 ");
              System.out.println("ingresa el valor de poder del personaje que quieres agregar. (el poder debe ser un valor entre 1 y 25)");
              //se brinda una segunda oportunidad al usuario para introducir una valor de poder adecuado con base a las indicaciones
              int poder1 = entrada.nextInt();
              if (poder1 >=1 && poder1 <= 25){
              objPersonaje2.setPoder(poder1);
              }else{
                  System.out.println("opps, el valor del poder debe ser un numero entre 1 y 25 ");
                  System.out.println("hemos asignado un poder de '15'");
                  objPersonaje2.setPoder(15); //se asigna una valor de poder de forma arbitraria tras el segundo ingreso erroneo de datos y se notifica al usuario
              }
              
          }
          //velocidad de ataque asignada arbitrariamente para evirar personajes que ataquen muy rapido
          objPersonaje2.setVAtaque(1);
          
          
          System.out.println("Has agregado un nuevo personaje; llamado: " + objPersonaje2.getNombre());
          System.out.println("Con una vida de: " + objPersonaje2.getVida() + ", y un poder de: "+ objPersonaje2.getPoder());
          //se devuelven los valores del nuevo objeto personaje que el usuario creo
          // se informa al ususario sobre el equipo que ha decidido usar para el ata que.
          System.out.println("tu equipo esta conformado por: ");
          System.out.println(objPersonaje.getNombre()+" Con una vida de: " + objPersonaje.getVida() + ", y un poder de: "+ objPersonaje.getPoder());
          System.out.println(objPersonaje2.getNombre()+" Con una vida de: " + objPersonaje2.getVida() + ", y un poder de: "+ objPersonaje2.getPoder());
      }else{
          System.out.println("ok, continuemos");
          // se informa al ususario sobre el equipo que ha decidido usar para el ata que.
          System.out.println("tu equipo esta conformado por: ");
          System.out.println(objPersonaje.getNombre()+" Con una vida de: " + objPersonaje.getVida() + ", y un poder de: "+ objPersonaje.getPoder());
      }
      
      
      int pueblos[] = {2,4,1,3};
      System.out.println("¿es hora de empezar, a que pueblo deceas ir?");
      for (int i=0;i<pueblos.length ;i++ ){
                  System.out.print(pueblos[i]+ "-");
              }
   
      int opcion;
      Scanner opciones = new Scanner(System.in);
      opcion = opciones.nextInt();
      char resp2;
      int aux;
      //utilizamos un switch para seleccionar la 
      switch (opcion){
          case 1: 
              System.out.println("haz seleccionado el Pueblo #1");
              System.out.println("empezamos a atacar");
              System.out.println("hay 5 enemigos y el numero hace referencia a su fuerza.");
              int enemigos[] = {4,2,1,5,3};
              for (int i=0;i<enemigos.length -1;i++ ){
                  System.out.print(enemigos[i]+ "-");
              }
              System.out.println("quieres comezar a atacar al mas debil. (preciona 's' para si o preciona otra letra para no)");
              
              resp2 = resp.next().charAt(0);
             if (resp2 == 's' || resp1 == 'S' ){
                 //ordenamiento del array enemigos por medio del metodo de la burbuja
                 for(int i=0;i<enemigos.length-1;i++){
                     for(int j=0;j<enemigos.length-1;j++){
                         aux = enemigos[j];
                         enemigos[j]= enemigos[j+1];
                         enemigos[j+1] = aux;
                         //la variable aux nos ayuda a tener un espacio para almacenar la el dato que deceamos evaluar si es mayor o menor en el arreglo.
                     }
                 }
                 System.out.println("este es el orden para que ataques a los enemigos");
              for (int i=0;i<enemigos.length-1 ;i++ ){
               System.out.print(enemigos[i]+ "-");}
              System.out.println("");
              //muestra el arreglo ya ordenado
             
             }else{
                 System.out.println("Como quieras, empecemos.");
             }
              
              
              break;
          case 2:
              System.out.println("haz seleccionado el Pueblo #2");
              System.out.println("empezamos a atacar");
              
              System.out.println("hay 7 enemigos y el numero hace referencia a su fuerza.");
              int enemigosP2[] = {4,2,1,5,3,7,6};
              for (int i=0;i<enemigosP2.length-1 ;i++ ){
                  System.out.print(enemigosP2[i]+ "-");
              }
              System.out.println("quieres comezar a atacar al mas debil. (preciona 's' para si o preciona otra letra para no)");
             
              resp2 = resp.next().charAt(0);
             if (resp2 == 's' || resp1 == 'S' ){
                 //ordenamiento del array enemigos por medio del metodo de la burbuja
                 for(int i=0;i<enemigosP2.length-1;i++){
                     for(int j=0;j<enemigosP2.length-1;j++){
                         aux = enemigosP2[j];
                         enemigosP2[j]= enemigosP2[j+1];
                         enemigosP2[j+1] = aux;
                         //la variable aux nos ayuda a tener un espacio para almacenar la el dato que deceamos evaluar si es mayor o menor en el arreglo.
                     }
                 }
                 System.out.println("este es el orden para que ataques a los enemigos");
              for (int i=0;i<enemigosP2.length-1 ;i++ ){
               System.out.print(enemigosP2[i]+ "-");}
              //muestra el arreglo ya ordenado
             
             }else{
                 System.out.println("Como quieras, empecemos.");
             }
              break;
              
          case 3:
              System.out.println("haz seleccionado el Pueblo #3");
              System.out.println("empezamos a atacar");
              
              System.out.println("hay 5 enemigos y el numero hace referencia a su fuerza.");
              int enemigosP3[] = {4,2,1,5,3};
              for (int i=0;i<enemigosP3.length -1;i++ ){
                  System.out.print(enemigosP3[i]+ "-");
              }
              System.out.println("quieres comezar a atacar al mas debil. (preciona 's' para si o preciona otra letra para no)");
             
              resp2 = resp.next().charAt(0);
             if (resp2 == 's' || resp1 == 'S' ){
                 //ordenamiento del array enemigos por medio del metodo de la burbuja
                 for(int i=0;i<enemigosP3.length-1;i++){
                     for(int j=0;j<enemigosP3.length-1;j++){
                         aux = enemigosP3[j];
                         enemigosP3[j]= enemigosP3[j+1];
                         enemigosP3[j+1] = aux;
                         //la variable aux nos ayuda a tener un espacio para almacenar la el dato que deceamos evaluar si es mayor o menor en el arreglo.
                     }
                 }
                 System.out.println("este es el orden para que ataques a los enemigos");
              for (int i=0;i<enemigosP3.length-1 ;i++ ){
               System.out.print(enemigosP3[i]+ "-");}
              //muestra el arreglo ya ordenado
             
             }else{
                 System.out.println("Como quieras, empecemos.");
             }
              break;
              
          case 4:
              System.out.println("haz seleccionado el Pueblo #4");
              System.out.println("empezamos a atacar");
              
              System.out.println("hay 9 enemigos y el numero hace referencia a su fuerza.");
              int enemigosP4[] = {4,8,2,1,9,5,3,7,6};
              for (int i=0;i<enemigosP4.length-1 ;i++ ){
                  System.out.print(enemigosP4[i]+ "-");
              }
              System.out.println("quieres comezar a atacar al mas debil. (preciona 's' para si o preciona otra letra para no)");
             
              resp2 = resp.next().charAt(0);
             if (resp2 == 's' || resp1 == 'S' ){
                 //ordenamiento del array enemigos por medio del metodo de la burbuja
                 for(int i=0;i<enemigosP4.length-1;i++){
                     for(int j=0;j<enemigosP4.length-1;j++){
                         aux = enemigosP4[j];
                         enemigosP4[j]= enemigosP4[j+1];
                         enemigosP4[j+1] = aux;
                         //la variable aux nos ayuda a tener un espacio para almacenar la el dato que deceamos evaluar si es mayor o menor en el arreglo.
                     }
                 }
                 System.out.println("este es el orden para que ataques a los enemigos");
              for (int i=0;i<enemigosP4.length-1 ;i++ ){
               System.out.print(enemigosP4[i]+ "-");}
              //muestra el arreglo ya ordenado
             
             }else{
                 System.out.println("Como quieras, empecemos.");
             }
              
              break;
              
              
              
          default:   
              System.out.println("no puedes ir mas lejos de estos pueblos");
              System.out.println("pues nada, nos quedamos hasta que estes listo");
             
    }
      //sistema para buscar un pueblo en especifico dentro del array pueblos.
      System.out.println("¿quieres viajar a un mundo en especifico?");
      System.out.println("puedes buscar el mundo que quieres dijistando su numero");
      int buscaPueblo;
      Scanner busquedaPueblo = new Scanner(System.in);
      buscaPueblo = busquedaPueblo.nextInt();
      int i=0;
      while(i<pueblos.length-1 && pueblos[i]!=buscaPueblo){
          i++;
      }
      if(i==pueblos.length-1){
          System.out.println("el pueblo al que intentas viajar no es accesible o no existe.");
          
      }else{
          if(pueblos[i]==buscaPueblo){
              System.out.println("claro, hemos encontrado el pueblo, en la posicion:"+i);
          
      }
      

 }  
   // public static void elimEnemigo(){
       
      /*
         int cantEnemigos = cant;
        for (int i=0; i< (cantenemigos); i++)
      */
}
    
    
}


