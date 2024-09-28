class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> chr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i%3==0 && i%5==0){
                chr.add("FizzBuzz");
            }
            else if(i%3==0){
                chr.add("Fizz");
            }
            else if(i%5==0){
                chr.add("Buzz");
            }
            else{
                chr.add(Integer.toString(i));
            }
        }
        return chr;
    }
}