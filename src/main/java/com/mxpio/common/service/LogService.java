package com.mxpio.common.service;

import org.springframework.stereotype.Service;

import com.mxpio.common.domain.LogDO;
import com.mxpio.common.domain.PageDO;
import com.mxpio.common.utils.Query;
@Service
public interface LogService {
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
