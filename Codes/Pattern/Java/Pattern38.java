class Pattern38 {
    public static void main(String[] args) {
        int ch=65;
        for(int i=0;i<5;i++) {
            for(int j=0;j<9;j++) {
                if((i+j)<=3||(j-i)>=5) {
                    System.out.print(" ");
                } else {
                    System.out.print((char)ch);
                }
            }
            ch = ch+2;
            System.out.println();
        }
    }
}