package view;

import java.util.List;
import java.util.Scanner;

import core.View;

public abstract class ViewImpl<T> implements View<T> {
     protected static Scanner scanner;

    public static void setScanner(Scanner scanner) {
        ViewImpl.scanner = scanner;
    }

    @Override
    public void affiche(List<T> datas) {
        for (T data : datas) {
            System.out.println(data);
        }
    }

    public String saisieString(String msg) {
        scanner.nextLine();
        System.out.println(msg);
        return scanner.nextLine();
    }
    
}