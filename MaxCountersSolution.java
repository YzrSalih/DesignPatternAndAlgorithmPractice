package DesignPatternAndAlgorithmPractice;

public class MaxCountersSolution {
    // Verilen işlemler sonucunda sayaçların son değerlerini döndürür
    public int[] getFinalCounterValues(int counterCount, int[] operations) {
        int[] counterValues = new int[counterCount];
        int currentMaxValue = 0; // Şu ana kadarki en büyük sayaç değeri
        int lastMaxUpdate = 0; // Max counter sonrası minimum değer
        for (int operation : operations) {
            if (operation >= 1 && operation <= counterCount) {
                // Lazy update: Gerekirse önce minimuma eşitle
                int index = operation - 1;
                if (counterValues[index] < lastMaxUpdate) {
                    counterValues[index] = lastMaxUpdate;
                }
                counterValues[index]++;
                if (counterValues[index] > currentMaxValue) {
                    currentMaxValue = counterValues[index];
                }
            } else if (operation == counterCount + 1) {
                // Max counter: Sadece minimumu güncelle
                lastMaxUpdate = currentMaxValue;
            }
        }
        // Sonunda eksik kalanları minimuma eşitle
        for (int i = 0; i < counterCount; i++) {
            if (counterValues[i] < lastMaxUpdate) {
                counterValues[i] = lastMaxUpdate;
            }
        }
        return counterValues;
    }

    public static void main(String[] args) {
        MaxCountersSolution solution = new MaxCountersSolution();
        int counterCount = 5;
        int[] operations = {3, 4, 4, 6, 1, 4, 4};
        int[] finalValues = solution.getFinalCounterValues(counterCount, operations);
        for (int value : finalValues) {
            System.out.print(value + " "); // Output: 3 2 2 4 2
        }
    }
}
