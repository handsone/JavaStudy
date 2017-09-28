public class User{
	public static void main(String args[]){
		int a[] = {1,2,3,4,5};
		CD dataCD = new CD();
		CD.content = a ;
		CD.size  = a.length ;
		CD.print();
		Computer computerIMB = new Computer();
		Computer.putCD(dataCD);
		Computer.showData();
		Computer.addData(12);
		System.out.print("\n数据修改后,");
		Computer.showData();
		Computer.copytocd();
		CD.print();

		
	}
}
