package com.project.demo.controller;

import com.project.demo.entity.Visitor;
import com.project.demo.service.VisitorService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *访客：(Visitor)表控制层
 *
 */
@RestController
@RequestMapping("/visitor")
public class VisitorController extends BaseController<Visitor,VisitorService> {

    /**
     *访客对象
     */
    @Autowired
    public VisitorController(VisitorService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapguest_account_ = new HashMap<>();
        mapguest_account_.put("guest_account_",String.valueOf(paramMap.get("guest_account_")));
        List listguest_account_ = service.select(mapguest_account_, new HashMap<>()).getResultList();
        if (listguest_account_.size()>0){
            return error(30000, "字段访客账号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
