package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *访客：(Visitor)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "Visitor")
public class Visitor implements Serializable {

    //Visitor编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "visitor_id")
    private Integer visitor_id;
   // 访客账号
   @Basic
    private String guest_account_;
   // 姓名
   @Basic
    private String full_name;
   // 性别
   @Basic
    private String gender;
    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
