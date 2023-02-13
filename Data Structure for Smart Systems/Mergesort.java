public static void Merge(int[] a, int beginning, int middle, int end)

  { 

    int n = end - beginning + 1;       

    int[] b = new int[n];

 

    int i1 = beginning;        

    int i2 = middle + 1;     

    int j = 0;            

 

    while (i1 <= middle && i2 <= end)

     { 

       if (a[i1] < a[i2])

        { 

          b[j] = a[i1];

          i1++;

        }

       else

        { 

          b[j] = a[i2];

          i2++;

        }

       j = j + 1;

     }

 

    while (i1 <= middle)

     { 

       b[j] = a[i1];

       i1 = i1 + 1;

       j = j + 1;

     }

    

    while (i2 <= end)

     { 

       b[j] = a[i2];

       i2 = i2 + 1;

       j = j + 1;

     }

 

    for (j = 0; j < n; j++)

     {

       a[beginning + j] = b[j];

     }

  }

 

public static void MergeSort(int[] a, int beginning, int end)

  { 

    if (beginning == end)

     {

       return;

     }

    int middle = (beginning + end) / 2;

    mergeSort(a, beginning, middle);

    mergeSort(a, middle + 1, end);

    merge(a, beginning, middle, end);

  }