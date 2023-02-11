public static void Bubble (int numbers [])

    {

      final int n = numbers.length;

      int aux;

     

      for (int i = 0 ; i < n-1 ; i++)

       {

         for (int j = 0 ; j < n-1-i ; j++)

          {

            if (numbers[j] > numbers[j+1])

            {

              aux = numbers[j];

              numbers[j] = numbers[j+1];

              numbers[j+1] = aux;

            }

          }

       }

    }

