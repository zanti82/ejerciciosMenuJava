import java.util.Scanner;

public class InfoClientesFinalSemestre1 {
    
    //PROGRAMA PARA PEDIR INFORMACION CON UN INDICE AL INICIO
 public static void main(String[] args)
      {
        Scanner read=new Scanner(System.in);

        String nomart;
        Double vart, promventas;
        int cart,op,i, conVen=0;
        double totalVentas=0, totalCuotas=0;

    
        do{
            System.out.println("*************************************************");
            System.out.println("                                                 ");
            System.out.println("*************************************************");
            System.out.println("                                                 ");


        System.out.println("**********BIENVENIDOS A VIVOTRAVEL**********");
        System.out.println("                                                 ");

        System.out.println("ELIGE LA OPCION QUE NECESITES");
        System.out.println("                                                 ");

        System.out.println("1.\t Ventas regulares\n" + //
                            "2.\t Ventas a crédito\n" + //
                            "3.\t Clientes registrados\n" + //
                            "4.\t Salir\n" 
                            );
        
        op=read.nextInt();

        switch (op) {
            case 1: {

                char rpta;
                System.out.println("RESGITRO DE VENTAS\n"
                                    +"quieres ingresera una venta?  S para si N para terminar "  );
                rpta=read.next().charAt(0);

                while (rpta=='S'|| rpta=='s') {
                    
                    
                        
                        System.out.println("Nombre el paquete turistico ");
                        nomart=read.next();
                        System.out.println("Valor del paquete turistico");
                        vart=read.nextDouble();
                        System.out.println("ingresa la cantidad de pasajeros: ");
                        cart=read.nextInt();

                        System.out.println("Nombre: "+nomart);
                        double vbruto=vart*cart;
                        System.out.println("Valor bruto: "+vbruto+" $");
                        double iva=vbruto*0.19;
                        System.out.println("IVA: "+iva+" $");
                        double Vneto= vbruto+iva;
                        System.out.println("El valor neto a pagar es: "+Vneto+" $");

                        totalVentas= Vneto+totalVentas;
                        conVen=conVen+1;

                        System.out.println("                                                 ");
                        System.out.println("RESGITRO DE VENTAS\n"
                                                +"quieres ingresera una venta?  S para si N para terminar "  );
                            rpta=read.next().charAt(0);
                        }

                promventas=totalVentas/conVen;

                System.out.println("*************************************************");
                System.out.println("                                                 ");

                System.out.println("el promedio de ventas hoy es de: "+promventas+" $");




            }
                
                break;

            case 2:{

                System.out.println("PAGOS DE CREDITOS USUARIOS");
                
                System.out.println("---------------");

                System.out.println("ingrese el nombre del cliente: ");
                String nomCliente=read.next();
                System.out.println("ingrese el total del credito: ");
                double credito=read.nextDouble();
                System.out.println("ingreses la cantidad de cuotas pagadas: ");
                int cuotas=read.nextInt();
                System.out.println("                                                 ");
               
                for(i=1;i<=cuotas; i++){
                    System.out.println("ingreses el valor de la cuota "+i);
                    double cuota=read.nextDouble();
                    totalCuotas=cuota+totalCuotas;

                }
                System.out.println("                                                 ");
                System.out.println("Usted "+nomCliente+" ha pagado "+totalCuotas+" $");
                System.out.println("Su saldo restante a pagar es de "+(credito-totalCuotas)+ " $");


            }
                break;

            case 3:{

                System.out.println("CLIENTES REGISTRADOS Y CREDITOS");
                
                System.out.println("---------------");
                System.out.println("Cuantos registro va a realizar?:");
                int a=read.nextInt();
        
                String[][] credito=new String[a][2];
        
                
                for(int j=0;j<a;j++){
                    System.out.println("ingrese el "+(j+1)+" nombres");
                    
                    credito[j][0]=read.next();   
        
                    System.out.println("ingrese el "+(j+1)+" valor");
                    credito[j][1]=read.next();  
                }
        
                System.out.println("usted ingreso");
        
                for(int j=0;j<a;j++){
                    System.out.println("nombre: "+ credito[j][0] + " credito:"+credito[j][1]) ;
                    
                } 
                // organizacion de menor a mayor

                String[][] aux=new String[2][2];

                //el programa burbuja para ayudar a organizar vectores

                for(int k=0;k<a;k++){
                    for(int j=1;j<a;j++){
                        if (Integer.parseInt(credito[j-1][1])>Integer.parseInt(credito[j][1])) {

                                aux[0][0]=credito[j][1];
                                aux[1][1]=credito[j][0];

                                credito[j][1]=credito[j-1][1];
                                credito[j][0]=credito[j-1][0];

                                credito[j-1][1]=aux[0][0];
                                credito[j-1][0]=aux[1][1];

                                System.out.println("aux"+aux[0][0]);
                            
                        }
                        
                        
                    } 
                }
                for(int j=0;j<a;j++){
                    System.out.println("nombre: "+ credito[j][0] + " credito:"+credito[j][1]) ;
                    
                } 


            }
                break;

            case 4: System.out.println("Gracias por usar nuestro software ");
                break;
        
            default: System.out.println("opcion erronea, vuelva a intentarlo");
                break;
        }
    }while (op!=4); 

        read.close();
        
    }
    
    
}
