/*package second.repair.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import second.common.dao.AbstractDAO;

@Repository("sampleDAO")
public class RepairDAO extends AbstractDAO{
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("sample.selectBoardList", map);
	}
	
	public void insertBoard(Map<String, Object> map) throws Exception{
	    insert("sample.insertBoard", map);
	}

	
	
}
*/