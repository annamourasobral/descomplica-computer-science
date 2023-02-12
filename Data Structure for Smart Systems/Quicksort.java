public static void Quicksort(int p, int q, int vector[])

   {

     int x;

 

     if (p < q)

      {

        x = partition(p, q, vector);

        quicksort(p, x - 1, vector);

        quicksort(x + 1, q, vector);

      }

   }

 

public static int partition(int p, int q, int vector[])

   {

     int j = p - 1;

     int temp, aux = vector[q];

 

     for (int i = p; i <= q; i++)

      {

        if (vector[i] <= aux)

         {

           j++;

           temp = vector[i];

           vector[i] = vector[j];

           vector[j] = temp;

         }

      }

     return j;

   }