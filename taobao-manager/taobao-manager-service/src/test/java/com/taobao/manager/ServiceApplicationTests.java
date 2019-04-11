package com.taobao.manager;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taobao.manager.mapper.TbItemMapper;
import com.taobao.manager.pojo.TbItem;
import com.taobao.manager.pojo.TbItemExample;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceApplicationTests {

    @Autowired
    TbItemMapper tbItemMapper;

    @Test
    @Ignore
    public void contextLoads() {
        PageHelper.startPage(1, 3);
        TbItemExample tbItemExample = new TbItemExample();
        List<TbItem> tbItems = tbItemMapper.selectByExample(tbItemExample);
        List<TbItem> tbItems1 = tbItemMapper.selectByExample(tbItemExample);
        PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(tbItems);

        System.out.println(tbItems1.size());


        for (TbItem tbItem:tbItems) {
            System.out.println(tbItem.getId()+">>>>mingch>>>"+tbItem.getTitle());
        }


    }

}
