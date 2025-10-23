package com.example.designpatternslab;

public class AlignCenter implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph, Context context) {
        String text = paragraph.getText();
        int width = context.getLineWidth();
        int padding = (width - text.length()) / 2;
        if (padding < 0){
            padding = 0;
        }

        String formatted = " ".repeat(padding) + text;
        System.out.print(formatted);
    }

}
