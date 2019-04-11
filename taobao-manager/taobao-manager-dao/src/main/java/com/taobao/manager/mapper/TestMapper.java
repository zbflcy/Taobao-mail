package com.taobao.manager.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 测试接口，查询当前时间
 */
public interface TestMapper {

    public String queryNow();
}
