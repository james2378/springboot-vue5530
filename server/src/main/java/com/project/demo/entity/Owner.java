package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *业主：(Owner)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "Owner")
public class Owner implements Serializable {

    //Owner编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private Integer owner_id;
   // 业主账号
   @Basic
    private String owner_account_number;
   // 姓名
   @Basic
    private String full_name;
   // 性别
   @Basic
    private String gender;
   // 楼栋号
   @Basic
    private String building_no;
   // 门牌号
   @Basic
    private String house_number;
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
