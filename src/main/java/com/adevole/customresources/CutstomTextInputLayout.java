package com.adevole.customresources;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.design.widget.TextInputLayout;
import android.util.AttributeSet;

/**
 * Created by surve on 21-Nov-17.
 */

public class CutstomTextInputLayout extends TextInputLayout {

    String fontName = "roboto";

    public CutstomTextInputLayout(Context context) {
        super(context);
        setFont();
    }

    public CutstomTextInputLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0);
        fontName = ta.getString(R.styleable.CustomView_customfont);
        if (fontName == null)
            fontName = "roboto";
        setFont();
    }

    public CutstomTextInputLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0);
        fontName = ta.getString(R.styleable.CustomView_customfont);
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
    }
}
