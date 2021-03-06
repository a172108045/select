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
package com.fanwe.lib.select.config;

import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

/**
 * Created by zhengjun on 2017/9/15.
 */
class TextViewTextSizeHandler extends ViewPropertyHandler<Integer>
{
    public TextViewTextSizeHandler(View view)
    {
        super(view);
        if (!(view instanceof TextView))
        {
            throw new IllegalArgumentException("view must be instance of TextView");
        }
    }

    @Override
    protected void onViewSelectedChanged(boolean selected, Integer value, View view)
    {
        if (value == null)
        {
            return;
        }
        TextView textView = (TextView) view;
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, value);
    }
}
