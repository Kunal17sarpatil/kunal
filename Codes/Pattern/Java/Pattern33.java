class Pattern33 {

    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            int ch=65;
            for(int j=0;j<5;j++) {
                if((i-j)>=1) {
                    System.out.print(" ");
                } else {
                    System.out.print((char)ch);
                    ch++;
                }
            }
            System.out.println();
        }
    }
}