public class Main {

    public static void main(String[] args) {
        Stack test = new Stack(3);
        System.out.println(test.free_spaces());
        System.out.println(test.max_capacity());
        test.push("asd");
        System.out.println(test.peek());
        test.push(2);
        System.out.println(test.peek());
        test.pop();
        test.push(6);
        System.out.println(test.free_spaces());
        System.out.println(test.peek());
        System.out.println(test.pop());
        System.out.println(test.peek());
    }

}
