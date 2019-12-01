import javax.swing.JOptionPane;
/**
 * La clase Contrasena contiene un metodo llamado evaluar(); el cual pide un 
 * String como parametro, y evalua con la contraseña ya establecida, la cual 
 * despues de que el usuario falla 3 veces, el programa termina.
 *Uso de la libreria import javax.swing.JOptionPane; para mandar Paneles al momento de ejecutar el programa.
 *
 * @author Gonzalez Pascual Melvin Paul
 * 
 * 
 * @version 2019 11 30
 */
public class Contrasena{ //Inicio de la Clase
    
    /**
     * 
     Constructor para los objetos de la clase Contrasena.
     */
    public Contrasena()//Constructor de la Clase, que se encuentra vacia.
    {
    }

    /**
     * Este metodo verifica que las contrasenas sean correctas, y al 3er fallo termina el programa.
     *
     * @param  con Contrasena que el usuario ingresa desde el teclado. 
     * @return La comparacion entre la contraseña y la clave dada.
     */
    public static void evaluar(String con){//Inicio del metodo evaluar
    String clave="qwerty";//Contrasena ya establecida para evaluar el metodo
    int intentos=1;//Contador que nos ayuda a llegar al limite para el intento de la contraseña, inicializado en 1
        while(!clave.equals(con)&&intentos<3)//Doble condicion con un while, para empezar a comparar los dos String
        {//Inicio del while
            JOptionPane.showMessageDialog(null,"Intente de nuevo");//Mensaje de error, si el usuario falla al ingresar la contrasena
            con=JOptionPane.showInputDialog("Reingrese la contraseña");//Envia a pantalla que ingrese la contrasena, con un nuevo mensaje
            intentos++;//Incremento del contador de errores
            
        }//Fin del while
        if(clave.equals(con))//Condicion con el if, si los Strings son iguales
            {//Inicio del if
            JOptionPane.showMessageDialog(null,"Desbloqueado");//Mensaje que nos indica que esta desbloqueado
            } //Fin del if  
            else{ //Inicio del else  
            JOptionPane.showMessageDialog(null,"Ya no se puede");//Mensaje de error que nos indica que ya no se puede intentar   
                } //Fin del else   
            }//Fin del metodo
            
}//Fin de la clase
