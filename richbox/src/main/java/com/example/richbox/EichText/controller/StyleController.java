package com.example.richbox.EichText.controller;

import android.text.Editable;
import android.widget.EditText;


public abstract class StyleController {

    private OnEditActionListener onEditActionListener;

    public void setOnEditActionListener(OnEditActionListener onEditActionListener) {
        this.onEditActionListener = onEditActionListener;
    }


    public abstract boolean excuteDeleteAction(EditText editText, Editable s, int start, int end);


    public abstract boolean excuteInputAction(EditText editText, Editable s, int start, int end);


    /**
     * 没有样式  执行 普通回退 逻辑
     *
     * @param editText
     */
    public void excuteBack(EditText editText) {
        if (onEditActionListener != null) {
            onEditActionListener.onBackspacePress(editText);
        }
    }

    /**
     * 没有特殊样式  执行 回车逻辑
     *
     * @param editText
     */
    public void excuteEnter(EditText editText) {
        if (onEditActionListener != null) {
            onEditActionListener.onEnter(editText);
        }
    }
}
