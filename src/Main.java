public class Main {
    public static void main (String[] args){

        /* Section 1
        //part a
        System.out.println("Part A:");
        String[] names = {"Mateo", "Sofia", "David", "Ziggy", "Charlie"};

        for (String name : names){
            System.out.println(name);
        }

        //part b
        System.out.println("\n" + "Part B:");
        int[] nums = {8, 4, 10, 5, 7, 11, 3, 9, 23, 6};
        int sum = 0;

        for (int num : nums){
            sum += num;
        }
        System.out.println(sum);

        //part c
        System.out.println("\n" + "Part C:");
        Person p1 = new Person("Adam", 12);
        Person p2 = new Person("Barb", 15);
        Person p3 = new Person("Cathy", 14);
        Person p4 = new Person("Fred", 16);
        // write code to create an array containing the four People objects.
        Person[] people = {p1, p2, p3, p4};
        // use an enhanced for loop to set each Person's name to all uppercase (use the
        // toUppercase() string method), then call the introduce method on each person
        for (Person person : people){
            person.setName(person.getName().toUpperCase());
            person.introduce();
        }

        //part d
        System.out.println("\n" + "Part D:");
        int[] grades = {75, 80, 82, 78, 92};

        for (int i = 0; i < grades.length; i++){
            grades[i] += 5;
        }

        for (int grade : grades){
            System.out.println(grade);
        } */

        /* Section 2 */
//        int[ ] values = {6, 2, 1, 7, 12, 5};
//
//        // Rewrite this loop using an enhanced for loop, and run to confirm
//        for (int value : values) {
//            if (value % 2 == 0) {
//                System.out.println(value + " is even!");
//            }
//        }

        int[ ] values = {6, 2, 1, 7, 12, 5};

        // triple each element in the array
        for (int i = 0; i < values.length; i++) {
            values[i]*= 3;
        }

        // print out array to see if they changed
        System.out.println("Array after the loop: ");
        for (int val : values) {
            System.out.print(val + " ");
        }

        String[] strings = {"hello", "hola", "hi", "apple", "why?"};
        System.out.println(ArrayAlgorithms.longestString(strings));
        String[] strings2 = {"cut", "boy", "mom", "she"};
        System.out.println(ArrayAlgorithms.longestString(strings2));
        String[] strings3 = {"M", "DA", "B", "FAD"};
        System.out.println(ArrayAlgorithms.longestString(strings3));
        String[] strings4 = {"hello", "holler", "hi", "apple", "why?"};
        System.out.println(ArrayAlgorithms.longestString(strings4));


        int[] nums3 = {-6, -4, 0, -3, -1, -2, 5};
        boolean positive = ArrayAlgorithms.containsPositive(nums3);
        System.out.println(positive);
        int[] nums4 = {-6, -4, 0, -3, -1, -2, -5};
        boolean positive2 = ArrayAlgorithms.containsPositive(nums4);
        System.out.println(positive2);
        int[] nums5 = {6, -4, -8, -3, -1, -2, -5};
        boolean positive3 = ArrayAlgorithms.containsPositive(nums5);
        System.out.println(positive3);
        int[] nums6 = {6, 4, 8, 3, 1, 2, 5};
        boolean positive4 = ArrayAlgorithms.containsPositive(nums6);
        System.out.println(positive4);


        String[] strings5 = {"HELLO", "Halo", "Adam", "what", "booyAH", "WHY?"};
        String[] lower = ArrayAlgorithms.makeLowercase(strings5);
        for (String str : lower) {
            System.out.print(str + " ");
        }
        System.out.println("\n\noriginal array not modified:");
        for (String str : strings5) {
            System.out.print(str + " ");
        }
        System.out.println();

        String[] strings6 = {"hello!!", "!!!whoa", "sad", "Adam!", "What! No way", "Why!"};
        int numExclamations = ArrayAlgorithms.endsInExclamations(strings6);
        System.out.println(numExclamations);

        String[] strings7 = {"hell!o", "w!hoa", "!sad", "Adam", "What! No way", "Why"};
        int numExclamations2 = ArrayAlgorithms.endsInExclamations(strings7);
        System.out.println(numExclamations2);


        String[] strings9 = {"HELlo", "Halo", "WHAT!", "Adam", "what", "booyAH", "WHY?", "for"};
        ArrayAlgorithms.makeUppercase(strings9);
        for (String str : strings9) {
            System.out.print(str + " ");
        }
        System.out.println();

        int[] arr1 = {2, 5, 6, 1, 0, -6, 10};
        int[] arr2 = {1, 7, 6, -2, 8, -8, 8};
        int[] maximums = ArrayAlgorithms.arrayMaximums(arr1, arr2);

        for (int num : maximums) {
            System.out.print(num + " ");
        }
        System.out.println("\n\noriginal arrays not modified:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums10 = {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6};
        int numDoubles = ArrayAlgorithms.countConsecutiveDoubles(nums10);
        System.out.println(numDoubles);
        int[] nums11 = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2};
        int numDoubles2 = ArrayAlgorithms.countConsecutiveDoubles(nums11);
        System.out.println(numDoubles2);
        int[] nums12 = {1, 2, 1, 3, 1, 2, 1, 3, 1, 2, 1, 3};
        int numDoubles3 = ArrayAlgorithms.countConsecutiveDoubles(nums12);
        System.out.println(numDoubles3);

        int[] nums13 = {10, 20, 10, 30, 10, 20, 10, 30, 10, 20, 10, 30};
        int streak1 = ArrayAlgorithms.longestStreak(nums13);
        System.out.println(streak1);
        int[] nums14 = {10, 10, 20, 20, 20, 30, 30, 30, 30, 40, 40, 50};
        int streak2 = ArrayAlgorithms.longestStreak(nums14);
        System.out.println(streak2);
        int[] nums15 = {10, 10, 10, 10, 10, 10, 20, 20, 30, 30, 30, 30};
        int streak3 = ArrayAlgorithms.longestStreak(nums15);
        System.out.println(streak3);
        int[] nums16 = {20, 20, 30, 30, 30, 30, 10, 10, 10, 10, 10, 10};
        int streak4 = ArrayAlgorithms.longestStreak(nums16);
        System.out.println(streak4);
        int[] nums17 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int streak5 = ArrayAlgorithms.longestStreak(nums17);
        System.out.println(streak5);



    }





}
