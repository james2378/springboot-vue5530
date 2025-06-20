package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *报修申请：(RepairApplication)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RepairApplication")
public class RepairApplication implements Serializable {

    //RepairApplication编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "repair_application_id")
    private Integer repair_application_id;
   // 报修标题
   @Basic
    private String repair_title;
   // 报修类型
   @Basic
    private String repair_type;
   // 相关图片
   @Basic
    private String related_pictures;
   // 申请时间
   @Basic
    private Timestamp application_time;
   // 业主账号
   @Basic
    private Integer owner_account_number;
   // 姓名
   @Basic
    private String full_name;
   // 楼栋号
   @Basic
    private String building_no;
   // 门牌号
   @Basic
    private String house_number;
   // 相关内容
   @Basic
    private String related_content;
   // 回复内容
   @Basic
    private String reply_content;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
