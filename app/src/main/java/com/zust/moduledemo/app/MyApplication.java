package com.zust.moduledemo.app;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zust.component_base.BuildConfig;
import com.zust.component_base.base.BaseApplication;

/**
 * project: ModuleDemo
 * author : 叶天华
 * date   : 2018/10/15
 * time   : 11:41
 * email  : 15869107730@163.com
 * note   :
 */
public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            //一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
