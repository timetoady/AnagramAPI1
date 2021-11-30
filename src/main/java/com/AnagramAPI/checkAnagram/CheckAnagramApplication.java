package com.AnagramAPI.checkAnagram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheckAnagramApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckAnagramApplication.class, args);
		AnagramChecker newWordCompare = new AnagramChecker();
        System.out.println(newWordCompare);
        String firstWord = "yellow";
        String secondWord = "black";
        boolean response = AnagramChecker.isAnagram(firstWord, secondWord);

        if (!response) {
            System.out.println(secondWord + " is not an anagram of " + firstWord);
        } else {
            System.out.println("The answer is true: " + secondWord + " is an anagram of " + firstWord);
        }
	}

}
