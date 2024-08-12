/**
 * @(#)ArrayFunHouse.java
 *
 * ArrayFunHouse application
 *
 * @author 
 * @version 1.00 2019/10/7
 */
 
public class ArrayFunHouse {
	public static void getSum(int[]x,int y,int z){
		int d=0;
		for(int p = y; p<=z; p++)
			d+=x[p];
			
		System.out.println("sum of spots " + y + " thru " + z + " = " + d);
	}
	public static void printArray(int[] s){
		for(int i=0;i<s.length;i++){
			if(i%5==0)
				System.out.println();
				
		System.out.printf("%5d",s[i]);
		}
		System.out.println();
	}
	public static int[] removeAll(int[]x,int y){
		int q=0;
		int r=0;
		
		int[] E = new int[ x.length-count(x,y)];
		for(r=0; r < x.length;r++)
	
	if(x[r]!=7){
		E[q]=	x[r];
		q++;
	}
	
	return E;
			}
	public static int count(int[]y,int x){
				int i = 0,b = 0;
			for(i = 0; i<y.length;i++)
				if(y[i]==x)
				b++;
				
				return b;
			}
	

    
    public static void main(String[] args) {
    
    int[] a = new int[]{7,4,10,0,1,7,6,5,3,2,9,7};
    int[] b = new int[]{7,4,2,7,3,4,6,7,8,9,7,0,10,7,0,1,7,6,5,7,3,2,7,9,9,8,7};
    System.out.println("Array A:");
    printArray(a);
    System.out.println();
    getSum(a,3,6);
    getSum(a,2,9);
    System.out.println();
    System.out.println("# of 4s = " + count(a,4));
    System.out.println("# of 9s = " + count(a,9));
    System.out.println("# of 7s = " + count(a,7));
    System.out.println();
    System.out.println("new array with all 7s removed: ");
    printArray(removeAll(a,7));
    System.out.println();
    System.out.println("# of 7s = " + count(removeAll(a,7),7));
    System.out.println("Array B: ");
    System.out.println();
    printArray(b);
    System.out.println();
    getSum(b,3,6);
    getSum(b,2,9);
    System.out.println();
    System.out.println("# of 0s = " + count(b,0));
    System.out.println("# of 3s = " + count(b,3));
    System.out.println("# of 7s = " + count(b,7));
    System.out.println();
    System.out.println("new array with all 7s removed: ");
    printArray(removeAll(b,7));
    System.out.println();
    System.out.println("# of 7s = " + count(removeAll(b,7),7));
    
    }
}
