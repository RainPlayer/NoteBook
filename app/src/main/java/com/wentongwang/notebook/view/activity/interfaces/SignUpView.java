package com.wentongwang.notebook.view.activity.interfaces;

import android.content.Context;

import com.wentongwang.notebook.view.BaseView;

/**
 * 注册界面的功能
 * Created by Wentong WANG on 2016/6/23.
 */
public interface SignUpView extends BaseView{

    /**
     * 获取注册用户名
     * @return
     */
    String getUserName();

    /**
     * 获取注册密码
     * @return
     */
    String getUserPwd();

    /**
     * 获取注册密码校验
     * @return
     */
    String getUserPwdConfirm();

    void goToLoginActivity();


}
