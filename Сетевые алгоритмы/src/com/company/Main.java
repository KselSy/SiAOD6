package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Floyd floyd = new Floyd(800,"C:\\Users\\EtoJeToha\\Desktop\\СИАОД\\test6.txt");
        System.out.println("Время поиска = " + floyd.getElapsedTime());
        System.out.println("Длина кратчайшего раастояния из (1) в (7)  = " + floyd.getMinPath());
    }

}

