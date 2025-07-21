package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        String title = "Traveling to New Zealand";
        int likes = 12;
        String content = "I'm going to visit this wonderful country!";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime moment = LocalDateTime.parse("21/06/2018 13:05:44", fmt);

        Post p1 = new Post(content, likes, (String) moment.format(fmt), title);

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");
        p1.addComment(c1);
        p1.addComment(c2);

        title = "Good night guys";
        likes = 5;
        content = "See you tomorrow";
        fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        moment = LocalDateTime.parse("28/07/2018 23:14:19", fmt);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("Maw the Force be with you");

        Post p2 = new Post(content, likes, (String) moment.format(fmt), title);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.print(p1);
        System.out.println();
        System.out.print(p2);



    }
}
