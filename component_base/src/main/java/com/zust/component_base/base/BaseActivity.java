package com.zust.component_base.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zust.component_base.util.ActivityManager;
import com.zust.component_base.util.ToastUtil;

/**
 * project: ModuleDemo
 * author : 叶天华
 * date   : 2018/10/14
 * time   : 13:02
 * email  : 15869107730@163.com
 * note   :
 */
public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity implements BaseView {

    private T mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        ActivityManager.getInstance().addActivity(this);
        mPresenter=createPresenter();
        mPresenter.attachView((V)this,this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityManager.getInstance().removeActivity(this);
        mPresenter.detachView();
    }

    protected abstract T createPresenter();

    @Override
    public void showMessage(String message) {
        ToastUtil.showShortToastMessage(message);
    }
}
