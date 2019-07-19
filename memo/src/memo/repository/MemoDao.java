package memo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import memo.entity.MemoDto;

public class MemoDao {
	//슬롯
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//메모 등록 메소드
	public void write(String content) {
		String sql = "insert into memo values(memo_seq.nextval, ?, sysdate)";
		Object[] param = {content};
		jdbcTemplate.update(sql, param);
	}
	
	//리스트 메소드
	public List<MemoDto> list() {
		String sql = "select * from memo";
		RowMapper<MemoDto> mapper = new RowMapper<MemoDto>() {
			
			@Override
			public MemoDto mapRow(ResultSet rs, int index) throws SQLException {
				MemoDto memoDto = new MemoDto();
				memoDto.setNo(rs.getInt("no"));
				memoDto.setContent(rs.getString("content"));
				memoDto.setWhen(rs.getString("when"));
				return memoDto;
			}
		};
		List<MemoDto> list = jdbcTemplate.query(sql, mapper);
		return list;
	}
}
