package com.example.designpatternslab.models;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(Paragraph paragraph, Context context) {

         int width = context.getLineWidth();
         String text = paragraph.getText();
         System.out.printf("\n%" + width + "s\n", text);
    }
}
