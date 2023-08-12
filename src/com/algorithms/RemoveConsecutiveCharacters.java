package com.algorithms;
import java.util.Stack;

public class RemoveConsecutiveCharacters {

  public String removeDuplicates(String str) {
    if (str.length() == 0) {
      return str;
    }
    StringBuilder sb = new StringBuilder();
    Stack<Character> stack = new Stack<>();
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (!stack.isEmpty() && stack.peek() == str.charAt(i)) {
        count++;
      } else {
        if (count > 1) {
          removeCharacterFromStack(stack, count);
        }
        count = 1;
      }
      stack.push(str.charAt(i));
    }
    if (count > 1) {
      removeCharacterFromStack(stack, count);
    }
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }

    if (sb.length() == str.length()) {
      return sb.reverse().toString();
    }
    return removeDuplicates(sb.reverse().toString());
  }

  private void removeCharacterFromStack(Stack<Character> stack, int countCharacter) {
    for (int j = 0; j < countCharacter; j++) {
      if(!stack.isEmpty()) {
        stack.pop();
      }
    }
  }
}