// https://www.sololearn.com/Discuss/113178/how-to-check-if-a-number-ends-with-2

public List<Integer> two2(List<Integer> nums) {
    nums.replaceAll(s -> s * 2);
    nums.removeIf(s -> s % 10 == 2);
    return nums;
}
  
