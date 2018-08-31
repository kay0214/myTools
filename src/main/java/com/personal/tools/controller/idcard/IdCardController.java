/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.personal.tools.controller.idcard;

import com.personal.tools.service.IdCardService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: sunpeikai
 * @version: IdCardController, v0.1 2018/7/19 11:57
 */
@Api(value = "身份证前6位工具",tags = "身份证前6位工具")
@Controller
@RequestMapping(value = "/tools/idcard")
public class IdCardController {
    @Autowired
    private IdCardService idCardService;

    @GetMapping(value = "/init")
    public String init(){
        return "/index";
    }

}
