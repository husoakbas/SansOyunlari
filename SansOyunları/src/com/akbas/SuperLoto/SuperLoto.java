package com.akbas.SuperLoto;

	import java.util.Random; //SÜPER LOTO
	import java.util.Scanner;

	public class SuperLoto {
		
	public static int kontrol (int [] dizi) {
	    	
	    	int temp;
	    	
	    	for(int i=0; i<5; i++) {
	  	      for(int j=i+1; j<6; j++) {
	  	    	   
		  	    	  temp=dizi[i];

	  	    	   if(dizi[j]==temp) {
	  	    		   
	                 return -1;
	  	    	   }
	  	    	   
	  	        }
	   	      
	   	      }
	          return 1;
	    }

	 public static void sirala(int [] dizi) {
		   
			 int temp1;
		 
		     for (int i=0; i<5; i++) {
	     	  
	     	  for(int j=i+1; j<6; j++) {
	     		  
	     		  if (dizi[i]>dizi[j]) {
	     			  
	    			  temp1 = dizi[i];
	     			  dizi[i] = dizi[j];
	     			  dizi[j] = temp1;
	     			  
	     		  }
	     	  }
	     		  
	       }
	   	    	  
	   	    for(int i=0;i<6;i++) {
	   	    	
	     	      System.out.print(" "+dizi[i]);
	     	      
	     	      if(i+1<6) {
	     	    	  
	     	        System.out.print(" "+"-");	  
	     	      }
	     	      
	     	      try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

	   	    }
	 }
	 
	    public static void main(String[] args) {

		Random r = new Random();
		
		int dizi[] = new int [6];

		 Scanner s = new Scanner(System.in);
		 System.out.println();
		 System.out.println("       "+"SÜPER LOTO");
		 System.out.println("*****************************");
	     System.out.print("Kaç kolon oynanacak = ");
	    
	       int kolonSayisi = s.nextInt();
	       
	        System.out.println();
	        System.out.println();
	     
	     int i=1;
	     
	     if(kolonSayisi>1) {
	    	 
			while ( i<=  kolonSayisi) {
				
				for(int a=0; a<6; a++ ) {
					
					dizi[a]=r.nextInt(60)+1;
				}	
				
				if (kontrol(dizi)==-1) {
					continue;
				}
				
				else{
					System.out.println("        "+i+". KOLON:");
					System.out.println("*****************************");
					sirala(dizi);
					System.out.println();
					System.out.println();
					i++;
				}
			}	
		 }
	     
	     else if(kolonSayisi==1) {
	    	 
	    	 while (true) {
	 			
	 			for(int a=0; a<6; a++ ) {
	 				
	 				dizi[a]=r.nextInt(60)+1;
	 			}	
	 			
	 			if (kontrol(dizi)==-1) {
	 				continue;
	 			}
	 			
	 			else{
	 				System.out.println("       "+i+". KOLON:");
	 				System.out.println("*****************************");
	 				sirala(dizi);
	 				return;
	 				
	 			}
	 		}	
	    	 
	     }
	     
	    else {
	    	 
	         System.out.println("Hatalý giriþ yaptýn. Tekrar dene...");	 
	     }
	     
	   }
	}



