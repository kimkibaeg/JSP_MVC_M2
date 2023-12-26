package test;

import board.BoardDAO;
import board.BoardDTO;

public class Board_Insert_Test02 {
	public static void main(String[] args) {
		
	
	
	
	// Board 테이블에 값이 잘 들어가는지 테스트 : BoardDTO, BoardDAO : insertBoard(DTO)
	
	// 1. BoardDTO 에 setter 를 사용해서 각 필드의 값을 insert
	BoardDTO dto = new BoardDTO();
	dto.setTitle("제목 입니다. - 26일");
	dto.setContent("내용 입니다. - 26일");
	dto.setWirte("김길동");
	
	// 2. BoardDAO의 insertBoard(DTO) 메소드 테스트
	BoardDAO dao = new BoardDAO();
	dao.insertBoard(dto);
	
	}
}
