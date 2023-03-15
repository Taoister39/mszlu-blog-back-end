package com.mszlu.blog.dao.pojo;

import lombok.Data;

@Data
public class SysUser {

    private Long id; // 用户Id
    private String account; // 帐户名
    private Integer admin; // 是否为管理员
    private String avatar; // 头像
    private Long createDate;// 创建实践
    private Integer deleted; // 注销了吗
    private String email; // 邮箱
    private Long lastLogin; // 最近登录时间
    private String mobilePhoneNumber; // 手机号码
    private String nickname; // 名称
    private String password; // 密码
    private String salt; //
    private String status; // 状态
}
