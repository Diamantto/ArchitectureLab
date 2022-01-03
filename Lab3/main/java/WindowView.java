public class WindowView {
    private WindowText obj;

    public WindowView(WindowText obj) {
        this.obj = obj;
    }

    public WindowView() {

    }

    public int show(String str) {
        if (!str.startsWith("error")) {
            System.out.println(str);
            return obj.wordsCounter(str);
        }
        else return -1;
    }

    public int show(int num) {
        return show(new WindowGenerator().generate(num));
    }
}
