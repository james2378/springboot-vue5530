package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *投票中心：(VotingCenter)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "VotingCenter")
public class VotingCenter implements Serializable {

    //VotingCenter编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voting_center_id")
    private Integer voting_center_id;
   //  投票标题
   @Basic
    private String voting_title;
   // 投票封面
   @Basic
    private String voting_cover;
   // 开始时间
   @Basic
    private Timestamp start_time;
   // 截止时间
   @Basic
    private Timestamp deadline;
   // 投票内容
   @Basic
    private String voting_content;
    // 点击数
    @Basic
    private Integer hits;
    // 点赞数
    @Basic
    private Integer praise_len;
	// 计时器标题
	@Basic
	private String timer_title;
	
	// 计时开始时间
	@Basic
	private Timestamp timing_start_time;
	
	// 计时结束时间
	@Basic
	private Timestamp timing_end_time;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
