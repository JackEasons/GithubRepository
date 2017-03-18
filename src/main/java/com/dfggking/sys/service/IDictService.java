package com.dfggking.sys.service;

import java.util.List;

import com.dfggking.sys.domain.DicDO;
import com.dfggking.sys.dto.DictDTO;

public interface IDictService {
	
	/**
	 * 
	 * <p>查询字典表全部数据</p>
	 * <pre></pre>
	 * @return List<DictDTO>
	 * @author jinyf   
	 * @date 2017年2月24日 下午2:09:36 
	 * @since 1.0
	 */
	List<DicDO> listDict();
}