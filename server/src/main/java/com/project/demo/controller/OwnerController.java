package com.project.demo.controller;

import com.project.demo.entity.Owner;
import com.project.demo.service.OwnerService;
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
 *业主：(Owner)表控制层
 *
 */
@RestController
@RequestMapping("/owner")
public class OwnerController extends BaseController<Owner,OwnerService> {

    /**
     *业主对象
     */
    @Autowired
    public OwnerController(OwnerService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapowner_account_number = new HashMap<>();
        mapowner_account_number.put("owner_account_number",String.valueOf(paramMap.get("owner_account_number")));
        List listowner_account_number = service.select(mapowner_account_number, new HashMap<>()).getResultList();
        if (listowner_account_number.size()>0){
            return error(30000, "字段业主账号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
