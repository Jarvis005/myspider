package com.me.services;

import com.me.bean.Informations;
import com.me.mappers.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MyService implements  IService{
    @Autowired
    private Mapper mapper;

    @Override
    public List<Informations> selectAll() {
        return mapper.selectALL();
    }

    @Override
    public void insertInfo(Informations informations) {
        mapper.insertInfo(informations);
    }
}
