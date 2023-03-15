package com.mszlu.blog.vo.params;

import lombok.Data;

@Data
public class LoginParam {
    private String account; // 账号
    private String password; // 密码
    private String nickname; // 名称
}
