package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *反馈中心：(FeedbackCenter)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "FeedbackCenter")
public class FeedbackCenter implements Serializable {

    //FeedbackCenter编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_center_id")
    private Integer feedback_center_id;
   // 反馈标题
   @Basic
    private String feedback_title;
   // 反馈类型
   @Basic
    private String feedback_type;
   // 反馈时间
   @Basic
    private Timestamp feedback_time;
   // 业主账号
   @Basic
    private Integer owner_account_number;
   // 反馈内容
   @Basic
    private String feedback_content;
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
