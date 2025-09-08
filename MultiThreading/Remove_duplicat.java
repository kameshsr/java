class Remove_duplicat {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;   // 1) edge case

        int write = 1;                    // 2) अगला unique कहाँ लिखना है
        for (int read = 1; read < nums.length; read++) { // 3) array स्कैन करो
            if (nums[read] != nums[read - 1]) {          // 4) नया(unique) मिला?
                nums[write] = nums[read];                // 5) उसे front में लिखो
                write++;                                 // 6) अगली जगह advance
            }
        }
        return write;                      // 7) unique elements की count = k
    }
    public static void main(String[] args){
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
