package Note;

public class Demo {
    class Outer {
        private int x;
        private static int y;
        //Inner là một nested class của Outer,
        // có thể truy cập vào biến x và y của Outer
        public class Inner {
            public void doSomething() {
                x = 1;
                y = 1;
            }
        }
    }

}
