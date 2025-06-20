package com.project.demo.controller;

import com.project.demo.entity.VotingManagement;
import com.project.demo.service.VotingManagementService;
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
 *投票管理：(VotingManagement)表控制层
 *
 */
@RestController
@RequestMapping("/voting_management")
public class VotingManagementController extends BaseController<VotingManagement,VotingManagementService> {

    /**
     *投票管理对象
     */
    @Autowired
    public VotingManagementController(VotingManagementService service) {
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
