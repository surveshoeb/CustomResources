package com.adevole.customresources;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/**
 * Created by surve on 14-Jul-17.
 */

public class CustomToggleButton extends ToggleButton {

    String fontName = "roboto";

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomToggleButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {

        super(context, attrs, defStyleAttr, defStyleRes);
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0);
        fontName = ta.getString(R.styleable.CustomView_customfont);
        if (fontName == null)
            fontName = "roboto";
        setFont();
    }

    public CustomToggleButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0);
        fontName = ta.getString(R.styleable.CustomView_customfont);
        if (fontName == null)
            fontName = "roboto";
        setFont();
    }

    public CustomToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0);
        fontName = ta.getString(R.styleable.CustomView_customfont);
        if (fontName == null)
            fontName = "roboto";
        setFont();
    }

    public CustomToggleButton(Context context) {
        super(context);
        setFont();
    }

    private void setFont(){
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/"+fontName+".ttf");
        setTypeface(tf);
    }

    public void setOwnFont(String font){
        fontName = font;
        setFont();
    }
    public void setFontFamily(String fontName){
        this.fontName = fontName;
        setFont();
    }
}
