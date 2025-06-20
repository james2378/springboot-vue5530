package com.project.demo.controller;

import com.project.demo.entity.FeedbackCenter;
import com.project.demo.service.FeedbackCenterService;
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
 *反馈中心：(FeedbackCenter)表控制层
 *
 */
@RestController
@RequestMapping("/feedback_center")
public class FeedbackCenterController extends BaseController<FeedbackCenter,FeedbackCenterService> {

    /**
     *反馈中心对象
     */
    @Autowired
    public FeedbackCenterController(FeedbackCenterService service) {
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
