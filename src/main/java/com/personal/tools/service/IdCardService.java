/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.personal.tools.service;

import com.personal.tools.dao.mapper.auto.IdCardMapper;
import com.personal.tools.dao.model.auto.IdCard;
import com.personal.tools.dao.model.auto.IdCardExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: sunpeikai
 * @version: IdCardFirstSixService, v0.1 2018/7/19 14:21
 */
@Service
public class IdCardService {

    @Resource
    private IdCardMapper idCardMapper;

}
