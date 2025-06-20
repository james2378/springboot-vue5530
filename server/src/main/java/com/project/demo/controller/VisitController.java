package com.project.demo.controller;

import com.project.demo.entity.Visit;
import com.project.demo.service.VisitService;
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
 *来访登记：(Visit)表控制层
 *
 */
@RestController
@RequestMapping("/visit")
public class VisitController extends BaseController<Visit,VisitService> {

    /**
     *来访登记对象
     */
    @Autowired
    public VisitController(VisitService service) {
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
