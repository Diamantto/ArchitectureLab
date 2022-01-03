package window.model;

import com.thedeanda.lorem.LoremIpsum;

public final class WindowGenerator implements Generator {
    private static WindowGenerator instance;

    private WindowGenerator() {

    }

    public static WindowGenerator getInstance() {
        if (instance == null) {
            instance = new WindowGenerator();
        }
        return instance;
    }

    @Override
    public String generate(int count) {
        if (count > 0) {
            return LoremIpsum.getInstance().getWords(count);
        } else return "error...";
    }
}
