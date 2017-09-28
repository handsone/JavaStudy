public class CD {
	static	int content[] ;
	static	int size      ;
	int getSize(){
		return content.length ;
	}
	void setSize(int a){
		size = a;	
	}
	void getContent(int b[]){
		b = content ;
	}
	 static void print(){
		System.out.println("\ndataCD上的内容：" );
		for (int i = 0 ; i < content.length ; i ++){
			System.out.printf("%d    ", content[i]);
		}
		System.out.println();
	}
}
