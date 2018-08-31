package com.personal.tools.dao.mapper.auto;

import com.personal.tools.dao.model.auto.IdCard;
import com.personal.tools.dao.model.auto.IdCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdCardMapper {
    int countByExample(IdCardExample example);

    int deleteByExample(IdCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IdCard record);

    int insertSelective(IdCard record);

    List<IdCard> selectByExample(IdCardExample example);

    IdCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IdCard record, @Param("example") IdCardExample example);

    int updateByExample(@Param("record") IdCard record, @Param("example") IdCardExample example);

    int updateByPrimaryKeySelective(IdCard record);

    int updateByPrimaryKey(IdCard record);
}