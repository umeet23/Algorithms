package com.algorithms;
import com.algorithms.RemoveConsecutiveCharacters;
import com.algorithms.recursions.MergeSortedList;
import com.algorithms.recursions.ReverseLinkedList;
import com.algorithms.recursions.SwapNodesInPairs;
import com.algorithms.stack.Temperatures;
import com.algorithms.twoPointers.TwoSum;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Call removeConsecutiveCharacter
        Main app = new Main();
//        app.removeConsecutiveCharacter();
//        app.generateBinaryTree();
//        app.preOrderTree();
//        app.subStr();
//        app.longestCommonPrefix();
//        app.twoSum();
//        app.swapNodes();
//        app.reverseLinkedList();
//        app.mergeSortedList();
//        app.temperatures();
//        app.convertDecimalToBinary();
//        app.swapNumbers();
//        app.findUnique();
//        app.findDuplicate();
//        app.arrayIntersection();
//        app.sort01();
//        app.uniqueNumbersOccurrence();
//        app.firstAndLastOccur();
//        app.peakElementInMountainArray();
//        app.findKeySortedArray();
//        app.sqrt();
//        app.bookAllocationProblem();
//        app.aggressiveCow();
//        app.sortingAlgo();
//        app.mergeSortedArray();
//        app.rotateArray();
//        app.checkArraySortedAndRotated();
//        app.sumofTwoArray();
//        app.getMaxOccChar();
//        app.printMatrixInWaveForm();
//        app.printSpiralForm();
//        if( new Boolean("true") == new Boolean("true"))
//        System.out.println("True");
//            else
//        System.out.println("False");
        app.printSlidingWindowNegative();
