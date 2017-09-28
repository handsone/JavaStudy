import java.util.Arrays;
public class HandleLargeNumber {
	static void handleLargeNumber(int a[], int b[], int c[]){
		int k ;
		int j ;
		for (int i = a.length - 1 ; i >= 0 ; i --){
			j = (a[i] + b[i] + c[i]) / 10 ;
			k = (a[i] + b[i] + c[i]  ) % 10 ;
			if(i != 0){
				a[i-1] += j ;
			}
			c[i] = k ;
		}
	}
	public static void main(String args[]) {
		int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,8,7,6,5,4,3,2};
		int b[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1}; 
		int c[]= new int[a.length];
		int d[] = a;
		handleLargeNumber(a, b, c);
		NumberArrayToString function = new NumberArrayToString();
		System.out.println(function.toString(d) + "\n加上：\n" +  
		function.toString(b) + "\n等于：\n" +function.toString(c));
	}
}//end of "main"

class NumberArrayToString{
	String toString(int array[]){
		String S = "";
		boolean  flag  = false;
		for (int i = 0 ; i < array.length ; i++){
			if( array[i] == 0 && !flag){
				continue;
			}
			S += array[i];
			flag = true;
		}
		return S;
	}
}
