import javax.swing.*;

 

class Potentiation

   {

      static int pot(int base , int exp)

         {

            if (base == 0) 

               {

                  return 0;

               }

            else

               {

                  if (exp == 0)

                     {

                        return 1;

                     }

                  else

                     {

                        return pot(base , exp-1) * base; 

                     }

               }

         } 


      public static void main(String entry [ ])

         {

            int b, e, p;

 

            b = Integer.parseInt(JOptionPane.showInputDialog(“Type a base number to see the potentiation”));

            e = Integer.parseInt(JOptionPane.showInputDialog(“Type the expoent number to calculate the potentiation”));

            if ( b < 0 || e < 0)

               {

                  System.out.println(“Invalid number, it must be equal or bigger than zero”);

               }

            else

               {

                  p = pot(b,e);

                  System.out.println(b + " elevated to " + e + " is equal to " + p);

               }

            System.exit(0);

         } 

   } 