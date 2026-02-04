class Stack {
    int top = -1;
    int size = 5;
    int arr[] = new int[size];

    // push operation
    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = x;
            System.out.println(x + " pushed");
        }
    }

    // pop operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top--] + " popped");
        }
    }

    // peek operation
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();
        s.pop();
    }
}
