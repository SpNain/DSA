import java.util.*;

class Main {
    public static void printSubsequences(int[] arr, int idx, ArrayList<Integer> subSeq) {
        if (idx == arr.length) {

            if (subSeq.size() > 0)
                System.out.println(subSeq);
        }

        else {

            printSubsequences(arr, idx + 1, subSeq);
            subSeq.add(arr[idx]);
            printSubsequences(arr, idx + 1, subSeq);
            subSeq.remove(subSeq.size() - 1);
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        ArrayList<Integer> subSeq = new ArrayList<>();

        printSubsequences(arr, 0, subSeq);
    }
}
