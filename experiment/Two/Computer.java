public class Computer{
	static 	CD includeCD;
	static 	void putCD(CD cd){
		includeCD = cd ;
	}
	void copyToComputer(){
		System.out.println("将dataCD的内容复制到计算机");
	}
	static void addData(int m){
		System.out.printf("\nComputerIMB的每个数据增加%d",m);
		for ( int i = 0 ; i < CD.content.length ; i ++ ){
			CD.content[i] += m ;
		}
	}
	static void copytocd(){
		System.out.println("\ncomputerIMB将增值后的数据复制到CD：dataCD");
	}
	static void showData(){
		System.out.println("computerIMB上的内容:");
		for( int i = 0 ; i <CD.content.length ; i ++ ){
			System.out.printf("%d   ",CD.content[i]);
		}
	}
}
