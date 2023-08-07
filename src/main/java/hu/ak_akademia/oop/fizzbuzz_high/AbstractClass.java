package hu.ak_akademia.oop.fizzbuzz_high;


import hu.ak_akademia.oop.fizzbuzz_high.tagger.BuzzTagger;
import hu.ak_akademia.oop.fizzbuzz_high.tagger.ChirpTagger;
import hu.ak_akademia.oop.fizzbuzz_high.tagger.FizzTagger;

public abstract class AbstractClass implements TaggerServicePoint {


//    @Override
//    public Tagger[] returnsTheCaptionObject() {
//        Tagger fizzTagger = new FizzTagger();
//        Tagger buzzTagger = new BuzzTagger();
//        Tagger chirpTagger = new ChirpTagger();
//        Tagger[] taggers = {fizzTagger, buzzTagger, chirpTagger};
//        return taggers;
//    }

    @Override
    public Tagger returnstheCaptionObject(String string) {
        Tagger tagger = null;
        return tagger;
    }

    @Override
    public Tagger[] kitalalokMajdValamit(String string) {
        Tagger[] taggers = {};

        return taggers;
    }
}