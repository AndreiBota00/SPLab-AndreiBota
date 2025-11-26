package com.example.designpatternslab.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)
public class Paragraph extends Element{
    private String text;
    @Transient
    private AlignStrategy alignStrategy;
    @Transient
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
