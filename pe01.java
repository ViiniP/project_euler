public final class pe01 {
    public static void main(String[] args) {
    System.out.println(new pe01().run());
    }

    public String run(){
        int sum = 0;
        int num;
        for(num = 0; num < 1000; num++){
        if (num % 3 == 0 || num % 5 == 0){
        sum += num;
            }
        }
        return Integer.toString(sum);
    }
    
}