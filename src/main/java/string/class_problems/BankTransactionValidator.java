package string.class_problems;

public class BankTransactionValidator {

    public static String normalizeReference(String raw) {
        if (raw == null) {
            return "";
        }
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String reference) {
        String code = normalizeReference(reference);

        if (code.length() != 14) {
            return "Invalid: reference must be exactly 14 characters";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: date and sequence must be digits";
            }
        }

        String bankCode = code.substring(0, 3);
        String dd = code.substring(3, 5);
        String mm = code.substring(5, 7);
        String yy = code.substring(7, 9);
        String seq = code.substring(9, 14);

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(bankCode).append("] DATE: ");
        sb.append(dd).append("/").append(mm).append("/").append(yy);
        sb.append(" | SEQ: ").append(seq);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(validateAndFormat("  hdf03022600042  "));
        System.out.println(validateAndFormat("12F03022600042"));
    }
}
