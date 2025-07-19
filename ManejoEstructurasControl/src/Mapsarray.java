import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapsarray {
    
    public static void main(String[] args) {

        Map<String, String > admin= new HashMap<>(); // aca creo un diccionario de administradores
        Map<String, String > user= new HashMap<>(); // aca creo un diccionario de usuarios

        Scanner read= new Scanner(System.in);
        int opIncial;
        char opCliente;

       

        System.out.println("******************************");
         System.out.println("WELCOME TO RAMBED JEANS");
        System.out.println("******************************");

        System.out.println("ESCOGE UNA OPCION \n 1. CLIENTE \n 2. ADMINISTRADOR \n 3. SALIR ");
        opIncial=read.nextInt();

        while(opIncial != 3){

            switch(opIncial){

                case 1: {
                
                System.out.println("WELCOME TO RAMBED JEANS");
                System.out.println("Estas registrado? \n S/N");
                opCliente=read.next().charAt(0);
                
                if (opCliente=='n' || opCliente=='N') {
                    System.out.println("ingresa tu usuario ");
                    String keyUname= read.next();
                    System.out.println("ingresa su contraseña ");
                    String valueUpass= read.next();

                    user.put(keyUname,valueUpass); // con esto registro usuarios
                    System.out.println("usted registro "+user.entrySet());



                    
                }else if(opCliente=='s' || opCliente=='S'){
                    System.out.println("ingresa tu usuario ");
                    String keyUname= read.next();
                    System.out.println("ingresa su contraseña ");
                    String valueUpass= read.next();

                    if(user.containsKey(keyUname)){
                        String valuename= admin.get(keyUname);
                        if (valuename.equals(valueUpass)) {
                            System.out.println("loggin existoso");
                    }else{
                            System.out.println("usuario admin econtrado, diferente pass");
                    }
                        
                    }else{
                    
                        System.out.println("error en usuario y contraseña");
                    }

                }

                System.out.println("ESCOGE UNA OPCION \n 1. CLIENTE \n 2. ADMINISTRADOR \n 3. SALIR ");
                    opIncial=read.nextInt();
               

                } break;

                case 2: { admin.put("santiago","admin1");
                            admin.put("julian","admin2");
                            admin.put("maricela","admin3");
        
                        System.out.println("ingresa tu usuario ");
                        String keyName= read.next();
                        System.out.println("ingresa su contraseña ");
                        String valuePass= read.next();
        
               
                    if(admin.containsKey(keyName)){
                        String valuename= admin.get(keyName);
                        if (valuename.equals(valuePass)) {
                            System.out.println("loggin existoso");
                    }else{
                            System.out.println("usuario admin econtrado, diferente pass");
                    }
                        
                    }else{
                    
                        System.out.println("error en usuario y contraseña");
                    }
    
                    System.out.println("ESCOGE UNA OPCION \n 1. CLIENTE \n 2. ADMINISTRADOR \n 3. SALIR ");
                    opIncial=read.nextInt();
                
                }break;

                case 3: {

                    opIncial=3;
                }
                default: {
                    System.out.println("opcion incorrecta, le bien y entre los datos bien");
                    System.out.println("ESCOGE UNA OPCION \n 1. CLIENTE \n 2. ADMINISTRADOR \n 3. SALIR ");
                    opIncial=read.nextInt();
                }


            }


        

            } 
            
            System.out.println("****************THANKS FOR USE IT*********************");
            System.out.println("******************SOFTWARE 2MSJ***********************");
            System.out.println("ELABORATE FOR MARICELA, MARIAJOSE, JULIAN  Y SANTIAGO");

            read.close();
        
    }
}
