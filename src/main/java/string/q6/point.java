package string.q6;

public class point {
    char ch;
    int freq;

    public point(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    @Override
    public String toString(){
        return "ch :" + ch + " ,freq : "+freq;
    }
}
