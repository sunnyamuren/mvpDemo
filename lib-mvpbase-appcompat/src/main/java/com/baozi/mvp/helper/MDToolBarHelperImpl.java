package com.baozi.mvp.helper;

import android.view.View;

import com.baozi.mvp.view.UIView;

/**
 * @author jlanglang  2017/3/7 16:29
 * @版本 2.0
 * @Change
 */
public class MDToolBarHelperImpl extends BaseToolBarHelperImpl {

    public MDToolBarHelperImpl(UIView uiView, View rootView, int toolbarLayout) {
        super(uiView, rootView, toolbarLayout);
    }

    @Override
    public void initToolbar() {
        ToolbarHelper.SimpleInitToolbar(mUIView.getContext(), mToolbar, true);
    }

    @Override
    public void setTextsize(int size) {

    }

    @Override
    public void setTitleSize(int size) {

    }
}