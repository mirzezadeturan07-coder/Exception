public class C1 {
    static int parseIntOrDefault(String s, int def) {
        try {
            return Integer.parseInt(s.trim());
        } catch (NumberFormatException | NullPointerException e) {
            return def;
        }
    }

    static double parseDoubleOrDefault(String s, double def) {
        try {
            return Double.parseDouble(s.trim());
        } catch (NumberFormatException | NullPointerException e) {
            return def;
        }
    }
}
