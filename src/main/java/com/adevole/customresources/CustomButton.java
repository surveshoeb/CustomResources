package com.adevole.customresources;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by surve on 14-Jul-17.
 */

public class CustomButton extends android.support.v7.widget.AppCompatButton {

    String fontName = "roboto";

    public CustomButton(Context context) {
        super(context);
        setFont();
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0);
        fontName = ta.getString(R.styleable.CustomView_font);
        if (fontName == null)
            fontName = "roboto";
        setFont();
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0);
        fontName = ta.getString(R.styleable.CustomView_font);
        if (fontName == null)
            fontName = "roboto";
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
