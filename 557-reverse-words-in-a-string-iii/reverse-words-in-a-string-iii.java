class Solution {
    public String reverseWords(String s) {

        int start = 0;
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int end = 0; end < n; end++) {

            if (end == n - 1 || arr[end] == ' ') {

                if (arr[end] == ' ')
                    reverse(arr, start, end - 1);
                else
                    reverse(arr, start, end);

                start = end + 1;
            }
        }

        return new String(arr);
    }

    public void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
