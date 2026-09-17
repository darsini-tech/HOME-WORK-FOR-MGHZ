
package batch1;

public class EvenOddCount {
    void count() {
        int a[] = {1, 2, 3, 7, 11};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even : " + even);
        System.out.println("Odd  : " + odd);
    }

    public static void main(String[] args) {
        EvenOddCount obj = new EvenOddCount();
        obj.count();
    }
}

