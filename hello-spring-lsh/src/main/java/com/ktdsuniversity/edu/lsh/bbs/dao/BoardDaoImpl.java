package com.ktdsuniversity.edu.lsh.bbs.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.edu.lsh.bbs.vo.BoardVO;

@Repository
public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao {
	
	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	
    @Override
    public int getBoardAllCount() {
        return getSqlSession().selectOne("getBoardAllCount");
    }

    @Override
    public List<BoardVO> getAllBoard() {
        return getSqlSession().selectList("getAllBoard");
    }
    
    @Override
    public int createNewBoard(BoardVO boardVO) {
        // getSqlSession().insert()는 insert한 Row의 개수를 반환한다.
        return getSqlSession().insert("createNewBoard", boardVO);
    }
    
    @Override
    public int increaseViewCount(int id) {
        return getSqlSession().update("increaseViewCount", id);
    }

    @Override
    public BoardVO getOneBoard(int id) {
        return getSqlSession().selectOne("getOneBoard", id);
    }
    
    @Override
    public int updateOneBoard(BoardVO boardVO) {
        return getSqlSession().update("updateOneBoard", boardVO);
    }
    
    @Override
    public int deleteOneBoard(int id) {
        return getSqlSession().delete("deleteOneBoard", id);
    }





}
