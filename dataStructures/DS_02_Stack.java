package com.dataStructures;
import java.util.Stack;

public class DS_02_Stack {
//    Stack = LIFO() Data Structure (Last In, First Out)
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>() ; //the () at the end is a constructor..

//        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Valo");
        stack.push("Valo");
        stack.push("Valo");
        stack.push("Valo2");
        stack.push("Assasin's Creed Syndicate");

        System.out.println(stack); //By printing stack, we are not removing any elements from stack

//        stack.pop();
//        System.out.println(stack);
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);
//        String myfavGame = stack.pop();
//        System.out.println(stack);
//        System.out.println(myfavGame);

        System.out.println(stack.search("Valo")); //In case of copies, it will return the index of closest/topmost "Valo" in the stack

    }


}
