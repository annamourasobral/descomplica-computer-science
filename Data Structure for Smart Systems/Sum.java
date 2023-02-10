import javax.swing.*;

class Sum {
    public static void main(String args []){
        int MatSum[][], a, b, sum=0;
        MatSum = new int [10][12];

        for (a=0,a<=9;a++){
            for (b=0,b<=11;b++){
                MatSum[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Type a integer"));
                sum = sum + MatSum[a][b];
            }
        }
    }

    System.out.println("The sum of the 120 typed integers is:" + sum);
    System.exit(0);
}