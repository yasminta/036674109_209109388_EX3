package Root_classificatin.Root_classificatin;

/*version 1*/

enum Root_Types {
      No_roots,
      Not_quadratic,
      Equal_roots,
      Two_roots,
      ERROR
      
	}

//Roots class source from example
class Roots
{
  
   private static Root_Types roots;
   
   private static boolean out_of_Range(double x, double a, double b) {
       return !(x >= a && x <= b);
   }
   
   
   public static void calculate_roots(double a, double b, double c)
   {
      double q;
      
      q = b*b - 4*a*c;
     
      if (out_of_Range(a, 0, 50)|| out_of_Range(b, 0, 50)||out_of_Range(c, 0, 100)) {
    	  roots = Root_Types.ERROR;
    	  return;
      }
      
      if (a != 0) {
	      if(q>0 )
	      {
	    	  /*tow roots*/
		      roots = Root_Types.Two_roots; 
	      }
	      else if(q==0)
	      {
		      // the equation has exactly one root
		     
		     /*equal roots*/
		      roots = Root_Types.Equal_roots; 
		      
	      } 
	      else
	      {
		      // the equation has no roots if b^2 < 4ac
		     /*no root*/
		      roots = Root_Types.No_roots;
	      }
      }
      else {
    	  /*no quadretic*/
    	  roots = Root_Types.Not_quadratic; 
      }
   }

    public static Root_Types root_types()
    {
    	
    	return roots;
    }

 }
