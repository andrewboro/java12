package com.example.java12;

public class SwitchStatement {

    public static void main(String[] args) {

        String wordySize = "Small";

        wordySize = (wordySize == null) ? "" : wordySize;

        int sizeCode = switch(wordySize.toLowerCase()) {
            case "small", "s" -> 1;
            case "medium", "m" -> 5;
            case "large", "l" -> 10;
            default -> 0;
        };

        System.out.println("Size Code: " + sizeCode);
    }
}