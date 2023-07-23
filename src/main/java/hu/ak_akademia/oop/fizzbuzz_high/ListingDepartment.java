package hu.ak_akademia.oop.fizzbuzz_high;

public class ListingDepartment extends AbstractClass {
    private static final int INITIAL_VALUE = 1;
    NumberRequest numberRequest = new NumberRequest();

    public void run() {
        int userNumber = numberRequest.numberRequestMethod();
        for (int i = INITIAL_VALUE; i <= userNumber; i++) {
            System.out.printf("\n%3d ", i);
            Tagger[] taggers = returnsTheCaptionObject();
            for (int j = 0; j < taggers.length; j++) {
                Tagger tagger = taggers[j];
                tagger.createTag(i);
            }
        }
    }
}