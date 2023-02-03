import javax.swing.*;



public class GradeAvarage {

  public static void main(String[] args) {

    int vectorsAvarage [ ], i, sum = 0, avarage;

    vectorsAvarage = new int [50];



    for (i = 0; i <= 49; i++){

      vectorsAvarage [i] = Integer.parseInt(JOptionPane.showInputDialog("Type a integer"));

      sum += vectorsAvarage [i];

    }

    avarage = sum/50;

    System.out.println("The avarage of 50 typed integer is: " + avarage);

    System.exit(0);

  }

}