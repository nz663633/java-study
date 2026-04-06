package final1;

public class ConstructInit {

    final int value;

    public ConstructInit(int value) {
        // 초기값을 할당하지 않은 경우, 생성자 내에서 값 할당 가능
        this.value = value;
    }
}
