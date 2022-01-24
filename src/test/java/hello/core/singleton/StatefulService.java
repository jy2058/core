package hello.core.singleton;

public class StatefulService {
    private int price; // 상태를 유지하는 필드

    public void order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
        this.price = price;
    }
    public int getPrice(){
        return price;   // 여기가 문제!!
    }
    // 항상 무상태(stateless)로 설계해야 하기 때문에 수정한다면?
    /*
    public void order(String name, int price){
        return price;
    }
    이런식으로 지역변수를 이용해서 사용해야 한다.
    private int price 제거,
    getPrice 제거.
    */

}
