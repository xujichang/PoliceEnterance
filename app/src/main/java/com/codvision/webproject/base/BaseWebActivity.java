package com.codvision.webproject.base;

import com.codvision.check.impl.WebContainerActivity;

import me.xujichang.web.interfaces.IWebJsCallBack;

/**
 * Des:PoliceEnterance - com.codvision.policeenterance.base
 *
 * @author xujichang
 * @date 2019-03-27 - 19:21
 * <p>
 * modify:
 */
public abstract class BaseWebActivity extends WebContainerActivity {
    @Override
    protected void initExtHandler(IWebJsCallBack callBack) {
//        new LogHandler(getWebView()).addJsCallBack(callBack);
        super.initExtHandler(callBack);
    }
}
