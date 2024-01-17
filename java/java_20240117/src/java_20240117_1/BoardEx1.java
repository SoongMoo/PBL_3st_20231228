package java_20240117_1;

public class BoardEx1 {

	public static void main(String[] args) {
		Board board1 = new Board(); 
		board1.num = 1;
		board1.boardWriter = "이숭무";
		board1.boardSubject = "자바는 잡아라";
		board1.boardContent = "자바는 재밌어요...";
		
		Board board2 = new Board(); 
		board2.num = 2;
		board2.boardWriter = "김찬중";
		board2.boardSubject = "제목";
		board2.boardContent = "내용";
		
		System.out.println(board2.boardWriter);
		
		
		Board board3 = new Board(); 
		Board board4 = new Board(); 
		Board board5 = new Board(); 
	}

}
