package com.mxpio.common.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.mxpio.common.domain.TaskDO;

/**
 * 
 * @author mxpio
 * @email i@mxpio.com
 * @date 2017-10-03 15:45:42
 */
@Mapper
public interface TaskDao {

	TaskDO get(Long id);
	
	List<TaskDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(TaskDO task);
	
	int update(TaskDO task);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
