class CountObj {
    static int totalCount = 0;

    public CountObj() {
        this.totalCount++;
    }

    public void DisplayTotalCount() {
        System.out.println(totalCount);
    }
}

public class lab56 {

    public static void main(String[] args) {
        CountObj ob1 = new CountObj();
        CountObj ob2 = new CountObj();
        CountObj ob3 = new CountObj();

        ob3.DisplayTotalCount();

    }
}