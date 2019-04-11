package com.taobao.manager.service;

import com.taobao.common.pojo.EasyUIDataGridResult;

public interface ItemService {

    public EasyUIDataGridResult getItemList(Integer page, Integer rows);
}
