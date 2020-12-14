package com.example.richbox.EichText.styles;


import com.example.richbox.EichText.span.BoldSpan;

public class BoldStyle extends NormalStyle<BoldSpan> {


    @Override
    protected BoldSpan newSpan() {
        return new BoldSpan();
    }
}
