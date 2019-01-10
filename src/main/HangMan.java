package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args)
    {
        System.out.println("Enter the secret word");
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));

        StringBuffer word;
        try
        {
            word = new StringBuffer(br.readline());
            System.out.println("Your word is " + word);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
