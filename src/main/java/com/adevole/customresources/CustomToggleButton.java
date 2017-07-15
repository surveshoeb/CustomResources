package com.adevole.customresources;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/**
 * Created by surve on 14-Jul-17.
 */

public class CustomToggleButton extends ToggleButton {

    String fontName = "roboto";

    public CustomToggleButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setFont();
    }

    public CustomToggleButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    public CustomToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
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
