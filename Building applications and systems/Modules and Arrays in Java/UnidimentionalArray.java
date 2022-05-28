import javax.swing.JOptionPane;

public class UnidimentionalArray {

public static void adding (int vetor[]){

    int sum=0;
    for(int i=0;i<vetor.length;i++){
         sum=sum+=vetor[i];
        }
        JOptionPane.showMessageDialog(null,"The sum is: "+sum);
}

public static int product(int vetor[]){

    int prod=1;
    for(int i=0;i<vetor.length;i++){
        prod=prod*vetor[i];
    }
    return prod;
}

    public static void main(String[] args) {

        int sum =0,vetor[]={2,4,6,8,10};
        int result;
        adding (vetor);
        result=product(vetor);
JOptionPane.showMessageDialog(null,"The productory is : "+result);
System.exit(0);
    }
}