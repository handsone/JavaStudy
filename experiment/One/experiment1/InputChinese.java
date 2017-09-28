public class InputChinese   {
	public static void main( String args[] ){
		char ch1 = '研';
		int  ch2 = '好';
		int count = 5 ;
		System.out.println("输出五个石字旁的汉字：");
		for (int i = 0 ; i < count ; i ++){
			System.out.printf("%c(%d)\t", ch1 + i , ch1 + i);
		}
		System.out.println("\n输出五个女字旁的汉字：");
		for (int i = 0 ; i < count ; i ++){
			System.out.printf("%c(%d)\t", ch2 + i , ch2 + i  );
		}
	}
}

