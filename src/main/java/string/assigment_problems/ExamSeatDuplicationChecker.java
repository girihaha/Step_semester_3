package string.assigment_problems;

public class ExamSeatDuplicationChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean hasDuplicate = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    hasDuplicate = true;
                    break;
                }
            }
        }

        if (!hasDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        int[] hallA = {101, 102, 103, 102, 105};
        int[] hallB = {101, 102, 103, 104, 105};

        checkDuplicateSeats(hallA);
        checkDuplicateSeats(hallB);
    }
}
