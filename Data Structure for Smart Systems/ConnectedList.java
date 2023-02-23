import javax.swing.;

 

class No

{

  double element;

  No prox;

 

  No (double elem)

   {

     element = elem;

     prox = null;

   }

}

 

class ConnectedList

{

  No first, last;

 

  ConnectedList ()

   {

     first = null;

     last = null;

   }

 

  public boolean EmptyList( )

   {

     if (first == null && last == null)

      {

        return true;

      }

     else

      {

        return false;

      }

   }

 

  public void InsertBeginning (No newNo)

   {

     if (EmptyList())

      {

        last = newNo;

      }

     else

      {

        newNo.prox = first;

      }

     first = newNo;

   }

 

  public void InsertEnd (No newNo)

   {

     if (EmptyList())

      {

        first = newNo;

      }

     else

      {

        last.prox = newNo;

      }

     last = newNo;

   }

 

  public int CountNodes ( )

   {

     int size = 0;

     No NoTemp = first;

 

     while (NoTemp != null)

      {

        size = size + 1;

        NoTemp = NoTemp.prox;

      }

     return size;

  }

 

  public void InsertInTheMiddle(No NovoNo, int position)

   {

     No NoTemp = first;

     int NbrNodes, posAux = 1;

 

     NbrNodes = CountNodes( );

     if (position <= 1)

      {

        InsertBeginning(NovoNo);

      }

     else

      {

        if (position > NbrNodes)

         {

           InsertEnd(NovoNo);

         }

        else

         {

           while (posAux < (position – 1))

            {

              NoTemp = NoTemp.prox;

              posAux = posAux + 1;

            }

           NovoNo.prox = NoTemp.prox;

           NoTemp.prox = NovoNo;

         }

      }

   }

 

  public void Remove (double element)

   {

     No NoTemp = first;

     No NoAnt = null;

 

     if (first.element == element)

      {

        first = first.prox;

      }

     else

      {

        while (NoTemp != null && NoTemp.element != element)

         {

           NoAnt = NoTemp;

           NoTemp = NoTemp.prox;

         }

        if(NoTemp != null)

         {

           NoAnt.prox = NoTemp.prox;

         }

        if (NoTemp == last)

         {

           last = NoAnt;

         }

      }

   }

 

  public void ElementBeginning( )

   {

     if (! EmptyList())

      {

        System.out.println("The first element is " +
                            first.element);

      }

     else

      {

        System.out.println(“Empty Connected List”);

      }

   }

 

  public void FinalElement( )

   {

     if (! EmptyList())

      {

        System.out.println("The last element is " +
                            last.element);

      }

     else

      {

        System.out.println(“Empty Connected List”);

      }

   }

 

  public No SearchNbr (double element)

   {

     int i = 1;

     No NoTemp = first;

 

     while (NoTemp != null)

      {

        if (NoTemp.element == element)

         {

           System.out.println("No " + NoTemp.element + " position "
                               + i);

           return NoTemp;

         }

        i = i + 1;

        NoTemp = NoTemp.prox;

      }

     return null;

   }

 

  public void ShowList( )

   {

     int i = 1;

     No NoTemp = first;

 

     while (NoTemp != null)

      {

        System.out.println("Element " + NoTemp.element + " position
                           " + i);

        NoTemp = NoTemp.prox;

        i = i + 1;

      }

   }

}

 

class Exemplo1

{

  public static void main (String arg [])

   {

     ConnectedList realList = new ConnectedList();

     int i;

     double num;

 

     for (i = 1 ; i <= 5 ; i++)

      {

        num = Double.parseDouble(JOptionPane.showInputDialog(
                                 “type a real number”));

        realList.InsertEnd(new No(num));

      }

     realList.ShowList();

     System.exit(0);

   }

}

