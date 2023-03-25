class Pattern10{

      public static void main(String [] args)
       {
	      for(int i=1;i<=5;i++)
		  {
		    for(int j=5;j>=i;j--)
			  {
			  System.out.print(" ");
			  }
			  for (int k=4;k>=i;k--)
			  {  
              System.out.print("*");
			  }
	          for(int x=1;x<=i;x++)
		      {
		      System.out.print("*");
			  }
			  System.out.println();
		   }
		}
    }
		  

    	
    