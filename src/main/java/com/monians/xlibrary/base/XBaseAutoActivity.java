package com.monians.xlibrary.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

;import com.monians.xlibrary.autolayout.AutoFrameLayout;
import com.monians.xlibrary.autolayout.AutoLinearLayout;
import com.monians.xlibrary.autolayout.AutoRelativeLayout;

/**
 * Created by zhy on 15/11/19.
 */
public abstract class XBaseAutoActivity extends XBaseActivity
{
    private static final String LAYOUT_LINEARLAYOUT = "LinearLayout";
    private static final String LAYOUT_FRAMELAYOUT = "FrameLayout";
    private static final String LAYOUT_RELATIVELAYOUT = "RelativeLayout";


    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs)
    {
        View view = null;
        if (name.equals(LAYOUT_FRAMELAYOUT))
        {
            view = new AutoFrameLayout(context, attrs);
        }

        if (name.equals(LAYOUT_LINEARLAYOUT))
        {
            view = new AutoLinearLayout(context, attrs);
        }

        if (name.equals(LAYOUT_RELATIVELAYOUT))
        {
            view = new AutoRelativeLayout(context, attrs);
        }

        if (view != null) return view;

        return super.onCreateView(name, context, attrs);
    }




}
