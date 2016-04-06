/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.PropPantalla;
import java.io.*;

/**
 *
 * @author Mario
 */
public class PropPantallaC {
    
    private Valor valor;
    
    private PropPantallaV vista;
    
    public PropPantallaC (PropPantallaV vista){
        this.vista = vista;
        valor=new Valor ();
        
        leer();
        
    }
    
    public void aceptar(){
        guardar();
        exit();
    }
    
    public void guardar(){
        System.out.println("Guardado");
        valor.setBrillo(vista.getBrillo());
        valor.setColor(vista.getColor());
        valor.setContraste(vista.getContraste());
        valor.setOrient(vista.getOrient());
        valor.setResolucion(vista.getResolucion());
        escribir();
    }
    
    
    public void escribir() {
        int linea=0;
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("texto.txt"));){
            while(linea<5){
          
            switch(linea){
                        case 0:
                             bw.write(Integer.toString(valor.getBrillo())+"\n");
                            break;
                        case 1:
                             bw.write(Integer.toString(valor.getContraste())+"\n");
                            break;
                        case 2:
                             bw.write(Integer.toString(valor.getResolucion())+"\n");
                            break;
                         case 3:
                              bw.write(Integer.toString(valor.getColor())+"\n");
                            break;
                        case 4:
                             bw.write(Integer.toString(valor.getOrient())+"\n");
                            break;
                            
                }   
                
            linea++;
        bw.flush();
        }
            
        }catch(IOException e){
          
        }
        
    }
    public void leer() {
        int contador=0;
        
        try(BufferedReader br = new BufferedReader(new FileReader("texto.txt"));){
            String linea="a";
            while(linea!=null){
                linea=br.readLine();
             
                switch(contador){
                        case 0:
                            valor.setBrillo(Integer.parseInt(linea));
                            vista.setBrillo(valor.getBrillo());
                            break;
                        case 1:
                            valor.setContraste(Integer.parseInt(linea));
                            vista.setContraste(valor.getContraste());
                            break;
                        case 2:
                            valor.setResolucion(Integer.parseInt(linea));
                            vista.setResolucion(valor.getResolucion());
                            break;
                         case 3:
                             valor.setColor(Integer.parseInt(linea));
                             vista.setColor(valor.getColor());
                            break;
                        case 4:
                            valor.setOrient(Integer.parseInt(linea));
                            vista.setOrient(valor.getOrient());
                            break;
                            
                }   
                contador++;
            }
        }catch(IOException e){
         
        }
        
        
        
    }
    
    public void exit(){
        System.exit(0);
    }
    
}
