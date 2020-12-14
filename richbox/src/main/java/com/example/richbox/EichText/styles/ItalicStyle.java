package com.example.richbox.EichText.styles;


import com.example.richbox.EichText.span.ItalicSpan;

public class ItalicStyle extends NormalStyle<ItalicSpan> {
    @Override
    protected ItalicSpan newSpan() {
        return new ItalicSpan();
    }
}
