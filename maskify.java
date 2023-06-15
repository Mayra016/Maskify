public class Maskify {
    static String maskify(String str) {
        Integer characters = str.length() - 5;
        Integer i = 0;
        String hashtags = "";
        while (i <= characters) {
            hashtags = hashtags.concat("#");
            i = i + 1;
        };
        Integer beginSecond = characters + 1;
        String strSecond = str.substring(beginSecond, str.length());

        return hashtags + strSecond;
    }
}
