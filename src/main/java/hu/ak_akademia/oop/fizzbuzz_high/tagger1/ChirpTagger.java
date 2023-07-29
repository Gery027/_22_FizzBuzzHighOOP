package hu.ak_akademia.oop.fizzbuzz_high.tagger1;

import hu.ak_akademia.oop.fizzbuzz_high.Tagger;

public class ChirpTagger implements Tagger {

    @Override
    public void createTag(int num) {
        if(num % 7 == 0) {
            System.out.println("Chirp ");
        }
    }
}
