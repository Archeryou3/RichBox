package com.example.richbox.EichText.styles;

import android.text.style.UnderlineSpan;



public class UnderlineStyle extends NormalStyle<UnderlineSpan> {
    @Override
    protected UnderlineSpan newSpan() {
        return new UnderlineSpan();
    }
}
