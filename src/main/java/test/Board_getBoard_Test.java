package test;

import board.BoardDAO;
import board.BoardDTO;

public class Board_getBoard_Test {

	public static void main(String[] args) {
		// 1. DTO에 조회할 SEQ 값만 할당 후 dao.getBoard(DTO)
		BoardDTO dto = new BoardDTO();
		dto.setSeq(5);
		
		// 2. DAO 메소드 호출 getBoard(DTO)
		BoardDAO dao = new BoardDAO();
		
		// 리턴으로 돌려 받는 변수 선언
		BoardDTO board = new BoardDTO();
		
		board = dao.getBoard(dto);
		
		System.out.println(board);
		
		
	}

}
