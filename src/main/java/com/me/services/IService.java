package com.me.services;

import com.me.bean.Informations;

import java.util.List;

public interface IService {

    List<Informations> selectAll();

    void insertInfo(Informations informations);


}
