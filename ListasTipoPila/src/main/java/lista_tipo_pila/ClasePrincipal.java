/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_tipo_pila;

import javax.swing.JOptionPane;

/**
 *
 * @author angelcampos
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        int opcion = 0, nodo = 0;
        Pila pila = new Pila();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Eliminar un nodo\n"
                        + "3. ¿La pila esta vacia?\n"
                        + "4. ¿Cuál es el último valor ingresado en la pila?\n"
                        + "5. ¿Cuántos nodos tiene la pila?\n"
                        + "6. Vacia pila\n"
                        + "7. Mostrar contenido de la pila\n"
                        + "8. Salir\n\n"));
                
                switch(opcion){
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Porfavor ingresa el valor a guardar en el nodo"));
                        pila.InsertarNodo(nodo);
                        
                        break;
                    case 2:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                            + pila.EliminarNodo());
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila está vacia");
                        }
                        break;
                    case 3:
                        if(pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "La pila está vacia");
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila no está vacia");
                        }
                        break;
                    case 4:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "El último valor ingresado es: "
                            + pila.MostrarultimoValorIngresado());
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila está vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene "+ pila.TamanoPila() + " nodos");
                        break;
                    case 6:
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila está vacia");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve a intentar nuevamente.");
                        break;
                }
            } catch (NumberFormatException e) {

            }
        } while (opcion != 8);

    }
}
