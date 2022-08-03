package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoradMapperTests {

	@Setter(onMethod_ = {@Autowired})
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
//	@Test
//	public void testInsertSelectKey() {
//		BoardVO board = new BoardVO();
//		board.setTitle("new title");
//		board.setContent("new content...........");
//		board.setWriter("유저02");
//		
//		mapper.insertSelectKey(board);
//		
//		log.info(board);
//	}
	
//	@Test
//	public void testRead() {
//		
//		// 존재하는 게시물 번호로 테스트
//		BoardVO board = mapper.read(3L);
//		
//		log.info(board);
//	}
	
//	@Test
//	public void testDelete() {
//		log.info("Delete Count : " + mapper.delete(8L));
//	}
	
//	@Test
//	public void testUpdate() {
//		BoardVO board = new BoardVO();
//		board.setBno(7L);
//		board.setTitle("수정된 제목");
//		board.setContent("수정된 내용");
//		board.setWriter("뉴 피플");
//		
//		int count = mapper.update(board);
//		log.info(" Update Count : " + count);
//		log.info(board);
//	}
}
