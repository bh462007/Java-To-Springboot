class Loops{
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i%3==0){
                continue;
            }
            if(i==73){
                break;
            }
            System.out.println(i);
            
        }
    }
}