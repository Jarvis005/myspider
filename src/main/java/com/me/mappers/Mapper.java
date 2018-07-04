package com.me.mappers;

import com.me.bean.Informations;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface Mapper {

   List<Informations> selectALL();

   void insertInfo(Informations informations);

}
