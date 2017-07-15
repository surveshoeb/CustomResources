package com.adevole.customresources;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.CheckBox;

/**
 * Created by surve on 14-Jul-17.
 */

public class CustomCheckBox extends android.support.v7.widget.AppCompatCheckBox {

    String fontName = "roboto";

    public CustomCheckBox(Context context) {
        super(context);
        setFont();
    }

    public CustomCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public CustomCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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
