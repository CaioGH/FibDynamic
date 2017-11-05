/*
 * Caio Souza.
 * COMPUTE DYNAMIC FIBONACCI.
 * 
 */


package fibdynamic;

public class Process
    {
      int countMoviment = 0;

    public long fib(int x)
        {
        
        long fib[] = new long[x + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < x + 1; i ++)
          {
            fib[i] = fib[i - 1] + fib[i - 2];
            countMoviment++;
          }
            return fib[x];
        }
    }
