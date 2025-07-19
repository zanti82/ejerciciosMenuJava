
import java.util.Scanner;


import javax.swing.JOptionPane;

public class ventaCliente {
    public static void main(String[] args) {
        
       
        

        Scanner read=new Scanner(System.in);

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


        


        

        System.out.println("**************************************");
        System.out.println("estas en la pagina de ventas, este es la lista de jeans:");
        System.out.println("**************************************");
        System.out.println("OPCION \t JEANS \t\t PRECIO ");
           
        for(int i=0; i<jeans.length;i++){

            if(jeans[i]!= null){
            System.out.println( i+"\t"+jeans[i]+"\t"+precio[i]);}
            else{ }
            

        }
                
            


       char op= JOptionPane.showInputDialog("Quieres agregar una compra S/N").charAt(0);
       
        double ventaTotal=0;
        int cont=0;

        while (op == 's' || op == 'S' ) {

            System.out.println("");
           
            int opcion=Integer.parseInt(JOptionPane.showInputDialog("la opcion del jean: "));
            
            int und= Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad"));

            double venta= und * precio[opcion];

            

            ventaTotal=venta+ventaTotal;
            cont++;

            op= JOptionPane.showInputDialog("Quieres agregar una compra S/N").charAt(0);
            
        }

        System.out.println("************************************");
        System.out.println("Usted compró:.... "+cont+" items .......total: " +ventaTotal+" $");
        
        String [] facturas=new String[20];
        Double [] valorFact= new Double[20];

        int contFac=0;

        facturas[contFac] = "1001";
        valorFact[contFac]= ventaTotal;

        contFac++;

        read.close();
    } 
    
}
