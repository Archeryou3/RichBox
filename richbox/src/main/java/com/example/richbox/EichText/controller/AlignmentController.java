package com.example.richbox.EichText.controller;

import android.text.Editable;
import android.text.style.AlignmentSpan;
import android.widget.EditText;


public class AlignmentController extends StyleController {
    @Override
    public boolean excuteDeleteAction(EditText editText, Editable s, int start, int end) {

        AlignmentSpan.Standard[] alignmentSpans = s.getSpans(start, end, AlignmentSpan.Standard.class);

        if (null == alignmentSpans || alignmentSpans.length == 0) {
            return false;
        }
        if(end==0) {  //执行删除

            for (AlignmentSpan.Standard span : alignmentSpans) {
                s.removeSpan(span);
            }
        }

        return true;
    }

    @Override
    public boolean excuteInputAction(EditText editText, Editable s, int start, int end) {
        return false;
    }
}