//        app.printLCS();
    }




    private void removeConsecutiveCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter String");
        String input = sc.nextLine();
        RemoveConsecutiveCharacters rcc = new RemoveConsecutiveCharacters();
        String output = rcc.removeDuplicates(input);
        System.out.println("After remove duplicates from string " + output);
    }

    private void generateBinaryTree() {
        GenerateBinaryTree gbt = new GenerateBinaryTree();
        int[] inorder = {1,2,3,4};
        int[] postorder = {2,1,4,3};
        gbt.buildTree(inorder, postorder);
    }

    private void preOrderTree() {
        PreOrder po = new PreOrder();
        int[] inorder = {3,9,20,15,7 };
        int[] preorder = {9,3,15,20,7};
        po.buildTree(inorder, preorder);
    }

    private void subStr() {
        String s1 = "Hello";
        String s2 = "ll";
        int  a = new SubStr().subStr(s1, s2);
        System.out.println(a + "index");
    }

    private void longestCommonPrefix() {
        String[] strs = {"flower", "flow", "flight" };
        LongestCommonPrefix lcp = new LongestCommonPrefix();
//        String strOne = lcp.horizontalScaling(strs);
//        String strTwo = lcp.verticalScaling(strs);
        String strThree = lcp.binarySearch(strs);
        System.out.println(strThree + " SubString");
    }

    private void twoSum() {
        TwoSum ts = new TwoSum();
        int[] input = { 2, 7 ,11, 15};
        int target = 9;
        int[] results = ts.twoSum(input, target);
    }

    private void swapNodes() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        SwapNodesInPairs snip = new SwapNodesInPairs();
        snip.swapPairs(head);
    }

    private void reverseLinkedList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ReverseLinkedList rll = new ReverseLinkedList();
        rll.reverseList(head);
    }
    private void mergeSortedList() {
        // list one
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        // list two
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        MergeSortedList msl = new MergeSortedList();
        msl.mergeTwoLists(list1, list2);
    }

    private void temperatures() {
        int[] temps = { 73,74,75,71,69,72,76,73 };
        Temperatures temp = new Temperatures();
        int[] result = temp.dailyTemperatures(temps);
    }

    private void convertDecimalToBinary() {
        ConvertDecimalToBinary cdtb = new ConvertDecimalToBinary();
//        int answer = cdtb.convertNegativeNumberToBinary(-6);
//        System.out.println("Answer is " + answer);
        int a = cdtb.tempFunc(-6);

    }

    private void swapNumbers() {
        int[] arr = { 6, 3, 4, 2, 1 };
        SwapAlternative sa = new SwapAlternative();
        int[] results = sa.swapNumbers(arr);
        for(int result: results) {
            System.out.println(result);
        }
    }

    private void findUnique() {
        int[] arr = { 6, 3, 6, 3, 1, 1, 10 };
        FindUnique fu = new FindUnique();
        System.out.println(fu.findUnique(arr));
    }

    private void findDuplicate() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 8};
        FindDuplicate fd = new FindDuplicate();
        System.out.println(fd.findDuplicate(arr));

    }

    private void arrayIntersection() {
        int[] arr1 = { 2 , 2 ,3 , 4, 4, 5};
        int[] arr2 = { 2 , 2 , 3, 5 , 1 };
        ArrayIntersection ai = new ArrayIntersection();
        System.out.println(ai.arrayIntersection(arr1, arr2));
    }

    private void sort01() {
        int[] arr1 = { 0 , 1 ,0 , 0, 1, 0, 1};
        SortZeroOne szo = new SortZeroOne();
        for(int ele: szo.sort01(arr1)) {
            System.out.println(ele);
        }
    }

    private void uniqueNumbersOccurrence() {
        int[] arr = { 1,2,2,1,1,3,3};
        UniqueNumbersInArray unia = new UniqueNumbersInArray();
        System.out.println(unia.uniqueNumbersOccurrence(arr));
    }

    private void firstAndLastOccur() {
        int[] arr = { 0 ,1, 2, 3, 4, 5, 6 };
        FirstAndLastOccur falo = new FirstAndLastOccur();
        for(Integer ele : falo.firstAndLastOccur(arr, 9)) {
            System.out.println(ele);
        }
    }

    // Total number of occur of key in array (lastIndex - firstIndex) + 1

    private void peakElementInMountainArray() {
        int[] arr = {3,4, 5, 6, 2,  1 };
        PeakIndexInMountain piim = new PeakIndexInMountain();
        System.out.println(piim.peakIndexInMountain(arr));
    }

    private void findKeySortedArray() {
        int key = 2;
        FindPivot fp = new FindPivot();
        BinarySearchAlgo bsa = new BinarySearchAlgo();
        int[] arr = { 7, 9, 1, 2, 3 };
        int pivot = fp.pivotElement(arr);
        if(key >= arr[pivot] && key <= arr[arr.length - 1]) {
            System.out.println(bsa.binarySearch(arr, pivot, arr.length - 1, key));
        } else {
            System.out.println(bsa.binarySearch(arr, 0, pivot - 1, key));
        }
    }

    public void sqrt() {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.sqrt(8));
        int tempSol = sqrt.sqrt(37);
        System.out.println(sqrt.morePrecision(37, 3, tempSol));
    }
    public void bookAllocationProblem() {
        int[] arr = { 12, 34, 67, 90 };
        BookAllocationProblem bap = new BookAllocationProblem();
        System.out.println(bap.bookAllocationProblem(arr, 2));
    }

    private void aggressiveCow() {
        int[] arr = { 4, 2, 1, 3, 6 };
        AggressiveCow ac = new AggressiveCow();
        System.out.println(ac.aggressiveCow(arr, 2));
    }

    private void sortingAlgo() {
        int[] arr = { 4, 2, 1, 3, 6, 14, 5 };
        SortingAlgo sa = new SortingAlgo();
        sa.insertionSort(arr);
        for (int ele : arr) {
            System.out.println(ele + " element");
        }
    }

    private void mergeSortedArray() {
        int[] arr1 = { 1, 3, 5, 7, 9 };
        int[] arr2 = { 2, 4, 6 };
        MergeSortedArray msa = new MergeSortedArray();
        List<Integer> result = msa.mergeSorted(arr1, arr2);
        for (int ele : result) {
            System.out.println(ele);
        }
    }

    private void rotateArray() {
        int[] arr = { 1, 2, 3, 4, 5};
        int[] result = new RotateArray().rotateSecond(arr, 2);
        for (int ans: result) {
            System.out.println("Result " + ans);
        }
    }

    private void checkArraySortedAndRotated() {
        int[] arr = { 1, 2, 3, 4, 5};
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i -1] > arr[i]) {
                count++;
            }
        }
        // checking boundary conditions
        if (arr[arr.length - 1] > arr[0]) {
            count++;
        }
        boolean result = count <= 1;
        System.out.println("Answer " + result);
    }

    private void sumofTwoArray() {
        int[] arr1 = { 9, 9, 9};
        int[] arr2 = { 9, 9, 9 };
        List<Integer> result = new SumOfTwoArray().sumOfTwoArray(arr2, arr1);
        for (int ans : result) {
            System.out.print(ans);
        }
    }

    private void getMaxOccChar() {
        MaxiOccCharacter moc = new MaxiOccCharacter();
        System.out.println("Maximium Character is " + moc.getMaxiOccCharacter("aaaabbbccddee"));
    }

    private void printMatrixInWaveForm() {
        WaveMatrix wm = new WaveMatrix();
        int[][] arr = { { 1, 2, 3}, { 4, 5, 6}, { 7, 8, 9} };
        wm.printMatrixInWaveForm(arr);
    }

    private void printSpiralForm() {
        WaveMatrix wm = new WaveMatrix();
        int[][] arr = { { 1, 2, 3}, { 4, 5, 6}, { 7, 8, 9} };
        for (Integer i : wm.spiralOrder(arr)) {
            System.out.print(i + " ");
        }
    }

    private void printLCS() {
        Print_LCS plcs = new Print_LCS();
        System.out.println("LCS is " + plcs.LCS("abcdef", "abefg"));
    }

    private void printSlidingWindowNegative() {
        SlidingWindow sw = new SlidingWindow();
        int[] arr = {12 ,-1, -7, 8, -15, 30, 16, 28};
        List result = sw.printNegativeOfWindow(arr, 3);
        result.forEach((ele) -> {
            System.out.println(ele);
        });
    }
}
