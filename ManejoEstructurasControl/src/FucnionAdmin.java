import java.util.Scanner;


public class FucnionAdmin {
     public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        int op;

        String [] facturas=new String[20];
        Double [] valorFact= new Double[20];

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

        System.out.println("HOLA SUPER ADMIN, QUE QUERES AHCER HOY");
        System.out.println("1. Editar producto \n 2. Resumen de ventas \n 3. Salir");
        op=read.nextInt();

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
                                                
                                         System.out.println( facturas[i]+"\t"+valorFact[i]);}
                          
                        break;
                       
                       
                       
                
                                      
        
                default: System.out.println("see you");
                        break;
                }
                read.close();
        }



    

}

