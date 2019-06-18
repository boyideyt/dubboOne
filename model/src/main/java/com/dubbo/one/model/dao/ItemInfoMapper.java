package com.dubbo.one.model.dao;


import com.dubbo.one.model.entity.ItemInfo;
import com.dubbo.one.model.entity.ItemInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemInfoMapper {
    long countByExample(ItemInfoExample example);

    int deleteByExample(ItemInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemInfo record);

    int insertSelective(ItemInfo record);

    List<ItemInfo> selectByExample(ItemInfoExample example);

    ItemInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemInfo record, @Param("example") ItemInfoExample example);

    int updateByExample(@Param("record") ItemInfo record, @Param("example") ItemInfoExample example);

    int updateByPrimaryKeySelective(ItemInfo record);

    int updateByPrimaryKey(ItemInfo record);

    List<ItemInfo> selectAll();

    List<ItemInfo> selectAllByParams(@Param("search") String search);

}