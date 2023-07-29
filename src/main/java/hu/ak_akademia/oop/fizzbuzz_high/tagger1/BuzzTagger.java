package hu.ak_akademia.oop.fizzbuzz_high.tagger1;

import hu.ak_akademia.oop.fizzbuzz_high.Tagger;

public class BuzzTagger implements Tagger {

    @Override
    public void createTag(int num) {
        if (num % 5 == 0) {
            System.out.println("Buzz ");
        }

    }
}
