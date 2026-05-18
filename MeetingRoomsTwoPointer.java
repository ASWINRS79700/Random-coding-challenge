import java.util.Arrays;

public class MeetingRoomsTwoPointer {
    public static int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];

        // Fill arrays
        for (int i = 0; i < n; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        // Sort both arrays
        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0;
        int rooms = 0, maxRooms = 0;

        while (i < n) {
            if (start[i] < end[j]) {
                rooms++;       // need new room
                i++;
            } else {
                rooms--;       // free a room
                j++;
            }
            maxRooms = Math.max(maxRooms, rooms);
        }

        return maxRooms;
    }

    public static void main(String[] args) {
        int[][] meetings = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(minMeetingRooms(meetings)); // Output: 2
    }
}