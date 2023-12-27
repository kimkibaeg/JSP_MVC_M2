package test;

import board.BoardDAO;
import board.BoardDTO;

public class Board_deleteBoard_Test {
	public static void main(String[] args) {
		// 1. BoardDTO에 SEQ 의 값을 할당
		BoardDTO dto = new BoardDTO();
		dto.setSeq(5);
		
		// 2. BoardDAO에 deleteBoard(DTO) 
		BoardDAO dao = new BoardDAO();
		dao.deleteBoard(dto);

	}

}
