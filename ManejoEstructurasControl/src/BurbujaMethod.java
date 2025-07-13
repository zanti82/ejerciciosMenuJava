public class BurbujaMethod {

    //este programa sirve para organizar vectores en orden ascendente
    public static void main(String[] args) {
        int[] credito={20000,500,10000,5000, 50000,100000,3000, 40000};
        int a =credito.length;
        int[] aux=new int[2];

        for(int i=0;i<a;i++){
            System.out.println("ventor "+i+ " = " +credito[i]);
        }

        for(int k=0;k<a;k++){
            for(int j=1;j<a;j++){
                if (credito[j-1]>credito[j]) {

                        aux[0]=credito[j];
                        credito[j]=credito[j-1];
                        credito[j-1]=aux[0];
                        System.out.println("ronda cambio");
                    
                }
             } 
             
             for(int i=0;i<a;i++){
                System.out.println("ventor "+i+ " = " +credito[i]);
                }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++el ultimo vector es+++++++++++++++++++++++++++++++");
        for(int i=0;i<a;i++){
            System.out.println("ventor "+i+ " = " +credito[i]);
            }

        
    }
}
