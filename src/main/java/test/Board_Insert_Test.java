package test;

import board.BoardDAO;
import board.BoardDTO;

public class Board_Insert_Test {

	public static void main(String[] args) {
		
		// 1. DTO 객체를 생성 후 값 입력
		BoardDTO dto = new BoardDTO();
		
			// DTO 에 setter 를 사용해서 값을 입력
			dto.setTitle("테스트 제목 1");
			dto.setWirte("user");
			dto.setContent("테스트 글 내용");
		
		// 2. DAO 객체에 insertBoard(dto)
		BoardDAO dao = new BoardDAO();
		
		dao.insertBoard(dto);
		
		

	}

}
