package com.szkj.service;

import java.util.List;
import java.util.Map;

import com.szkj.bean.Lines;
import com.szkj.common.exception.LinesException;

public interface ILinesService {
	void addLines(Lines lines)throws LinesException;
	void addAllLine(Map<Long,Lines> lineList,long id)throws LinesException;
	void removeLine(int id)throws LinesException;
	void removeLineByOrderId(long id)throws LinesException;
	List<Lines> findByOrderId(Long id)throws LinesException;
}
