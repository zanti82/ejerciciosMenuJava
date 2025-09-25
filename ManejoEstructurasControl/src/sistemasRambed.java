/**
 * Manejo de una tienda virtual de jeans, donde tenemos las clases
 * Administradores, Clientes que herdan de la superclase User.
 * Tambien tenemos las clases Jeans que maneja el inventario.
 * La clase TiendaRB maneja las listas de los clinentes, administradores y productos.
 */




import java.util.ArrayList;
import java.util.Scanner;



public class sistemasRambed {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
       
        //BLOQUE PARA GAUARDAR CLIENTES, ADMINISTRADORES, JEANS

        ArrayList<Admin> listaAdmin= new ArrayList<>();
        ArrayList<Cliente> listaClientes= new ArrayList<>();
        ArrayList<Jeans> listaJeans= new ArrayList<>();
        ArrayList<Factura> listaFacturas=new ArrayList<>();

        //aca creo los admin
        Admin adm1= new Admin("100234","Julian", "julina@mail.com", "1111","32100000",  "crr 20");
        Admin adm2= new Admin("100235","Maricela", "maricela@mail.com", "2222","32100033",  "calle 22");
        Admin adm3= new Admin("100236","MariaJ", "maria@mail.com", "3333","32100022",  "crr 30");
        Admin adm4= new Admin("100237","Santiago", "santi@mail.com", "4444","32100044",  "cll 49");
       
        //los anexamos al arraylist instanciando una clase tienda
        /**
         * La clase tienda recoge la informacion de las listas de administradores, cliente y productos
         * Queda faltando la de las facturas
         */

        TiendaRB tiendaVirtualRB= new TiendaRB(listaJeans, listaClientes, listaAdmin, listaFacturas);

        tiendaVirtualRB.addAdmin(adm1);
        tiendaVirtualRB.addAdmin(adm2);
        tiendaVirtualRB.addAdmin(adm3);
        tiendaVirtualRB.addAdmin(adm4);
             
        //creación de objetos jeans para tener una lista

        Jeans ref1= new Jeans(1001,"ClasicoDenim", 89000);
        Jeans ref2= new Jeans(1002,"ClasicoDril", 89000);
        Jeans ref3= new Jeans(1003,"CargoDril", 110000);
        Jeans ref4= new Jeans(1004,"CargoDemin", 110000);

        //anexamos jeans al arraylist de listajeans por medio de la tienda

        tiendaVirtualRB.addRef(ref1);
        tiendaVirtualRB.addRef(ref2);
        tiendaVirtualRB.addRef(ref3);
        tiendaVirtualRB.addRef(ref4);
        
        
        
        // BLOQUE FACTURAS con arrays simples
        int contFac=0;
    
        String [] facturas=new String[20];
        Double [] valorFact= new Double[20];

           
              
//inicio del programa **************

        int opIncial=0;
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
                        System.out.println("ingresa tu Cedula ");
                        String clienteId= read.next();
                        System.out.println("ingresa tu nombre ");
                        String clienteName= read.next();
                        System.out.println("ingresa tu email ");
                        String clienteMail= read.next();
                        System.out.println("ingresa tu pass ");
                        String clientePass= read.next();
                        System.out.println("ingresa tu phone ");
                        String clientePhone= read.next();
                        System.out.println("ingresa tu direccion ");
                        String clienteAddress= read.next();

                        //con la info capturada creeamos clientes con la siguiente instruccion
                        //aca lo guardamos en el arraylist de la tiendaviertual de listaClinetes

                        tiendaVirtualRB.addClientes(new Cliente(clienteId, clienteName, clienteMail, clientePass, clientePhone, clienteAddress));
                                              
                        

