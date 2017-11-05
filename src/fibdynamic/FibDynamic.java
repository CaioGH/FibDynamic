/*
 * Caio Souza.
 * MAIN DYNAMIC FIBONACCI.
 * 
 */
package fibdynamic;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FibDynamic
    {

    public static void main(String[] args)
        {

        try
          {
            int x = 0;

            Scanner input = new Scanner (System.in);
            System.out.print ("Informe o valor do Fibonacci a ser calculado: ");
            x = input.nextInt ();

            //Maior número possível: 176293693.
           
            
            ArrayList ni = new ArrayList();
            ni.add (10);
            ni.add (20);
            ni.add (30);
            ni.add (40);
            ni.add (50);
            ni.add (60);
            ni.add (70);
            ni.add (80);
            ni.add (90);
            ni.add (100);
            
            //O gráfico só abrirá se o número informado for o que estão contidos no array.

            Process p = new Process ();
            p.fib (x);

            System.out.println ("Resultado do Fibonacci:" + p.fib (x));
            System.out.println ("Chamadas de função:" + p.countMoviment);

            if (ni.contains (x))

              {
                BarGraph bar = new BarGraph ("p", "ds");
                bar.CreateGraph ();
              }

          }

        catch (OutOfMemoryError f)
          {
            System.out.println ("O número informado é muito grande.");

          }

        catch (InputMismatchException e)
          {
            System.out.println ("Informe um número inteiro");

          }

        }

    }
