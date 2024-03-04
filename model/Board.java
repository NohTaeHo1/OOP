package model;


import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString



public class Board {
    //private int id;
    private String title;
    private String content;
    private String writer;
    @Builder(builderMethodName = "builder")
    public Board(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

}