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