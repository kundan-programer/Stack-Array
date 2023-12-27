import java.util.Scanner;

class stack {
  Scanner sc = new Scanner(System.in);
  int top = -1;
  int n = 10;
  int arr[] = new int[n];

  void push() {
    if (top == n - 1) {
      System.out.println("overFlow");
    }

    else {
      System.out.print("Enter data : ");
      int i = sc.nextInt();

      top = top + 1;
      arr[top] = i;
      System.out.println("Item inserted");

    }
  }

  void pop() {
    if (top == -1) {
      System.out.println("Underflow");
    } else {
      top = top - 1;
      System.out.println("Item deleted");
    }
  }

  void display() {
    System.out.print("\nItem are: ");
    for (int i = top; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
  }
}

public class Stack_Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    stack s = new stack();
    int l;
    do {

      System.out.println("Press 1 to push: ");
      System.out.println("Press 2 to pop: ");
      System.out.println("Press 3 to display: ");
      System.out.println();
      System.out.print("Enter your chice: ");
      int c = sc.nextInt();

      switch (c) {
        case 1:
          s.push();
          break;

        case 2:
          s.pop();
          break;

        case 3:
          s.display();
          break;
      }
      System.out.print("\nEnter 0 to go back to the main menu: ");
      l = sc.nextInt();
      System.out.println();
    }

    while (l == 0);
    System.out.print("Exit sucessfully");
  }
}