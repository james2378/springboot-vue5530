package com.project.demo.controller;

import com.project.demo.entity.RepairApplication;
import com.project.demo.service.RepairApplicationService;
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
 *报修申请：(RepairApplication)表控制层
 *
 */
@RestController
@RequestMapping("/repair_application")
public class RepairApplicationController extends BaseController<RepairApplication,RepairApplicationService> {

    /**
     *报修申请对象
     */
    @Autowired
    public RepairApplicationController(RepairApplicationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
