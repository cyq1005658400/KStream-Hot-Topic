package com.cyq.article.service;

import com.cyq.model.article.dtos.CollectionBehaviorDto;
import com.cyq.model.common.dtos.ResponseResult;

public interface ApCollectionService {

    /**
     * 收藏
     * @param dto
     * @return
     */
    public ResponseResult collection(CollectionBehaviorDto dto);
}
