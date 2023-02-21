import javax.swing.*;

 

class Queue

{

  int size, beginning, end, total;

  double vector[];

  Queue(int siz)

   {

     beginning = 0;

     end = 0;

     total = 0;

     size = siz;

     vector = new double[siz];

   } 

 

  public boolean EmptyQueue( )

   {

     if (total == 0)

      {

        return true;

      }

     else

      {

        return false;

      }

   }

 

  public boolean FullQueue( )

   {

     if (total >= size)

      {

        return true;

      }

     else

      {

        return false;

      }

   }

 

  public void Row (double element)

   {

     if (! FullQueue( ))

      {

        vector[end] = element;

        end = end + 1;

        total = total + 1;

        if (end >= size)

         {

           end = 0;

         }

      }

     else

      {

        System.out.println (“Full Queue”);

      }

   }

 

  public double ToUnset ()

   {

     double unset = 0.0;

     if (EmptyQueue())

      {

        System.out.println(“Empty Queue”);

      }

     else

      {

        unset = vector[beginning];

        beginning = beginning + 1;

        total = total – 1;

        if (beginning >= size)

         {

           beginning = 0;

         }

      }

     return unset;

   }

 

  public void ElementBeginning( )

   {

     if (!EmptyQueue())

      {

        System.out.println("The first element is "+ vector[beginning]);

      }

     else

      {

        System.out.println(“Empty Queue”);

      }

   }

 

  public void ShowQueue( )

   {

     int i, aux;

 

     aux = beginning;

     for (i = 1 ; i <= total ; i++)

      {

        JOptionPane.showMessageDialog(null, "Element " + vector[aux]
                                      + " position " + i);

        aux = aux + 1;

        if (aux >= size)

         {

           aux = 0;

         }

      }

   }

}

 

class Exemplo1

 {

   public static void main (String arg [])

    {

      Queue realQueue = new Queue(5);

      double entry = 0.0;

      int i;

 

      for (i = 0 ; i < 5 ; i++)

       {

         entry = Double.parseDouble(JOptionPane.showInputDialog(
                                      “Type a real value”));

         realQueue.Row(entry);

       }

      realQueue.ShowQueue( );

      System.exit(0);

    }

 }