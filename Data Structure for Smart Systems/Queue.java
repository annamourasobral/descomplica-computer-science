import javax.swing.*;

 

class Fila

{

  int tamanho, inicio, fim, total;

  double vetor[];

  Fila(int tam)

   {

     inicio = 0;

     fim = 0;

     total = 0;

     tamanho = tam;

     vetor = new double[tam];

   } 

 

  public boolean FilaVazia( )

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

 

  public boolean FilaCheia( )

   {

     if (total >= tamanho)

      {

        return true;

      }

     else

      {

        return false;

      }

   }

 

  public void Enfileirar (double elemento)

   {

     if (! FilaCheia( ))

      {

        vetor[fim] = elemento;

        fim = fim + 1;

        total = total + 1;

        if (fim >= tamanho)

         {

           fim = 0;

         }

      }

     else

      {

        System.out.println (“Fila Cheia”);

      }

   }

 

  // retorna o valor desenfileirado

  public double Desenfileirar ()

   {

     double desenfileirado = 0.0;

     if (FilaVazia())

      {

        System.out.println(“Fila Vazia”);

      }

     else

      {

        desenfileirado = vetor[inicio];

        inicio = inicio + 1;

        total = total – 1;

        if (inicio >= tamanho)

         {

           inicio = 0;

         }

      }

     return desenfileirado;

   }

 

  public void ElementoInicio( )

   {

     if (!FilaVazia())

      {

        System.out.println("O primeiro elemento é "+ vetor[inicio]);

      }

     else

      {

        System.out.println(“Fila Vazia”);

      }

   }

 

  public void MostrarFila( )

   {

     int i, aux;

 

     aux = inicio;

     for (i = 1 ; i <= total ; i++)

      {

        JOptionPane.showMessageDialog(null, "Elemento " + vetor[aux]
                                      + " posição " + i);

        aux = aux + 1;

        if (aux >= tamanho)

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

      Fila realFila = new Fila(5);

      double entrada = 0.0;

      int i;

 

      for (i = 0 ; i < 5 ; i++)

       {

         entrada = Double.parseDouble(JOptionPane.showInputDialog(
                                      “Digite um valor real”));

         realFila.Enfileirar(entrada);

       }

      realFila.MostrarFila( );

      System.exit(0);

    }

 }