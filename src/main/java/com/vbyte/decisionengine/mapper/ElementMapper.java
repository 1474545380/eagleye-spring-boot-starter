package com.vbyte.decisionengine.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vbyte.decisionengine.rules.Element;

@Deprecated
public interface ElementMapper extends BaseMapper<Element> {

    int createTable();

    int deleteAll();

}
