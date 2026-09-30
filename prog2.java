        public static void runProgram2(Scanner sc) {
        int[] arr = new int[8];
        System.out.println("Enter 8 integer numbers:");
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[8];
        int j = 0;
        for (int i = 0; i < 8; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }
        int[] uniqueArr = Arrays.copyOf(temp, j);
        System.out.print("Array after removing duplicates: ");
        for (int val : uniqueArr) {
            System.out.print(val + " ");
        }
        System.out.println();

        if (uniqueArr.length < 2) {
            System.out.println("Cannot find second largest/smallest due to insufficient unique elements.");
            return;
        }

        Arrays.sort(uniqueArr);
        System.out.println("Second Smallest element: " + uniqueArr[1]);
        System.out.println("Second Largest element: " + uniqueArr[uniqueArr.length - 2]);
    }

    