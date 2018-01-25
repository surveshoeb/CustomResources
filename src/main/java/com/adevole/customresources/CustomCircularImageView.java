package com.adevole.customresources;

import android.content.Context;
import android.util.AttributeSet;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by surveshoeb on 15-Jul-17.
 */

public class CustomCircularImageView extends CircleImageView {
    public CustomCircularImageView(Context context) {
        super(context);
    }

    public CustomCircularImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomCircularImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
