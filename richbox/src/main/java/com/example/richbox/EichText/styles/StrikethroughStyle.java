package com.example.richbox.EichText.styles;

import android.text.style.StrikethroughSpan;


public class StrikethroughStyle extends NormalStyle<StrikethroughSpan> {
    @Override
    protected StrikethroughSpan newSpan() {
        return new StrikethroughSpan();
    }
}
