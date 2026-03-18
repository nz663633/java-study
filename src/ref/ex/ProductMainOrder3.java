package ref.ex;

import java.util.Scanner;

public class ProductMainOrder3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductOrder productOrder = new ProductOrder();

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int countMenu = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[countMenu];

        for (int i = 0; i < countMenu; i++) {
            scanner.nextLine(); // 입력 버퍼 비워주기
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount + "원");
    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price= price;
        order.quantity = quantity;
        return order;
    }

    public static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    public static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
