package com.example.richbox.EichText.controller;

import android.text.Editable;
import android.widget.EditText;

import com.example.richbox.EichText.span.MyQuoteSpan;
import com.example.richbox.EichText.util.EditConstants;

public class NormalController extends StyleController {
    @Override
    public boolean excuteDeleteAction(EditText editText, Editable s, int start, int end) {
        return true;
    }

    @Override
    public boolean excuteInputAction(EditText editText, Editable editable, int start, int end) {
        if(end==0) {
            return true;
        }
        //判断最后一个 字符
        char c = editable.charAt(end - 1);
        if (c == EditConstants.CHAR_NEW_LINE) {
            //用户 输入了 回车符号
            MyQuoteSpan[] quoteSpans = editable.getSpans(start, end, MyQuoteSpan.class);
            if (null == quoteSpans || quoteSpans.length == 0) {
                //表示 当前行 已经取消了 列表样式
                //执行回车操作
                editable.delete(end - 1, end);
                excuteEnter(editText);
            }
        }
        return true;
    }
}
