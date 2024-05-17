public class OperatorsExample {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b)); // Output: a + b = 15
        System.out.println("a - b = " + (a - b)); // Output: a - b = 5
        System.out.println("a * b = " + (a * b)); // Output: a * b = 50
        System.out.println("a / b = " + (a / b)); // Output: a / b = 2
        System.out.println("a % b = " + (a % b)); // Output: a % b = 0

        // Assignment Operators
        int x = 10;
        x += 5; // Equivalent to: x = x + 5;
        System.out.println("x += 5: " + x); // Output: x += 5: 15
        x -= 3; // Equivalent to: x = x - 3;
        System.out.println("x -= 3: " + x); // Output: x -= 3: 12

        // Unary Operators
        int y = 5;
        System.out.println("y++ = " + (y++)); // Output: y++ = 5 (post-increment)
        System.out.println("y = " + y); // Output: y = 6
        System.out.println("++y = " + (++y)); // Output: ++y = 7 (pre-increment)

        // Relational Operators
        int p = 10, q = 20;
        System.out.println("p == q: " + (p == q)); // Output: p == q: false
        System.out.println("p != q: " + (p != q)); // Output: p != q: true
        System.out.println("p > q: " + (p > q)); // Output: p > q: false
        System.out.println("p < q: " + (p < q)); // Output: p < q: true
        System.out.println("p >= q: " + (p >= q)); // Output: p >= q: false
        System.out.println("p <= q: " + (p <= q)); // Output: p <= q: true

        // Logical Operators
        boolean r = true, s = false;
        System.out.println("r && s: " + (r && s)); // Output: r && s: false
        System.out.println("r || s: " + (r || s)); // Output: r || s: true
        System.out.println("!r: " + (!r)); // Output: !r: false

        // Bitwise Operators
        int t = 5, u = 3;
        System.out.println("t & u: " + (t & u)); // Output: t & u: 1
        System.out.println("t | u: " + (t | u)); // Output: t | u: 7
        System.out.println("t ^ u: " + (t ^ u)); // Output: t ^ u: 6
        System.out.println("~t: " + (~t)); // Output: ~t: -6
        System.out.println("t << 2: " + (t << 2)); // Output: t << 2: 20
        System.out.println("t >> 2: " + (t >> 2)); // Output: t >> 2: 1
    }
}