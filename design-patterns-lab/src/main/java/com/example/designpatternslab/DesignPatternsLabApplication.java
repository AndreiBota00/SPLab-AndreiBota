package com.example.designpatternslab;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsLabApplication {

    public static void main(String[] args) {

//    Book noapteBuna = new Book("Noapte buna, copii!");
//    Author rpGheo = new Author("Radu Pavel", "Gheo");
//    noapteBuna.addAuthor(rpGheo);
//
//    Section cap1 = new Section("Capitolul 1");
//    Section subcap11 = new Section("Subcapitolul 1.1");
//    Section subcap111 = new Section("Subcapitolul 1.1.1");
//    Section subcap1111 = new Section("Subcapitolul 1.1.1.1");
//
//    noapteBuna.add(new Paragraph("Multumesc celor care..."));
//
//    noapteBuna.add(cap1);
//    cap1.add(new Paragraph("Moto capitol"));
//
//    cap1.add(subcap11);
//    subcap11.add(new Paragraph("Text from subchapter 1.1"));
//
//    subcap11.add(subcap111);
//    subcap111.add(new Paragraph("Text from subchapter 1.1.1"));
//
//    subcap111.add(subcap1111);
//    subcap1111.add(new Image("Image from subchapter 1.1.1.1"));
//
//    noapteBuna.print();


      Section cap1 = new Section("Capitolul 1");
      Paragraph p1 = new Paragraph("Paragraph 1");
      cap1.add(p1);
      Paragraph p2 = new Paragraph("Paragraph 2");
      cap1.add(p2);
      Paragraph p3 = new Paragraph("Paragraph 3");
      cap1.add(p3);
      Paragraph p4 = new Paragraph("Paragraph 4");
      cap1.add(p4);

      System.out.println("Printing without Alignment\n");
      cap1.print();

      p1.setAlignStrategy(new AlignCenter());
      p2.setAlignStrategy(new AlignRight());
      p3.setAlignStrategy(new AlignLeft());

      System.out.println("\nPrinting WITH Alignment\n");
      System.out.println();
      cap1.print();

    }

}
