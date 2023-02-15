import javax.swing.;

 

class FatorialP {

  static void fatP (int n, int x, int f)

    {

      if (x == 0 || x == 1)  {

          System.out.println("The factorial of " + n + " is " + f);
        }

      else

        {

          fatP(n, x-1, fx);

        }

    }

    public static void main (String arg [ ])

        {

            int nro;

 

            nro = Integer.parseInt(JOptionPane.showInputDialog(“Type a number that you want to know the factorial”));

            if (nro < 0)

               {

                  System.out.println (“This value is not valid, the number must be equal or bigger than zero”);

                  System.exit(0);

               }

            else

               {

                  fatP(nro, nro, 1);

               }

            System.exit(0);

         }

   }