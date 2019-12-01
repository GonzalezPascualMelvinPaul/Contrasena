import javax.swing.JOptionPane;
/**
 * Test para poder ejecutar la clase Contrasena.
 *
 * @author Gonzalez Pascual Melvin Paul
 * @version 2019 11 30
 */
public class Test
{//Inicio de la Clase
    /**
     * Constructor for objects of class Test
     */
    public Test()//Constructor de la clase vacia
    {
        
    }

    /**
     * Metodo que ejecuta el main para ejecutar el metodo evaluar() de la clase Contrasena. 
     *
     * @param  String []args para ejecutar el main
     * @return    void Nos envia el resultado del metodo evaluar().
     */
    public static void main (String[] args){//Inicio del metodo main
    Contrasena c=new Contrasena();//Creamos un objeto de la clase a usar
    String con=JOptionPane.showInputDialog("Ingrese la contraseña");//Un String para poder pedir la contraseña desde teclado
    c.evaluar(con);//Ejecucion del metodo evaluar
    }//Fin del metodo main
}//Fin de la clase
