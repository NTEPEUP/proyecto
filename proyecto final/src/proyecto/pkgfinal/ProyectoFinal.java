/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkgfinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;

/**
 *
 * @author Nelson
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONFIGURACION INICAL DEL SISTEMA
         
        Scanner scan = new Scanner(System.in);
        // Verificar si el archivo de configuración ya existe
        File archivoConfiguracion = new File("admin.txt");

        if (archivoConfiguracion.exists()) {
            // Si el archivo de configuración ya existe, cargar la contraseña del administrador
            String administrador= cargarContraseñaAdministrador(archivoConfiguracion);

            // Solicitar inicio de sesión
            
            System.out.println("Ingrese la contrasenia del administrador: ");
            String contraseñaIngresada = scan.nextLine();

            if (contraseñaIngresada.equals(administrador)) {
                // Inicio de sesión exitoso, mostrar el menú del sistema
                mostrarMenu();
            } else {
                System.out.println("Contrasenia incorrecta. Saliendo del programa.");
            }
        } else {
            // Solicitar una nueva contraseña para el administrador
            System.out.println("Configuracion inicial: Ingrese una contrasenia para el usuario administrador: ");
            String administrador= scan.nextLine();

            // Guardar la contraseña en el archivo de configuración
            guardarContraseñaAdministrador(archivoConfiguracion, administrador);
            System.out.println("La contrasenia del administrador se ha configurado correctamente.");

        }
    }

    private static String cargarContraseñaAdministrador(File archivoConfiguracion) {
        try (BufferedReader lector = new BufferedReader(new FileReader(archivoConfiguracion))) {
            return lector.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void guardarContraseñaAdministrador(File archivoConfiguracion, String contraseña) {
        try (PrintWriter escritor = new PrintWriter(archivoConfiguracion)) {
            escritor.println(contraseña);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mostrarMenu() {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("*******************BIENVENIDO  AL SISTEMA DE VOTACIONES***************");
        System.out.println("___________________________________________");
        

        int opcion=0;
        
        System.out.println("1. Registro de usuarios  ");
        System.out.println("2. Administracion de elecciones");
        System.out.println("3. Acceso de votante al sistema");
        System.out.println("4. Conteo de votos");
        System.out.println("5. Registro de votantes");
        System.out.println("Seleccione operacion a utilizar ");
        opcion=scan.nextInt();
        
        switch (opcion) {
            case 1: registroUsuario();
                
            case 2: adminElecciones();
                break;
                
            case 3: accesoVotante();
            break;
            
            case 4:conteoVotos();
            break;
            case 5: registroVotante();
            break;
                
               
            default:
                throw new AssertionError();
        }
      
        }
    
    // registros de usuarios
    static void registroUsuario(){
         int opcion;
         String nombres, apellidos, correo;
         Scanner scan=new Scanner(System.in);
          System.out.println("BIENVENIDO AL REGISTRO DE USUARIO");
                System.out.println("_____________________________________");
                System.out.println("1. Crear usuario del sistema");
                System.out.println("2. Modificar usuario");
                System.out.println("3. Reiniciar contrasenia");
                System.out.println("ingrese la opcion");
                opcion=scan.nextInt();
                
           switch (opcion) {
               
           case 1: System.out.println("***CREAR USUARIO***");
                        System.out.println("Ingrese los nombres:");
                        nombres=scan.next();
                        System.out.println("Ingrese los apellidos: ");
                        apellidos=scan.next();
                        System.out.println("Ingrese el correo electronico:");
                        correo=scan.next();
             break;
     
           case 2: System.out.println("****MODIFICAR USUARIO");
         
           
            break;
            default:
                throw new AssertionError();
        }
          
        }
     static void adminElecciones(){
         
         Scanner scan=new Scanner(System.in);
         System.out.println("1. Gestion de elecciones");
         System.out.println("2. Gestion de candidatos");
         System.out.println("3. configuracion de gestion de elecciones");
         
         
         
         
    }
     static void registroVotante(){
         System.out.println("1. Agregar votante");
         System.out.println("2. Desabilitar votante");
         System.out.println("3. Modificar votante");
         System.out.println("4. Reiniciar contraseña");
         System.out.println("Seleccione una opcion");
         
     }
     static void accesoVotante(){
         Scanner scan=new Scanner(System.in);
         boolean accesoValido=false;
         
         System.out.println("ingrese su correo: ");
         String correo=scan.next(); 
         
         System.out.println("ingrese contrasenia:");
         String Contrasenia=scan.next();
         
         if (correo.compareTo("correo@correo.com")==0) {
             if (Contrasenia.compareTo("123")==0) {
                 System.out.println("ingrese CUI:");
                 System.out.println("***Bienvenido al sistema***");
                 
                 accesoValido=true;
             }
             else{
                 System.err.println("contraseña incorrecta");
             accesoValido=false;
         }
             System.err.println("correo incorrecto");
             accesoValido=false;
     }
     
}
     
     static void conteoVotos(){
         
     
     }
}



