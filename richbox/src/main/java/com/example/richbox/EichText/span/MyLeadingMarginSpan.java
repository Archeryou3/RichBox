package com.example.richbox.EichText.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;


public class MyLeadingMarginSpan implements LeadingMarginSpan {

    private final int mLeadingMargin;

    private int mLevel = 1;


    public MyLeadingMarginSpan(int leadingMargin) {
        this.mLeadingMargin = leadingMargin;
    }


    public MyLeadingMarginSpan(Parcel src) {
        mLeadingMargin = src.readInt();
    }

    /**
     * @hide
     */
    public void writeToParcelInternal(Parcel dest, int flags) {
        dest.writeInt(mLeadingMargin);

    }

    public void setmLevel(int mLevel) {
        this.mLevel = mLevel;
    }

    @Override
    public int getLeadingMargin(boolean first) {
        return mLeadingMargin * mLevel;
    }

    @Override
    public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {

    }
}
