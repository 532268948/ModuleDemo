package com.zust.component_main.ui;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zust.component_base.base.BaseActivity;
import com.zust.component_main.R;
import com.zust.component_main.contract.LoginContract;
import com.zust.component_main.presenter.LoginPresenter;
@Route(path = "/main/login")
public class LoginActivity extends BaseActivity<LoginContract.View,LoginPresenter<LoginContract.View>> implements LoginContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected LoginPresenter<LoginContract.View> createPresenter() {
        return new LoginPresenter<>();
    }
}
