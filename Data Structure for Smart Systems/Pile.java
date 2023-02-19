import javax.swing.;

class Exemple

 {

   public static void main (String arg [])

    {

      Pila intPile = new Pile(5);

      int i;

      int entry;

 

      for (i = 1 ; i <= 5 ; i++)

       {

         entry = Integer.parseInt(JOptionPane.showInputDialog(

                                      “Type an integer”));

         intPile.Pileup(entry);

       }

      intPile.ShowPile( );

      System.exit(0);

    }

 }

 

class Pile

 {

   int size;

   int top;

   int vector [ ];

 

   Pile (int siz)

    {

      top = -1;

      size = siz;

      vector = new int[siz];

    }

 

   public boolean PileEmpty( )

     {

       if (top == -1)

        {

          return true;

        }

       else

        {

          return false;

        }

     }

 

    public boolean PileCheia( )

     {

       if (top >= size-1)

        {

          return true;

        }

       else

        {

          return false;

        }

     }

 

    public void Pileup (int element)

     {

       if (! PileCheia( ))

        {

          top = top + 1;

          vector[top] = element;

        }

       else

        {

          System.out.println ("Pile Full");

        }

     }

 

    public int Unset ()

     {

       int unsetPile = 0;

 

       if (PileEmpty())

        {

          System.out.println(“Empty Pile”);

        }

       else

        {

          unsetPile = vector[top];

          top = top - 1;

        }

       return unsetPile;

     }

 

    public void TopElemet( )

     {

       if (top >= 0)

        {

          System.out.println("The top element is " + vector[top]);

        }

       else

        {

          System.out.println(“Empty pile”);

        }

     }

 

    public void ShowPile( )

     {

       int i;

 

       for (i = top ; i >= 0 ; i–)

        {

          System.out.println(“Element " + vector[i] + " position " + i +

                              " of Pile”);

        }

     }

