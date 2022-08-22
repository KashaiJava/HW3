public class Task4 {
    public static void main(String[] args) {
        task4();
    }

    public static void task4() {
int deliveryDistance = 95;
int deliveryDays = 1;
if (deliveryDistance > 20) {
    deliveryDays++;
    }
if (deliveryDistance > 60) {
    deliveryDays++;
}
System.out.println("Потребуется дней " + deliveryDays);
}
}