
public class Test01 {
	
	//입력 1 : 마크가 되는 문자열
	//입력 2 : 출력할 줄 수
	
	//<결과>
	//A
	//AA
	//AAA
	//AAAA
	//AAAAA
	
	//run("A",5)
	
	public void run(String mark, int lines) {
		for(int index=0 ; index<lines ; index=index+1) {
			for(int innerIndex=0 ; innerIndex<index+1 ; innerIndex++) {
				System.out.print(mark);
			}
			System.out.println("");
		}
	}
}