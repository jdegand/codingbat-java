// https://stackoverflow.com/questions/21549598/how-do-you-find-the-rightmost-digit-of-an-integer

public List<Integer> rightDigit(List<Integer> nums) {
  nums.replaceAll(n -> Math.abs(n) % 10);
  return nums;
}