import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class sistemasRambed {
    public static void main(String[] args) {
       
        //BLOQUE PARA MAPS DE USUARIO Y CONTRASEÑA

         Map<String, String > admin= new HashMap<>(); // aca creo un diccionario de administradores
        Map<String, String > user= new HashMap<>(); // aca creo un diccionario de usuarios

        // BLOQUE FCATURAS
        int contFac=0;
        String [] facturas=new String[20];
        Double [] valorFact= new Double[20];

        Scanner read=new Scanner(System.in);

        //BLOQUE DE REFERECIAS DE VENTAS 
        String[] jeans= new String[20];
        Double[] precio= new Double[20];

        jeans[0]="JeanClasico";
        jeans[1]="Cargo/dril";
        jeans[2]="Cargo Jean";
        jeans[3]="PnatRibete";
        jeans[4]="JeanBaggy";

        precio[0]= 80000.0;
        precio[1]= 99000.0;
        precio[2]= 99000.0;
        precio[3]= 80000.0;
        precio[4]= 85000.0;

       
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
                        String valuename= user.get(keyUname);
                        if (valuename.equals(valueUpass)) {
                            System.out.println("loggin existoso");

                            //BLOQUE VENTAS DEL CLIENTE

                                    System.out.println("**************************************");
                                    System.out.println("estas en la pagina de ventas, este es la lista de jeans:");
                                    System.out.println("**************************************");
                                    System.out.println("OPCION \t JEANS \t\t PRECIO ");
                                    
                                    for(int i=0; i<jeans.length;i++){

                                        if(jeans[i]!= null){
                                        System.out.println( i+"\t"+jeans[i]+"\t"+precio[i]);}
                                        else{ }
                                        

                                    }
                                            
                                        
                                 System.out.println("**************************************");

                                System.out.println("Quieres agregar una compra S/N");
                                char op= read.next().charAt(0);
                                
                                    double ventaTotal=0;
                                    int cont=0;

                                    while (op == 's' || op == 'S' ) {

                                        System.out.println("");
                                        
                                        System.out.println("escoge el nuemro de la opcin del jean: ");
                                        int opcion=read.nextInt();
                                        System.out.println("cuantas unidades quieres?:  ");
                                        int und= read.nextInt();

                                        double venta= und * precio[opcion];

                                        

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

                                    contFac++;

                                 //FIN BLOQUE VENTAS DEL CLIENTE


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

                            //BLOQUE ADMIN
                            System.out.println("HOLA SUPER ADMIN, QUE DESEAS HACER HOY");
                            System.out.println("1. Editar producto \n 2. Resumen de ventas \n 3. Salir");
                            int op=read.nextInt();

                            while (op!=3) {
                                
                            
                    
                            switch (op) {
                                    case 1:
                                            System.out.println("este es el listado de los jeans ");
                                            System.out.println("OPCION \t JEANS \t\t PRECIO ");
                                            for(int i=0;i<jeans.length;i++){
                                                    if(jeans[i]!= null){
                                                            System.out.println( i+"\t"+jeans[i]+"\t"+precio[i]);}
                                                    else{ }
                                                    }
                                            
                                            System.out.println("seleccion la opcion");
                                            System.out.println("1. Editar productos \n 2. agregar");
                                            op=read.nextInt();
                    
                                            switch (op) {
                                                    case 1:
                                                            System.out.println("introduce la posicion que deseas editar");
                                                            int pos=read.nextInt();
                    
                                                            System.out.println("ingresa el nombre: ");
                                                            String cambioNom=read.next();
                                                            jeans[pos]=cambioNom;
                    
                                                            System.out.println("ingresa el valor: ");
                                                            double  cambioPrec=read.nextDouble();
                                                            precio[pos]=cambioPrec;
                    
                                                            System.out.println( "actualizacion= "+jeans[pos]+"....."+precio[pos]);
                    
                                                                    
                                                                    break;
                    
                                                    case 2:
                                                            System.out.println("ingresa la posicion del 6 al 20");
                                                            pos=read.nextInt();
                                                           
                                                            System.out.println("ingresa el nombre: ");
                                                            String newNom=read.next();
                                                            jeans[pos]=newNom;
                    
                                                            System.out.println("ingresa el valor: ");
                                                            double  newPrec=read.nextDouble();
                                                            precio[pos]=newPrec;
                    
                                                            System.out.println( "ingresaste= "+jeans[pos]+"....."+precio[pos]);
                    
                    
                                                            
                                                                    break;
                                            
                                                    default:
                                                            break;
                                                    }
                                            
                    
                    
                                            break;
                    
                                    case 2:
                                             System.out.println("LISTANDO FACTURAS ");
                                             System.out.println("NUMERO FACT \t VALOR ");
                                            for(int i=0;i<facturas.length;i++){
                                                if(facturas[i]!= null){
                                                                    
                                                   System.out.println( facturas[i]+"\t"+valorFact[i]);}
                                                else{}

                                                }
                                            break;
                                           
                                           
                                           
                                    
                                                          
                            
                                    default: System.out.println("see you");
                                            break;
                                    }
                                }


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
