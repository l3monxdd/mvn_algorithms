package exercises;

public class Ex31 {
    //31. У прилавка магазина выстроилась очередь из n покупателей.
    // Время обслуживания i-того покупателя равно tj (i = 1, …, n).
    // Определить время Ci пребывания i-гo покупателя в очереди.

    public Integer doConditional(int n, int c) {
        if (c > n) {
            throw new IllegalArgumentException("wrong argument value");
        }
        int time = 0;
        for (int i = 1; i < n; i++) {
            time += i;
            if (i == c) {
                break;
            }
        }
        return time;
    }
}
