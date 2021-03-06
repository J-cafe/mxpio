package com.mxpio.common.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mxpio.common.dao.LogDao;
import com.mxpio.common.domain.LogDO;
import com.mxpio.common.domain.PageDO;
import com.mxpio.common.service.LogService;
import com.mxpio.common.utils.Query;

@Service
public class LogServiceImpl implements LogService {
	@Autowired
	LogDao logMapper;

	@Override
	public PageDO<LogDO> queryList(Query query) {
		int total = logMapper.count(query);
		List<LogDO> logs = logMapper.list(query);
		PageDO<LogDO> page = new PageDO<>();
		page.setTotal(total);
		page.setRows(logs);
		return page;
	}

	@Override
	public int remove(Long id) {
		int count = logMapper.remove(id);
		return count;
	}

	@Override
	public int batchRemove(Long[] ids){
		return logMapper.batchRemove(ids);
	}
}
