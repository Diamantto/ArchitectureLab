import com.thedeanda.lorem.LoremIpsum;

public class WindowGenerator implements Generator {
    @Override
    public String generate(int count) {
        if (count > 0) {
            return LoremIpsum.getInstance().getWords(count);
        } else return "error...";
    }
}
