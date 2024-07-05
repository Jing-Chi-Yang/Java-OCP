package ch02;

public class Tag {

	public static void main(String[] args) {
		tag:
	         for (int i=1;i<=4;i++){
	            System.out.println("Start:"+i);
	            for (int k = 1; k<=3;k++){
	                System.out.print(i+":"+k+" ");
	                if (i == 2){
	                	//break tag;
	                    continue tag;
	                }
	            }          
	            System.out.println();
	            System.out.println("End:"+i);
	        }
	    }
	    
	}

