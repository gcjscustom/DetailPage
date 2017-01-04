package com.NewSuper.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * 自定义ListView解决ScrollView嵌套冲突问题
 */

public class NoScrollListView extends ListView {
	public NoScrollListView(Context context) {
		super(context);

	}

	public NoScrollListView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	/** 
         * 设置不滚动 
         */
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
				MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}
}