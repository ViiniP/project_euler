public final class pe02 {
    public static void main(String[] args) {
    System.out.println(new pe02().run());
    }

    public String run(){
        int x = 1;
        int y = 2;
        int z = 0, sum = 0;

        while (x < 4000000){
            z = x + y;
            x = y;
            y = z;
            if (x % 2 == 0){
                sum += x;
            }
        }
        return Integer.toString(sum);
    }
        
        

    }