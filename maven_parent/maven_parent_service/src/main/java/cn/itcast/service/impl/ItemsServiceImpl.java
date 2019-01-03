package cn.itcast.service.impl;

import cn.itcast.damain.Items;
import cn.itcast.dao.ItemsDao;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }
}
