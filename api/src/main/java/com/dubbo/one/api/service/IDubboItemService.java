package com.dubbo.one.api.service;

import com.dubbo.one.api.reponse.BaseResponse;


public interface IDubboItemService {

    BaseResponse listItems();

    BaseResponse listPageItems(Integer pageNo,Integer pageSize);

    BaseResponse listPageItemsParams(Integer pageNo,Integer pageSize,String search);

}
