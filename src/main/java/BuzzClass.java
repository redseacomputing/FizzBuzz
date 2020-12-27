class BuzzClass {


    public String process(int number) {
        if(number == 0){ return "infinitive";}
        if (number % 15 == 0) {
            return "FIZZBUZZ";
        } else if (number % 5 == 0) {
            return "BUZZ";
        } else if (number % 3 == 0) {
            return "FIZZ";
        }
        return String.valueOf(number);
    }
}
