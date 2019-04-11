package com.taobao.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taobao.common.pojo.EasyUIDataGridResult;
import com.taobao.manager.mapper.TbItemMapper;
import com.taobao.manager.pojo.TbItem;
import com.taobao.manager.pojo.TbItemExample;
import com.taobao.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    TbItemMapper itemMapper;

    @Override
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {

        if (page == null) page = 1;
        if (rows == null) rows = 30;

        PageHelper.startPage(page, rows);
        PageInfo<TbItem> pageInfo = new PageInfo<>(itemMapper.selectByExample(new TbItemExample()));
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setRows(pageInfo.getList());
        result.setTotal(pageInfo.getTotal());
        return result;
    }
}
