package com.example.designpatternslab.models;

public class Paragraph extends Element{
    private String text;
    private AlignStrategy alignStrategy;
    private Context context = new Context();

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void print() {
        if(alignStrategy != null){
            alignStrategy.render(this, context);
        }else{
            System.out.println(text);
        }
    }
}