                        //ensayis
                        tiendaVirtualRB.getListClientes();



                        
                    }else if(opCliente=='s' || opCliente=='S'){

                        System.out.println("ingresa tu email ");
                        String nclienteMail= read.next();
                        System.out.println("ingresa tu pass ");
                        String nclientePass= read.next();

                        boolean loggin=false;

                        for (Cliente c: listaClientes) {

                            if(c.getMail().equals(nclienteMail) && c.getPassword().equals(nclientePass)){

                                    loggin=true;

                                System.out.println("Loggin exitoso");

                            }else{
                                

                            }    
                        }
                        
                        if(loggin==true){

                        
                                System.out.println("**************************************");
                                System.out.println("estas en la pagina de ventas, \n  este es la lista de jeans:");
                                System.out.println("**************************************");
                                System.out.println("OPCION \t JEANS \t\t PRECIO ");
                                
                                //  jeans.getListRef();

                                //aca listo los jeans pero en los arrays para mostrar el numero y escoja facil

                               ArrayList<Jeans> jeans= tiendaVirtualRB.getListaJeans();

                               for(int i=0;i<listaJeans.size(); i++){

                               

                                    System.out.println( 
                                                        "\n ref: "+jeans.get(i).getId()+
                                                       "\n estilo: " +jeans.get(i).getEstilo()+
                                                       "\n precios:"+jeans.get(i).getPrice());
                                    
                                }
                            
                                    
                            System.out.println("**************************************");

                            System.out.println("Quieres agregar una compra S/N");
                            char op= read.next().charAt(0);
                            
                                double ventaTotal=0;
                                int cont=0;

                                while (op == 's' || op == 'S' ) {

                                    System.out.println("");
                                    
                                    System.out.println("escoge el numero de la ref del jean: ");
                                    int opcion=read.nextInt();
                                    System.out.println("cuantas unidades quieres de este jean ?:  ");
                                    int und= read.nextInt();

                                    double valorjean=0;
                                    double venta=0;
                                    for(int i=0;i<listaJeans.size(); i++){

                                        if(jeans.get(i).getId() == opcion){

                                             valorjean= jeans.get(i).getPrice();

                                             venta= und * valorjean;

                                             System.out.println("Usted compro ref: "+jeans.get(i).getEstilo()+
                                             " und: "+ und + " valor: "+ venta);
                                        }

                                    }
                                                        

                                    ventaTotal=venta+ventaTotal;
                                    cont++;

                                    System.out.println("Quieres agregar una compra S/N");
                                    op= read.next().charAt(0);
                                    
                                }

                                System.out.println("************************************");
                                System.out.println("Usted compró:.... "+cont+" items .......total: " +ventaTotal+" $");
                                
                                System.out.println("************************************");
                                System.out.println("************************************");
                            

                            

                                facturas[contFac] = "100"+contFac;
                                valorFact[contFac]= ventaTotal;

                                System.out.println("FACTURA NRO: "+ facturas[contFac]);
                                
                                contFac++;

                                    //FIN BLOQUE VENTAS DEL CLIENTE
                                                                                            
                            }else{
                                System.out.println("Error en usuario y constraseña");
                            };

                           
                       //esto para cambiar el switch

                        System.out.println("ESCOGE UNA OPCION \n 1. CLIENTE \n 2. ADMINISTRADOR \n 3. SALIR ");
                        opIncial=read.nextInt();
                        
                       

                    }
                } break;

                case 2: { 
        
                    System.out.println(listaAdmin);
                        System.out.println("ingresa tu correo");
                        String adminMail= read.next();
                        System.out.println("ingresa su contraseña");
                        String adminPass= read.next();

                        boolean loggin=false;

                        for (Admin a : listaAdmin) {

                            if(a.getMail().equals(adminMail) && a.getPassword().equals(adminPass)){

                                    loggin=true;

                                System.out.println("Loggin exitoso");

                            }else{
                                

                            }    
                        }

                        

                            if(loggin){                                   
                           
                                
                            //BLOQUE ADMIN
                            System.out.println("**********************************************");
                            System.out.println("HOLA SUPER ADMINISTRADOR, QUE DESEAS HACER HOY");
                            System.out.println("1. Editar producto \n 2. Resumen de ventas \n 3. Salir");
                            int opad=read.nextInt();

                            while (opad!=3) {
                                
                            
                    
                             switch (opad) {
                                    case 1:
                                            System.out.println("Este es el listado de los jeans en bodega ");
                                            System.out.println("OPCION \t JEANS \t\t PRECIO ");
                                             tiendaVirtualRB.getListRef();
                                            
                                            System.out.println("seleccion la opcion");
                                            System.out.println("1. Editar productos \n 2. agregar \n 3. salir");
                                            int ops=read.nextInt();
                                                    
                                            while(ops!=3){
                                                    switch (ops) {
                                                            case 1:
                                                                    System.out.println("introduce la referencia que deseas editar");
                                                                    int pos=read.nextInt();

                                                                    ArrayList<Jeans> jeans= tiendaVirtualRB.getListaJeans();

                                                                    for(int i=0;i<listaJeans.size(); i++){

                                                                        if(jeans.get(i).getId() == pos){

                                                                            System.out.println("ingresa el nombre: ");
                                                                            String cambioNom=read.next();
                                                                            jeans.get(i).setEstilo(cambioNom);
                                                                            
                                    
                                                                            System.out.println("ingresa el valor: ");
                                                                            double  cambioPrec=read.nextDouble();
                                                                            jeans.get(i).setPrice(cambioPrec);

                                                                            System.out.println( "actualizacion= "
                                                                                                +"\n ref: "+jeans.get(i).getId()+
                                                                                               "\n estilo: " +jeans.get(i).getEstilo()+
                                                                                               "\n precios:"+jeans.get(i).getPrice());
                                                                            
                                                                        }
                                
                                
                                                                    }
                                                                   
                                                                    break;
                            
                                                            case 2:
                                                                    System.out.println("AHora vas a agregar una ref nueva");
                                                                        
                                                                    System.out.println("ingresa el id: ");
                                                                    int newId=read.nextInt();
                                                                                                
                                                                    System.out.println("ingresa el estilo: ");
                                                                    String newNom=read.next();
                                                                                                
                                                                    System.out.println("ingresa el valor: ");
                                                                    double  newPrec=read.nextDouble();

                                                                    Jeans jeansNew= new Jeans(newId, newNom, newPrec);
                                                                    
                                                                    tiendaVirtualRB.addRef(jeansNew);
                                                                    
                                                                    System.out.println( "Ingresaste= "
                                                                    +"\n ref: "+jeansNew.getId()+
                                                                   "\n estilo: " +jeansNew.getEstilo()+
                                                                   "\n precios:"+jeansNew.getPrice());
                                                                 
                            
                                                                    break;
                                                        
                                                    
                                                            default:
                                                                    System.out.println("opcion errada, intenta de nuevo");
                                                                    
                                                                    break;
                                                            };

                                                            System.out.println("seleccion la opcion");
                                                            System.out.println("1. Editar productos \n 2. agregar \n 3. salir");
                                                            ops=read.nextInt();
                                                        }
                                                 System.out.println("**********************************************");
                                                 System.out.println("HOLA SUPER ADMINISTRADOR, QUE DESEAS HACER HOY");
                                                 System.out.println("1. Editar producto \n 2. Resumen de ventas \n 3. Salir");
                                                 opad=read.nextInt();
                                                
                                                break;
                            
                                            case 2:
                                                    System.out.println("LISTANDO FACTURAS ");
                                                    System.out.println("NUMERO FACT \t VALOR ");


                                                for(int i=0;i<facturas.length;i++){
                                                            if(facturas[i]!= null){
                                                                            
                                                        System.out.println( facturas[i]+"\t"+valorFact[i]);
                                                            }
                                                        else{}
                                                    
                                                        };
                                                 
                                            System.out.println("**********************************************");           
                                            System.out.println("HOLA SUPER ADMINISTRADOR, QUE DESEAS HACER HOY");
                                            System.out.println("1. Editar producto \n 2. Resumen de ventas \n 3. Salir");
                                            opad=read.nextInt();  

                                                    break;

                                                                                    
                                            default: System.out.println("opcion errada vuelve a intentarlo");
                                                    
                                                    break;
                               
                                                 }

                                   
                            }


                        }else{
                            System.out.println("Error en usuario y constraseña");
                               
                        }
                    
                        
                  
                    System.out.println("/////////////////////////////////////////////////////////");
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
                System.out.println("/////////////////////////////////////////////////////////");
                System.out.println("ESCOGE UNA OPCION \n 1. CLIENTE \n 2. ADMINISTRADOR \n 3. SALIR ");
                opIncial=read.nextInt();

            }


        

            } 
            
            System.out.println("****************THANKS FOR USE IT*********************");
            System.out.println("******************SOFTWARE 2MSJ***********************");
            System.out.println("ELABORATE FOR MARICELA, MARIAJOSE, JULIAN  Y SANTIAGO");


            read.close();   
    }
           
}
