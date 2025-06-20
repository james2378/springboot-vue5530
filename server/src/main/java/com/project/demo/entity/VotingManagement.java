package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *投票管理：(VotingManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "VotingManagement")
public class VotingManagement implements Serializable {

    //VotingManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voting_management_id")
    private Integer voting_management_id;
   //  投票标题
   @Basic
    private String voting_title;
   // 开始时间
   @Basic
    private Timestamp start_time;
   // 截止时间
   @Basic
    private Timestamp deadline;
   // 表决状态
   @Basic
    private String voting_status;
   // 业主账号
   @Basic
    private Integer owner_account_number;
   // 姓名
   @Basic
    private String full_name;
   // 投票时间
   @Basic
    private Timestamp voting_time;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
