package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *来访登记：(Visit)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "Visit")
public class Visit implements Serializable {

    //Visit编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "visit_id")
    private Integer visit_id;
   // 来访账号
   @Basic
    private Integer visiting_account;
   // 姓名
   @Basic
    private String full_name;
   // 探访业主
   @Basic
    private Integer visit_the_owner;
   // 业主姓名
   @Basic
    private String name_of_owner;
   // 楼栋号
   @Basic
    private String building_no;
   // 门牌号
   @Basic
    private String house_number;
   // 业主确认状态
   @Basic
    private String owner_confirmation_status;
   // 来访原因
   @Basic
    private String reason_for_visit;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
