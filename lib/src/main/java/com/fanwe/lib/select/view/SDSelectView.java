/*
 * Copyright (C) 2017 zhengjun, fanwe (http://www.fanwe.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fanwe.lib.select.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.fanwe.lib.select.config.SDSelectImageViewConfig;
import com.fanwe.lib.select.config.SDSelectTextViewConfig;
import com.fanwe.lib.select.config.SDSelectViewConfig;
import com.fanwe.lib.select.container.ISDSelectViewContainer;
import com.fanwe.lib.select.container.SDSelectViewContainer;

public class SDSelectView extends FrameLayout implements ISDSelectViewContainer
{
    public SDSelectView(Context context)
    {
        super(context);
        init();
    }

    public SDSelectView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public SDSelectView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    private SDSelectViewContainer mSelectViewContainer = new SDSelectViewContainer();

    private void init()
    {

    }

    public void setContentView(int layoutId)
    {
        clearConfig();
        removeAllViews();
        LayoutInflater.from(getContext()).inflate(layoutId, this, true);
    }

    public void setContentView(View view)
    {
        clearConfig();
        removeAllViews();
        addView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams params)
    {
        clearConfig();
        removeAllViews();
        addView(view, params);
    }

    @Override
    public void setInvokeViewSelected(boolean invokeViewSelected)
    {
        mSelectViewContainer.setInvokeViewSelected(invokeViewSelected);
    }

    @Override
    public SDSelectViewConfig config(View view)
    {
        return mSelectViewContainer.config(view);
    }

    @Override
    public SDSelectImageViewConfig configImage(ImageView view)
    {
        return mSelectViewContainer.configImage(view);
    }

    @Override
    public SDSelectTextViewConfig configText(TextView view)
    {
        return mSelectViewContainer.configText(view);
    }

    @Override
    public void removeConfig(View view)
    {
        mSelectViewContainer.removeConfig(view);
    }

    @Override
    public void clearConfig()
    {
        mSelectViewContainer.clearConfig();
    }

    @Override
    public void setSelected(boolean selected)
    {
        mSelectViewContainer.setSelected(selected);
        super.setSelected(selected);
    }
}
