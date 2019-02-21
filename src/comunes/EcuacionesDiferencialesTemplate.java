package comunes;

/*
 * Codigo que usa el metodo de euler y RK de 4to
 * para encontrar y con x=1 para dy/dx = x * sqrt(1 + y*y)
 * con valores iniciales y=0 at x=0.
 */

public class EcuacionesDiferencialesTemplate
{
  public static final int iteraciones = 999;


  // La derivada dy/dx con valor x e y.
  public static double derivada(double x, double y)
  {
      // reemplazar esto, con la funcion que me toque 
    return x * Math.sqrt(1 + y*y);
  }


  public static void main(String[] argv)
  {
    // `h' o tamaño de iteracion
    double h = 1.0 / iteraciones;
    double k1, k2, k3, k4;
    double x, y;
    int i;


    // Metodo de euler
    // Inicializar Y
    y = 0;

    for (i=0; i<iteraciones; i++)
    {
      // iteraciones, actualizan "x" e incrementan "y"
      x = i * h;
      y += h * derivada(x, y);
    }

   // resultado con Euler
    System.out.println("Con Euler, el valor de y En x=1 is:");
    System.out.println(y);


    // Runge-Kutta
    y = 0;

    for (i=0; i<iteraciones; i++)
    {
      // Iterar, actualizar x
      x = i * h;

      k1 = h * derivada(x, y);
      k2 = h * derivada(x + h/2, y + k1/2);
      k3 = h * derivada(x + h/2, y + k2/2);
      k4 = h * derivada(x + h, y + k3);

      // Actualizar y
      y += k1/6 + k2/3+ k3/3 + k4/6;
    }

    // resultado con R-K
    System.out.println();
    System.out.println("Con Runge-Kutta 4to orden el valor en x=1 es:");
    System.out.println(y);


    // Computation by closed form solution
    // Print out the result that we get.
    System.out.println();
    System.out.println("The value really is:");
    y = (Math.exp(0.5) - Math.exp(-0.5)) / 2;
    System.out.println(y);
  }
  
  double Euler(){
    // `h' o tamaño de iteracion
    double h = 1.0 / iteraciones;
    double k1, k2, k3, k4;
    double x, y;
    int i;


    // Metodo de euler
    // Inicializar Y
    y = 0;

    for (i=0; i<iteraciones; i++)
    {
      // iteraciones, actualizan "x" e incrementan "y"
      x = i * h;
      y += h * derivada(x, y);
    }

   // resultado con Euler
    System.out.println("Con Euler, el valor de y En x=1 is:");
    System.out.println(y);
    
    return y;
}
  
  double RungeKutta(){
      // `h' o tamaño de iteracion
    double h = 1.0 / iteraciones;
    double k1, k2, k3, k4;
    double x, y;
    int i;
    
      y = 0;

    for (i=0; i<iteraciones; i++)
    {
      // Iterar, actualizar x
      x = i * h;

      k1 = h * derivada(x, y);
      k2 = h * derivada(x + h/2, y + k1/2);
      k3 = h * derivada(x + h/2, y + k2/2);
      k4 = h * derivada(x + h, y + k3);

      // Actualizar y
      y += k1/6 + k2/3+ k3/3 + k4/6;
    }

    // resultado con R-K
    System.out.println();
    System.out.println("Con Runge-Kutta 4to orden el valor en x=1 es:");
    System.out.println(y);
    
    return y;
  }
}
